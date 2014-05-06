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
import javax.mail.internet.MimeMessage;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.FromStringTerm;
import javax.mail.search.MessageIDTerm;
import javax.mail.search.SearchTerm;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.Result;
import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

/**
 * 收取邮件服务实现
 * 
 * @author evan
 * 
 */
@Service
public class RemoteMailServiceImpl implements RemoteMailServiceIntf {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private SessionProvider sessionProvider;

    private Session session;

    private Store mailStore;

    private String defaultSender;
    
    @Autowired
    private MailMessageServiceIntf mailMessageService;

    @SuppressWarnings("restriction")
    public RemoteMailServiceImpl() {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        this.sessionProvider = new IMAPSessionProvider();
    }

    @Override
    public CollectionResult<List<String>> get2HanlerMail() {
        String methodName = "get2HanlerMail";
        logger.debug("Entering {}", methodName);
        CollectionResult<List<String>> result = new CollectionResult<List<String>>();
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
            List<String> list = new ArrayList<String>();
            for (Message msg : msgArr) {
            	MimeMessage mm = (MimeMessage)msg;
                logger.debug("主题:{}", mm.getSubject());
                logger.debug("发送时间:{}", mm.getSentDate());
                logger.debug("MessageID:{}", mm.getMessageID());
                MailEntity mail = new MailEntity();
                mail.setMessageId(mm.getMessageID());
                mail.setSubject(msg.getSubject());
                //保存邮件
                mailMessageService.saveMail(mail);
                list.add(mm.getMessageID());
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

	@Override
	public Result reserveMail(String id) {
		String methodName = "reserveMail";
        logger.debug("Entering {}", methodName);
        Result result = new Result();

        try {
            // 连接邮件服务器
            if (!getMailStore().isConnected()) {
                logger.info("邮箱未登录，进行登录连接...");
                getMailStore().connect();
            }

            logger.info("邮箱已经登录...");
            Folder folder = mailStore.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);

            // 查询 对应的邮件
            SearchTerm st = new MessageIDTerm(id);
            // 搜索邮件
            Message[] msgArr = folder.search(st);
            
            logger.debug("您收到id={}的邮件:{}封", id, msgArr.length);

            for (Message msg : msgArr) {
                MimeMessage mm = (MimeMessage)msg;
                mailMessageService.deleteById(mm.getMessageID());
                // 标记已读
                msg.setFlag(Flags.Flag.SEEN, true);
            }

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

}
