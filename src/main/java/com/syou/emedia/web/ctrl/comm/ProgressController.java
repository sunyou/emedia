package com.syou.emedia.web.ctrl.comm;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.utils.file.upload.FileUploadListener;
import com.syou.emedia.web.consts.WebConstants;

@Controller
@RequestMapping("/upload")
@Scope(value="prototype")
public class ProgressController {

	@Autowired
	private CommonsMultipartResolver multipartResolver;
	
	@RequestMapping(value = "/progress", method = RequestMethod.POST)
	public @ResponseBody Callable<JSONObject>  retrieveGiftQrcode(Model model,String mac) throws Exception {
		return new Callable<JSONObject>() {
			public JSONObject call() throws Exception {
				JSONObject rsp = new JSONObject();
				try {
					FileUploadListener uploadProgressListener = (FileUploadListener)multipartResolver.getFileUpload().getProgressListener();
					int ret=uploadProgressListener.getPercentDone();
					System.out.println("new ->:"+String.valueOf(ret));
					rsp.put("percent", ret);
					rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
					return rsp;
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
		};
	}
}
