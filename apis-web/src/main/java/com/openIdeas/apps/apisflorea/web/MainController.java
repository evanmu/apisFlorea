package com.openIdeas.apps.apisflorea.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author Evan Mu
 */
@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping(value = "/index")
	public String index() {
		return "/main/index";
	}
	
	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "/main/welcome";
	}
	
}
