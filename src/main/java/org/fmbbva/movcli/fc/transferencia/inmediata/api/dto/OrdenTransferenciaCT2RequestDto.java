package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaCT2RequestDto {

	@JsonProperty("CT2")
	private CT2Dto ct2Dto;

	public OrdenTransferenciaCT2RequestDto() {
		super();
	}

	public OrdenTransferenciaCT2RequestDto(CT2Dto ct2Dto) {
		super();
		this.ct2Dto = ct2Dto;
	}

	public CT2Dto getCt2Dto() {
		return ct2Dto;
	}

	public void setCt2Dto(CT2Dto ct2Dto) {
		this.ct2Dto = ct2Dto;
	}
	
	
}
