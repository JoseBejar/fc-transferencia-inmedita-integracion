package org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaSignOn1RequestDto {
	
	
	
	public RespuestaSignOn1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("SIGNON1")
	private SignON1Dto signON1Dto;

	public RespuestaSignOn1RequestDto(SignON1Dto signON1Dto) {
		super();
		this.signON1Dto = signON1Dto;
	}

	public SignON1Dto getSignON1Dto() {
		return signON1Dto;
	}

	public void setSignON1Dto(SignON1Dto signON1Dto) {
		this.signON1Dto = signON1Dto;
	}
	
	

}
