package com.syou.emedia.server.service.sync;

import java.util.List;

import com.syou.emedia.server.model.sync.PFSyncAppInfo;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.sync.SyncReq;

public interface ISyncService {

	/**
	 * 保存同步信息（记录app首次登录时间）
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Response saveSyncAppInfo(SyncReq req) throws Exception;
	
	/**
	 * 同步优惠券信息
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Response saveSyncCoupon(SyncReq req) throws Exception;
	
	/**
	 * 从同步表中查询下载及登录过app列表
	 * @param mac
	 * @return
	 * @throws Exception
	 */
	public List<PFSyncAppInfo> queryLoginApps(String mac) throws Exception;
	
	/**
	 * 将已提取出来送机会的同步信息移到历史表中
	 * @param list
	 * @throws Exception
	 */
	public void removeAppSyncInfoToHis(List<PFSyncAppInfo> list) throws Exception;
}
