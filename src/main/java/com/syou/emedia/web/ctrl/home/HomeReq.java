package com.syou.emedia.web.ctrl.home;

import com.syou.emedia.web.ctrl.api.pojo.ApInfo;
import com.syou.emedia.web.ctrl.api.pojo.Request;

public class HomeReq extends Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Detail detail;
	
	public static class Detail{
		private String ip;
		private String mac;
		private ApInfo ap_INFO;
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

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
}
