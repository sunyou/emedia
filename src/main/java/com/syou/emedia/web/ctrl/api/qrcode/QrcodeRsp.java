package com.syou.emedia.web.ctrl.api.qrcode;

import java.util.List;

import com.syou.emedia.web.ctrl.api.pojo.CommodityInfo;
import com.syou.emedia.web.ctrl.api.pojo.CommonRsp;

public class QrcodeRsp extends CommonRsp{

	private List<CommodityInfo> commodity_INFO_LIST;

	public List<CommodityInfo> getCommodity_INFO_LIST() {
		return commodity_INFO_LIST;
	}

	public void setCommodity_INFO_LIST(List<CommodityInfo> commodity_INFO_LIST) {
		this.commodity_INFO_LIST = commodity_INFO_LIST;
	}
	
}
