package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV4Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaAV4ResponseDto {
	
	@JsonProperty("AV4")
	private AV4Dto av4;

	public ConsultaCuentaAV4ResponseDto() {
		super();
	}

	public ConsultaCuentaAV4ResponseDto(AV4Dto av4) {
		super();
		this.av4 = av4;
	}

	public AV4Dto getAv4() {
		return av4;
	}

	public void setAv4(AV4Dto av4) {
		this.av4 = av4;
	}

}
