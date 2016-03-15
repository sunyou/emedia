package com.syou.emedia.web.ctrl.api.pojo;

public class CommonRsp {

	private String result;
	private com.syou.emedia.web.ctrl.api.pojo.Error error;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public com.syou.emedia.web.ctrl.api.pojo.Error getError() {
		return error;
	}
	public void setError(com.syou.emedia.web.ctrl.api.pojo.Error error) {
		this.error = error;
	}
}
