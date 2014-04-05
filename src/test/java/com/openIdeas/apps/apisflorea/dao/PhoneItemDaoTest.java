package com.openIdeas.apps.apisflorea.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.test.spring.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class PhoneItemDaoTest extends SpringTransactionalTestCase {

    private static Logger logger = LoggerFactory.getLogger(PhoneItemDaoTest.class);

    @Autowired
    PhoneItemDao phoneItemDao;

    @Test
    public void testSaveS() {
        PhoneItem item = new PhoneItem();
        item.setPhoneNo(18689458233L);
        PhoneItem result = phoneItemDao.save(item);
        Assert.assertNotNull(result.getId());
        logger.debug("保存结果：" + result.getId());

        List<PhoneItem> list = new ArrayList<PhoneItem>();
        list.add(item);
        item = new PhoneItem();
        item.setPhoneNo(18689458240L);
        list.add(item);

        Iterable<PhoneItem> itb = phoneItemDao.save(list);
        Assert.assertNotNull(itb);
        for (PhoneItem phoneItem : itb) {
            logger.debug("保存结果：" + phoneItem.getId());
        }

    }

    @Test
    public void testFindAll() {
        PhoneItem item = new PhoneItem();
        item.setPhoneNo(18689458233L);
        PhoneItem result = phoneItemDao.save(item);
        Assert.assertNotNull(result.getId());
        // logger.debug("保存结果：" + result.getId());

        List<PhoneItem> list = new ArrayList<PhoneItem>();
        list.add(item);
        item = new PhoneItem();
        item.setPhoneNo(18689458240L);
        list.add(item);

        Iterable<PhoneItem> itb = phoneItemDao.save(list);
        Assert.assertNotNull(itb);

        List<PhoneItem> lip = (List<PhoneItem>) phoneItemDao.findAll();
//        lip.addAll();
        for (PhoneItem phoneItem : lip) {
            logger.debug("find保存结果：" + phoneItem.getId());
        }
    }
}
