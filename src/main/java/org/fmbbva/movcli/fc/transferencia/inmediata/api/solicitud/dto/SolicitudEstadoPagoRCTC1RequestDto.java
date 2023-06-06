package org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CTC1Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudEstadoPagoRCTC1RequestDto {
	
	
	@JsonProperty("RCTC1")
	private RCTC1Dto rctc1Dto;

	public SolicitudEstadoPagoRCTC1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudEstadoPagoRCTC1RequestDto(RCTC1Dto rctc1Dto) {
		super();
		this.rctc1Dto = rctc1Dto;
	}

	public RCTC1Dto getRctc1Dto() {
		return rctc1Dto;
	}

	public void setRctc1Dto(RCTC1Dto rctc1Dto) {
		this.rctc1Dto = rctc1Dto;
	}

	


}
