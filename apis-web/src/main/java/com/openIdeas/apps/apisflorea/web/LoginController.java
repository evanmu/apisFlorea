package com.openIdeas.apps.apisflorea.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页面
 * 
 * @author Evan Mu
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
}
