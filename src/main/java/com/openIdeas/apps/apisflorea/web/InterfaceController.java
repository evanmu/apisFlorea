package com.openIdeas.apps.apisflorea.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.impl.InterfaceServcie;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.util.RequestUtils;

/**
 * 登录页面
 * 
 * @author Evan Mu
 */
@Controller
@RequestMapping("/gateway")
public class InterfaceController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 发送短信接口
	 * 
	 * @return
	 */
	@RequestMapping(value = "/{service}")
	@ResponseBody
	public String handler(@PathVariable String service,
			HttpServletRequest request) {
		logger.info("网关接口服务[" + service + "], 参数：" + request.getParameterMap());

		try {
			InterfaceEm inte = InterfaceEm.valueOf(service);
			Map<String, String> map = RequestUtils.getParameters(request);

			RequestHandlerIntf handler = InterfaceServcie.getHandler(inte);
			return handler.handlerRequest(map);
		} catch (IllegalArgumentException e) {
			logger.info("网关接口服务不支持类型： " + service);
			return null;
		}
	}

}
