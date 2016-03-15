package com.syou.emedia.web.ctrl.api.pojo;

public class CouponInfo {
	private String coupon_ID;
	private String coupon_CODE;
	private String coupon_TYPE;//优惠卷类型
	private String coupon_AMOUNT;//优惠卷金额
	public String getCoupon_ID() {
		return coupon_ID;
	}
	public void setCoupon_ID(String coupon_ID) {
		this.coupon_ID = coupon_ID;
	}
	public String getCoupon_CODE() {
		return coupon_CODE;
	}
	public void setCoupon_CODE(String coupon_CODE) {
		this.coupon_CODE = coupon_CODE;
	}
	public String getCoupon_TYPE() {
		return coupon_TYPE;
	}
	public void setCoupon_TYPE(String coupon_TYPE) {
		this.coupon_TYPE = coupon_TYPE;
	}
	public String getCoupon_AMOUNT() {
		return coupon_AMOUNT;
	}
	public void setCoupon_AMOUNT(String coupon_AMOUNT) {
		this.coupon_AMOUNT = coupon_AMOUNT;
	}
}
