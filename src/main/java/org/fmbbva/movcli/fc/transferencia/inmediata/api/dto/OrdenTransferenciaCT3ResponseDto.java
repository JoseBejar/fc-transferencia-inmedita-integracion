package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaCT3ResponseDto {
	
	@JsonProperty("CT3")
	private CT3Dto ct3Dto;

	public OrdenTransferenciaCT3ResponseDto() {
		super();
	}

	public OrdenTransferenciaCT3ResponseDto(CT3Dto ct3Dto) {
		super();
		this.ct3Dto = ct3Dto;
	}

	public CT3Dto getCt3Dto() {
		return ct3Dto;
	}

	public void setCt3Dto(CT3Dto ct3Dto) {
		this.ct3Dto = ct3Dto;
	}

	
}
