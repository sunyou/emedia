package com.syou.emedia.web.ctrl.api.qrcode;

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
import com.syou.emedia.server.service.qrcode.IQrcodeService;
import com.syou.emedia.web.consts.WebConstants;
import com.syou.emedia.web.ctrl.api.pojo.Response;
import com.syou.emedia.web.exceptions.BusinessException;

@Controller
@RequestMapping("/api/qrcode")
@Scope(value="prototype")
public class QrcodeController {

	private static final Logger logger = LoggerFactory.getLogger(QrcodeController.class);
	
	@Autowired
	private IQrcodeService qrcodeService;
	
	/**
	 * 验证二维码，并且获取二维码对应的赠送礼品信息
	 * @param model
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	 @RequestMapping(value = "/validate", method = RequestMethod.POST)
	 public @ResponseBody String qrcodeValidate(String json) throws Exception {
		 try {
			 QrcodeReq req = JSONObject.toJavaObject(JSON.parseObject(json), QrcodeReq.class);
			 //检查参数有效性
			 if(req.getQr_CODE_INFO() == null 
					 || StringUtils.isEmpty(req.getQr_CODE_INFO().getQr_CODE_ID())){
				 throw new BusinessException(WebConstants.ERROR_CODE_9000,"传参错误");
			 }
			 Response rsp =  qrcodeService.checkQRCode(req);
			 return JSON.toJSONString(rsp);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("二维码校验异常",e);
				throw e;
			}
	  }
	 
	 @RequestMapping(value = "/genQrcode", method = RequestMethod.POST)
	 public void genQrcode() throws Exception {
		 try {
			 qrcodeService.generateQrcode100();
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
	  }
}
