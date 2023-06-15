package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaAV3ResponseDto {
    

	@JsonProperty("AV3")
	private AV3 aV3 ;

	public ConsultaCuentaAV3ResponseDto() {
		super();
	}

	public ConsultaCuentaAV3ResponseDto(AV3 aV3) {
		super();
		this.aV3 = aV3;
	}

	public AV3 getaV3() {
		return aV3;
	}

	public void setaV3(AV3 aV3) {
		this.aV3 = aV3;
	}
}
