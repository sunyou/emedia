package com.syou.emedia.web.ctrl.login;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.syou.emedia.web.consts.WebConstants;

@Controller
@RequestMapping("/admin")
@Scope(value="prototype")
public class LoginController {

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String login(Model model,String username,String password) throws Exception {
		if("admin".equals(username) && "sunyou".equals(password)){
			return "intf/index";
		}else{
			model.addAttribute("error", "用户不存在或密码错误！");
			return "error";
		}
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody JSONObject  callMethod(String username,String password) {
		JSONObject rsp = new JSONObject();
		try {
			if("admin".equals(username) && "sunyou".equals(password)){
				rsp.put("rspMsg", "intf/index");
				rsp.put("rspCode", WebConstants.SUCCESS_CODE_0000);
			}else{
				rsp.put("rspMsg", "用户名不存在或密码错误");
				rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
			}
			return rsp;
		} catch (Exception e) {
			e.printStackTrace();
			rsp.put("rspCode", WebConstants.ERROR_CODE_9999);
			rsp.put("rspMsg", e.getMessage());
		}
		return rsp;
	}
}
