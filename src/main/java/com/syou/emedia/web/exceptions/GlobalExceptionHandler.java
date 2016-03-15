package com.syou.emedia.web.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.syou.emedia.server.model.system.PFSystem;
import com.syou.emedia.server.service.system.ISystemService;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.CommonRsp;
import com.syou.emedia.web.ctrl.api.pojo.Response;

@ControllerAdvice
public class GlobalExceptionHandler {

	@Autowired
	private ISystemService systemService;
	
	@ExceptionHandler
	public @ResponseBody String handleException(Exception ex) {
		ex.printStackTrace();//test
		Response rsp = new Response();
		
		if(ex instanceof SystemException){
			SystemException be = (SystemException) ex;
			rsp.setStateCode(be.getErrCode());
			rsp.setMessage(be.getErrMsg());
		}else if(ex instanceof BusinessException){
			BusinessException be = (BusinessException) ex;
			rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
			rsp.setMessage("返回成功");
			com.syou.emedia.web.ctrl.api.pojo.Error error = new com.syou.emedia.web.ctrl.api.pojo.Error();
			error.setId(be.getErrCode());
			error.setMessage(be.getErrMsg());
			CommonRsp crsp = new CommonRsp();
			crsp.setError(error);
			crsp.setResult(be.getErrCode());
			rsp.setDetail(crsp);
		}else{
			rsp.setStateCode(WebConstants.ERROR_CODE_9999);
			rsp.setMessage(ex.getMessage());
		}
		try {
			String rspStr = JSON.toJSONString(rsp).replace("\\", "");
			//rspStr = rspStr.substring(1, rspStr.length()-1);
			//对数据进行加密传输
			PFSystem smedia = systemService.querySysInfoByCode(WebConstants.SYSTEM_SMEDIA);
			String smediaKey = CryptoUtils.MD5(smedia.getSystemKey()+smedia.getSystemCode());
			return CryptoUtils.encrypt3DESECB(rspStr, smediaKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
