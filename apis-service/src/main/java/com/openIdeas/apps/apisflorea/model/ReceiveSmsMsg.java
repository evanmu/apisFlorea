package com.openIdeas.apps.apisflorea.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkage.netmsg.server.AnswerBean;
import com.linkage.netmsg.server.ReceiveMsg;
import com.linkage.netmsg.server.ReturnMsgBean;
import com.linkage.netmsg.server.UpMsgBean;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;
import com.openIdeas.apps.apisflorea.result.GeniResult;

@Service("receiveSmsMsgImpl")
public class ReceiveSmsMsg extends ReceiveMsg {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OperatorLogServiceIntf operatorLog;

    /* 获取下行短信返回状态和短信ID的方法 */
    public void getAnswer(AnswerBean answerBean) {
        super.getAnswer(answerBean);
        /* 序列Id */
        String seqIdString = answerBean.getSeqId();
        // /* 短信状态 ,0表示提交至API平台成功 */
        int status = answerBean.getStatus();
        // /* 下行短信ID，用来唯一标识一条下行短信 */
        String smsId = answerBean.getMsgId();
        logger.info("序列号【{}】返回状态{}", seqIdString, status);

        if (0 == status) {
            logger.info("{} 邮件提交短信平台成功,序列号：{}", smsId, seqIdString);
            // 根据序列号获取邮件id
            GeniResult<String> msgResult = operatorLog.getMsgId(seqIdString);
            if (!msgResult.isSuccess()) {
                logger.info("转发记录中没有找到序列号：{}", seqIdString);
                return;
            }

            // 更新数据库手机发送记录状态为成功
            operatorLog.update2Sucd(msgResult.getObject(), seqIdString);
        }
    }

    /* 接收上行短信的方法 */
    public void getUpMsg(UpMsgBean upMsgBean) {
        super.getUpMsg(upMsgBean);
    }

    /* 获取下行短信回执的方法 */
    public void getReturnMsg(ReturnMsgBean returnMsgBean) {
        super.getReturnMsg(returnMsgBean);

        // String sequenceId = returnMsgBean.getSequenceId();
        // /* 短信的msgId */
        // String msgId = returnMsgBean.getMsgId();
        // /* 发送号码 */
        // String sendNum = returnMsgBean.getSendNum();
        // /* 接收号码 */
        // String receiveNum = returnMsgBean.getReceiveNum();
        // /* 短信提交时间 */
        // String submitTime = returnMsgBean.getSubmitTime();
        // /* 短信下发时间 */
        // String sendTime = returnMsgBean.getSendTime();
        // /* 短信状态 */
        // String msgStatus = returnMsgBean.getMsgStatus();
        // /* 短信错误代码 */
        // int msgErrStatus = returnMsgBean.getMsgErrStatus();

        // 此处加入接收短信回执的处理代码
        // System.out.println("ReturnMsgBean sequenceId: " + sequenceId);
        // System.out.println("ReturnMsgBean msgId: " + msgId);
        // System.out.println("ReturnMsgBean sendNum: " + sendNum);
        // System.out.println("ReturnMsgBean receiveNum: " + receiveNum);
        // System.out.println("ReturnMsgBean submitTime: " + submitTime);
        // System.out.println("ReturnMsgBean sendTime: " + sendTime);
        // System.out.println("ReturnMsgBean msgStatus: " + msgStatus);
        // System.out.println("ReturnMsgBean msgErrStatus: " + msgErrStatus);
    }
}
