
/**
 * AlarmServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package com.apc.www.stdws.wsdl.isxcentralalarms_v1;

public class AlarmServiceFault extends java.lang.Exception{

    private static final long serialVersionUID = 1390532168322L;
    
    private com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault faultMessage;

    
        public AlarmServiceFault() {
            super("AlarmServiceFault");
        }

        public AlarmServiceFault(java.lang.String s) {
           super(s);
        }

        public AlarmServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AlarmServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault msg){
       faultMessage = msg;
    }
    
    public com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.AlarmServiceFault getFaultMessage(){
       return faultMessage;
    }
}
    