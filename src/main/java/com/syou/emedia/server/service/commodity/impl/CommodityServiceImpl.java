package com.syou.emedia.server.service.commodity.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.commodity.PFCommodityMapper;
import com.syou.emedia.server.model.commodity.PFCommodity;
import com.syou.emedia.server.model.commodity.PFCommodityExample;
import com.syou.emedia.server.service.commodity.ICommodityService;

@Service("commodityService")
@Transactional
public class CommodityServiceImpl implements ICommodityService {

	@Autowired
	private PFCommodityMapper commodityMapper;
	
	@Override
	public List<PFCommodity> queryCommodityList(String[] commodityIds) throws Exception {
		List<Integer> commodityIdList = new ArrayList<Integer>(commodityIds.length);
		for (String commodityId : commodityIds) {
			commodityIdList.add(Integer.valueOf(commodityId));
		}
		PFCommodityExample example = new PFCommodityExample();
		example.createCriteria().andCommodityIdIn(commodityIdList).andStatusEqualTo("1");//有效商品
		return commodityMapper.selectByExample(example);
	}

	@Override
	public void saveCommodity(PFCommodity commodity) throws Exception {
		commodityMapper.insert(commodity);
	}

}
