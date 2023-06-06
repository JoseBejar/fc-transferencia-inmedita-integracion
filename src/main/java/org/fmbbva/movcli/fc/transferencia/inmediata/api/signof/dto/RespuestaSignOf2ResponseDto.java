package org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaSignOf2ResponseDto {
	@JsonProperty("SIGNOF2")
	private SignOF2Dto signOF2Dto;

	public RespuestaSignOf2ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaSignOf2ResponseDto(SignOF2Dto signOF2Dto) {
		super();
		this.signOF2Dto = signOF2Dto;
	}

	public SignOF2Dto getSignOF2Dto() {
		return signOF2Dto;
	}

	public void setSignOF2Dto(SignOF2Dto signOF2Dto) {
		this.signOF2Dto = signOF2Dto;
	}
	
	

}
