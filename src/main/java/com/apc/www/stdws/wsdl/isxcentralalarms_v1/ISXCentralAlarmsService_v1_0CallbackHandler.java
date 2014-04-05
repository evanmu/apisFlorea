
/**
 * ISXCentralAlarmsService_v1_0CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package com.apc.www.stdws.wsdl.isxcentralalarms_v1;

    /**
     *  ISXCentralAlarmsService_v1_0CallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ISXCentralAlarmsService_v1_0CallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ISXCentralAlarmsService_v1_0CallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ISXCentralAlarmsService_v1_0CallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAlarmsHistoryForDevice method
            * override this method for handling normal response from getAlarmsHistoryForDevice operation
            */
           public void receiveResultgetAlarmsHistoryForDevice(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForDeviceResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlarmsHistoryForDevice operation
           */
            public void receiveErrorgetAlarmsHistoryForDevice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAlarmsHistoryForSensor method
            * override this method for handling normal response from getAlarmsHistoryForSensor operation
            */
           public void receiveResultgetAlarmsHistoryForSensor(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSensorResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlarmsHistoryForSensor operation
           */
            public void receiveErrorgetAlarmsHistoryForSensor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllActiveAlarms method
            * override this method for handling normal response from getAllActiveAlarms operation
            */
           public void receiveResultgetAllActiveAlarms(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAllActiveAlarmsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllActiveAlarms operation
           */
            public void receiveErrorgetAllActiveAlarms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActiveAlarmsForSeverity method
            * override this method for handling normal response from getActiveAlarmsForSeverity operation
            */
           public void receiveResultgetActiveAlarmsForSeverity(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSeverityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActiveAlarmsForSeverity operation
           */
            public void receiveErrorgetActiveAlarmsForSeverity(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAlarmsHistory method
            * override this method for handling normal response from getAlarmsHistory operation
            */
           public void receiveResultgetAlarmsHistory(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlarmsHistory operation
           */
            public void receiveErrorgetAlarmsHistory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActiveAlarmsForSensor method
            * override this method for handling normal response from getActiveAlarmsForSensor operation
            */
           public void receiveResultgetActiveAlarmsForSensor(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForSensorResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActiveAlarmsForSensor operation
           */
            public void receiveErrorgetActiveAlarmsForSensor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAlarmByID method
            * override this method for handling normal response from getAlarmByID operation
            */
           public void receiveResultgetAlarmByID(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmByIDResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlarmByID operation
           */
            public void receiveErrorgetAlarmByID(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActiveAlarmsForDevice method
            * override this method for handling normal response from getActiveAlarmsForDevice operation
            */
           public void receiveResultgetActiveAlarmsForDevice(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetActiveAlarmsForDeviceResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActiveAlarmsForDevice operation
           */
            public void receiveErrorgetActiveAlarmsForDevice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAlarmsHistoryForSeverity method
            * override this method for handling normal response from getAlarmsHistoryForSeverity operation
            */
           public void receiveResultgetAlarmsHistoryForSeverity(
                    com.apc.www.stdws.wsdl.isxcentralalarms_v1.ISXCentralAlarmsService_v1_0Stub.GetAlarmsHistoryForSeverityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlarmsHistoryForSeverity operation
           */
            public void receiveErrorgetAlarmsHistoryForSeverity(java.lang.Exception e) {
            }
                


    }
    