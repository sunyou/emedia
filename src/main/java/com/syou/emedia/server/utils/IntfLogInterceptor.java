package com.syou.emedia.server.utils;

import java.io.BufferedInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.model.log.PFLog;
import com.syou.emedia.server.model.system.PFSystem;
import com.syou.emedia.server.service.log.ILogService;
import com.syou.emedia.server.service.system.ISystemService;
import com.syou.emedia.web.consts.SystemCode;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Request;
import com.syou.emedia.web.exceptions.BusinessException;
import com.syou.emedia.web.exceptions.SystemException;

public class IntfLogInterceptor{

	public static final DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
//	private static final Logger logger = LoggerFactory.getLogger(IntfLogInterceptor.class);
	private static final List<String> filterIntfs = new ArrayList<String>();
	@Autowired
	private ILogService logService;
	@Autowired
	private ISystemService systemService;
	@Autowired  
	private HttpServletRequest request; 
	
	static{
		filterIntfs.add("qrcodeValidate");//二维码校验
		filterIntfs.add("shipmentResult");//提交出货结果
		filterIntfs.add("syncAppLoginInfo");//同步App首次登录信息
		filterIntfs.add("syncCoupon");//同步优惠券信息
		//filterIntfs.add("wifiReport");//wifi信息上报 comment 2016/02/27 接口比较特殊，更改为重定向方式
	}
	/**
	 * 功能描述：围绕方法需要做的处理
	 * @author sunyou
	 * @param pjp
	 * @throws Throwable
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Exception{
		String methodName = pjp.getSignature().getName(); 
		if(!filterIntfs.contains(methodName)){//非接口方法执行跳过
			try {
				return pjp.proceed();
			} catch (Throwable e) {
				throw new SystemException("9001","服务暂不可用");
			}
		}
		//对数据进行加密传输
		PFSystem smedia = systemService.querySysInfoByCode(WebConstants.SYSTEM_SMEDIA);
		String smediaKey = CryptoUtils.MD5(smedia.getSystemKey()+smedia.getSystemCode());
		//解密对方传递过来的数据
		long readAndDecryptStart = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(request.getInputStream());
		byte[] reqstr = new byte[request.getContentLength()];
		bis.read(reqstr);
		String decrypt = CryptoUtils.decrypt3DESECB(new String(reqstr,"utf-8"), smediaKey);
		Request req = JSONObject.toJavaObject(JSON.parseObject(decrypt), Request.class);
		System.out.println("数据读取解密转化时长:"+(System.currentTimeMillis() - readAndDecryptStart)+"ms");
		//对接口参数做一般性校验 add at 2016/02/21
		validateCommonReq(req);
		//统计服务调用时长
		long serviceStart = System.currentTimeMillis();
		//判断token是否有效
		//token组成部分是系统key+14为时间戳+00,10分钟有效期
		PFSystem system = null;
		try {
			system = systemService.querySysInfoByCode(req.getAppId());
		} catch (Exception e) {//保证异常日志记录
			saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, "", e.getMessage());
			throw new SystemException("9006","系统信息不存在");
		}
		String token = CryptoUtils.aesDecrypt(req.getToken(), CryptoUtils.MD5(system.getSystemKey()+system.getSystemCode()));
		String timestamp = token.substring(0,token.length() -2);
		if((new Date()).getTime() - df.parse(timestamp).getTime() > 10*60*1000){
			saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, "", "token已失效");
			throw new SystemException("9003","token已失效");
		}
		Object result;
		try {
			result = pjp.proceed(new Object[]{req.getDetail().toString()});
		} catch (Throwable e) {
			if(e instanceof BusinessException){
				saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, "", ((BusinessException) e).getErrMsg());
				throw new BusinessException(((BusinessException) e).getErrCode(),((BusinessException) e).getErrMsg());
			}else if(e instanceof SystemException){
				saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, "", ((SystemException) e).getErrMsg());
				throw new SystemException(((SystemException) e).getErrCode(),((SystemException) e).getErrMsg());
			}
			saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, "", e.getMessage());
			throw new SystemException("9001","服务暂不可用");
		}
		System.out.println("服务调用时长:"+(System.currentTimeMillis() - serviceStart)+"ms");
		//去掉对象转json带\问题及首尾"
		String rspStr = JSON.toJSONString(result).replace("\\", "");
				rspStr = rspStr.substring(1, rspStr.length()-1);
		String encryptRsp = CryptoUtils.encrypt3DESECB(rspStr, smediaKey);
		saveInftLog(req, methodName, serviceStart, new String(reqstr,"UTF-8"), decrypt, encryptRsp, rspStr);
		return encryptRsp;
	}

	private void saveInftLog(Request req,String methodName,long startTime,String encryptReq,String reqstr,String encryptRsp,String rspstr) throws Exception{
		//记录接口日志
		PFLog log = new PFLog();
		log.setIntfName(methodName);
		BeanUtils.copyProperties(req, log);//拷贝系统参数
		log.setCostsTime((int)(System.currentTimeMillis() - startTime));
		log.setCreateTime(new Date());
		log.setReqObj(reqstr);
		log.setEncryptReqObj(encryptReq);
		log.setRspObj(rspstr);
		log.setEncryptRspObj(encryptRsp);
		log.setStateCode(WebConstants.SUCCESS_CODE_0000);
		log.setMessage(SystemCode.lookup(WebConstants.SUCCESS_CODE_0000));
		logService.saveLog(log);
	}
	/**
	 * 功能描述：异常信息记录
	 * @author sunyou
	 * @param jp
	 * @param ex
	 * @throws Exception
	 */
	public void doThrowing(JoinPoint jp, Throwable e) throws Exception {  
		//打印异常栈信息
		StackTraceElement[] sts= e.getStackTrace() ;
		StringBuilder buf = new StringBuilder();
		if(sts != null){
			buf.append(e.toString());
			for (int i = 0; i < sts.length; i++) {
				buf.append(StringUtils.leftPad("-", i)).append(sts[i].toString());
			}
			if(buf.length() > 500){//数据库字段长度为500，加此限制
				buf.delete(495, buf.length() - 1);
			}
		}
//		PFLog log = new PFLog();
//		String methodName = jp.getSignature().getName(); 
//		log.setIntfName(methodName);
//		log.setCreateTime(new Date());
//		log.setRspObj(buf.toString());
//		log.setStateCode(WebConstants.ERROR_CODE_9999);
//		log.setMessage(e.getMessage());
//		logService.saveLog(log);
		throw new Exception(e.getMessage());
    }  
	
	public static void validateCommonReq(Request req) throws SystemException {
		if(req == null){
			throw new SystemException("1010","请求信息不能为空");
		}
		if(StringUtils.isEmpty(req.getAppId())){
			throw new SystemException("1010","系统编码信息不能为空");
		}
		if(StringUtils.isEmpty(req.getToken())){
			throw new SystemException("1010","请求token信息不能为空");
		}
		if(StringUtils.isEmpty(req.getTranId())){
			throw new SystemException("1010","请求业务流水不能为空");
		}
	}
}
