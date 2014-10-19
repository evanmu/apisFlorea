package com.openIdeas.apps.apisflorea.intf;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.sql.Timestamp;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.linkage.netmsg.NetMsgclient;
import com.linkage.netmsg.server.ReceiveMsg;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;
import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class AnthenServiceIntfTest {

	@Autowired
	AnthenServiceIntf anthenService;

	@Before
	public void init() {
		try {
			PropertyFileUtil.init("test");
		} catch (IOException e) {
			System.err.println("初始化配置失败");
		}
		// 设置代理
		// ProxySelector.getDefault();
		// Properties props = System.getProperties();
		// // socks代理服务器的地址与端口
		// props.setProperty("socksProxyHost", "192.168.121.32");
		// props.setProperty("socksProxyPort", "8080");
	}

	static class MyAuthenticator extends Authenticator {
		private String user = "";
		private String password = "";

		public MyAuthenticator(String user, String password) {
			this.user = user;
			this.password = password;
		}

		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user, password.toCharArray());
		}
	}

	@Test
	public void testAnthenMsg() {
		// AuthParams params = new AuthParams();
		// params.setUsername("lv7872782");
		// params.setPassword("111111");
		ReceiveMsg msgImpl = new ReceiveSmsMsg();
		boolean result = anthenService.anthenMsg(msgImpl);
		System.out.println("认证结果： " + result);

		NetMsgclient client = anthenService.getMsgClient();
		// 发送短信记录操作日志
		client.sendMsg(client, 0, "18652925450",
				"测试短信" + new Timestamp(System.currentTimeMillis()), 1);
	}
}
