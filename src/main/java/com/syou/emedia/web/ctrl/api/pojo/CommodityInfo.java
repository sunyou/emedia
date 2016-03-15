package com.syou.emedia.web.ctrl.api.pojo;

public class CommodityInfo {
//	出货结果
//	0：出货成功出货
//	1：出货失败
	private String commodity_ID;//商品ID
	private String commodity_TYPE;//商品类型
	private String ext_COMMODITY_ID;//外部商品ID
	private String shipment_RESULT;//出货结果，0：成功，其他：失败
	private String shipment_RESULT_DESC;//出货结果描述
	private String channel_ID;
	
	public String getCommodity_ID() {
		return commodity_ID;
	}
	public void setCommodity_ID(String commodity_ID) {
		this.commodity_ID = commodity_ID;
	}
	public String getCommodity_TYPE() {
		return commodity_TYPE;
	}
	public void setCommodity_TYPE(String commodity_TYPE) {
		this.commodity_TYPE = commodity_TYPE;
	}
	public String getExt_COMMODITY_ID() {
		return ext_COMMODITY_ID;
	}
	public void setExt_COMMODITY_ID(String ext_COMMODITY_ID) {
		this.ext_COMMODITY_ID = ext_COMMODITY_ID;
	}
	public String getShipment_RESULT() {
		return shipment_RESULT;
	}
	public void setShipment_RESULT(String shipment_RESULT) {
		this.shipment_RESULT = shipment_RESULT;
	}
	public String getShipment_RESULT_DESC() {
		return shipment_RESULT_DESC;
	}
	public void setShipment_RESULT_DESC(String shipment_RESULT_DESC) {
		this.shipment_RESULT_DESC = shipment_RESULT_DESC;
	}
	public String getChannel_ID() {
		return channel_ID;
	}
	public void setChannel_ID(String channel_ID) {
		this.channel_ID = channel_ID;
	}
	
}
