package com.syou.emedia.web.ctrl.api.pojo;

/**
 * 二维码
 */
public class QrCodeInfo {
	private String qr_CODE_ID;
	private String qr_CODE_TYPE;
	private String qr_CODE;
	private String end_DATE;
	public String getQr_CODE_ID() {
		return qr_CODE_ID;
	}
	public void setQr_CODE_ID(String qr_CODE_ID) {
		this.qr_CODE_ID = qr_CODE_ID;
	}
	public String getQr_CODE_TYPE() {
		return qr_CODE_TYPE;
	}
	public void setQr_CODE_TYPE(String qr_CODE_TYPE) {
		this.qr_CODE_TYPE = qr_CODE_TYPE;
	}
	public String getQr_CODE() {
		return qr_CODE;
	}
	public void setQr_CODE(String qr_CODE) {
		this.qr_CODE = qr_CODE;
	}
	public String getEnd_DATE() {
		return end_DATE;
	}
	public void setEnd_DATE(String end_DATE) {
		this.end_DATE = end_DATE;
	}
}
