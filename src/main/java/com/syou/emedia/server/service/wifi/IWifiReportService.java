package com.syou.emedia.server.service.wifi;

import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.wifi.WifiReq;

public interface IWifiReportService {

	/**
	 * wifi信息上报
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Response saveWifiReport(WifiReq req) throws Exception;
	
	/**
	 * 判断当前手机mac是否连入wifi
	 * @param mac
	 * @return
	 * @throws Exception
	 */
	public boolean isMacConnected(String mac) throws Exception;
	
	/**
	 * 连接wifi
	 * @param stamac
	 * @return
	 * @throws Exception
	 */
	public Response connectWifi(String stamac) throws Exception;
}
