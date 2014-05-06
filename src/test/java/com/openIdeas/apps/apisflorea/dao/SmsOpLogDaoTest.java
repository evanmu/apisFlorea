package com.openIdeas.apps.apisflorea.dao;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.test.spring.SpringTransactionalTestCase;

@ActiveProfiles("production")
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class SmsOpLogDaoTest extends SpringTransactionalTestCase {

	private static Logger logger = LoggerFactory
			.getLogger(SmsOpLogDaoTest.class);

	@Autowired
	SmsOpLogDao smsOpLogDao;

}
