package com.openIdeas.apps.apisflorea.mail;

import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.FromStringTerm;
import javax.mail.search.SearchTerm;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

/**
 * 收取邮件服务实现
 * 
 * @author evan
 * 
 */
@Service
public class ReceiveMailServiceImpl implements ReceiveMailServiceIntf {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private SessionProvider sessionProvider;

    private Session session;

    private Store mailStore;

    private String defaultSender;

    @SuppressWarnings("restriction")
    public ReceiveMailServiceImpl() {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        this.sessionProvider = new IMAPSessionProvider();
    }

    @Override
    public CollectionResult<List<Message>> getSubjects4Sms() {
        String methodName = "getSubjects4Sms";
        logger.debug("Entering {}", methodName);
        CollectionResult<List<Message>> result = new CollectionResult<List<Message>>();
        if (StringUtils.isEmpty(getDefaultSender())) {
            logger.error("{} 默认发件人为空", methodName);
            result.fail();
            return result;
        }

        try {
            // 连接邮件服务器
            if (!getMailStore().isConnected()) {
                logger.info("邮箱未登录，进行登录连接...");
                getMailStore().connect();
            }

            logger.info("邮箱登录成功....");
            Folder folder = mailStore.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);

            // 查询 defaultSender下未读邮件
            SearchTerm st = new AndTerm(new FromStringTerm(defaultSender), new FlagTerm(new Flags(Flags.Flag.SEEN),
                    false));
            // 搜索邮件
            Message[] msgArr = folder.search(st);
            // Message[] msgArr = folder.getMessages();
            logger.debug("您收到来自{}的未读邮件:{}封", defaultSender, msgArr.length);
            List<Message> list = new ArrayList<Message>();
            for (Message msg : msgArr) {
                // // 判断message 已经处理
                // logger.debug("待发送内容: {}", pmm.getSubject());
                // mm = new MailMessage();
                // mm.setOccurTime(pmm.getSentDate());
                // mm.setSubject(pmm.getSubject());
                // list.add(msg);
                // 标记已读
                // msg.setFlag(Flags.Flag.SEEN, true);
            }

            result.setDataSet(list);

            // 释放资源
            if (folder != null) {
                folder.close(true);
            }
        } catch (MessagingException me) {
            final Exception e = me.getNextException();

            if (e instanceof UnknownHostException) {
                logger.error("error.login.mailhost.unknownhostexception", e.getMessage());
            } else if (e instanceof NoRouteToHostException) {
                logger.error("error.login.mailhost.noroutetohostexception", e.getMessage());
            } else if (e instanceof ConnectException) {
                logger.error("error.login.mailhost.connectexception", e.getMessage());
            } else {
                logger.error("I don't recognize this error: " + me);
                logger.error("error.login.mailhost.default", e.getMessage());
            }
        }

        logger.debug("Exiting {}", methodName);
        return result;
    }

    public SessionProvider getSessionProvider() {
        return sessionProvider;
    }

    public Session getSession() {
        if (null == session) {
            logger.debug("获取邮件session");
            session = sessionProvider.getSession();
        }

        return session;
    }

    public Store getMailStore() {
        if (null == mailStore) {
            try {
                mailStore = getSession().getStore();
            } catch (NoSuchProviderException e) {
                logger.error("获取mailstore失败", e);
            }
        }
        return mailStore;
    }

    public String getDefaultSender() {
        if (StringUtils.isEmpty(defaultSender)) {
            this.defaultSender = PropertyFileUtil.get("mail.default.sender");
        }
        return defaultSender;
    }

}
