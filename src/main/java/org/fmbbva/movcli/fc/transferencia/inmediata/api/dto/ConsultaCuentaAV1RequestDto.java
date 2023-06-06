package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV1Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaAV1RequestDto {
	
	@JsonProperty("AV1")
	private AV1Dto av1;

	public ConsultaCuentaAV1RequestDto() {
		super();
	}

	public ConsultaCuentaAV1RequestDto(AV1Dto av1) {
		super();
		this.av1 = av1;
	}

	public AV1Dto getAv1() {
		return av1;
	}

	public void setAv1(AV1Dto av1) {
		this.av1 = av1;
	}
	
}
