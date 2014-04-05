/**
 * ISXCentralAlarmsService_v1_0Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package com.apc.www.stdws.wsdl.isxcentralalarms_v1;

import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

/*
 *  ISXCentralAlarmsService_v1_0Stub java implementation
 */

public class ISXCentralAlarmsService_v1_0Stub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("ISXCentralAlarmsService_v1_0" + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[9];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAlarmsHistoryForDevice"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAlarmsHistoryForSensor"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAllActiveAlarms"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getActiveAlarmsForSeverity"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAlarmsHistory"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getActiveAlarmsForSensor"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAlarmByID"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getActiveAlarmsForDevice"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                "getAlarmsHistoryForSeverity"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

    }

    // populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistoryForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAllActiveAlarms"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAllActiveAlarms"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAllActiveAlarms"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getActiveAlarmsForSeverity"), "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getActiveAlarmsForSeverity"), "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getActiveAlarmsForSeverity"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistory"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistory"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmsHistory"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForSensor"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmByID"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmByID"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getAlarmByID"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"), "getActiveAlarmsForDevice"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

        faultExceptionNameMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getAlarmsHistoryForSeverity"), "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultExceptionClassNameMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getAlarmsHistoryForSeverity"), "com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault");
        faultMessageMap.put(
                new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault"),
                        "getAlarmsHistoryForSeverity"),
                "com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub$AlarmServiceFault");

    }

    /**
     * Constructor that takes in a configContext
     */

    public ISXCentralAlarmsService_v1_0Stub(org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public ISXCentralAlarmsService_v1_0Stub(org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    }

    /**
     * Default Constructor
     */
    public ISXCentralAlarmsService_v1_0Stub(org.apache.axis2.context.ConfigurationContext configurationContext)
            throws org.apache.axis2.AxisFault {

        this(configurationContext, PropertyFileUtil.get("wbsserver"));

    }

    /**
     * Default Constructor
     */
    public ISXCentralAlarmsService_v1_0Stub() throws org.apache.axis2.AxisFault {

        this("http://localhost:8080/WS_HL01/services/ISXCentralAlarmsService_v1_0/");

    }

    /**
     * Constructor taking the target endpoint
     */
    public ISXCentralAlarmsService_v1_0Stub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAlarmsHistoryForDevice
     * @param getAlarmsHistoryForDeviceRequest0
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE getAlarmsHistoryForDevice(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE getAlarmsHistoryForDeviceRequest0)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForDevice");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getAlarmsHistoryForDeviceRequest0, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForDevice")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAlarmsHistoryForDevice"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAlarmsHistoryForDevice"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForDevice"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForDevice"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAlarmsHistoryForDevice
     * @param getAlarmsHistoryForDeviceRequest0
     */
    public void startgetAlarmsHistoryForDevice(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE getAlarmsHistoryForDeviceRequest0,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[0].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForDevice");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getAlarmsHistoryForDeviceRequest0, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForDevice")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAlarmsHistoryForDevice"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAlarmsHistoryForDevice((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAlarmsHistoryForDevice(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAlarmsHistoryForDevice"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForDevice"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForDevice"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAlarmsHistoryForDevice((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAlarmsHistoryForDevice(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForDevice(f);
                            }
                        } else {
                            callback.receiveErrorgetAlarmsHistoryForDevice(f);
                        }
                    } else {
                        callback.receiveErrorgetAlarmsHistoryForDevice(f);
                    }
                } else {
                    callback.receiveErrorgetAlarmsHistoryForDevice(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAlarmsHistoryForDevice(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAlarmsHistoryForSensor
     * @param getAlarmsHistoryForSensorRequest2
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE getAlarmsHistoryForSensor(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE getAlarmsHistoryForSensorRequest2)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForSensor");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getAlarmsHistoryForSensorRequest2, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForSensor")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAlarmsHistoryForSensor"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAlarmsHistoryForSensor"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForSensor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForSensor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAlarmsHistoryForSensor
     * @param getAlarmsHistoryForSensorRequest2
     */
    public void startgetAlarmsHistoryForSensor(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE getAlarmsHistoryForSensorRequest2,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[1].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForSensor");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getAlarmsHistoryForSensorRequest2, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForSensor")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAlarmsHistoryForSensor"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAlarmsHistoryForSensor((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAlarmsHistoryForSensor(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAlarmsHistoryForSensor"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForSensor"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForSensor"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAlarmsHistoryForSensor((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAlarmsHistoryForSensor(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSensor(f);
                            }
                        } else {
                            callback.receiveErrorgetAlarmsHistoryForSensor(f);
                        }
                    } else {
                        callback.receiveErrorgetAlarmsHistoryForSensor(f);
                    }
                } else {
                    callback.receiveErrorgetAlarmsHistoryForSensor(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAlarmsHistoryForSensor(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAllActiveAlarms
     * @param getAllActiveAlarmsRequest4
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE getAllActiveAlarms(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE getAllActiveAlarmsRequest4)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAllActiveAlarms");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAllActiveAlarmsRequest4,
                    optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAllActiveAlarms")), new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAllActiveAlarms"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAllActiveAlarms"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllActiveAlarms"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllActiveAlarms"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAllActiveAlarms
     * @param getAllActiveAlarmsRequest4
     */
    public void startgetAllActiveAlarms(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE getAllActiveAlarmsRequest4,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAllActiveAlarms");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAllActiveAlarmsRequest4,
                optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAllActiveAlarms")), new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAllActiveAlarms"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAllActiveAlarms((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAllActiveAlarms(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAllActiveAlarms"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAllActiveAlarms"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAllActiveAlarms"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAllActiveAlarms((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAllActiveAlarms(new java.rmi.RemoteException(ex.getMessage(),
                                        ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllActiveAlarms(f);
                            }
                        } else {
                            callback.receiveErrorgetAllActiveAlarms(f);
                        }
                    } else {
                        callback.receiveErrorgetAllActiveAlarms(f);
                    }
                } else {
                    callback.receiveErrorgetAllActiveAlarms(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAllActiveAlarms(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getActiveAlarmsForSeverity
     * @param getActiveAlarmsForSeverityRequest6
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE getActiveAlarmsForSeverity(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE getActiveAlarmsForSeverityRequest6)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForSeverity");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getActiveAlarmsForSeverityRequest6, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForSeverity")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getActiveAlarmsForSeverity"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getActiveAlarmsForSeverity"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForSeverity"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForSeverity"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetActiveAlarmsForSeverity
     * @param getActiveAlarmsForSeverityRequest6
     */
    public void startgetActiveAlarmsForSeverity(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE getActiveAlarmsForSeverityRequest6,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[3].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForSeverity");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getActiveAlarmsForSeverityRequest6, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForSeverity")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getActiveAlarmsForSeverity"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetActiveAlarmsForSeverity((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetActiveAlarmsForSeverity(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getActiveAlarmsForSeverity"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForSeverity"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForSeverity"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetActiveAlarmsForSeverity((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetActiveAlarmsForSeverity(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSeverity(f);
                            }
                        } else {
                            callback.receiveErrorgetActiveAlarmsForSeverity(f);
                        }
                    } else {
                        callback.receiveErrorgetActiveAlarmsForSeverity(f);
                    }
                } else {
                    callback.receiveErrorgetActiveAlarmsForSeverity(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetActiveAlarmsForSeverity(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAlarmsHistory
     * @param getAlarmsHistoryRequest8
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE getAlarmsHistory(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE getAlarmsHistoryRequest8)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistory");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAlarmsHistoryRequest8,
                    optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAlarmsHistory")), new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistory"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAlarmsHistory"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAlarmsHistory"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAlarmsHistory"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAlarmsHistory
     * @param getAlarmsHistoryRequest8
     */
    public void startgetAlarmsHistory(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE getAlarmsHistoryRequest8,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistory");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAlarmsHistoryRequest8,
                optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAlarmsHistory")), new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistory"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAlarmsHistory((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAlarmsHistory(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAlarmsHistory"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistory"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistory"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAlarmsHistory((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAlarmsHistory(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistory(f);
                            }
                        } else {
                            callback.receiveErrorgetAlarmsHistory(f);
                        }
                    } else {
                        callback.receiveErrorgetAlarmsHistory(f);
                    }
                } else {
                    callback.receiveErrorgetAlarmsHistory(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAlarmsHistory(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getActiveAlarmsForSensor
     * @param getActiveAlarmsForSensorRequest10
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE getActiveAlarmsForSensor(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE getActiveAlarmsForSensorRequest10)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForSensor");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getActiveAlarmsForSensorRequest10, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForSensor")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getActiveAlarmsForSensor"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getActiveAlarmsForSensor"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForSensor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForSensor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetActiveAlarmsForSensor
     * @param getActiveAlarmsForSensorRequest10
     */
    public void startgetActiveAlarmsForSensor(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE getActiveAlarmsForSensorRequest10,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[5].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForSensor");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getActiveAlarmsForSensorRequest10, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForSensor")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getActiveAlarmsForSensor"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetActiveAlarmsForSensor((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetActiveAlarmsForSensor(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getActiveAlarmsForSensor"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForSensor"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForSensor"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetActiveAlarmsForSensor((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetActiveAlarmsForSensor(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForSensor(f);
                            }
                        } else {
                            callback.receiveErrorgetActiveAlarmsForSensor(f);
                        }
                    } else {
                        callback.receiveErrorgetActiveAlarmsForSensor(f);
                    }
                } else {
                    callback.receiveErrorgetActiveAlarmsForSensor(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetActiveAlarmsForSensor(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAlarmByID
     * @param getAlarmByIDRequest12
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE getAlarmByID(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE getAlarmByIDRequest12)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6]
                    .getName());
            _operationClient.getOptions().setAction("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmByID");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAlarmByIDRequest12,
                    optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAlarmByID")), new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmByID"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAlarmByID"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAlarmByID"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAlarmByID"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAlarmByID
     * @param getAlarmByIDRequest12
     */
    public void startgetAlarmByID(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE getAlarmByIDRequest12,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmByID");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAlarmByIDRequest12,
                optimizeContent(new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAlarmByID")), new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmByID"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAlarmByID((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAlarmByID(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAlarmByID"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmByID"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmByID"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAlarmByID((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAlarmByID(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmByID(f);
                            }
                        } else {
                            callback.receiveErrorgetAlarmByID(f);
                        }
                    } else {
                        callback.receiveErrorgetAlarmByID(f);
                    }
                } else {
                    callback.receiveErrorgetAlarmByID(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAlarmByID(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getActiveAlarmsForDevice
     * @param getActiveAlarmsForDeviceRequest14
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE getActiveAlarmsForDevice(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE getActiveAlarmsForDeviceRequest14)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForDevice");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getActiveAlarmsForDeviceRequest14, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForDevice")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getActiveAlarmsForDevice"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getActiveAlarmsForDevice"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForDevice"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getActiveAlarmsForDevice"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetActiveAlarmsForDevice
     * @param getActiveAlarmsForDeviceRequest14
     */
    public void startgetActiveAlarmsForDevice(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE getActiveAlarmsForDeviceRequest14,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[7].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getActiveAlarmsForDevice");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getActiveAlarmsForDeviceRequest14, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getActiveAlarmsForDevice")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getActiveAlarmsForDevice"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetActiveAlarmsForDevice((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetActiveAlarmsForDevice(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getActiveAlarmsForDevice"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForDevice"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getActiveAlarmsForDevice"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetActiveAlarmsForDevice((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetActiveAlarmsForDevice(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetActiveAlarmsForDevice(f);
                            }
                        } else {
                            callback.receiveErrorgetActiveAlarmsForDevice(f);
                        }
                    } else {
                        callback.receiveErrorgetActiveAlarmsForDevice(f);
                    }
                } else {
                    callback.receiveErrorgetActiveAlarmsForDevice(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetActiveAlarmsForDevice(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#getAlarmsHistoryForSeverity
     * @param getAlarmsHistoryForSeverityRequest16
     * 
     * @throws com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault :
     */

    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE getAlarmsHistoryForSeverity(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE getAlarmsHistoryForSeverityRequest16)

    throws java.rmi.RemoteException

    , com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8]
                    .getName());
            _operationClient.getOptions().setAction(
                    "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForSeverity");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getAlarmsHistoryForSeverityRequest16, optimizeContent(new javax.xml.namespace.QName(
                            "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForSeverity")),
                    new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                            "getAlarmsHistoryForSeverity"));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
                    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                        "getAlarmsHistoryForSeverity"))) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForSeverity"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                        "getAlarmsHistoryForSeverity"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                            throw (com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0#startgetAlarmsHistoryForSeverity
     * @param getAlarmsHistoryForSeverityRequest16
     */
    public void startgetAlarmsHistoryForSeverity(

            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE getAlarmsHistoryForSeverityRequest16,

            final com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0CallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[8].getName());
        _operationClient.getOptions().setAction(
                "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1/getAlarmsHistoryForSeverity");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getAlarmsHistoryForSeverityRequest16, optimizeContent(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1", "getAlarmsHistoryForSeverity")),
                new javax.xml.namespace.QName("http://www.apc.com/stdws/wsdl/ISXCentralAlarms-v1",
                        "getAlarmsHistoryForSeverity"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(
                            resultEnv.getBody().getFirstElement(),
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAlarmsHistoryForSeverity((com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAlarmsHistoryForSeverity(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
                                .getQName(), "getAlarmsHistoryForSeverity"))) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForSeverity"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap
                                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
                                                "getAlarmsHistoryForSeverity"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                if (ex instanceof com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) {
                                    callback.receiveErrorgetAlarmsHistoryForSeverity((com.apc.www.stdws.wsdl.isxcentralalarms_v1.AlarmServiceFault) ex);
                                    return;
                                }

                                callback.receiveErrorgetAlarmsHistoryForSeverity(new java.rmi.RemoteException(ex
                                        .getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                            }
                        } else {
                            callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                        }
                    } else {
                        callback.receiveErrorgetAlarmsHistoryForSeverity(f);
                    }
                } else {
                    callback.receiveErrorgetAlarmsHistoryForSeverity(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                        .getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAlarmsHistoryForSeverity(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    // http://localhost:8080/WS_HL01/services/ISXCentralAlarmsService_v1_0/
    public static class GetActiveAlarmsForSensorResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForSensorResponse Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForSensorResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForSensorResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSensorResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSensorResponse object = new GetActiveAlarmsForSensorResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForSensorResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForSensorResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSensorRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForSensorRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCElementID
         */

        protected java.lang.String localISXCElementID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getISXCElementID() {
            return localISXCElementID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementID
         */
        public void setISXCElementID(java.lang.String param) {

            this.localISXCElementID = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForSensorRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForSensorRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "ISXCElementID", xmlWriter);

            if (localISXCElementID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localISXCElementID);

            }

            xmlWriter.writeEndElement();
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCElementID"));

            if (localISXCElementID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSensorRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSensorRequest object = new GetActiveAlarmsForSensorRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForSensorRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForSensorRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCElementID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setISXCElementID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForDeviceResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForDeviceResponse Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForDeviceResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForDeviceResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForDeviceResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForDeviceResponse object = new GetAlarmsHistoryForDeviceResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForDeviceResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForDeviceResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class AlarmServiceFault implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault", "isx");

        /**
         * field for AlarmServiceFault
         */

        protected AlarmFaultDetail localAlarmServiceFault;

        /**
         * Auto generated getter method
         * 
         * @return AlarmFaultDetail
         */
        public AlarmFaultDetail getAlarmServiceFault() {
            return localAlarmServiceFault;
        }

        /**
         * Auto generated setter method
         * 
         * @param param AlarmServiceFault
         */
        public void setAlarmServiceFault(AlarmFaultDetail param) {

            this.localAlarmServiceFault = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localAlarmServiceFault == null) {
                throw new org.apache.axis2.databinding.ADBException("AlarmServiceFault cannot be null!");
            }
            localAlarmServiceFault.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localAlarmServiceFault.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AlarmServiceFault parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                AlarmServiceFault object = new AlarmServiceFault();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "AlarmServiceFault")
                                            .equals(reader.getName())) {

                                object.setAlarmServiceFault(AlarmFaultDetail.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmByIDResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmByIDResponse Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCAlarm
         */

        protected ISXCAlarm localISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarm
         */
        public ISXCAlarm getISXCAlarm() {
            return localISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarm
         */
        public void setISXCAlarm(ISXCAlarm param) {

            this.localISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmByIDResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GetAlarmByIDResponse",
                            xmlWriter);
                }

            }

            if (localISXCAlarm == null) {

                writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ISXCAlarm", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localISXCAlarm.serialize(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ISXCAlarm"), xmlWriter);
            }

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCAlarm"));

            elementList.add(localISXCAlarm == null ? null : localISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmByIDResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmByIDResponse object = new GetAlarmByIDResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmByIDResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmByIDResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCAlarm").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            object.setISXCAlarm(null);
                            reader.next();

                            reader.next();

                        } else {

                            object.setISXCAlarm(ISXCAlarm.Factory.parse(reader));

                            reader.next();
                        }
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSeverityResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForSeverityResponse", "isx");

        /**
         * field for GetAlarmsHistoryForSeverityResponse
         */

        protected GetAlarmsHistoryForSeverityResponse localGetAlarmsHistoryForSeverityResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForSeverityResponse
         */
        public GetAlarmsHistoryForSeverityResponse getGetAlarmsHistoryForSeverityResponse() {
            return localGetAlarmsHistoryForSeverityResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForSeverityResponse
         */
        public void setGetAlarmsHistoryForSeverityResponse(GetAlarmsHistoryForSeverityResponse param) {

            this.localGetAlarmsHistoryForSeverityResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForSeverityResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "getAlarmsHistoryForSeverityResponse cannot be null!");
            }
            localGetAlarmsHistoryForSeverityResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForSeverityResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSeverityResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSeverityResponseE object = new GetAlarmsHistoryForSeverityResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForSeverityResponse").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForSeverityResponse(GetAlarmsHistoryForSeverityResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSensorResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForSensorResponse Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForSensorResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForSensorResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSensorResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSensorResponse object = new GetAlarmsHistoryForSensorResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForSensorResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForSensorResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAllActiveAlarmsRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAllActiveAlarmsRequest", "isx");

        /**
         * field for GetAllActiveAlarmsRequest
         */

        protected GetAllActiveAlarmsRequest localGetAllActiveAlarmsRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAllActiveAlarmsRequest
         */
        public GetAllActiveAlarmsRequest getGetAllActiveAlarmsRequest() {
            return localGetAllActiveAlarmsRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAllActiveAlarmsRequest
         */
        public void setGetAllActiveAlarmsRequest(GetAllActiveAlarmsRequest param) {

            this.localGetAllActiveAlarmsRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAllActiveAlarmsRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getAllActiveAlarmsRequest cannot be null!");
            }
            localGetAllActiveAlarmsRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAllActiveAlarmsRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAllActiveAlarmsRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAllActiveAlarmsRequestE object = new GetAllActiveAlarmsRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAllActiveAlarmsRequest").equals(reader.getName())) {

                                object.setGetAllActiveAlarmsRequest(GetAllActiveAlarmsRequest.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ArrayOfISXCAlarm implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = ArrayOfISXCAlarm Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentral/2008/10 Namespace Prefix = ns1
         */

        /**
         * field for ISXCAlarm This was an Array!
         */

        protected ISXCAlarm[] localISXCAlarm;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localISXCAlarmTracker = false;

        public boolean isISXCAlarmSpecified() {
            return localISXCAlarmTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarm[]
         */
        public ISXCAlarm[] getISXCAlarm() {
            return localISXCAlarm;
        }

        /**
         * validate the array for ISXCAlarm
         */
        protected void validateISXCAlarm(ISXCAlarm[] param) {

        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarm
         */
        public void setISXCAlarm(ISXCAlarm[] param) {

            validateISXCAlarm(param);

            localISXCAlarmTracker = true;

            this.localISXCAlarm = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * 
         * @param param ISXCAlarm
         */
        public void addISXCAlarm(ISXCAlarm param) {
            if (localISXCAlarm == null) {
                localISXCAlarm = new ISXCAlarm[] {};
            }

            // update the setting tracker
            localISXCAlarmTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localISXCAlarm);
            list.add(param);
            this.localISXCAlarm = (ISXCAlarm[]) list.toArray(new ISXCAlarm[list.size()]);

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ArrayOfISXCAlarm", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ArrayOfISXCAlarm",
                            xmlWriter);
                }

            }
            if (localISXCAlarmTracker) {
                if (localISXCAlarm != null) {
                    for (int i = 0; i < localISXCAlarm.length; i++) {
                        if (localISXCAlarm[i] != null) {
                            localISXCAlarm[i].serialize(new javax.xml.namespace.QName(
                                    "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarm"), xmlWriter);
                        } else {

                            writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarm",
                                    xmlWriter);

                            // write the nil attribute
                            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                            xmlWriter.writeEndElement();

                        }

                    }
                } else {

                    writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarm", xmlWriter);

                    // write the nil attribute
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                    xmlWriter.writeEndElement();

                }
            }
            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localISXCAlarmTracker) {
                if (localISXCAlarm != null) {
                    for (int i = 0; i < localISXCAlarm.length; i++) {

                        if (localISXCAlarm[i] != null) {
                            elementList.add(new javax.xml.namespace.QName(
                                    "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarm"));
                            elementList.add(localISXCAlarm[i]);
                        } else {

                            elementList.add(new javax.xml.namespace.QName(
                                    "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarm"));
                            elementList.add(null);

                        }

                    }
                } else {

                    elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                            "ISXCAlarm"));
                    elementList.add(localISXCAlarm);

                }

            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfISXCAlarm parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfISXCAlarm object = new ArrayOfISXCAlarm();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ArrayOfISXCAlarm".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfISXCAlarm) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "ISXCAlarm").equals(reader.getName())) {

                        // Process the array and step past its final element's end.

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            list1.add(null);
                            reader.next();
                        } else {
                            list1.add(ISXCAlarm.Factory.parse(reader));
                        }
                        // loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                // two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                        "ISXCAlarm").equals(reader.getName())) {

                                    nillableValue = reader.getAttributeValue(
                                            "http://www.w3.org/2001/XMLSchema-instance", "nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                        list1.add(null);
                                        reader.next();
                                    } else {
                                        list1.add(ISXCAlarm.Factory.parse(reader));
                                    }
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility to convert and set the array

                        object.setISXCAlarm((ISXCAlarm[]) org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToArray(ISXCAlarm.class, list1));

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ISXCElement implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = ISXCElement Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentral/2008/10 Namespace Prefix = ns1
         */

        /**
         * field for ISXCElementType
         */

        protected ISXCElementType localISXCElementType;

        /**
         * Auto generated getter method
         * 
         * @return ISXCElementType
         */
        public ISXCElementType getISXCElementType() {
            return localISXCElementType;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementType
         */
        public void setISXCElementType(ISXCElementType param) {

            this.localISXCElementType = param;

        }

        /**
         * field for Id
         */

        protected java.lang.String localId;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getId() {
            return localId;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Id
         */
        public void setId(java.lang.String param) {

            this.localId = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ISXCElement", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ISXCElement", xmlWriter);
                }

            }

            if (localISXCElementType == null) {

                writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCElementType", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localISXCElementType.serialize(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCElementType"), xmlWriter);
            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "id", xmlWriter);

            if (localId == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(localId);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "ISXCElementType"));

            elementList.add(localISXCElementType == null ? null : localISXCElementType);

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "id"));

            elementList.add(localId == null ? null : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localId));

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ISXCElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ISXCElement object = new ISXCElement();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ISXCElement".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ISXCElement) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "ISXCElementType").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            object.setISXCElementType(null);
                            reader.next();

                            reader.next();

                        } else {

                            object.setISXCElementType(ISXCElementType.Factory.parse(reader));

                            reader.next();
                        }
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "id")
                                    .equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

                            java.lang.String content = reader.getElementText();

                            object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        } else {

                            reader.getElementText(); // throw away text nodes if any.
                        }

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryRequest", "isx");

        /**
         * field for GetAlarmsHistoryRequest
         */

        protected GetAlarmsHistoryRequest localGetAlarmsHistoryRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryRequest
         */
        public GetAlarmsHistoryRequest getGetAlarmsHistoryRequest() {
            return localGetAlarmsHistoryRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryRequest
         */
        public void setGetAlarmsHistoryRequest(GetAlarmsHistoryRequest param) {

            this.localGetAlarmsHistoryRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryRequest cannot be null!");
            }
            localGetAlarmsHistoryRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryRequestE object = new GetAlarmsHistoryRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryRequest").equals(reader.getName())) {

                                object.setGetAlarmsHistoryRequest(GetAlarmsHistoryRequest.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSensorRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForSensorRequest", "isx");

        /**
         * field for GetActiveAlarmsForSensorRequest
         */

        protected GetActiveAlarmsForSensorRequest localGetActiveAlarmsForSensorRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForSensorRequest
         */
        public GetActiveAlarmsForSensorRequest getGetActiveAlarmsForSensorRequest() {
            return localGetActiveAlarmsForSensorRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForSensorRequest
         */
        public void setGetActiveAlarmsForSensorRequest(GetActiveAlarmsForSensorRequest param) {

            this.localGetActiveAlarmsForSensorRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForSensorRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getActiveAlarmsForSensorRequest cannot be null!");
            }
            localGetActiveAlarmsForSensorRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForSensorRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSensorRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSensorRequestE object = new GetActiveAlarmsForSensorRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForSensorRequest").equals(reader.getName())) {

                                object.setGetActiveAlarmsForSensorRequest(GetActiveAlarmsForSensorRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSeverityRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForSeverityRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for EndDateTime
         */

        protected java.util.Calendar localEndDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getEndDateTime() {
            return localEndDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param EndDateTime
         */
        public void setEndDateTime(java.util.Calendar param) {

            this.localEndDateTime = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * field for ISXCAlarmSeverity
         */

        protected ISXCAlarmSeverity localISXCAlarmSeverity;

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarmSeverity
         */
        public ISXCAlarmSeverity getISXCAlarmSeverity() {
            return localISXCAlarmSeverity;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarmSeverity
         */
        public void setISXCAlarmSeverity(ISXCAlarmSeverity param) {

            this.localISXCAlarmSeverity = param;

        }

        /**
         * field for StartDateTime
         */

        protected java.util.Calendar localStartDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getStartDateTime() {
            return localStartDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param StartDateTime
         */
        public void setStartDateTime(java.util.Calendar param) {

            this.localStartDateTime = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForSeverityRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForSeverityRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "EndDateTime", xmlWriter);

            if (localEndDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEndDateTime));

            }

            xmlWriter.writeEndElement();
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            if (localISXCAlarmSeverity == null) {
                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmSeverity cannot be null!!");
            }
            localISXCAlarmSeverity.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ISXCAlarmSeverity"), xmlWriter);

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "StartDateTime", xmlWriter);

            if (localStartDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localStartDateTime));

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "EndDateTime"));

            if (localEndDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCAlarmSeverity"));

            if (localISXCAlarmSeverity == null) {
                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmSeverity cannot be null!!");
            }
            elementList.add(localISXCAlarmSeverity);

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "StartDateTime"));

            if (localStartDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSeverityRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSeverityRequest object = new GetAlarmsHistoryForSeverityRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForSeverityRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForSeverityRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "EndDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setEndDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCAlarmSeverity").equals(reader.getName())) {

                        object.setISXCAlarmSeverity(ISXCAlarmSeverity.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "StartDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setStartDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryResponse Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryResponse object = new GetAlarmsHistoryResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSeverityResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForSeverityResponse
         * Namespace URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForSeverityResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForSeverityResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSeverityResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSeverityResponse object = new GetAlarmsHistoryForSeverityResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForSeverityResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForSeverityResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSensorResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForSensorResponse", "isx");

        /**
         * field for GetAlarmsHistoryForSensorResponse
         */

        protected GetAlarmsHistoryForSensorResponse localGetAlarmsHistoryForSensorResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForSensorResponse
         */
        public GetAlarmsHistoryForSensorResponse getGetAlarmsHistoryForSensorResponse() {
            return localGetAlarmsHistoryForSensorResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForSensorResponse
         */
        public void setGetAlarmsHistoryForSensorResponse(GetAlarmsHistoryForSensorResponse param) {

            this.localGetAlarmsHistoryForSensorResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForSensorResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryForSensorResponse cannot be null!");
            }
            localGetAlarmsHistoryForSensorResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForSensorResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSensorResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSensorResponseE object = new GetAlarmsHistoryForSensorResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForSensorResponse").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForSensorResponse(GetAlarmsHistoryForSensorResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryRequest Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for EndDateTime
         */

        protected java.util.Calendar localEndDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getEndDateTime() {
            return localEndDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param EndDateTime
         */
        public void setEndDateTime(java.util.Calendar param) {

            this.localEndDateTime = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * field for StartDateTime
         */

        protected java.util.Calendar localStartDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getStartDateTime() {
            return localStartDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param StartDateTime
         */
        public void setStartDateTime(java.util.Calendar param) {

            this.localStartDateTime = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "EndDateTime", xmlWriter);

            if (localEndDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEndDateTime));

            }

            xmlWriter.writeEndElement();
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "StartDateTime", xmlWriter);

            if (localStartDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localStartDateTime));

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "EndDateTime"));

            if (localEndDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "StartDateTime"));

            if (localStartDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryRequest object = new GetAlarmsHistoryRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryRequest) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "EndDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setEndDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "StartDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setStartDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ExtensionMapper {

        public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForSensorResponse".equals(typeName)) {

                return GetActiveAlarmsForSensorResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForSensorRequest".equals(typeName)) {

                return GetActiveAlarmsForSensorRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForDeviceResponse".equals(typeName)) {

                return GetAlarmsHistoryForDeviceResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmByIDResponse".equals(typeName)) {

                return GetAlarmByIDResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForSensorResponse".equals(typeName)) {

                return GetAlarmsHistoryForSensorResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI)
                    && "ArrayOfISXCAlarm".equals(typeName)) {

                return ArrayOfISXCAlarm.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI)
                    && "ISXCElement".equals(typeName)) {

                return ISXCElement.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForSeverityRequest".equals(typeName)) {

                return GetAlarmsHistoryForSeverityRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryResponse".equals(typeName)) {

                return GetAlarmsHistoryResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForSeverityResponse".equals(typeName)) {

                return GetAlarmsHistoryForSeverityResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryRequest".equals(typeName)) {

                return GetAlarmsHistoryRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI)
                    && "ISXCAlarmSeverity".equals(typeName)) {

                return ISXCAlarmSeverity.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAllActiveAlarmsRequest".equals(typeName)) {

                return GetAllActiveAlarmsRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI)
                    && "ISXCElementType".equals(typeName)) {

                return ISXCElementType.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForSensorRequest".equals(typeName)) {

                return GetAlarmsHistoryForSensorRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForSeverityResponse".equals(typeName)) {

                return GetActiveAlarmsForSeverityResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmByIDRequest".equals(typeName)) {

                return GetAlarmByIDRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAlarmsHistoryForDeviceRequest".equals(typeName)) {

                return GetAlarmsHistoryForDeviceRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI) && "ISXCAlarm".equals(typeName)) {

                return ISXCAlarm.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForDeviceResponse".equals(typeName)) {

                return GetActiveAlarmsForDeviceResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForSeverityRequest".equals(typeName)) {

                return GetActiveAlarmsForSeverityRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetAllActiveAlarmsResponse".equals(typeName)) {

                return GetAllActiveAlarmsResponse.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "GetActiveAlarmsForDeviceRequest".equals(typeName)) {

                return GetActiveAlarmsForDeviceRequest.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentral/2008/10".equals(namespaceURI)
                    && "ISXCAlarmState".equals(typeName)) {

                return ISXCAlarmState.Factory.parse(reader);

            }

            if ("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1".equals(namespaceURI)
                    && "AlarmFaultDetail".equals(typeName)) {

                return AlarmFaultDetail.Factory.parse(reader);

            }

            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    public static class ISXCAlarmSeverity implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmSeverity", "ns1");

        /**
         * field for ISXCAlarmSeverity
         */

        protected java.lang.String localISXCAlarmSeverity;

        private static java.util.HashMap _table_ = new java.util.HashMap();

        // Constructor

        protected ISXCAlarmSeverity(java.lang.String value, boolean isRegisterValue) {
            localISXCAlarmSeverity = value;
            if (isRegisterValue) {

                _table_.put(localISXCAlarmSeverity, this);

            }

        }

        public static final java.lang.String _ERROR = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("ERROR");

        public static final java.lang.String _FAILURE = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("FAILURE");

        public static final java.lang.String _CRITICAL = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("CRITICAL");

        public static final java.lang.String _WARNING = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("WARNING");

        public static final java.lang.String _INFORMATIONAL = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("INFORMATIONAL");

        public static final ISXCAlarmSeverity ERROR = new ISXCAlarmSeverity(_ERROR, true);

        public static final ISXCAlarmSeverity FAILURE = new ISXCAlarmSeverity(_FAILURE, true);

        public static final ISXCAlarmSeverity CRITICAL = new ISXCAlarmSeverity(_CRITICAL, true);

        public static final ISXCAlarmSeverity WARNING = new ISXCAlarmSeverity(_WARNING, true);

        public static final ISXCAlarmSeverity INFORMATIONAL = new ISXCAlarmSeverity(_INFORMATIONAL, true);

        public java.lang.String getValue() {
            return localISXCAlarmSeverity;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj == this);
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public java.lang.String toString() {

            return localISXCAlarmSeverity.toString();

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            java.lang.String namespace = parentQName.getNamespaceURI();
            java.lang.String _localName = parentQName.getLocalPart();

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ISXCAlarmSeverity", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ISXCAlarmSeverity",
                            xmlWriter);
                }
            }

            if (localISXCAlarmSeverity == null) {

                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmSeverity cannot be null !!");

            } else {

                xmlWriter.writeCharacters(localISXCAlarmSeverity);

            }

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCAlarmSeverity) },
                    null);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            public static ISXCAlarmSeverity fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
                ISXCAlarmSeverity enumeration = (ISXCAlarmSeverity)

                _table_.get(value);

                if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                    throw new java.lang.IllegalArgumentException();
                }
                return enumeration;
            }

            public static ISXCAlarmSeverity fromString(java.lang.String value, java.lang.String namespaceURI)
                    throws java.lang.IllegalArgumentException {
                try {

                    return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalArgumentException();
                }
            }

            public static ISXCAlarmSeverity fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                    java.lang.String content) {
                if (content.indexOf(":") > -1) {
                    java.lang.String prefix = content.substring(0, content.indexOf(":"));
                    java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                    return ISXCAlarmSeverity.Factory.fromString(content, namespaceUri);
                } else {
                    return ISXCAlarmSeverity.Factory.fromString(content, "");
                }
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ISXCAlarmSeverity parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ISXCAlarmSeverity object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement() || reader.hasText()) {

                            java.lang.String content = reader.getElementText();

                            if (content.indexOf(":") > 0) {
                                // this seems to be a Qname so find the namespace and send
                                prefix = content.substring(0, content.indexOf(":"));
                                namespaceuri = reader.getNamespaceURI(prefix);
                                object = ISXCAlarmSeverity.Factory.fromString(content, namespaceuri);
                            } else {
                                // this seems to be not a qname send and empty namespace incase of it is
                                // check is done in fromString method
                                object = ISXCAlarmSeverity.Factory.fromString(content, "");
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAllActiveAlarmsRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAllActiveAlarmsRequest Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAllActiveAlarmsRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAllActiveAlarmsRequest", xmlWriter);
                }

            }
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAllActiveAlarmsRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAllActiveAlarmsRequest object = new GetAllActiveAlarmsRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAllActiveAlarmsRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAllActiveAlarmsRequest) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ISXCElementType implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCElementType", "ns1");

        /**
         * field for ISXCElementType
         */

        protected java.lang.String localISXCElementType;

        private static java.util.HashMap _table_ = new java.util.HashMap();

        // Constructor

        protected ISXCElementType(java.lang.String value, boolean isRegisterValue) {
            localISXCElementType = value;
            if (isRegisterValue) {

                _table_.put(localISXCElementType, this);

            }

        }

        public static final java.lang.String _ALARM = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("ALARM");

        public static final java.lang.String _CAPACITY_GROUP = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("CAPACITY_GROUP");

        public static final java.lang.String _DEVICE = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("DEVICE");

        public static final java.lang.String _DEVICE_GROUP = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("DEVICE_GROUP");

        public static final java.lang.String _PHYSICAL_CONTAINER = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("PHYSICAL_CONTAINER");

        public static final java.lang.String _SENSOR = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("SENSOR");

        public static final java.lang.String _UNKNOWN = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("UNKNOWN");

        public static final ISXCElementType ALARM = new ISXCElementType(_ALARM, true);

        public static final ISXCElementType CAPACITY_GROUP = new ISXCElementType(_CAPACITY_GROUP, true);

        public static final ISXCElementType DEVICE = new ISXCElementType(_DEVICE, true);

        public static final ISXCElementType DEVICE_GROUP = new ISXCElementType(_DEVICE_GROUP, true);

        public static final ISXCElementType PHYSICAL_CONTAINER = new ISXCElementType(_PHYSICAL_CONTAINER, true);

        public static final ISXCElementType SENSOR = new ISXCElementType(_SENSOR, true);

        public static final ISXCElementType UNKNOWN = new ISXCElementType(_UNKNOWN, true);

        public java.lang.String getValue() {
            return localISXCElementType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj == this);
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public java.lang.String toString() {

            return localISXCElementType.toString();

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            java.lang.String namespace = parentQName.getNamespaceURI();
            java.lang.String _localName = parentQName.getLocalPart();

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ISXCElementType", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ISXCElementType",
                            xmlWriter);
                }
            }

            if (localISXCElementType == null) {

                throw new org.apache.axis2.databinding.ADBException("ISXCElementType cannot be null !!");

            } else {

                xmlWriter.writeCharacters(localISXCElementType);

            }

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementType) },
                    null);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            public static ISXCElementType fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
                ISXCElementType enumeration = (ISXCElementType)

                _table_.get(value);

                if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                    throw new java.lang.IllegalArgumentException();
                }
                return enumeration;
            }

            public static ISXCElementType fromString(java.lang.String value, java.lang.String namespaceURI)
                    throws java.lang.IllegalArgumentException {
                try {

                    return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalArgumentException();
                }
            }

            public static ISXCElementType fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                    java.lang.String content) {
                if (content.indexOf(":") > -1) {
                    java.lang.String prefix = content.substring(0, content.indexOf(":"));
                    java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                    return ISXCElementType.Factory.fromString(content, namespaceUri);
                } else {
                    return ISXCElementType.Factory.fromString(content, "");
                }
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ISXCElementType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ISXCElementType object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement() || reader.hasText()) {

                            java.lang.String content = reader.getElementText();

                            if (content.indexOf(":") > 0) {
                                // this seems to be a Qname so find the namespace and send
                                prefix = content.substring(0, content.indexOf(":"));
                                namespaceuri = reader.getNamespaceURI(prefix);
                                object = ISXCElementType.Factory.fromString(content, namespaceuri);
                            } else {
                                // this seems to be not a qname send and empty namespace incase of it is
                                // check is done in fromString method
                                object = ISXCElementType.Factory.fromString(content, "");
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSensorRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForSensorRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCElementID
         */

        protected java.lang.String localISXCElementID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getISXCElementID() {
            return localISXCElementID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementID
         */
        public void setISXCElementID(java.lang.String param) {

            this.localISXCElementID = param;

        }

        /**
         * field for EndDateTime
         */

        protected java.util.Calendar localEndDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getEndDateTime() {
            return localEndDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param EndDateTime
         */
        public void setEndDateTime(java.util.Calendar param) {

            this.localEndDateTime = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * field for StartDateTime
         */

        protected java.util.Calendar localStartDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getStartDateTime() {
            return localStartDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param StartDateTime
         */
        public void setStartDateTime(java.util.Calendar param) {

            this.localStartDateTime = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForSensorRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForSensorRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "ISXCElementID", xmlWriter);

            if (localISXCElementID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localISXCElementID);

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "EndDateTime", xmlWriter);

            if (localEndDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEndDateTime));

            }

            xmlWriter.writeEndElement();
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "StartDateTime", xmlWriter);

            if (localStartDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localStartDateTime));

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCElementID"));

            if (localISXCElementID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "EndDateTime"));

            if (localEndDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "StartDateTime"));

            if (localStartDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSensorRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSensorRequest object = new GetAlarmsHistoryForSensorRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForSensorRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForSensorRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCElementID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setISXCElementID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "EndDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setEndDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "StartDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setStartDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmByIDRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmByIDRequest", "isx");

        /**
         * field for GetAlarmByIDRequest
         */

        protected GetAlarmByIDRequest localGetAlarmByIDRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmByIDRequest
         */
        public GetAlarmByIDRequest getGetAlarmByIDRequest() {
            return localGetAlarmByIDRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmByIDRequest
         */
        public void setGetAlarmByIDRequest(GetAlarmByIDRequest param) {

            this.localGetAlarmByIDRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmByIDRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmByIDRequest cannot be null!");
            }
            localGetAlarmByIDRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmByIDRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmByIDRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmByIDRequestE object = new GetAlarmByIDRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmByIDRequest")
                                            .equals(reader.getName())) {

                                object.setGetAlarmByIDRequest(GetAlarmByIDRequest.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSeverityResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForSeverityResponse Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForSeverityResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForSeverityResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSeverityResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSeverityResponse object = new GetActiveAlarmsForSeverityResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForSeverityResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForSeverityResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmByIDRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmByIDRequest Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCElementID
         */

        protected java.lang.String localISXCElementID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getISXCElementID() {
            return localISXCElementID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementID
         */
        public void setISXCElementID(java.lang.String param) {

            this.localISXCElementID = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmByIDRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GetAlarmByIDRequest",
                            xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "ISXCElementID", xmlWriter);

            if (localISXCElementID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localISXCElementID);

            }

            xmlWriter.writeEndElement();
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCElementID"));

            if (localISXCElementID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmByIDRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetAlarmByIDRequest object = new GetAlarmByIDRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmByIDRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmByIDRequest) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCElementID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setISXCElementID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSeverityRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForSeverityRequest", "isx");

        /**
         * field for GetActiveAlarmsForSeverityRequest
         */

        protected GetActiveAlarmsForSeverityRequest localGetActiveAlarmsForSeverityRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForSeverityRequest
         */
        public GetActiveAlarmsForSeverityRequest getGetActiveAlarmsForSeverityRequest() {
            return localGetActiveAlarmsForSeverityRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForSeverityRequest
         */
        public void setGetActiveAlarmsForSeverityRequest(GetActiveAlarmsForSeverityRequest param) {

            this.localGetActiveAlarmsForSeverityRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForSeverityRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getActiveAlarmsForSeverityRequest cannot be null!");
            }
            localGetActiveAlarmsForSeverityRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForSeverityRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSeverityRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSeverityRequestE object = new GetActiveAlarmsForSeverityRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForSeverityRequest").equals(reader.getName())) {

                                object.setGetActiveAlarmsForSeverityRequest(GetActiveAlarmsForSeverityRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAllActiveAlarmsResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAllActiveAlarmsResponse", "isx");

        /**
         * field for GetAllActiveAlarmsResponse
         */

        protected GetAllActiveAlarmsResponse localGetAllActiveAlarmsResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAllActiveAlarmsResponse
         */
        public GetAllActiveAlarmsResponse getGetAllActiveAlarmsResponse() {
            return localGetAllActiveAlarmsResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAllActiveAlarmsResponse
         */
        public void setGetAllActiveAlarmsResponse(GetAllActiveAlarmsResponse param) {

            this.localGetAllActiveAlarmsResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAllActiveAlarmsResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getAllActiveAlarmsResponse cannot be null!");
            }
            localGetAllActiveAlarmsResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAllActiveAlarmsResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAllActiveAlarmsResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAllActiveAlarmsResponseE object = new GetAllActiveAlarmsResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAllActiveAlarmsResponse").equals(reader.getName())) {

                                object.setGetAllActiveAlarmsResponse(GetAllActiveAlarmsResponse.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSensorResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForSensorResponse", "isx");

        /**
         * field for GetActiveAlarmsForSensorResponse
         */

        protected GetActiveAlarmsForSensorResponse localGetActiveAlarmsForSensorResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForSensorResponse
         */
        public GetActiveAlarmsForSensorResponse getGetActiveAlarmsForSensorResponse() {
            return localGetActiveAlarmsForSensorResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForSensorResponse
         */
        public void setGetActiveAlarmsForSensorResponse(GetActiveAlarmsForSensorResponse param) {

            this.localGetActiveAlarmsForSensorResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForSensorResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getActiveAlarmsForSensorResponse cannot be null!");
            }
            localGetActiveAlarmsForSensorResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForSensorResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSensorResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSensorResponseE object = new GetActiveAlarmsForSensorResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForSensorResponse").equals(reader.getName())) {

                                object.setGetActiveAlarmsForSensorResponse(GetActiveAlarmsForSensorResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForDeviceRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForDeviceRequest", "isx");

        /**
         * field for GetActiveAlarmsForDeviceRequest
         */

        protected GetActiveAlarmsForDeviceRequest localGetActiveAlarmsForDeviceRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForDeviceRequest
         */
        public GetActiveAlarmsForDeviceRequest getGetActiveAlarmsForDeviceRequest() {
            return localGetActiveAlarmsForDeviceRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForDeviceRequest
         */
        public void setGetActiveAlarmsForDeviceRequest(GetActiveAlarmsForDeviceRequest param) {

            this.localGetActiveAlarmsForDeviceRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForDeviceRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getActiveAlarmsForDeviceRequest cannot be null!");
            }
            localGetActiveAlarmsForDeviceRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForDeviceRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForDeviceRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForDeviceRequestE object = new GetActiveAlarmsForDeviceRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForDeviceRequest").equals(reader.getName())) {

                                object.setGetActiveAlarmsForDeviceRequest(GetActiveAlarmsForDeviceRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSeverityResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForSeverityResponse", "isx");

        /**
         * field for GetActiveAlarmsForSeverityResponse
         */

        protected GetActiveAlarmsForSeverityResponse localGetActiveAlarmsForSeverityResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForSeverityResponse
         */
        public GetActiveAlarmsForSeverityResponse getGetActiveAlarmsForSeverityResponse() {
            return localGetActiveAlarmsForSeverityResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForSeverityResponse
         */
        public void setGetActiveAlarmsForSeverityResponse(GetActiveAlarmsForSeverityResponse param) {

            this.localGetActiveAlarmsForSeverityResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForSeverityResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "getActiveAlarmsForSeverityResponse cannot be null!");
            }
            localGetActiveAlarmsForSeverityResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForSeverityResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSeverityResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSeverityResponseE object = new GetActiveAlarmsForSeverityResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForSeverityResponse").equals(reader.getName())) {

                                object.setGetActiveAlarmsForSeverityResponse(GetActiveAlarmsForSeverityResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForDeviceRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAlarmsHistoryForDeviceRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCElementID
         */

        protected java.lang.String localISXCElementID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getISXCElementID() {
            return localISXCElementID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementID
         */
        public void setISXCElementID(java.lang.String param) {

            this.localISXCElementID = param;

        }

        /**
         * field for EndDateTime
         */

        protected java.util.Calendar localEndDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getEndDateTime() {
            return localEndDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param EndDateTime
         */
        public void setEndDateTime(java.util.Calendar param) {

            this.localEndDateTime = param;

        }

        /**
         * field for ExcludeSensorAlarms
         */

        protected boolean localExcludeSensorAlarms;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localExcludeSensorAlarmsTracker = false;

        public boolean isExcludeSensorAlarmsSpecified() {
            return localExcludeSensorAlarmsTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return boolean
         */
        public boolean getExcludeSensorAlarms() {
            return localExcludeSensorAlarms;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ExcludeSensorAlarms
         */
        public void setExcludeSensorAlarms(boolean param) {

            // setting primitive attribute tracker to true
            localExcludeSensorAlarmsTracker = true;

            this.localExcludeSensorAlarms = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * field for StartDateTime
         */

        protected java.util.Calendar localStartDateTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getStartDateTime() {
            return localStartDateTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param StartDateTime
         */
        public void setStartDateTime(java.util.Calendar param) {

            this.localStartDateTime = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAlarmsHistoryForDeviceRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAlarmsHistoryForDeviceRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "ISXCElementID", xmlWriter);

            if (localISXCElementID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localISXCElementID);

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "EndDateTime", xmlWriter);

            if (localEndDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localEndDateTime));

            }

            xmlWriter.writeEndElement();
            if (localExcludeSensorAlarmsTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "excludeSensorAlarms", xmlWriter);

                if (false) {

                    throw new org.apache.axis2.databinding.ADBException("excludeSensorAlarms cannot be null!!");

                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localExcludeSensorAlarms));
                }

                xmlWriter.writeEndElement();
            }
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "StartDateTime", xmlWriter);

            if (localStartDateTime == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localStartDateTime));

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCElementID"));

            if (localISXCElementID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "EndDateTime"));

            if (localEndDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EndDateTime cannot be null!!");
            }
            if (localExcludeSensorAlarmsTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "excludeSensorAlarms"));

                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localExcludeSensorAlarms));
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "StartDateTime"));

            if (localStartDateTime != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDateTime));
            } else {
                throw new org.apache.axis2.databinding.ADBException("StartDateTime cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForDeviceRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForDeviceRequest object = new GetAlarmsHistoryForDeviceRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAlarmsHistoryForDeviceRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAlarmsHistoryForDeviceRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCElementID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setISXCElementID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "EndDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setEndDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "excludeSensorAlarms").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setExcludeSensorAlarms(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "StartDateTime").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setStartDateTime(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToDateTime(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmByIDResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmByIDResponse", "isx");

        /**
         * field for GetAlarmByIDResponse
         */

        protected GetAlarmByIDResponse localGetAlarmByIDResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmByIDResponse
         */
        public GetAlarmByIDResponse getGetAlarmByIDResponse() {
            return localGetAlarmByIDResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmByIDResponse
         */
        public void setGetAlarmByIDResponse(GetAlarmByIDResponse param) {

            this.localGetAlarmByIDResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmByIDResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmByIDResponse cannot be null!");
            }
            localGetAlarmByIDResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmByIDResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmByIDResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmByIDResponseE object = new GetAlarmByIDResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmByIDResponse")
                                            .equals(reader.getName())) {

                                object.setGetAlarmByIDResponse(GetAlarmByIDResponse.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForDeviceRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForDeviceRequest", "isx");

        /**
         * field for GetAlarmsHistoryForDeviceRequest
         */

        protected GetAlarmsHistoryForDeviceRequest localGetAlarmsHistoryForDeviceRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForDeviceRequest
         */
        public GetAlarmsHistoryForDeviceRequest getGetAlarmsHistoryForDeviceRequest() {
            return localGetAlarmsHistoryForDeviceRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForDeviceRequest
         */
        public void setGetAlarmsHistoryForDeviceRequest(GetAlarmsHistoryForDeviceRequest param) {

            this.localGetAlarmsHistoryForDeviceRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForDeviceRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryForDeviceRequest cannot be null!");
            }
            localGetAlarmsHistoryForDeviceRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForDeviceRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForDeviceRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForDeviceRequestE object = new GetAlarmsHistoryForDeviceRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForDeviceRequest").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForDeviceRequest(GetAlarmsHistoryForDeviceRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ISXCAlarm implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = ISXCAlarm Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentral/2008/10 Namespace Prefix = ns1
         */

        /**
         * field for ISXCElement
         */

        protected ISXCElement localISXCElement;

        /**
         * Auto generated getter method
         * 
         * @return ISXCElement
         */
        public ISXCElement getISXCElement() {
            return localISXCElement;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElement
         */
        public void setISXCElement(ISXCElement param) {

            this.localISXCElement = param;

        }

        /**
         * field for ActiveTime
         */

        protected java.util.Calendar localActiveTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getActiveTime() {
            return localActiveTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ActiveTime
         */
        public void setActiveTime(java.util.Calendar param) {

            this.localActiveTime = param;

        }

        /**
         * field for ISXCAlarmSeverity
         */

        protected ISXCAlarmSeverity localISXCAlarmSeverity;

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarmSeverity
         */
        public ISXCAlarmSeverity getISXCAlarmSeverity() {
            return localISXCAlarmSeverity;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarmSeverity
         */
        public void setISXCAlarmSeverity(ISXCAlarmSeverity param) {

            this.localISXCAlarmSeverity = param;

        }

        /**
         * field for ISXCAlarmState
         */

        protected ISXCAlarmState localISXCAlarmState;

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarmState
         */
        public ISXCAlarmState getISXCAlarmState() {
            return localISXCAlarmState;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarmState
         */
        public void setISXCAlarmState(ISXCAlarmState param) {

            this.localISXCAlarmState = param;

        }

        /**
         * field for Description
         */

        protected java.lang.String localDescription;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Description
         */
        public void setDescription(java.lang.String param) {

            this.localDescription = param;

        }

        /**
         * field for DeviceID
         */

        protected java.lang.String localDeviceID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getDeviceID() {
            return localDeviceID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param DeviceID
         */
        public void setDeviceID(java.lang.String param) {

            this.localDeviceID = param;

        }

        /**
         * field for RecommendedAction
         */

        protected java.lang.String localRecommendedAction;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getRecommendedAction() {
            return localRecommendedAction;
        }

        /**
         * Auto generated setter method
         * 
         * @param param RecommendedAction
         */
        public void setRecommendedAction(java.lang.String param) {

            this.localRecommendedAction = param;

        }

        /**
         * field for ResolvedTime
         */

        protected java.util.Calendar localResolvedTime;

        /**
         * Auto generated getter method
         * 
         * @return java.util.Calendar
         */
        public java.util.Calendar getResolvedTime() {
            return localResolvedTime;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ResolvedTime
         */
        public void setResolvedTime(java.util.Calendar param) {

            this.localResolvedTime = param;

        }

        /**
         * field for SensorID
         */

        protected java.lang.String localSensorID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getSensorID() {
            return localSensorID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param SensorID
         */
        public void setSensorID(java.lang.String param) {

            this.localSensorID = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ISXCAlarm", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ISXCAlarm", xmlWriter);
                }

            }

            if (localISXCElement == null) {

                writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCElement", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localISXCElement.serialize(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCElement"), xmlWriter);
            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "activeTime", xmlWriter);

            if (localActiveTime == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localActiveTime));

            }

            xmlWriter.writeEndElement();

            if (localISXCAlarmSeverity == null) {

                writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmSeverity",
                        xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localISXCAlarmSeverity.serialize(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmSeverity"), xmlWriter);
            }

            if (localISXCAlarmState == null) {

                writeStartElement(null, "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmState", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localISXCAlarmState.serialize(new javax.xml.namespace.QName(
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmState"), xmlWriter);
            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDescription);

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "deviceID", xmlWriter);

            if (localDeviceID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("deviceID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localDeviceID);

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "recommendedAction", xmlWriter);

            if (localRecommendedAction == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("recommendedAction cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localRecommendedAction);

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "resolvedTime", xmlWriter);

            if (localResolvedTime == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localResolvedTime));

            }

            xmlWriter.writeEndElement();

            namespace = "http://www.apc.com/stdws/xsd/ISXCentral/2008/10";
            writeStartElement(null, namespace, "sensorID", xmlWriter);

            if (localSensorID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sensorID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSensorID);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "ISXCElement"));

            elementList.add(localISXCElement == null ? null : localISXCElement);

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "activeTime"));

            elementList.add(localActiveTime == null ? null : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localActiveTime));

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "ISXCAlarmSeverity"));

            elementList.add(localISXCAlarmSeverity == null ? null : localISXCAlarmSeverity);

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "ISXCAlarmState"));

            elementList.add(localISXCAlarmState == null ? null : localISXCAlarmState);

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "description"));

            if (localDescription != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            }

            elementList
                    .add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "deviceID"));

            if (localDeviceID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeviceID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("deviceID cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "recommendedAction"));

            if (localRecommendedAction != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localRecommendedAction));
            } else {
                throw new org.apache.axis2.databinding.ADBException("recommendedAction cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                    "resolvedTime"));

            elementList.add(localResolvedTime == null ? null : org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localResolvedTime));

            elementList
                    .add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "sensorID"));

            if (localSensorID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSensorID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sensorID cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ISXCAlarm parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ISXCAlarm object = new ISXCAlarm();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ISXCAlarm".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ISXCAlarm) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "ISXCElement").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            object.setISXCElement(null);
                            reader.next();

                            reader.next();

                        } else {

                            object.setISXCElement(ISXCElement.Factory.parse(reader));

                            reader.next();
                        }
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "activeTime").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

                            java.lang.String content = reader.getElementText();

                            object.setActiveTime(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToDateTime(content));

                        } else {

                            reader.getElementText(); // throw away text nodes if any.
                        }

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "ISXCAlarmSeverity").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            object.setISXCAlarmSeverity(null);
                            reader.next();

                            reader.next();

                        } else {

                            object.setISXCAlarmSeverity(ISXCAlarmSeverity.Factory.parse(reader));

                            reader.next();
                        }
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "ISXCAlarmState").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            object.setISXCAlarmState(null);
                            reader.next();

                            reader.next();

                        } else {

                            object.setISXCAlarmState(ISXCAlarmState.Factory.parse(reader));

                            reader.next();
                        }
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "description").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "deviceID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setDeviceID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "recommendedAction").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setRecommendedAction(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "resolvedTime").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

                            java.lang.String content = reader.getElementText();

                            object.setResolvedTime(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToDateTime(content));

                        } else {

                            reader.getElementText(); // throw away text nodes if any.
                        }

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentral/2008/10",
                                    "sensorID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setSensorID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForSeverityRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForSeverityRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * field for ISXCAlarmSeverity
         */

        protected ISXCAlarmSeverity localISXCAlarmSeverity;

        /**
         * Auto generated getter method
         * 
         * @return ISXCAlarmSeverity
         */
        public ISXCAlarmSeverity getISXCAlarmSeverity() {
            return localISXCAlarmSeverity;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCAlarmSeverity
         */
        public void setISXCAlarmSeverity(ISXCAlarmSeverity param) {

            this.localISXCAlarmSeverity = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForSeverityRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForSeverityRequest", xmlWriter);
                }

            }
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            if (localISXCAlarmSeverity == null) {
                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmSeverity cannot be null!!");
            }
            localISXCAlarmSeverity.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ISXCAlarmSeverity"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCAlarmSeverity"));

            if (localISXCAlarmSeverity == null) {
                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmSeverity cannot be null!!");
            }
            elementList.add(localISXCAlarmSeverity);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForSeverityRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForSeverityRequest object = new GetActiveAlarmsForSeverityRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForSeverityRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForSeverityRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCAlarmSeverity").equals(reader.getName())) {

                        object.setISXCAlarmSeverity(ISXCAlarmSeverity.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForDeviceResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForDeviceResponse Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForDeviceResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForDeviceResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForDeviceResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForDeviceResponse object = new GetActiveAlarmsForDeviceResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForDeviceResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForDeviceResponse) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAllActiveAlarmsResponse implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetAllActiveAlarmsResponse Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ArrayOfISXCAlarm
         */

        protected ArrayOfISXCAlarm localArrayOfISXCAlarm;

        /**
         * Auto generated getter method
         * 
         * @return ArrayOfISXCAlarm
         */
        public ArrayOfISXCAlarm getArrayOfISXCAlarm() {
            return localArrayOfISXCAlarm;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ArrayOfISXCAlarm
         */
        public void setArrayOfISXCAlarm(ArrayOfISXCAlarm param) {

            this.localArrayOfISXCAlarm = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetAllActiveAlarmsResponse", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetAllActiveAlarmsResponse", xmlWriter);
                }

            }

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            localArrayOfISXCAlarm.serialize(new javax.xml.namespace.QName(
                    "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "ArrayOfISXCAlarm"), xmlWriter);

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ArrayOfISXCAlarm"));

            if (localArrayOfISXCAlarm == null) {
                throw new org.apache.axis2.databinding.ADBException("ArrayOfISXCAlarm cannot be null!!");
            }
            elementList.add(localArrayOfISXCAlarm);

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAllActiveAlarmsResponse parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAllActiveAlarmsResponse object = new GetAllActiveAlarmsResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetAllActiveAlarmsResponse".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetAllActiveAlarmsResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ArrayOfISXCAlarm").equals(reader.getName())) {

                        object.setArrayOfISXCAlarm(ArrayOfISXCAlarm.Factory.parse(reader));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSeverityRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForSeverityRequest", "isx");

        /**
         * field for GetAlarmsHistoryForSeverityRequest
         */

        protected GetAlarmsHistoryForSeverityRequest localGetAlarmsHistoryForSeverityRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForSeverityRequest
         */
        public GetAlarmsHistoryForSeverityRequest getGetAlarmsHistoryForSeverityRequest() {
            return localGetAlarmsHistoryForSeverityRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForSeverityRequest
         */
        public void setGetAlarmsHistoryForSeverityRequest(GetAlarmsHistoryForSeverityRequest param) {

            this.localGetAlarmsHistoryForSeverityRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForSeverityRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "getAlarmsHistoryForSeverityRequest cannot be null!");
            }
            localGetAlarmsHistoryForSeverityRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForSeverityRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSeverityRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSeverityRequestE object = new GetAlarmsHistoryForSeverityRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForSeverityRequest").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForSeverityRequest(GetAlarmsHistoryForSeverityRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForDeviceRequest implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = GetActiveAlarmsForDeviceRequest Namespace
         * URI = http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for ISXCElementID
         */

        protected java.lang.String localISXCElementID;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getISXCElementID() {
            return localISXCElementID;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ISXCElementID
         */
        public void setISXCElementID(java.lang.String param) {

            this.localISXCElementID = param;

        }

        /**
         * field for ExcludeSensorAlarms
         */

        protected boolean localExcludeSensorAlarms;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localExcludeSensorAlarmsTracker = false;

        public boolean isExcludeSensorAlarmsSpecified() {
            return localExcludeSensorAlarmsTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return boolean
         */
        public boolean getExcludeSensorAlarms() {
            return localExcludeSensorAlarms;
        }

        /**
         * Auto generated setter method
         * 
         * @param param ExcludeSensorAlarms
         */
        public void setExcludeSensorAlarms(boolean param) {

            // setting primitive attribute tracker to true
            localExcludeSensorAlarmsTracker = true;

            this.localExcludeSensorAlarms = param;

        }

        /**
         * field for Locale
         */

        protected java.lang.String localLocale;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will
         * be used to determine whether to include this field in the serialized XML
         */
        protected boolean localLocaleTracker = false;

        public boolean isLocaleSpecified() {
            return localLocaleTracker;
        }

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getLocale() {
            return localLocale;
        }

        /**
         * Auto generated setter method
         * 
         * @param param Locale
         */
        public void setLocale(java.lang.String param) {
            localLocaleTracker = param != null;

            this.localLocale = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":GetActiveAlarmsForDeviceRequest", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetActiveAlarmsForDeviceRequest", xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "ISXCElementID", xmlWriter);

            if (localISXCElementID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localISXCElementID);

            }

            xmlWriter.writeEndElement();
            if (localExcludeSensorAlarmsTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "excludeSensorAlarms", xmlWriter);

                if (false) {

                    throw new org.apache.axis2.databinding.ADBException("excludeSensorAlarms cannot be null!!");

                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                            .convertToString(localExcludeSensorAlarms));
                }

                xmlWriter.writeEndElement();
            }
            if (localLocaleTracker) {
                namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
                writeStartElement(null, namespace, "locale", xmlWriter);

                if (localLocale == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

                } else {

                    xmlWriter.writeCharacters(localLocale);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "ISXCElementID"));

            if (localISXCElementID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCElementID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ISXCElementID cannot be null!!");
            }
            if (localExcludeSensorAlarmsTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "excludeSensorAlarms"));

                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(localExcludeSensorAlarms));
            }
            if (localLocaleTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                        "locale"));

                if (localLocale != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForDeviceRequest parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForDeviceRequest object = new GetActiveAlarmsForDeviceRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetActiveAlarmsForDeviceRequest".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetActiveAlarmsForDeviceRequest) ExtensionMapper.getTypeObject(nsUri, type,
                                        reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "ISXCElementID").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setISXCElementID(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "excludeSensorAlarms").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setExcludeSensorAlarms(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToBoolean(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "locale").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setLocale(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForSensorRequestE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForSensorRequest", "isx");

        /**
         * field for GetAlarmsHistoryForSensorRequest
         */

        protected GetAlarmsHistoryForSensorRequest localGetAlarmsHistoryForSensorRequest;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForSensorRequest
         */
        public GetAlarmsHistoryForSensorRequest getGetAlarmsHistoryForSensorRequest() {
            return localGetAlarmsHistoryForSensorRequest;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForSensorRequest
         */
        public void setGetAlarmsHistoryForSensorRequest(GetAlarmsHistoryForSensorRequest param) {

            this.localGetAlarmsHistoryForSensorRequest = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForSensorRequest == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryForSensorRequest cannot be null!");
            }
            localGetAlarmsHistoryForSensorRequest.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForSensorRequest.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForSensorRequestE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForSensorRequestE object = new GetAlarmsHistoryForSensorRequestE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForSensorRequest").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForSensorRequest(GetAlarmsHistoryForSensorRequest.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class ISXCAlarmState implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentral/2008/10", "ISXCAlarmState", "ns1");

        /**
         * field for ISXCAlarmState
         */

        protected java.lang.String localISXCAlarmState;

        private static java.util.HashMap _table_ = new java.util.HashMap();

        // Constructor

        protected ISXCAlarmState(java.lang.String value, boolean isRegisterValue) {
            localISXCAlarmState = value;
            if (isRegisterValue) {

                _table_.put(localISXCAlarmState, this);

            }

        }

        public static final java.lang.String _ACTIVE = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("ACTIVE");

        public static final java.lang.String _RESOLVED = org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString("RESOLVED");

        public static final ISXCAlarmState ACTIVE = new ISXCAlarmState(_ACTIVE, true);

        public static final ISXCAlarmState RESOLVED = new ISXCAlarmState(_RESOLVED, true);

        public java.lang.String getValue() {
            return localISXCAlarmState;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj == this);
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public java.lang.String toString() {

            return localISXCAlarmState.toString();

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            java.lang.String namespace = parentQName.getNamespaceURI();
            java.lang.String _localName = parentQName.getLocalPart();

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentral/2008/10");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":ISXCAlarmState", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ISXCAlarmState",
                            xmlWriter);
                }
            }

            if (localISXCAlarmState == null) {

                throw new org.apache.axis2.databinding.ADBException("ISXCAlarmState cannot be null !!");

            } else {

                xmlWriter.writeCharacters(localISXCAlarmState);

            }

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentral/2008/10")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localISXCAlarmState) },
                    null);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            public static ISXCAlarmState fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
                ISXCAlarmState enumeration = (ISXCAlarmState)

                _table_.get(value);

                if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                    throw new java.lang.IllegalArgumentException();
                }
                return enumeration;
            }

            public static ISXCAlarmState fromString(java.lang.String value, java.lang.String namespaceURI)
                    throws java.lang.IllegalArgumentException {
                try {

                    return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalArgumentException();
                }
            }

            public static ISXCAlarmState fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                    java.lang.String content) {
                if (content.indexOf(":") > -1) {
                    java.lang.String prefix = content.substring(0, content.indexOf(":"));
                    java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                    return ISXCAlarmState.Factory.fromString(content, namespaceUri);
                } else {
                    return ISXCAlarmState.Factory.fromString(content, "");
                }
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ISXCAlarmState parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ISXCAlarmState object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement() || reader.hasText()) {

                            java.lang.String content = reader.getElementText();

                            if (content.indexOf(":") > 0) {
                                // this seems to be a Qname so find the namespace and send
                                prefix = content.substring(0, content.indexOf(":"));
                                namespaceuri = reader.getNamespaceURI(prefix);
                                object = ISXCAlarmState.Factory.fromString(content, namespaceuri);
                            } else {
                                // this seems to be not a qname send and empty namespace incase of it is
                                // check is done in fromString method
                                object = ISXCAlarmState.Factory.fromString(content, "");
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryForDeviceResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryForDeviceResponse", "isx");

        /**
         * field for GetAlarmsHistoryForDeviceResponse
         */

        protected GetAlarmsHistoryForDeviceResponse localGetAlarmsHistoryForDeviceResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryForDeviceResponse
         */
        public GetAlarmsHistoryForDeviceResponse getGetAlarmsHistoryForDeviceResponse() {
            return localGetAlarmsHistoryForDeviceResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryForDeviceResponse
         */
        public void setGetAlarmsHistoryForDeviceResponse(GetAlarmsHistoryForDeviceResponse param) {

            this.localGetAlarmsHistoryForDeviceResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryForDeviceResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryForDeviceResponse cannot be null!");
            }
            localGetAlarmsHistoryForDeviceResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryForDeviceResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryForDeviceResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryForDeviceResponseE object = new GetAlarmsHistoryForDeviceResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryForDeviceResponse").equals(reader.getName())) {

                                object.setGetAlarmsHistoryForDeviceResponse(GetAlarmsHistoryForDeviceResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetActiveAlarmsForDeviceResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getActiveAlarmsForDeviceResponse", "isx");

        /**
         * field for GetActiveAlarmsForDeviceResponse
         */

        protected GetActiveAlarmsForDeviceResponse localGetActiveAlarmsForDeviceResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetActiveAlarmsForDeviceResponse
         */
        public GetActiveAlarmsForDeviceResponse getGetActiveAlarmsForDeviceResponse() {
            return localGetActiveAlarmsForDeviceResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetActiveAlarmsForDeviceResponse
         */
        public void setGetActiveAlarmsForDeviceResponse(GetActiveAlarmsForDeviceResponse param) {

            this.localGetActiveAlarmsForDeviceResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetActiveAlarmsForDeviceResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getActiveAlarmsForDeviceResponse cannot be null!");
            }
            localGetActiveAlarmsForDeviceResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetActiveAlarmsForDeviceResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetActiveAlarmsForDeviceResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetActiveAlarmsForDeviceResponseE object = new GetActiveAlarmsForDeviceResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getActiveAlarmsForDeviceResponse").equals(reader.getName())) {

                                object.setGetActiveAlarmsForDeviceResponse(GetActiveAlarmsForDeviceResponse.Factory
                                        .parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class AlarmFaultDetail implements org.apache.axis2.databinding.ADBBean {
        /*
         * This type was generated from the piece of schema that had name = AlarmFaultDetail Namespace URI =
         * http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1 Namespace Prefix = ns2
         */

        /**
         * field for FaultMsg
         */

        protected java.lang.String localFaultMsg;

        /**
         * Auto generated getter method
         * 
         * @return java.lang.String
         */
        public java.lang.String getFaultMsg() {
            return localFaultMsg;
        }

        /**
         * Auto generated setter method
         * 
         * @param param FaultMsg
         */
        public void setFaultMsg(java.lang.String param) {

            this.localFaultMsg = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {

                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
                            + ":AlarmFaultDetail", xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AlarmFaultDetail",
                            xmlWriter);
                }

            }

            namespace = "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1";
            writeStartElement(null, namespace, "FaultMsg", xmlWriter);

            if (localFaultMsg == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FaultMsg cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFaultMsg);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                    "FaultMsg"));

            if (localFaultMsg != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultMsg));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FaultMsg cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                    attribList.toArray());

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AlarmFaultDetail parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                AlarmFaultDetail object = new AlarmFaultDetail();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"AlarmFaultDetail".equals(type)) {
                                // find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AlarmFaultDetail) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }

                        }

                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()
                            && new javax.xml.namespace.QName("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                    "FaultMsg").equals(reader.getName())) {

                        java.lang.String content = reader.getElementText();

                        object.setFaultMsg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    public static class GetAlarmsHistoryResponseE implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1", "getAlarmsHistoryResponse", "isx");

        /**
         * field for GetAlarmsHistoryResponse
         */

        protected GetAlarmsHistoryResponse localGetAlarmsHistoryResponse;

        /**
         * Auto generated getter method
         * 
         * @return GetAlarmsHistoryResponse
         */
        public GetAlarmsHistoryResponse getGetAlarmsHistoryResponse() {
            return localGetAlarmsHistoryResponse;
        }

        /**
         * Auto generated setter method
         * 
         * @param param GetAlarmsHistoryResponse
         */
        public void setGetAlarmsHistoryResponse(GetAlarmsHistoryResponse param) {

            this.localGetAlarmsHistoryResponse = param;

        }

        /**
         * 
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
                boolean serializeType) throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it

            if (localGetAlarmsHistoryResponse == null) {
                throw new org.apache.axis2.databinding.ADBException("getAlarmsHistoryResponse cannot be null!");
            }
            localGetAlarmsHistoryResponse.serialize(MY_QNAME, xmlWriter);

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1")) {
                return "isx";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":"
                            + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite
                                    .append(prefix)
                                    .append(":")
                                    .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                    .convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
                                .convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
                throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         * 
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {

            // We can safely assume an element has only one type associated with it
            return localGetAlarmsHistoryResponse.getPullParser(MY_QNAME);

        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start
             * element starts this object and any intervening reader events are ignorable If this object is not an
             * element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element If this object
             * is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetAlarmsHistoryResponseE parse(javax.xml.stream.XMLStreamReader reader)
                    throws java.lang.Exception {
                GetAlarmsHistoryResponseE object = new GetAlarmsHistoryResponseE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement()
                                    && new javax.xml.namespace.QName(
                                            "http://www.apc.com/stdws/xsd/ISXCentralAlarms-v1",
                                            "getAlarmsHistoryResponse").equals(reader.getName())) {

                                object.setGetAlarmsHistoryResponse(GetAlarmsHistoryResponse.Factory.parse(reader));

                            } // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement "
                                        + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    } // end of while loop

                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }// end of factory class

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param
                    .getOMElement(
                            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE.MY_QNAME,
                            org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope
                    .getBody()
                    .addChild(
                            param.getOMElement(
                                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE.MY_QNAME,
                                    factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityRequestE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.class
                    .equals(type)) {

                return com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault.Factory
                        .parse(param.getXMLStreamReaderWithoutCaching());

            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
