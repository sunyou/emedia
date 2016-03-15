package com.syou.emedia.web.consts;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum SystemCode {

	SYSTEM_CODE_0000("0000","OK")
	,SYSTEM_CODE_9999("9999","请求异常")
	,SYSTEM_CODE_9000("9000","传参错误")
	,SYSTEM_CODE_1000("1000","无效二维码")
	,SYSTEM_CODE_1001("1001","出货信息不能为空")
	,SYSTEM_CODE_1002("1002","同步信息不能为空")
	,SYSTEM_CODE_1003("1003","系统信息不存在")
	,SYSTEM_CODE_1004("1004","优惠券同步信息不能为空")
	,SYSTEM_CODE_1005("1005","当前用户未曾下载过推广APP")
	,SYSTEM_CODE_1006("1006","优惠券同步信息不能为空")
	,SYSTEM_CODE_1007("1007","用户未获得任何礼品赠送机会")
	,SYSTEM_CODE_1008("1008","推广APP未配置赠送礼品信息")
	,SYSTEM_CODE_1009("1009","WIFI连接异常")
	;
	private String key;
	private String name;
	
	private SystemCode(String key,String name){
		this.key = key;
		this.name = name;
	}
	
	private static Map<String,String> codeMap = new ConcurrentHashMap<String,String>();
	
	static {
		for(SystemCode code : SystemCode.values()){
			codeMap.put(code.key, code.name);
		}
	}
	
	public static String lookup(String key){
		return codeMap.get(key);
	}
}
