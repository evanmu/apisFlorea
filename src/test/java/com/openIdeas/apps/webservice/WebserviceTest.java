package com.openIdeas.apps.webservice;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties.ProxyProperties;

import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.ArrayOfISXCAlarm;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponse;
import com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.ISXCAlarm;
import com.openIdeas.apps.apisflorea.util.WebServerceUtil;

public class WebserviceTest {

	// Create an ADBBean and provide it as the test object
	public static ADBBean getTestObject(Class<?> type)
			throws java.lang.Exception {
		return (ADBBean) type.newInstance();
	}

	public static void testStatic() {
		GetAllActiveAlarmsResponse response = WebServerceUtil
				.getAllActiveAlarms();
		ArrayOfISXCAlarm arrays = response.getArrayOfISXCAlarm();
		if (arrays.getISXCAlarm().length > 0) {
			System.err.println("存在设备故障");
			for (ISXCAlarm alarm : arrays.getISXCAlarm()) {
				System.out.println(alarm.getDescription());
				System.out.println(alarm.getISXCAlarmSeverity());
				System.out.println(alarm.getRecommendedAction());
			}
		}
	}

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 * 
	 * @param stub
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	private static void setNetProxy(ISXCentralAlarmsService_v1_0Stub stub) {
		Options options = stub._getServiceClient().getOptions();
		ProxyProperties proxyProperties = new ProxyProperties();
		proxyProperties.setProxyName("10.19.110.32");
		proxyProperties.setProxyPort(8080);
		proxyProperties.setUserName("13010158");
		proxyProperties.setPassWord("123");
		options.setProperty(HTTPConstants.PROXY, proxyProperties);
	}

	public static void main(String[] args) {
		dynamicTest();
	}

	/**
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 * 
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	private static void dynamicTest() {
		// String endpoint =
		// "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAllActiveAlarms";
		// // 群发邮件接口
		// String namespace =
		// "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1";
		String endpoint = "http://127.0.0.1:8080/WS_HL01/services/ISXCentralAlarmsService_v1_0";
		String namespace = "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1";
		String soapAction = "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAllActiveAlarms";

		Map<String, String> map = new HashMap<String, String>();
		Object[] obj = new Object[] {};
		// 调用接口方法
		QName qname = new QName(namespace, "getAllActiveAlarmsRequest", "isx");

		Object[] result = (Object[]) getComplexWebservice(endpoint, soapAction,
				qname, obj);
		if (result != null && result.length > 0) {
			for (int i = 0; i < result.length; i++) {
				String[] ss = (String[]) result[i];
				for (int j = 0; j < ss.length; j++) {
					System.out.println("ss[" + j + "]=" + ss[j]);
				}
				System.out.println("result[" + i + "]=" + result[i]);
			}
		}
	}

	public static Object getComplexWebservice(String endpoint,
			String soapAction, QName qname, Object[] valuelist) {
		try {
			RPCServiceClient client = new RPCServiceClient();
			Options options = new Options();
			options.setTo(new EndpointReference(endpoint));
			options.setAction(soapAction);
			options.setProperty(HTTPConstants.CHUNKED, true);
			options.setExceptionToBeThrownOnSOAPFault(true);

			client.setOptions(options);
			Object[] params = valuelist;// 要传递的参数值，其中包括数组
			Class[] returnType = new Class[] { String[].class };
			Object[] objs = (Object[]) client.invokeBlocking(qname, params,
					returnType);
			return objs;
		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
			return null;
		}
	}

}
