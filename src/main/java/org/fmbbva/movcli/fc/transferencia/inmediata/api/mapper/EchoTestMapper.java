package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;



import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.controller.EchoTestController;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.ET2;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.springframework.stereotype.Service;

@Service
public class EchoTestMapper {
	
	private static final Logger  logger= Logger.getLogger(EchoTestMapper.class);


	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto request) {
		logger.info("Ingresando  al mappeo de atributos en getEchoTest1 ");

		EchoTestResponseET2Dto echoTestResponseET2Dto = new EchoTestResponseET2Dto();
		ET2 et2 = new ET2();
		et2.setParticipantCode(request.getEt1().getParticipantCode());
		et2.setResponseDate(null);
		et2.setResponseTime(null);
		et2.setStatus(null);
		et2.setReasonCode(null);
		et2.setTrace(request.getEt1().getTrace());
		echoTestResponseET2Dto.setEt2(et2);
		
		logger.info("Fin del mappeo de atributos en getEchoTest1 ");
		return echoTestResponseET2Dto;
		
		
	}
	
	
	

}
