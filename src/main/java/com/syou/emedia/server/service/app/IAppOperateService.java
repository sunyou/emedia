package com.syou.emedia.server.service.app;

import java.util.List;

import com.syou.emedia.server.model.app.PFAppPromote;
import com.syou.emedia.server.model.app.PFFreeGiftConfig;

public interface IAppOperateService {

	/**
	 * 查询app推广列表
	 * @return
	 * @throws Exception
	 */
	public List<PFAppPromote> queryPromoteAppList(List<String> extAppCodes) throws Exception;
	
	/**
	 * 记录app下载记录
	 * @param appId
	 * @param mac
	 * @throws Exception
	 */
	public void saveAppDownloadRecord(String appId,String mac) throws Exception;
	
	/**
	 * 根据平台保存的下载信息，判断该用户是否下载客户端。
	 * @param mac
	 * @return
	 * @throws Exception
	 */
	public boolean isMacDownloadAnyApp(String mac) throws Exception;
	
	/**
	 * 根据app_id列表获取app配置赠送礼品表记录
	 * @param applist
	 * @return
	 * @throws Exception
	 */
	public List<PFFreeGiftConfig> queryFreeGiftConfigList(List<Integer> applist) throws Exception;
	
	/**
	 * 保存礼品赠送记录
	 * @param mac
	 * @param appId
	 * @param commodityId
	 * @throws Exception
	 */
	public void saveFreeGiveRecord(String mac,Integer appId,Integer commodityId) throws Exception;
}
