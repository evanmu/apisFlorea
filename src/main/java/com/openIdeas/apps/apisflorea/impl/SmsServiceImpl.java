package com.openIdeas.apps.apisflorea.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;

@Service(RequestHandlerIntf.SEND_SMS)
public class SmsServiceImpl implements RequestHandlerIntf {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PhoneItemDao phoneItemDao;

	/**
	 * 消息线程池
	 */
	@Autowired
	@Qualifier("msgthreadPool")
	private ExecutorService msgPool;

	@Autowired
	private AnthenServiceIntf anthenService;

	@Override
	public String handlerRequest(Map<String, String> params) {
		// 1.调用认证任务
		firstAuthenTask();

		logger.debug("handlerRequest 参数{}", params);
		// 2. 获取当前待发送的手机号队列
		Iterable<PhoneItem> list = phoneItemDao.findAll();
		// 3. 短信内容 使用|分割“ERROR” “FAILURE” “CRITICAL” “WARNING” “INFORMATIONAL”
		String severity = params.get("severity");
		List<String> sts = Arrays.asList(severity.split("[|]"));
		// // 4. 调用wbs接口获取具体故障内容

		// 5. 转换为短信内容
		// StringBuffer sb = convert2Sms(sts, response);
		// String content = sb.toString();
		String content = "测试短信";
		logger.debug("短信内容： {}", content);

		SendMsgTask task = null;
		PhoneItem pi = new PhoneItem();
		pi.setId(1L);
		pi.setPhoneNo(18651616696L);
		for (PhoneItem phoneItem : list) {
			task = new SendMsgTask(phoneItem.getId(), phoneItem.getPhoneNo(),
					content);
			task.setAnthenService(anthenService);
			msgPool.execute(task);
		}

		return "SUCCESS";
	}

	/**
	 * 功能描述: <br>
	 * 认证任务
	 */
	private void firstAuthenTask() {
		AuthenTask task = new AuthenTask();
		task.setAnthenService(anthenService);
		Thread authThread = new Thread(task, "authenTask");
		authThread.start();
	}

	public static String getAnnot() {
		return SEND_SMS;
	}
}
