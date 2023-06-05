package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaCT5RequestDto {
	
	@JsonProperty("CT5")
	private CT5Dto ct5dto;

	public OrdenTransferenciaCT5RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public OrdenTransferenciaCT5RequestDto(CT5Dto ct5dto) {
		super();
		this.ct5dto = ct5dto;
	}


	public CT5Dto getCt5dto() {
		return ct5dto;
	}

	public void setCt5dto(CT5Dto ct5dto) {
		this.ct5dto = ct5dto;
	}
	
	
	

}
