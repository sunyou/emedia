package com.syou.emedia.server.service.system.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.attr.PFAttrMapper;
import com.syou.emedia.server.mapper.system.PFSystemMapper;
import com.syou.emedia.server.model.attr.PFAttr;
import com.syou.emedia.server.model.attr.PFAttrExample;
import com.syou.emedia.server.model.system.PFSystem;
import com.syou.emedia.server.model.system.PFSystemExample;
import com.syou.emedia.server.service.system.ISystemService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.exceptions.BusinessException;
import com.syou.emedia.web.exceptions.SystemException;

@Service("systemService")
@Transactional
public class SystemServiceImpl implements ISystemService {

	@Autowired
	private PFSystemMapper  systemMapper;
	
	@Autowired
	private PFAttrMapper attrMapper;
	
	private static Map<String,List<PFAttr>> attrMap = new ConcurrentHashMap<String,List<PFAttr>>();
	
	@Override
	public PFSystem querySysInfoByCode(String systemCode) throws Exception {
		PFSystemExample example = new PFSystemExample();
		example.createCriteria().andSystemCodeEqualTo(systemCode);
		List<PFSystem> list = systemMapper.selectByExample(example);
		if(list.isEmpty()){
			throw new SystemException(WebConstants.ERROR_CODE_1003,"系统信息不存在");
		}
		return list.get(0);
	}

	@Override
	public List<PFAttr> queryAttrListBySpec(String attrSpec) throws Exception {
		if(attrMap.get(attrSpec) == null){
			PFAttrExample example = new PFAttrExample();
			example.createCriteria().andAttrSpecEqualTo(attrSpec);
			List<PFAttr> attrlist =  attrMapper.selectByExample(example);
			attrMap.put(attrSpec, attrlist);
			return attrlist;
		}else{
			return attrMap.get(attrSpec);
		}
	}

	@Override
	public PFAttr queryAttrByCode(String attrSpec, String attrCode) throws Exception {
		PFAttrExample example = new PFAttrExample();
		example.createCriteria().andAttrCodeEqualTo(attrSpec);
		List<PFAttr> attrlist =  attrMapper.selectByExample(example);
		if(attrlist.isEmpty()){
			throw new BusinessException("2001","未找到"+attrSpec+"配置");
		}
		return attrlist.get(0);
	}
}
