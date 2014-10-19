package com.openIdeas.apps.apisflorea.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.openIdeas.apps.test.spring.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext-test.xml" })
@ActiveProfiles("production")
public class MailMessageDaoTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	private static Logger logger = LoggerFactory
			.getLogger(MailMessageDaoTest.class);

	@Autowired
	private MailMessageDao messageDao;

	@Test
	public void test() {
		int uc = messageDao
				.increaseSucdCount("<15fe634c.8d7a.145cafe0ad9.Coremail.mp1316@163.com>");
		Assert.assertEquals(1, uc);
	}

}
