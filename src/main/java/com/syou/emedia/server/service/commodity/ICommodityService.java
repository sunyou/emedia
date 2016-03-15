package com.syou.emedia.server.service.commodity;

import java.util.List;

import com.syou.emedia.server.model.commodity.PFCommodity;

public interface ICommodityService {

	/**
	 * 查询厂家商品列表(无分页处理)
	 * @param commodityIds
	 * @return
	 * @throws Exception
	 */
	public List<PFCommodity> queryCommodityList(String[] commodityIds) throws Exception;
	
	/**
	 * 保存商品信息
	 * @param commodity
	 * @throws Exception
	 */
	public void saveCommodity(PFCommodity commodity) throws Exception;
}
