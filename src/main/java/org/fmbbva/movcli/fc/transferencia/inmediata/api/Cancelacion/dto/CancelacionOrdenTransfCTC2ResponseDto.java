package org.fmbbva.movcli.fc.transferencia.inmediata.api.Cancelacion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelacionOrdenTransfCTC2ResponseDto {

	@JsonProperty("CTC2")
	private CTC2Dto ctc2Dto;

	public CancelacionOrdenTransfCTC2ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CancelacionOrdenTransfCTC2ResponseDto(CTC2Dto ctc2Dto) {
		super();
		this.ctc2Dto = ctc2Dto;
	}

	public CTC2Dto getCtc2Dto() {
		return ctc2Dto;
	}

	public void setCtc2Dto(CTC2Dto ctc2Dto) {
		this.ctc2Dto = ctc2Dto;
	}
	
	
	
	
}
