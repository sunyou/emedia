package com.syou.emedia.server.service.log;

import com.syou.emedia.server.model.log.PFLog;

public interface ILogService {

	/**
	 * 保存接口日志
	 * @param log
	 * @throws Exception
	 */
	public void saveLog(PFLog log) throws Exception;

	/**
	 * 
	 * @param intfName
	 * @param reqStr
	 * @param rspStr
	 * @param encryptReqStr
	 * @param encryptRspStr
	 * @param costTime
	 * @param stateCode
	 * @param message
	 * @throws Exception
	 */
	public void saveLog(String intfName, String reqStr, String rspStr, 
			String encryptReqStr, String encryptRspStr,
			int costTime, String stateCode, String message) throws Exception;
}
