package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.SignON2Dto;
import org.springframework.stereotype.Service;


@Service
public class RespuestaSignOn1Mapper {
	
	private static final Logger  logger= Logger.getLogger(RespuestaSignOn1Mapper.class);

	public RespuestaSignOn2ResponseDto getRespuestaSignOn1(RespuestaSignOn1RequestDto request){
		logger.info("Respuesta SignOn2 Mapper");
		 
		RespuestaSignOn2ResponseDto respuestaSignOn2ResponseDto = new RespuestaSignOn2ResponseDto();
		
		SignON2Dto signON2Dto = new SignON2Dto();
		signON2Dto.setParticipantCode(request.getSignON1Dto().getParticipantCode());
		signON2Dto.setResponseDate(null);
		signON2Dto.setResponseTime(request.getSignON1Dto().getParticipantCode());
		signON2Dto.setStatus(null);
		signON2Dto.setReasonCode(null);
		signON2Dto.setTrace(request.getSignON1Dto().getTrace());
		respuestaSignOn2ResponseDto.setSignON2Dto(signON2Dto);
		return respuestaSignOn2ResponseDto;
		
		
	} 

}
