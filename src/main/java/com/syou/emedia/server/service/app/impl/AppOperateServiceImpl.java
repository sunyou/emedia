package com.syou.emedia.server.service.app.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.app.PFAppPromoteMapper;
import com.syou.emedia.server.mapper.app.PFFreeGiftConfigMapper;
import com.syou.emedia.server.mapper.app.PFFreeGiveRecordMapper;
import com.syou.emedia.server.mapper.qrcode.PFAppDownloadMapper;
import com.syou.emedia.server.model.app.PFAppPromote;
import com.syou.emedia.server.model.app.PFAppPromoteExample;
import com.syou.emedia.server.model.app.PFFreeGiftConfig;
import com.syou.emedia.server.model.app.PFFreeGiftConfigExample;
import com.syou.emedia.server.model.app.PFFreeGiveRecord;
import com.syou.emedia.server.model.qrcode.PFAppDownload;
import com.syou.emedia.server.model.qrcode.PFAppDownloadExample;
import com.syou.emedia.server.service.app.IAppOperateService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.exceptions.BusinessException;

@Service("appOperateService")
@Transactional
public class AppOperateServiceImpl implements IAppOperateService {

	@Autowired
	private PFAppPromoteMapper appPromoteMapper;
	@Autowired
	private PFAppDownloadMapper appDownloadMapper;
	@Autowired
	private PFFreeGiftConfigMapper freeGiftConfigMapper;
	@Autowired
	private PFFreeGiveRecordMapper freeGiveRecordMapper;
	@Override
	public List<PFAppPromote> queryPromoteAppList(List<String> extAppCodes) throws Exception {
		PFAppPromoteExample example = new PFAppPromoteExample();
		PFAppPromoteExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(WebConstants.VALID);
		if(extAppCodes != null && !extAppCodes.isEmpty()){
			criteria.andExtAppCodeIn(extAppCodes);
		}
		return appPromoteMapper.selectByExample(example);
	}

	@Override
	public void saveAppDownloadRecord(String appId, String mac) throws Exception {
		PFAppDownloadExample example = new PFAppDownloadExample();
		example.createCriteria().andAppIdEqualTo(Integer.valueOf(appId)).andMacEqualTo(mac);
		int count = appDownloadMapper.countByExample(example);
		if(count > 0)return;//下载记录已存在将不再重复记录
		PFAppDownload record = new PFAppDownload();
		record.setAppId(Integer.valueOf(appId));
		record.setMac(mac);
		record.setCreateTime(new Date());
		appDownloadMapper.insert(record);
	}

	@Override
	public boolean isMacDownloadAnyApp(String mac) throws Exception {
		PFAppDownloadExample example = new PFAppDownloadExample();
		example.createCriteria().andMacEqualTo(mac);
		int count = appDownloadMapper.countByExample(example);
		if(count > 0) return true;
		return false;
	}

	@Override
	public List<PFFreeGiftConfig> queryFreeGiftConfigList(List<Integer> applist) throws Exception {
		if(applist.isEmpty()){
			throw new BusinessException("","");
		}
		PFFreeGiftConfigExample example = new PFFreeGiftConfigExample();
		example.createCriteria().andAppIdIn(applist);
		return freeGiftConfigMapper.selectByExample(example);
	}

	@Override
	public void saveFreeGiveRecord(String mac, Integer appId, Integer commodityId) throws Exception {
		PFFreeGiveRecord record = new PFFreeGiveRecord();
		record.setMac(mac);
		record.setAppId(appId);
		record.setCommodityId(commodityId);
		record.setCreateTime(new Date());
		freeGiveRecordMapper.insert(record);
	}

}
