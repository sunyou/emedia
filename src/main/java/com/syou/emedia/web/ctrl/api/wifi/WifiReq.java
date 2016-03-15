package com.syou.emedia.web.ctrl.api.wifi;

import com.syou.emedia.web.ctrl.api.pojo.ApInfo;

public class WifiReq {

	private String ip;
	private String mac;

	private ApInfo ap_INFO;//wifi信息
	
	

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public ApInfo getAp_INFO() {
		return ap_INFO;
	}

	public void setAp_INFO(ApInfo ap_INFO) {
		this.ap_INFO = ap_INFO;
	}

}
