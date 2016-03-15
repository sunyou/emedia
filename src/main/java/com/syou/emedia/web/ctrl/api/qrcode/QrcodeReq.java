package com.syou.emedia.web.ctrl.api.qrcode;

import com.syou.emedia.web.ctrl.api.pojo.QrCodeInfo;
import com.syou.emedia.web.ctrl.api.pojo.TerminalInfo;

public class QrcodeReq {

	private QrCodeInfo qr_CODE_INFO;
	private TerminalInfo ter_INFO;
	
	public QrCodeInfo getQr_CODE_INFO() {
		return qr_CODE_INFO;
	}

	public void setQr_CODE_INFO(QrCodeInfo qr_CODE_INFO) {
		this.qr_CODE_INFO = qr_CODE_INFO;
	}

	public TerminalInfo getTer_INFO() {
		return ter_INFO;
	}

	public void setTer_INFO(TerminalInfo ter_INFO) {
		this.ter_INFO = ter_INFO;
	}
	
}
