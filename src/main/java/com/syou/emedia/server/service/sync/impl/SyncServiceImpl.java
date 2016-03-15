package com.syou.emedia.server.service.sync.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.coupon.PFCouponMapper;
import com.syou.emedia.server.mapper.sync.PFSyncAppInfoHisMapper;
import com.syou.emedia.server.mapper.sync.PFSyncAppInfoMapper;
import com.syou.emedia.server.model.coupon.PFCoupon;
import com.syou.emedia.server.model.sync.PFSyncAppInfo;
import com.syou.emedia.server.model.sync.PFSyncAppInfoHis;
import com.syou.emedia.server.service.sync.ISyncService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.ctrl.api.sync.SyncReq;
import com.syou.emedia.web.ctrl.api.sync.SyncRsp;
import com.syou.emedia.web.exceptions.BusinessException;

@Service("syncService")
@Transactional
public class SyncServiceImpl implements ISyncService {

	private static final DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
	
	@Autowired
	private PFSyncAppInfoMapper syncAppInfoMapper;
	@Autowired
	private PFSyncAppInfoHisMapper syncAppInfoHisMapper;
	@Autowired
	private PFCouponMapper couponMapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Response saveSyncAppInfo(SyncReq req) throws Exception {
		Response rsp = new Response();
		PFSyncAppInfo record = new PFSyncAppInfo();
		record.setChannelId(req.getChannel_ID());
		record.setMac(req.getMac());
		record.setFirstLoginTime(df.parse(req.getFirst_DATE()));
		record.setCreateTime(new Date());
		syncAppInfoMapper.insert(record);
		SyncRsp detail = new SyncRsp();
		detail.setResult(WebConstants.SUCCESS_CODE_0000);
		rsp.setDetail(detail);
		rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
		rsp.setMessage("返回成功");
		return rsp;
	}
	
	@Override
	public Response saveSyncCoupon(SyncReq req) throws Exception {
		Response rsp = new Response();
		if(req.getCoupon_INFO() == null){
			throw new BusinessException(WebConstants.ERROR_CODE_1004,"优惠券同步信息不能为空");
		}
		PFCoupon coupon = new PFCoupon();
		coupon.setApplyOrderId(req.getApply_ORDER_ID());
		coupon.setChannelId(Integer.valueOf(req.getChannel_ID()));
		coupon.setOutCouponId(req.getCoupon_INFO().getCoupon_ID());
		coupon.setOutCouponCode(req.getCoupon_INFO().getCoupon_CODE());
		coupon.setOutCouponType(req.getCoupon_INFO().getCoupon_TYPE());
		coupon.setOutCouponAmount(req.getCoupon_INFO().getCoupon_AMOUNT());
		couponMapper.insert(coupon);
		SyncRsp detail = new SyncRsp();
		detail.setResult(WebConstants.SUCCESS_CODE_0000);
		rsp.setDetail(detail);
		rsp.setStateCode(WebConstants.SUCCESS_CODE_0000);
		rsp.setMessage("返回成功");
		return rsp;
	}

	@Override
	public List<PFSyncAppInfo> queryLoginApps(String mac) throws Exception {
		StringBuffer sql = new StringBuffer();
		//表示用户下载过的app中有登录过的记录
		sql.append("select t1.* total from platform_sync_appinfo t1,platform_app_download t2,platform_app_promote t3");
		sql.append(" where t1.ext_app_code = t3.ext_app_code");
		sql.append(" and t3.app_id = t2.app_id");
		sql.append(" and  t3.`status` = '1' ");
		sql.append(" and t1.mac = ?");
		List<PFSyncAppInfo> list = this.jdbcTemplate.queryForList(sql.toString(), new Object[]{mac}, PFSyncAppInfo.class);
		return list;
	}

	@Override
	public void removeAppSyncInfoToHis(List<PFSyncAppInfo> list) throws Exception {
		if(list.isEmpty())return;
		PFSyncAppInfoHis his = null;
		for (PFSyncAppInfo pfSyncAppInfo : list) {
			//删除1表中数据
			syncAppInfoMapper.deleteByPrimaryKey(pfSyncAppInfo.getSyncId());
			//往2表中添加数据
			his = new PFSyncAppInfoHis();
			BeanUtils.copyProperties(pfSyncAppInfo, his);
			syncAppInfoHisMapper.insert(his);
		}
	}

}
