package com.syou.emedia.web.ctrl.api.wifi;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.model.system.PFSystem;
import com.syou.emedia.server.service.log.ILogService;
import com.syou.emedia.server.service.system.ISystemService;
import com.syou.emedia.server.service.wifi.IWifiReportService;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.server.utils.IntfLogInterceptor;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Request;

@Controller
@RequestMapping("/api/wifi")
@Scope(value="prototype")
public class WifiReportController {

	private static final Logger logger = LoggerFactory.getLogger(WifiReportController.class);
	@Autowired
	private IWifiReportService wifiReportService;
	@Autowired
	private ISystemService systemService;
	@Autowired
	private ILogService logService;
	
	 @RequestMapping(value = "/report", method = RequestMethod.GET)
	 public String wifiReport(Model model,HttpServletRequest request,HttpServletResponse response,String msg) throws Exception {
		 try {
			 if(StringUtils.isEmpty(msg)){
				 if(request.getCookies() != null){
					 Cookie[] cookies = request.getCookies();
					 for (Cookie cookie : cookies) {
						 request.getSession().setAttribute(cookie.getName(), cookie.getValue());
					 }
				 }
				 if(request.getSession().getAttribute("mac") != null 
						 && !StringUtils.isEmpty(request.getSession().getAttribute("mac").toString())){
					 logService.saveLog("wifiReport", msg, "home/index", "", "", 0, "0000", "");
					 model.addAttribute("connected", "true");
					 return "home/index"; //如果session中已经有用户信息，则直接跳转进入首页
				 }else{
					 model.addAttribute("error", "当前用户登录信息超时，请尝试重新连接wifi重定向");//跳转到错误页面
					 logService.saveLog("wifiReport", msg, "登录超时,重定向msg信息不能为空", "", "", 0, "9000", "");
					 return "error";
				 }
			 }
				//对数据进行加密传输
				PFSystem smedia = systemService.querySysInfoByCode(WebConstants.SYSTEM_SMEDIA);
				String smediaKey = CryptoUtils.MD5(smedia.getSystemKey()+smedia.getSystemCode());
				//解密对方传递过来的数据
				String decrypt = CryptoUtils.decrypt3DESECB(msg.replace(" ", "+"), smediaKey);
				Request srcreq = JSONObject.toJavaObject(JSON.parseObject(decrypt), Request.class);
				if(srcreq.getDetail() == null || StringUtils.isEmpty(srcreq.getDetail().toString())){
					model.addAttribute("error", "重定向传参信息错误");//跳转到错误页面
					logService.saveLog("wifiReport", msg, "msg信息错误", "", "", 0, "9000", "");
					return "error";
				}
				WifiReq req = JSONObject.toJavaObject(JSON.parseObject(srcreq.getDetail().toString()), WifiReq.class);
				//检查参数有效性
				 if(StringUtils.isEmpty(req.getIp())
						 || StringUtils.isEmpty(req.getMac())){
					 model.addAttribute("error", "未获取到有效手机mac信息");//跳转到错误页面
					 logService.saveLog("wifiReport", msg, "未获取到有效手机mac信息", "", "", 0, "9000", "");
					 return "error";
				 }
				try {
					//对接口参数做一般性校验 add at 2016/02/21
					IntfLogInterceptor.validateCommonReq(srcreq);
				}catch (Throwable e) {
					e.printStackTrace();
				}
				//判断token是否有效
				//token组成部分是系统key+14为时间戳+00,10分钟有效期
//				PFSystem system = systemService.querySysInfoByCode(srcreq.getAppId());
//				String token = CryptoUtils.aesDecrypt(srcreq.getToken(), CryptoUtils.MD5(system.getSystemKey()+system.getSystemCode()));
//				String timestamp = token.substring(0,token.length() -2);
//				if((new Date()).getTime() - IntfLogInterceptor.df.parse(timestamp).getTime() > 10*60*1000){
//					model.addAttribute("error", "token已失效");//跳转到错误页面
//					return "error";
//				}
				wifiReportService.saveWifiReport(req);
				//session一组
				request.getSession().setAttribute("ip", req.getIp());
				request.getSession().setAttribute("mac", req.getMac());
				request.getSession().setAttribute("apId", req.getAp_INFO().getAp_ID());
				request.getSession().setAttribute("apName", req.getAp_INFO().getAp_NAME());
				request.getSession().setAttribute("apDesc", req.getAp_INFO().getAp_DESC());
				//cookies一组
				Cookie ipCookie = new Cookie("ip", req.getIp());
				ipCookie.setMaxAge(365*24*60*60);//有效期1年
				response.addCookie(ipCookie);
				Cookie macCookie = new Cookie("mac", req.getMac());
				macCookie.setMaxAge(365*24*60*60);
				response.addCookie(macCookie);
				Cookie acIdCookie = new Cookie("apId", req.getAp_INFO().getAp_ID());
				acIdCookie.setMaxAge(365*24*60*60);
				response.addCookie(acIdCookie);
				Cookie acNameCookie = new Cookie("apName", req.getAp_INFO().getAp_NAME());
				acNameCookie.setMaxAge(365*24*60*60);
				response.addCookie(acNameCookie);
				Cookie acDescCookie = new Cookie("apDesc", req.getAp_INFO().getAp_DESC());
				acDescCookie.setMaxAge(365*24*60*60);
				response.addCookie(acDescCookie);
				logService.saveLog("wifiReport", JSON.toJSONString(req), "home/index", msg, "", 0, "0000", "");
				return "home/index";
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("wifi上报异常",e);
				throw e;
			}
	  }
}
