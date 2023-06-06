package org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaSignOf1RequestDto {
	
	@JsonProperty("SIGNOF1")
	private SignOF1Dto signOF1Dto;

	public RespuestaSignOf1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaSignOf1RequestDto(SignOF1Dto signOF1Dto) {
		super();
		this.signOF1Dto = signOF1Dto;
	}

	public SignOF1Dto getSignOF1Dto() {
		return signOF1Dto;
	}

	public void setSignOF1Dto(SignOF1Dto signOF1Dto) {
		this.signOF1Dto = signOF1Dto;
	}
	
	

}
