package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;



import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.SignOF2Dto;
import org.springframework.stereotype.Service;


@Service
public class RespuestaSignOfMapper {
	
	private static final Logger  logger= Logger.getLogger(RespuestaSignOfMapper.class);
	public RespuestaSignOf2ResponseDto getRespuestaSignOf1(RespuestaSignOf1RequestDto request){
		logger.info("Respuesta SignOf2 Mapper");
		 
		RespuestaSignOf2ResponseDto respuestaSignOf2ResponseDto = new RespuestaSignOf2ResponseDto();
		
		SignOF2Dto signOF2Dto = new SignOF2Dto();
		signOF2Dto.setParticipantCode(request.getSignOF1Dto().getParticipantCode());
		signOF2Dto.setResponseDate(null);
		signOF2Dto.setResponseTime(null);
		signOF2Dto.setStatus(null);
		signOF2Dto.setReasonCode(null);
		signOF2Dto.setTrace(request.getSignOF1Dto().getTrace());
		respuestaSignOf2ResponseDto.setSignOF2Dto(signOF2Dto);
		return respuestaSignOf2ResponseDto;
	
	
		
		
	} 

}
