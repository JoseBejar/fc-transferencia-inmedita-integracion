package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.signOf.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signOf.dto.RespuestaSignOf2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signOf.dto.SignOF2Dto;


public class RespuestaSignOfMapper {
	
	public RespuestaSignOf2ResponseDto getRespuestaSignOf1(RespuestaSignOf1RequestDto request){
		
		 
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
