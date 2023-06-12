package org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudEstadoPagoPSR2ResponsetDto {
	
	@JsonProperty("PSR2")
	private PSR2Dto psr2Dto;

	public SolicitudEstadoPagoPSR2ResponsetDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudEstadoPagoPSR2ResponsetDto(PSR2Dto psr2Dto) {
		super();
		this.psr2Dto = psr2Dto;
	}

	public PSR2Dto getPsr2Dto() {
		return psr2Dto;
	}

	public void setPsr2Dto(PSR2Dto psr2Dto) {
		this.psr2Dto = psr2Dto;
	}

	
	

}
