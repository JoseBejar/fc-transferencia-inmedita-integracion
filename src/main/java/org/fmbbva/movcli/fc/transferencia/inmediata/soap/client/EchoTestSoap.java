package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.action.WsBTHabilitarTIN;
import org.tempuri.action.WsBTHabilitarTINExecute;
import org.tempuri.action.WsBTHabilitarTINExecuteResponse;
import org.tempuri.action.WsBTHabilitarTINSoapPort;

public class EchoTestSoap extends WebServiceGatewaySupport {

	private static final Logger log = LogManager.getLogger(ClientSoap.class); 	
	
	public WsBTHabilitarTINExecuteResponse getWsBTHabilitarTIN(WsBTHabilitarTINExecute request) {
		
		
		WsBTHabilitarTINExecuteResponse response = new WsBTHabilitarTINExecuteResponse();
				log.info("Obteniendo servicio HabilitarTIN Soap");	
			WsBTHabilitarTIN service = new WsBTHabilitarTIN();
			WsBTHabilitarTINSoapPort port = service.getWsBTHabilitarTINSoapPort();
			
			try {
				response = port.execute(request);
	
			} catch (Exception e) {
				log.error("Error obtener habilatar TIN  : "  + e.getMessage());
			}
			return response;
		}
}
