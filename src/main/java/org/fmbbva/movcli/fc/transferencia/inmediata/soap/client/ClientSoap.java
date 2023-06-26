package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client;


import org.apache.log4j.Logger;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.action.WsBTRecepcionTIN;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINSoapPort;


public class ClientSoap extends WebServiceGatewaySupport {
	
	private static final Logger  log= Logger.getLogger(ClientSoap.class);

	public WsBTRecepcionTINExecuteResponse getWsBTRecepcionTIN(WsBTRecepcionTINExecute request) {
		
		log.info(" Inicio- getWsBTRecepcionTIN -  servicio de Recepcion getWsBTRecepcionTIN");
		WsBTRecepcionTINExecuteResponse response = new WsBTRecepcionTINExecuteResponse();
	
		WsBTRecepcionTIN service = new WsBTRecepcionTIN();
		WsBTRecepcionTINSoapPort port = service.getWsBTRecepcionTINSoapPort();
		
		try {
			response = port.execute(request);
			log.info(" Inicio- getWsBTRecepcionTIN - Obteniendo respuesta del servicio  SOAP RECEPCIONTIN");

		} catch (Exception e) {
			log.error("Error - getWsBTRecepcionTIN- obtener el servicio de Recepcion  : "  + e.getMessage());
		}
		
		log.info("Fin - getWsBTRecepcionTIN - del servicio de Recepcion getWsBTRecepcionTIN");
		return response;
	}
	
	

}
