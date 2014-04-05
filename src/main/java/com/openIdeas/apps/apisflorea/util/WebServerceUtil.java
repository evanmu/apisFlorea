package com.openIdeas.apps.apisflorea.util;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequest;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponse;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE;

public class WebServerceUtil {
    private static Logger logger = LoggerFactory.getLogger(WebServerceUtil.class);

    public Object getComplexWebservice(String endpoint, String namespace, String methodname, Object[] valuelist) {
        try {
            RPCServiceClient client = new RPCServiceClient();
            Options options = new Options();
            options.setTo(new EndpointReference(endpoint));
            options.setAction(methodname);
            options.setProperty(HTTPConstants.CHUNKED, true);
            client.setOptions(options);
            Object[] params = valuelist;// 要传递的参数值，其中包括数组
            QName qname = new QName(namespace, methodname, "isx");

            Class[] returnType = new Class[] { String[].class };
            Object[] objs = (Object[]) client.invokeBlocking(qname, params, returnType);
            return objs;
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            return null;
        }
    }

    public static GetAllActiveAlarmsResponse getAllActiveAlarms() {
        ISXCentralAlarmsService_v1_0Stub stub;
        try {
            // 创建Axis2 sub对象
            stub = new ISXCentralAlarmsService_v1_0Stub();
            GetAllActiveAlarmsRequestE getAllActiveAlarmsRequest40 = new GetAllActiveAlarmsRequestE();
            GetAllActiveAlarmsRequest request = new GetAllActiveAlarmsRequest();
            // request.setLocale("Test");
            getAllActiveAlarmsRequest40.setGetAllActiveAlarmsRequest(request);
            // 调用WebService接口
            GetAllActiveAlarmsResponseE ree = stub.getAllActiveAlarms(getAllActiveAlarmsRequest40);
            return ree.getGetAllActiveAlarmsResponse();
        } catch (AxisFault e) {
            logger.error(e.getMessage(), e);
        } catch (RemoteException e) {
            logger.error(e.getMessage(), e);
        } catch (AlarmServiceFault e) {
            logger.error(e.getMessage(), e);
        }

        return null;
    }
}
