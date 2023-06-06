package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaAV3ResponseDto {
    
	@JsonProperty("AV3")
	private AV3Dto av3Dto ;

	public ConsultaCuentaAV3ResponseDto() {
		super();
	}

	public ConsultaCuentaAV3ResponseDto(AV3Dto av3Dto) {
		super();
		this.av3Dto = av3Dto;
	}

	public AV3Dto getAv3Dto() {
		return av3Dto;
	}

	public void setAv3Dto(AV3Dto av3Dto) {
		this.av3Dto = av3Dto;
	}
}
