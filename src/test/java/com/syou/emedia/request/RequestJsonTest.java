package com.syou.emedia.request;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.server.model.terminal.PFTerminal;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeReq;
import com.syou.emedia.web.ctrl.api.wifi.WifiReq;

public class RequestJsonTest {

	@Test
	public void testQrcodeReqJson(){
		QrcodeReq req = new QrcodeReq();
		System.out.println(JSON.toJSONString(req));
	}
	
	@Test
	public void testWifiReqJson(){
		WifiReq req = new WifiReq();
		req.setIp("1.0.0.0");
		req.setMac("3e:20:1f:9a:ce:bd:78");
		System.out.println(JSON.toJSONString(req));
	}
}
