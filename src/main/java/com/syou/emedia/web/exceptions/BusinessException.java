package com.syou.emedia.web.exceptions;

@SuppressWarnings("serial")
public class BusinessException extends Exception {

	private String errCode;
	private String errMsg;
	
	public BusinessException(){}
	
	public BusinessException(String errCode,String errMsg){
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
}
