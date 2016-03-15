package com.syou.emedia.server.service.config;

import java.util.List;

import com.syou.emedia.server.model.app.PFCodeMapping;

public interface ICodeMappingService {

	/**
	 * 
	 * @param codeMappingType
	 * @param codeAcode
	 * @param codeAvalue
	 * @return
	 * @throws Exception
	 */
	public List<PFCodeMapping> queryCodeMappings(String codeMappingType,String codeAcode,String codeAvalue) throws Exception;
}
