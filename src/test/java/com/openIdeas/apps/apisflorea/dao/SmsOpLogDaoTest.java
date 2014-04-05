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

    private static Logger logger = LoggerFactory.getLogger(SmsOpLogDaoTest.class);

    @Autowired
    SmsOpLogDao smsOpLogDao;

    public SmsOpLog initData() {
        SmsOpLog log = new SmsOpLog();
        log.setSerialNo(12L);
        log.setPhoneNo(18892392983L);
        log.setCreateTime(new Date());
        log.setStatus(HandlerStatus.N);
        log.setContent("测试短信");
        return smsOpLogDao.save(log);
    }

    @Test
    public void testSaveIterableOfS() {
        SmsOpLog result = initData();

        Assert.assertNotNull(result.getId());
        logger.debug("保存完成: id=" + result.getId());
        SmsOpLog sms = smsOpLogDao.findOne(result.getId());
        logger.debug("要发送内容: {}, 状态{}", sms.getContent(), sms.getStatus());
    }

    @Test
    public void testFindAll() {
        initData();

        Iterable<SmsOpLog> itb = smsOpLogDao.findAll();
        Assert.assertNotNull(itb);
        for (SmsOpLog smsOpLog : itb) {
            logger.debug("id=" + smsOpLog.getId());
            logger.debug("手机号：" + smsOpLog.getPhoneNo() + "要发送内容: " + smsOpLog.getContent());
        }
    }

    @Test
    public void testFindBySerialNo() {
        SmsOpLog result = initData();

        Assert.assertNotNull(result.getId());
        logger.debug("保存完成: id=" + result.getId());
        SmsOpLog sms = smsOpLogDao.findBySerialNo(12L);
        logger.debug("使用序列号查询要发送内容: {}, 状态{}", sms.getContent(), sms.getStatus());
    }
}
