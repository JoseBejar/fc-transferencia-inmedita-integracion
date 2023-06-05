package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaCT4ResponseDto {
	
	@JsonProperty("CT4")
	private CT4Dto ct4Dto;

	public OrdenTransferenciaCT4ResponseDto() {
		super();
	}

	public OrdenTransferenciaCT4ResponseDto(CT4Dto ct4Dto) {
		super();
		this.ct4Dto = ct4Dto;
	}

	public CT4Dto getCt4Dto() {
		return ct4Dto;
	}

	public void setCt4Dto(CT4Dto ct4Dto) {
		this.ct4Dto = ct4Dto;
	}
	
	

}
