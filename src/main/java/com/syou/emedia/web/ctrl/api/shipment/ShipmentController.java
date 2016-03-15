package com.syou.emedia.web.ctrl.api.shipment;

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
import com.syou.emedia.server.service.shipment.IShipmentService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.exceptions.BusinessException;

@Controller
@RequestMapping("/api/shipment")
@Scope(value="prototype")
public class ShipmentController {

	private static final Logger logger = LoggerFactory.getLogger(ShipmentController.class);
	
	@Autowired
	private IShipmentService shipmentService;
	
	 @RequestMapping(value = "/result", method = RequestMethod.POST)
	 public @ResponseBody String shipmentResult(String json) throws Exception {
		 try {
			 ShipmentReq req = JSONObject.toJavaObject(JSON.parseObject(json), ShipmentReq.class);
			 //检查参数有效性
			 if(req.getCommodity_INFO_LIST() == null 
					 || req.getTer_INFO() == null
					 || req.getCommodity_INFO_LIST().isEmpty()){
				 throw new BusinessException(WebConstants.ERROR_CODE_9000,"传参错误");
			 }
			 Response rsp = shipmentService.saveShipmentResult(req);
			 return JSON.toJSONString(rsp);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("出货结果提交异常",e);
				throw e;
			}
	  }
}
