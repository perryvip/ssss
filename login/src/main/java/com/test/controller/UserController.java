package com.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.entity.User;
import com.test.service.UserService;
import com.test.util.JsonResult;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	/**
	 * 登录功能
	 */
	@ResponseBody
	@RequestMapping("/login.do")
	public Object login(String name,String password ){
		try {
			User user = userService.login(name, password);
			return new JsonResult(user);
		}catch (Exception e) {
			e.printStackTrace();
			return new JsonResult(e);
		}
		
	}
	/**
	 * 注册功能
	 */  
	@ResponseBody
	@RequestMapping("/regist.do")
	public JsonResult regist(String name,String password,String nick){
			try {
				User user = userService.regist(name, password, nick);
				return new JsonResult(user);
			} catch (Exception e) {
				e.printStackTrace();
				return new JsonResult(e);
			}	
	}
	
}

