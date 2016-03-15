package com.syou.emedia.server.service.log.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syou.emedia.server.mapper.log.PFLogMapper;
import com.syou.emedia.server.model.log.PFLog;
import com.syou.emedia.server.service.log.ILogService;

@Service("logService")
@Transactional
public class LogServiceImpl implements ILogService {

	@Autowired
	private PFLogMapper logMapper;
	
	@Override
	public void saveLog(PFLog log) throws Exception {
		log.setCreateTime(new Date());
		logMapper.insert(log);
	}

	@Override
	public void saveLog(String intfName, String reqStr, String rspStr, String encryptReqStr, String encryptRspStr,
			int costTime, String stateCode, String message) throws Exception {
		PFLog log = new PFLog();
		log.setIntfName(intfName);
		log.setCostsTime(costTime);
		log.setCreateTime(new Date());
		log.setReqObj(reqStr);
		log.setEncryptReqObj(encryptReqStr);
		log.setRspObj(rspStr);
		log.setEncryptRspObj(encryptRspStr);
		log.setStateCode(stateCode);
		log.setMessage(message);
		log.setCreateTime(new Date());
		logMapper.insert(log);
	}
}
