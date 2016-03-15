package com.syou.emedia.web.ctrl.api.shipment;

import java.util.List;

import com.syou.emedia.web.ctrl.api.pojo.CommodityInfo;
import com.syou.emedia.web.ctrl.api.pojo.TerminalInfo;

public class ShipmentReq{

	private String qr_CODE_ID;//二维码ID
    private List<CommodityInfo> commodity_INFO_LIST;//一个二维码下的商品出货清单
    private TerminalInfo ter_INFO;//售卖机
    
	public String getQr_CODE_ID() {
		return qr_CODE_ID;
	}
	public void setQr_CODE_ID(String qr_CODE_ID) {
		this.qr_CODE_ID = qr_CODE_ID;
	}
	public List<CommodityInfo> getCommodity_INFO_LIST() {
		return commodity_INFO_LIST;
	}
	public void setCommodity_INFO_LIST(List<CommodityInfo> commodity_INFO_LIST) {
		this.commodity_INFO_LIST = commodity_INFO_LIST;
	}
	public TerminalInfo getTer_INFO() {
		return ter_INFO;
	}
	public void setTer_INFO(TerminalInfo ter_INFO) {
		this.ter_INFO = ter_INFO;
	}

}
