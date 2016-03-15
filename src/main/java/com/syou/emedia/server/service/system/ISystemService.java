package com.syou.emedia.server.service.system;

import java.util.List;

import com.syou.emedia.server.model.attr.PFAttr;
import com.syou.emedia.server.model.system.PFSystem;

public interface ISystemService {
	
	/**
	 * 根据系统编码取系统信息，此编码唯一
	 * @param systemCode
	 * @return
	 * @throws Exception
	 */
	public PFSystem querySysInfoByCode(String systemCode) throws Exception;
	
	/**
	 * 属性序列
	 * @param attrSpec
	 * @return
	 * @throws Exception
	 */
	public List<PFAttr> queryAttrListBySpec(String attrSpec) throws Exception;
	
	/**
	 * 
	 * @param attrSpec
	 * @param attrCode
	 * @return
	 * @throws Exception
	 */
	public PFAttr queryAttrByCode(String attrSpec,String attrCode) throws Exception;
}
