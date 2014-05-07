package com.openIdeas.apps.apisflorea.dao;

import java.sql.Timestamp;

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

    private static Logger logger = LoggerFactory.getLogger(SmsOpLogDaoTest.class);

    @Autowired
    SmsOpLogDao smsOpLogDao;

    @Test
    public void testSave() {
        SmsOpLog log = new SmsOpLog();
        log.setMessageId("8192343");
        log.setPhoneNo(18652925450L);
        log.setCreateTime(new Timestamp(System.currentTimeMillis()));
        log.setStatus(HandlerStatus.N);
        SmsOpLog sl = smsOpLogDao.save(log);
        Assert.assertNotNull(sl.getMessageId());
        logger.debug(sl.toString());
        log.setPhoneNo(18652925451L);
        log.setCreateTime(new Timestamp(System.currentTimeMillis()));
        log.setStatus(HandlerStatus.S);

        sl = smsOpLogDao.save(log);
        Assert.assertNotNull(sl.getPhoneNo());
        logger.debug(sl.toString());
        Iterable<SmsOpLog> its = smsOpLogDao.findAll();
        logger.debug("--------------------");
        for (SmsOpLog smsOpLog : its) {
            logger.debug(smsOpLog.toString());
        }
        logger.debug("--------------------");
    }
}
