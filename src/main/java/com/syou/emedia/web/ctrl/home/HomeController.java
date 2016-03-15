package com.syou.emedia.web.ctrl.home;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.model.app.PFAppPromote;
import com.syou.emedia.server.model.app.PFCodeMapping;
import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.server.service.app.IAppOperateService;
import com.syou.emedia.server.service.config.ICodeMappingService;
import com.syou.emedia.server.service.log.ILogService;
import com.syou.emedia.server.service.qrcode.IQrcodeService;
import com.syou.emedia.server.service.wifi.IWifiReportService;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.QrCodeInfo;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.exceptions.BusinessException;

@Controller
@RequestMapping("/home")
@Scope(value="prototype")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IAppOperateService appOperateService;
	@Autowired
	private IQrcodeService qrcodeService;
	@Autowired
	private IWifiReportService wifiReportService;
	@Autowired
	private ICodeMappingService codeMappingService;
	@Autowired
	private ILogService logService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response,String msg) throws Exception {
		
		return "home/index";
	}
	/**
	 * app推广列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/applist", method = RequestMethod.GET)
	public @ResponseBody Callable<JSONObject> queryPromoteAppList(Model model,final String wifiIp) {
		return new Callable<JSONObject>() {
			public JSONObject call() {
				long currentTime = System.currentTimeMillis();
				JSONObject rsp = new JSONObject();
				try {
					List<PFAppPromote> list = appOperateService.queryPromoteAppList(null);
					//add at 2016/03/06
					List<PFCodeMapping> mappinglist = codeMappingService.queryCodeMappings("DOWNLOAD_URL_MAPPING", "WIFI_IP", wifiIp);
					if(!mappinglist.isEmpty()){
						for (PFAppPromote app : list) {
							app.setDownloadUrl("http://"+mappinglist.get(0).getCodeZValue()+"/"+app.getDownloadUrl());
						}
					}else{
						throw new BusinessException(WebConstants.ERROR_CODE_2000,"AC下载地址映射未配置");
					}
					rsp.put("data", list);
					rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
					return rsp;
				} catch (Exception e) {
					e.printStackTrace();
					if(e instanceof BusinessException){
						BusinessException be = (BusinessException) e;
						rsp.put("rspCode", be.getErrCode());
						rsp.put("rspMsg", be.getErrMsg());
					}else{
						rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
						rsp.put("rspMsg", e.getMessage());
					}
					logger.error("查询app推广列表异常",e);
				}
				try {
					logService.saveLog("queryPromoteAppList", "wifiIp:"+wifiIp, rsp.toJSONString(), "", "", 
							(int)(System.currentTimeMillis()-currentTime), rsp.getString("rspCode"), rsp.getString("rspMsg"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return rsp;
			}
		};
	}
	/**
	 * 记录app下载
	 * @param model
	 * @param appId
	 * @param mac
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/download/record", method = RequestMethod.POST)
	public @ResponseBody Callable<JSONObject>  appDownloadRecord(Model model,final String appId,final String mac) throws Exception {
		return new Callable<JSONObject>() {
			public JSONObject call() {
				long currentTime = System.currentTimeMillis();
				JSONObject rsp = new JSONObject();
				try {
					if(StringUtils.isEmpty(appId) || StringUtils.isEmpty(mac)){
						rsp.put("rspCode", WebConstants.ERROR_CODE_9000);
						rsp.put("rspMsg", "传参错误");
						return rsp;
					}
					appOperateService.saveAppDownloadRecord(appId, mac);
					rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
					return rsp;
				} catch (Exception e) {
					e.printStackTrace();
					if(e instanceof BusinessException){
						BusinessException be = (BusinessException) e;
						rsp.put("rspCode", be.getErrCode());
						rsp.put("rspMsg", be.getErrMsg());
					}else{
						rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
						rsp.put("rspMsg", e.getMessage());
					}
					logger.error("记录app下载异常",e);
				}
				try {
					logService.saveLog("appDownloadRecord", "appId:"+appId+";"+"mac:"+mac, rsp.toJSONString(), "", "", 
							(int)(System.currentTimeMillis()-currentTime), rsp.getString("rspCode"), rsp.getString("rspMsg"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return rsp;
			}
		};
	}
	
	@RequestMapping(value = "/gift/qrcode", method = RequestMethod.POST)
	public @ResponseBody Callable<JSONObject>  retrieveGiftQrcode(Model model,final String mac) throws Exception {
		return new Callable<JSONObject>() {
			public JSONObject call() {
				long currentTime = System.currentTimeMillis();
				JSONObject rsp = new JSONObject();
				try {
					PFQrcode pfQrcode = qrcodeService.retrieveGiftQrcode(mac);
					DateFormat df = new SimpleDateFormat("yyyyMMddHHmsss");
					QrCodeInfo qrcode = new QrCodeInfo();
					qrcode.setQr_CODE_ID(pfQrcode.getQrCodeId()+"");
					qrcode.setQr_CODE_TYPE(pfQrcode.getQrCodeType());
					qrcode.setQr_CODE(pfQrcode.getQrCode());
					qrcode.setEnd_DATE(df.format(pfQrcode.getExpireTime()));
					String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(qrcode), CryptoUtils.MD5("system_smedia"+"101"));
					rsp.put("qrcode", reqstr);
					rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
					return rsp;
				} catch (Exception e) {
					e.printStackTrace();
					if(e instanceof BusinessException){
						BusinessException be = (BusinessException) e;
						rsp.put("rspCode", be.getErrCode());
						rsp.put("rspMsg", be.getErrMsg());
					}else{
						rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
						rsp.put("rspMsg", e.getMessage());
					}
					logger.error("获取礼品二维码异常",e);
				}
				try {
					logService.saveLog("retrieveGiftQrcode", "mac:"+mac, rsp.toJSONString(), "", "", 
							(int)(System.currentTimeMillis()-currentTime), rsp.getString("rspCode"), rsp.getString("rspMsg"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return rsp;
			}
		};
	}
	
	@RequestMapping(value = "/wifi/connect", method = RequestMethod.GET)
	public String  connectWifi(Model model,final String apId,final String mac) {
		String result_page = "";
		try {
			Response wifirsp = wifiReportService.connectWifi(mac);
			if("OK".equals(wifirsp.getStateCode())){
				model.addAttribute("mac", mac);
				model.addAttribute("apId", apId);
				result_page = "home/connected";
			}else{
				model.addAttribute("error", "WIFI认证失败");
				result_page = "error";
			}
			return result_page;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("连接wifi异常",e);
		}finally {
			try {
				logService.saveLog("connectWifi", "mac:"+mac, result_page, "", "",0, "", "");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "redirect:/home/connected.action";
	}
	
	@RequestMapping(value = "/connected", method = RequestMethod.GET)
	public String connected(RedirectAttributes attr) throws Exception {
		
		return "home/connected";
	}
	@RequestMapping(value = "/wifi/disconnect", method = RequestMethod.POST)
	public @ResponseBody JSONObject  disConnectWifi(HttpServletRequest request,HttpServletResponse response) {
		JSONObject rsp = new JSONObject();
		try {
			//清理session信息
			Enumeration<String> attrs = request.getSession().getAttributeNames();
			while(attrs.hasMoreElements()){
				request.getSession().removeAttribute(attrs.nextElement());
			}
			//清理cookie信息
/*			Cookie ipCookie = new Cookie("ip", null);
			ipCookie.setMaxAge(0);
			response.addCookie(ipCookie);
			Cookie macCookie = new Cookie("mac", null);
			macCookie.setMaxAge(0);
			response.addCookie(macCookie);
			Cookie acIdCookie = new Cookie("acId", null);
			acIdCookie.setMaxAge(0);
			response.addCookie(acIdCookie);
			Cookie acNameCookie = new Cookie("acName", null);
			acNameCookie.setMaxAge(0);
			response.addCookie(acNameCookie);
			Cookie acDescCookie = new Cookie("acDesc", null);
			acDescCookie.setMaxAge(0);
			response.addCookie(acDescCookie);*/
			rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
			return rsp;
		} catch (Exception e) {
			e.printStackTrace();
			rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
			rsp.put("rspMsg", e.getMessage());
			logger.error("清理wifi连接信息异常",e);
		}
		return rsp;
	}
}
