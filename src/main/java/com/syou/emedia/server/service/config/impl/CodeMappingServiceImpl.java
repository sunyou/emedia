package com.syou.emedia.server.service.config.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.app.PFCodeMappingMapper;
import com.syou.emedia.server.model.app.PFCodeMapping;
import com.syou.emedia.server.model.app.PFCodeMappingExample;
import com.syou.emedia.server.service.config.ICodeMappingService;

@Service("codeMappingService")
@Transactional
public class CodeMappingServiceImpl implements ICodeMappingService {

	@Autowired
	private PFCodeMappingMapper codeMappingMapper;
	
	@Override
	public List<PFCodeMapping> queryCodeMappings(String codeMappingType, String codeAcode, String codeAvalue)
			throws Exception {
		PFCodeMappingExample example = new PFCodeMappingExample();
		PFCodeMappingExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(codeMappingType)){
			criteria.andCodeMappingTypeEqualTo(codeMappingType);
		}
		if(StringUtils.isNotBlank(codeAcode)){
			criteria.andCodeACodeEqualTo(codeAcode);
		}
//		comment by syou 暂时注释 2016/03/10
//		if(StringUtils.isNotBlank(codeAvalue)){
//			criteria.andCodeAValueEqualTo(codeAvalue);
//		}
		return codeMappingMapper.selectByExample(example);
	}

}
