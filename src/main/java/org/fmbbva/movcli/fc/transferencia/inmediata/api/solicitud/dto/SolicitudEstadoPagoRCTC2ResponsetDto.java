package org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudEstadoPagoRCTC2ResponsetDto {
	
	@JsonProperty("RCTC2")
	private RCTC2Dto rctc2Dto;

	public SolicitudEstadoPagoRCTC2ResponsetDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RCTC2Dto getCtc2Dto() {
		return rctc2Dto;
	}

	public void setCtc2Dto(RCTC2Dto ctc2Dto) {
		this.rctc2Dto = ctc2Dto;
	}

	public SolicitudEstadoPagoRCTC2ResponsetDto(RCTC2Dto ctc2Dto) {
		super();
		this.rctc2Dto = ctc2Dto;
	}
	
	

}
