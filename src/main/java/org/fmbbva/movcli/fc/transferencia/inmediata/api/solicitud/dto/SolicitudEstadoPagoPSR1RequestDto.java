package org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CTC1Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudEstadoPagoPSR1RequestDto {
	
	
	@JsonProperty("PSR1")
	private PSR1Dto psr1Dto;

	public SolicitudEstadoPagoPSR1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudEstadoPagoPSR1RequestDto(PSR1Dto psr1Dto) {
		super();
		this.psr1Dto = psr1Dto;
	}

	public PSR1Dto getPsr1Dto() {
		return psr1Dto;
	}

	public void setPsr1Dto(PSR1Dto psr1Dto) {
		this.psr1Dto = psr1Dto;
	}

	
	


}
