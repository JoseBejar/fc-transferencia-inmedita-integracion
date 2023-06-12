package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

public class ClientSoap extends WebServiceGatewaySupport {
	
	public WsBTRecepcionTINExecuteResponse getWsBTRecepcionTIN(WsBTRecepcionTINExecute request) {
		
		 SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/action/wsBTRecepcionTIN");
		 WsBTRecepcionTINExecuteResponse response = (WsBTRecepcionTINExecuteResponse)getWebServiceTemplate().
				 marshalSendAndReceive("https://172.20.6.15:9443/desarrollo/servlet/com.dlya.bantotal.awsbtrecepciontin",request, soapActionCallback);
		 
		return response;
	}

}
