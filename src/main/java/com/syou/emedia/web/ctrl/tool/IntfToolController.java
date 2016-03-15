package com.syou.emedia.web.ctrl.tool;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.server.utils.HttpClientUtils;
import com.syou.emedia.web.consts.WebConstants;

@Controller
@RequestMapping("/intf")
@Scope(value="prototype")
public class IntfToolController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response,String msg) throws Exception {
		
		return "intf/index";
	}
	
	@RequestMapping(value = "/method/call", method = RequestMethod.POST)
	public @ResponseBody JSONObject  callMethod(String method,String intfUrl,String input) {
		JSONObject rsp = new JSONObject();
		try {
			Map<String,Object> result = new HashMap<String,Object>();
			if("get".equals(method.toLowerCase())){
				HttpClientUtils.doGet(intfUrl+"?"+input, result);
			}else if("post".equals(method.toLowerCase())){
				HttpClientUtils.doPost(intfUrl, input, result);
			}
			rsp.put("output", result.get("rspBody"));
			rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
			return rsp;
		} catch (Exception e) {
			e.printStackTrace();
			rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
			rsp.put("rspMsg", e.getMessage());
		}
		return rsp;
	}
}
