package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.SolicitudEstadoPagoMapper;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.action.WsBTHabilitarTIN;
import org.tempuri.action.WsBTHabilitarTINExecute;
import org.tempuri.action.WsBTHabilitarTINExecuteResponse;
import org.tempuri.action.WsBTHabilitarTINSoapPort;
import org.tempuri.action.WsBTRecepcionTIN;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINSoapPort;


public class ClientSoap extends WebServiceGatewaySupport {
	
	private static final Logger  log= Logger.getLogger(ClientSoap.class);

	public WsBTRecepcionTINExecuteResponse getWsBTRecepcionTIN(WsBTRecepcionTINExecute request) {
		
		log.info("Obteniendo el servicio  SOAP RECEPCION");
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
