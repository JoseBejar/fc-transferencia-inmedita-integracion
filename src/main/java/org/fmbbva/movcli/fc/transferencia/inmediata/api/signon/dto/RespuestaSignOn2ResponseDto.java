package org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaSignOn2ResponseDto {
	
	@JsonProperty("SIGNON2")
	private SignON2Dto signON2Dto;

	public RespuestaSignOn2ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaSignOn2ResponseDto(SignON2Dto signON2Dto) {
		super();
		this.signON2Dto = signON2Dto;
	}

	public SignON2Dto getSignON2Dto() {
		return signON2Dto;
	}

	public void setSignON2Dto(SignON2Dto signON2Dto) {
		this.signON2Dto = signON2Dto;
	}
	
	
	

}
