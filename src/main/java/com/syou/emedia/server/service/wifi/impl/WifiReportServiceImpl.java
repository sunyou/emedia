package com.syou.emedia.server.service.wifi.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.mapper.report.PFWifiReportMapper;
import com.syou.emedia.server.model.report.PFWifiReport;
import com.syou.emedia.server.model.report.PFWifiReportExample;
import com.syou.emedia.server.service.log.ILogService;
import com.syou.emedia.server.service.wifi.IWifiReportService;
import com.syou.emedia.server.utils.HttpClientUtils;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.wifi.WifiReq;
import com.syou.emedia.web.ctrl.api.wifi.WifiRsp;
import com.syou.emedia.web.exceptions.BusinessException;

@Service("wifiReportService")
@Transactional
public class WifiReportServiceImpl implements IWifiReportService {

	private static final String AC_AUTHOR_URL = "http://218.5.9.225:8088/AC/index.php/ExternInterface/usrauthapi";
	
	@Autowired
	private PFWifiReportMapper wifiReportMapper;
	@Autowired
	private ILogService logService;
	
	@Override
	public Response saveWifiReport(WifiReq req) throws Exception {
		Response rsp = new Response();
		PFWifiReport report = new PFWifiReport();
		BeanUtils.copyProperties(req, report);
		if(req.getAp_INFO() != null){
			report.setAcId(req.getAp_INFO().getAp_ID());
			report.setAcName(req.getAp_INFO().getAp_NAME());
			report.setAcDesc(req.getAp_INFO().getAp_DESC());
		}
		report.setCreateTime(new Date());
		wifiReportMapper.insert(report);
		WifiRsp detail = new WifiRsp();
		detail.setResult(WebConstants.SUCCESS_CODE_0000);
		rsp.setDetail(detail);
		rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
		rsp.setMessage("返回成功");
		return rsp;
	}

	@Override
	public boolean isMacConnected(String mac) throws Exception {
		//连接wifi的时间不能超过1小时，比如说是1小时前登录的，则不能认为当前手机有连入wifi
		PFWifiReportExample example = new PFWifiReportExample();
		example.createCriteria().andMacEqualTo(mac);
		int count = wifiReportMapper.countByExample(example);
		if(count > 0) return true;
		return false;
	}

	@Override
	public Response connectWifi(String stamac) throws Exception {
		JSONObject req = new JSONObject();
		Response rsp = new Response();
		long currentTime = System.currentTimeMillis();
		try {
			req.put("apikey", "sunnada");
			req.put("stamac", stamac);
			Map<String,Object> result = new HashMap<String,Object>();
			HttpClientUtils.doPost(AC_AUTHOR_URL, req.toJSONString(),result);
			if(result.get("rspBody") == null){
				rsp.setStateCode(WebConstants.ERROR_CODE_1009);
				rsp.setMessage("WIFI返回信息为空");
				logService.saveLog("ExternInterface/usrauthapi", req.toJSONString(), null, "", "", (int)(System.currentTimeMillis()-currentTime), rsp.getStateCode(), rsp.getMessage());
			}else{
				rsp.setStateCode(JSONObject.parseObject(result.get("rspBody").toString()).get("result")+"");
				rsp.setMessage("返回成功");
				logService.saveLog("ExternInterface/usrauthapi", req.toJSONString(), result.get("rspBody").toString(), "", "", (int)(System.currentTimeMillis()-currentTime), rsp.getStateCode(), rsp.getMessage());
			}
		} catch (java.net.ConnectException e) {
			logService.saveLog("ExternInterface/usrauthapi", req.toJSONString(), "WIFI服务超时或异常", "", "", (int)(System.currentTimeMillis()-currentTime), "9999","");
			throw new BusinessException("9999","WIFI服务超时或异常");
		} catch (Exception ex) {
			logService.saveLog("ExternInterface/usrauthapi", req.toJSONString(), ex.getMessage(), "", "", (int)(System.currentTimeMillis()-currentTime), "9999","");
			ex.printStackTrace();
			throw ex;
		} 
		return rsp;
	}

}
