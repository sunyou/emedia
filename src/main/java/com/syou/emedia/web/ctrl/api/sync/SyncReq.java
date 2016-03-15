package com.syou.emedia.web.ctrl.api.sync;

import com.syou.emedia.web.ctrl.api.pojo.CouponInfo;

public class SyncReq{

	/**
	 * 
	 */
	private String channel_ID;//售卖机厂家ID
	private String mac;//手机mac
	private String first_DATE;//第一次登录时间
	
	private String apply_ORDER_ID;
	private CouponInfo coupon_INFO;
	
	public String getChannel_ID() {
		return channel_ID;
	}
	public void setChannel_ID(String channel_ID) {
		this.channel_ID = channel_ID;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getFirst_DATE() {
		return first_DATE;
	}
	public void setFirst_DATE(String first_DATE) {
		this.first_DATE = first_DATE;
	}
	public String getApply_ORDER_ID() {
		return apply_ORDER_ID;
	}
	public void setApply_ORDER_ID(String apply_ORDER_ID) {
		this.apply_ORDER_ID = apply_ORDER_ID;
	}
	public CouponInfo getCoupon_INFO() {
		return coupon_INFO;
	}
	public void setCoupon_INFO(CouponInfo coupon_INFO) {
		this.coupon_INFO = coupon_INFO;
	}
	
}
