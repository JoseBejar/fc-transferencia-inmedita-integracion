package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.action.WsBTRecepcionTIN;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINSoapPort;


public class ClientSoap extends WebServiceGatewaySupport {
	
	private static final Logger log = LogManager.getLogger(ClientSoap.class);
	
	public WsBTRecepcionTINExecuteResponse getWsBTRecepcionTIN(WsBTRecepcionTINExecute request) {
		
		
		WsBTRecepcionTINExecuteResponse response = new WsBTRecepcionTINExecuteResponse();
				
		WsBTRecepcionTIN service = new WsBTRecepcionTIN();
		WsBTRecepcionTINSoapPort port = service.getWsBTRecepcionTINSoapPort();
		
		try {
			response = port.execute(request);

		} catch (Exception e) {
			log.error("Error obtener el servicio de Recepcion  : "  + e.getMessage());
		}
		return response;
	}

}
