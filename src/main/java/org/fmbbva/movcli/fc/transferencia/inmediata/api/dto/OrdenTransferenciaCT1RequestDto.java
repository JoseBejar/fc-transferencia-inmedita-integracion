package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaCT1RequestDto {
	
	@JsonProperty("CT1")
	private CT1Dto ct1Dto;

	public OrdenTransferenciaCT1RequestDto() {
		super();
	}

	public OrdenTransferenciaCT1RequestDto(CT1Dto ct1Dto) {
		super();
		this.ct1Dto = ct1Dto;
	}

	public CT1Dto getCt1Dto() {
		return ct1Dto;
	}

	public void setCt1Dto(CT1Dto ct1Dto) {
		this.ct1Dto = ct1Dto;
	}

}
