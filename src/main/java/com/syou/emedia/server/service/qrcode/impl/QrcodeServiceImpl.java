package com.syou.emedia.server.service.qrcode.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.syou.emedia.server.mapper.qrcode.PFQrcodeMapper;
import com.syou.emedia.server.model.app.PFAppPromote;
import com.syou.emedia.server.model.app.PFFreeGiftConfig;
import com.syou.emedia.server.model.attr.PFAttr;
import com.syou.emedia.server.model.commodity.PFCommodity;
import com.syou.emedia.server.model.qrcode.PFQrcode;
import com.syou.emedia.server.model.qrcode.PFQrcodeExample;
import com.syou.emedia.server.model.sync.PFSyncAppInfo;
import com.syou.emedia.server.service.app.IAppOperateService;
import com.syou.emedia.server.service.commodity.ICommodityService;
import com.syou.emedia.server.service.qrcode.IQrcodeService;
import com.syou.emedia.server.service.sync.ISyncService;
import com.syou.emedia.server.service.system.ISystemService;
import com.syou.emedia.server.service.wifi.IWifiReportService;
import com.syou.emedia.server.utils.CryptoUtils;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.CommodityInfo;
import com.syou.emedia.web.ctrl.api.pojo.QrCodeInfo;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeReq;
import com.syou.emedia.web.ctrl.api.qrcode.QrcodeRsp;
import com.syou.emedia.web.exceptions.BusinessException;

@Service("qrcodeService")
@Transactional
public class QrcodeServiceImpl implements IQrcodeService {

	@Autowired
	private PFQrcodeMapper  qrcodeMapper;
	@Autowired
	private ICommodityService commodityService;
	@Autowired
	private IWifiReportService wifiReportService;
	@Autowired
	private IAppOperateService appOperateService;
	@Autowired
	private ISyncService syncService;
	@Autowired
	private ISystemService systemService;
	
	@Override
	public Response checkQRCode(QrcodeReq req) throws Exception {
		Response rsp = new Response();
		
		QrcodeRsp detail = new QrcodeRsp();
		try {
			QrCodeInfo qrcode = req.getQr_CODE_INFO();
			PFQrcodeExample example = new PFQrcodeExample();
			example.createCriteria()
				.andQrCodeIdEqualTo(Integer.valueOf(qrcode.getQr_CODE_ID()))
				.andExpireTimeGreaterThanOrEqualTo(new Date());//有效期应大于当前系统时间
			//验证二维码有效性
			List<PFQrcode> qlist = qrcodeMapper.selectByExample(example);
			if(qlist.isEmpty()){
				throw new BusinessException(WebConstants.ERROR_CODE_1000, "无效二维码");
			}
			//验证通过后将二维码失效掉，如果是检验性操作就不应该执行插入修改操作 2016/02/20 kevin
			PFQrcode pfqrcode = qlist.get(0);
			pfqrcode.setExpireTime(new Date());
			pfqrcode.setStatus("0");
			qrcodeMapper.updateByPrimaryKey(pfqrcode);
			
			//根据二维码中信息查询商品信息
			List<PFCommodity> list = commodityService.queryCommodityList(qlist.get(0).getQrCode().split(";"));
			List<CommodityInfo> clist = new ArrayList<CommodityInfo>();
			if(!list.isEmpty()){
				CommodityInfo info = null;
				for (PFCommodity cd : list) {
					info = new CommodityInfo();
					info.setCommodity_ID(cd.getCommodityId()+"");
					info.setCommodity_TYPE(cd.getCommodityTypeId()+"");
					info.setExt_COMMODITY_ID("GD00001");//cd.getExtCommodityId()
					info.setChannel_ID(cd.getChannelId());
					clist.add(info);
				}
			}
			detail.setCommodity_INFO_LIST(clist);
			detail.setResult(WebConstants.SUCCESS_CODE_0000);
			rsp.setDetail(detail);
			rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
			rsp.setMessage("返回成功");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return rsp;
	}

	@Override
	public PFQrcode retrieveGiftQrcode(String mac) throws Exception {
		//add at 2016/03/06
		List<PFAttr> attrlist = systemService.queryAttrListBySpec("SWITCH");
		Map<String,String> attrMap = new HashMap<String,String>();
		if(!attrlist.isEmpty()){
			for (PFAttr pfAttr : attrlist) {
				attrMap.put(pfAttr.getAttrCode(), pfAttr.getAttrValue());
			}
		}
		
		/*客户点击获取礼品二维码平台规则，*/
		//1.	根据wifi上传的连入信息判断当前手机mac是否连入wifi.
		if(attrMap.get("WHETHER_WIFI_CONNECTED") != null && "1".equals(attrMap.get("WHETHER_WIFI_CONNECTED"))){
			boolean wifiConnected = wifiReportService.isMacConnected(mac);
			if(!wifiConnected){
				throw new BusinessException(WebConstants.ERROR_CODE_1006, "当前用户未曾连入过WIFI");
			}
		}
		//2.	根据平台保存的下载信息，判断该用户是否下载客户端。
		if(attrMap.get("WHETHER_APP_DOWNLOAD") != null && "1".equals(attrMap.get("WHETHER_APP_DOWNLOAD"))){
			boolean downloadBefore = appOperateService.isMacDownloadAnyApp(mac);
			if(!downloadBefore){
				throw new BusinessException(WebConstants.ERROR_CODE_1005, "当前用户未曾下载过推广APP");
			}
		}
		//3.	根据app应用上传的手机第一次登录信息，判断用户是否第一次登录。
		List<String> extAppCodes = new ArrayList<String>();
		if(attrMap.get("WHETHER_LOGIN_BEFORE") != null && "1".equals(attrMap.get("WHETHER_LOGIN_BEFORE"))){
			List<PFSyncAppInfo> list = syncService.queryLoginApps(mac);
			//4.	根据礼品赠送记录表，判断是否已经赠送过礼品。
			//已经赠送的将会把同步信息移到2表中，这样可以避免每次都要重复判断
			//5.	根据推广app赠送礼品表获取赠送的商品类型。
			if(list.isEmpty()){
				throw new BusinessException(WebConstants.ERROR_CODE_1007,"用户未获得任何礼品赠送机会");
			}
			for (PFSyncAppInfo pfSyncAppInfo : list) {
				extAppCodes.add(pfSyncAppInfo.getExtAppCode());
			}
			//将已提取出的同步信息（即获得的赠送礼品机会）移入2表
			syncService.removeAppSyncInfoToHis(list);
		}
		//根据同步信息获取对应的推广app列表
		List<PFAppPromote> plist = appOperateService.queryPromoteAppList(extAppCodes);
		if(plist.isEmpty()){
			throw new BusinessException("","配置信息错误");
		}
		List<Integer> applist = new ArrayList<Integer>();
		for (PFAppPromote pfAppPromote : plist) {
			applist.add(pfAppPromote.getAppId());
		}
		//根据推广app列表查找，app对应的礼品赠送清单
		List<PFFreeGiftConfig> configlist = appOperateService.queryFreeGiftConfigList(applist);
		if(configlist.isEmpty()){
			throw new BusinessException(WebConstants.ERROR_CODE_1007, "推广APP未配置赠送礼品信息");
		}
		List<Integer> commodityIdList = new ArrayList<Integer>();
		//保存礼品赠送记录
		PFCommodity commodity = null;
		for (PFFreeGiftConfig pfFreeGiftConfig : configlist) {
			commodity = new PFCommodity();
			BeanUtils.copyProperties(pfFreeGiftConfig, commodity);
			commodity.setCreateTime(new Date());
			commodity.setStatus(WebConstants.VALID);
			commodityService.saveCommodity(commodity);
			commodityIdList.add(commodity.getCommodityId());
			appOperateService.saveFreeGiveRecord(mac, pfFreeGiftConfig.getAppId(), commodity.getCommodityId());
		}
		//6.	生成礼品二维码返回。
		PFQrcode qrcode = new PFQrcode();
		qrcode.setQrCode(StringUtils.join(commodityIdList.iterator(), ";"));//赠送的商品ID集合
		qrcode.setQrCodeType(WebConstants.REAL_COMMODITY);
		qrcode.setStatus(WebConstants.VALID);
		Date now = new Date();
		qrcode.setCreateTime(now);
		qrcode.setExpireTime(new Date(now.getTime()+10*60*1000));//10分钟后
		qrcodeMapper.insert(qrcode);
		return qrcode;
	}

	@Override
	public PFQrcode queryQrcodeById(Integer qrcodeId) throws Exception {
		return qrcodeMapper.selectByPrimaryKey(qrcodeId);
	}

	@Override
	public void updateQrcode(PFQrcode qrCode) throws Exception {
		qrcodeMapper.updateByPrimaryKeySelective(qrCode);
	}

	@Override
	public void generateQrcode100() throws Exception {
//		for(int i = 0;i < 100; i++){
//			PFQrcode qrcode = new PFQrcode();
//			qrcode.setQrCode("1;2;3");//赠送的商品ID集合
//			qrcode.setQrCodeType(WebConstants.REAL_COMMODITY);
//			qrcode.setStatus(WebConstants.VALID);
//			Date now = new Date();
//			qrcode.setCreateTime(now);
//			qrcode.setExpireTime(new Date(now.getTime()+36000*60*1000));
//			qrcodeMapper.insert(qrcode);
//		}
		PFQrcodeExample example = new PFQrcodeExample();
		List<PFQrcode> list = qrcodeMapper.selectByExample(example);
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmsss");
		for (PFQrcode pfQrcode : list) {
			QrCodeInfo qrcode = new QrCodeInfo();
			qrcode.setQr_CODE_ID(pfQrcode.getQrCodeId()+"");
			qrcode.setQr_CODE_TYPE(pfQrcode.getQrCodeType());
			qrcode.setQr_CODE(pfQrcode.getQrCode());
			qrcode.setEnd_DATE(df.format(pfQrcode.getExpireTime()));
			String reqstr = CryptoUtils.encrypt3DESECB(JSON.toJSONString(qrcode), CryptoUtils.MD5("system_smedia"+"101"));
			System.out.println("二维码记录："+reqstr);
		}
	}

}
