package com.syou.emedia.web.ctrl.api.sync;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.service.sync.ISyncService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.exceptions.BusinessException;

@Controller
@RequestMapping("/api/sync")
@Scope(value="prototype")
public class SyncController {

	private static final Logger logger = LoggerFactory.getLogger(SyncController.class);
	
	@Autowired
	private ISyncService syncService;
	
	 @RequestMapping(value = "/loginfo", method = RequestMethod.POST)
	 public @ResponseBody String syncAppLoginInfo(String json) throws Exception {
		 try {
			 	SyncReq req = JSONObject.toJavaObject(JSON.parseObject(json), SyncReq.class);
			 	//检查参数有效性
				 if(StringUtils.isEmpty(req.getChannel_ID())
						 || StringUtils.isEmpty(req.getMac())
						 || StringUtils.isEmpty(req.getFirst_DATE())){
					 throw new BusinessException(WebConstants.ERROR_CODE_9000,"传参错误");
				 }
				 Response rsp = syncService.saveSyncAppInfo(req);
			 	return  JSON.toJSONString(rsp);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("app同步异常",e);
				throw e;
			}
	  }
	 
	 @RequestMapping(value = "/coupon", method = RequestMethod.POST)
	 public @ResponseBody String syncCoupon(String json) throws Exception {
		 try {
			 	SyncReq req = JSONObject.toJavaObject(JSON.parseObject(json), SyncReq.class);
			 	//检查参数有效性
				 if(req.getCoupon_INFO() == null 
						 || StringUtils.isEmpty(req.getCoupon_INFO().getCoupon_ID())){
					 throw new BusinessException(WebConstants.ERROR_CODE_9000,"传参错误");
				 }
				 Response rsp = syncService.saveSyncCoupon(req);
			 	return  JSON.toJSONString(rsp);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("优惠券同步异常",e);
				throw e;
			}
	  }
}
