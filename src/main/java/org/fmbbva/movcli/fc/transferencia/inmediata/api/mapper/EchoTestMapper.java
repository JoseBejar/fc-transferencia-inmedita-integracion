package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;


import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.ET2;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.springframework.stereotype.Service;

@Service
public class EchoTestMapper {
	
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto request) {
		
		EchoTestResponseET2Dto echoTestResponseET2Dto = new EchoTestResponseET2Dto();
		ET2 et2 = new ET2();
		et2.setParticipantCode(request.getEt1().getParticipantCode());
		et2.setResponseDate(null);
		et2.setResponseTime(null);
		et2.setStatus(null);
		et2.setReasonCode(null);
		et2.setTrace(request.getEt1().getTrace());
		echoTestResponseET2Dto.setEt2(et2);
		return echoTestResponseET2Dto;
		
		
	}
	
	
	

}
