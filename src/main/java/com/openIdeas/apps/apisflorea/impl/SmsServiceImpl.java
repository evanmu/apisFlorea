package com.openIdeas.apps.apisflorea.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkage.netmsg.NetMsgclient;
import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;
import com.openIdeas.apps.apisflorea.result.Result;

@Service(RequestHandlerIntf.SEND_SMS)
public class SmsServiceImpl extends AbstractRequestHandleImpl {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AnthenServiceIntf anthenService;

    @Autowired
    private PhoneItemDao phoneItemDao;

    private List<PhoneItem> phoneList = new ArrayList<PhoneItem>();;

    @Override
    public Result initParams() {
        Result r = new Result();
        // 短信接口认证登录
        if (!anthenService.isAnthed()) {
            logger.debug("{} 短信接口登录", "initParams");
            anthenService.anthenMsg(new ReceiveSmsMsg());
        }
        r.setSuccess(anthenService.isAnthed());
        return r;
    }

    protected String getForwardContent(Map<String, String> params) {
        // 1. 请求中获取内容
        String content = params.get("content");
        // content = "测试短信" + new Timestamp(System.currentTimeMillis());
        logger.debug("短信内容： {}", content);
        return content;
    }

    @Override
    public void handleForward(String content) {
        logger.debug("Entering {}", "handleForward");
        // 1. 获取当前待发送的手机号队列
        List<PhoneItem> list = getPhoneList();

        // 2. 创建发送短信线程任务
        NetMsgclient client = anthenService.getMsgClient();
        logger.debug("认证成功, phoneList has next=" + phoneList.iterator().hasNext());
        for (PhoneItem phoneItem : list) {
            logger.debug("发送短信，手机号：{}， 短信内容：{}", phoneItem.getPhoneNo(), content);
            // 发送短信记录操作日志
            client.sendMsg(client, 0, phoneItem.getPhoneNo().toString(), content, 1);
            try {
                // 每秒上限提交2条
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }

        logger.debug("Exiting {}", "handleForward");
    }

    private List<PhoneItem> getPhoneList() {
        if (phoneList.size() != 0) {
            return phoneList;
        }

        // 查询数据库
        logger.debug("{} 数据库查询号码列表", "getPhoneList");
        Iterable<PhoneItem> itera = phoneItemDao.findAll();

        // 添加到list成员中
        if (null != itera) {
            CollectionUtils.addAll(phoneList, itera.iterator());
        }

        return phoneList;
    }

    public static String getAnnot() {
        return SEND_SMS;
    }

    @Override
    public void clearQueue() {
        this.phoneList.clear();
    }
}
