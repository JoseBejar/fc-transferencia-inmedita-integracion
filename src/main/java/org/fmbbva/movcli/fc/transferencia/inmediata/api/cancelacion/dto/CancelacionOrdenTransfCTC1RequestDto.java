package org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelacionOrdenTransfCTC1RequestDto {

	@JsonProperty("CTC1")
	private CTC1Dto ctc1Dto;

	public CancelacionOrdenTransfCTC1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CTC1Dto getCtc1Dto() {
		return ctc1Dto;
	}

	public void setCtc1Dto(CTC1Dto ctc1Dto) {
		this.ctc1Dto = ctc1Dto;
	}

	public CancelacionOrdenTransfCTC1RequestDto(CTC1Dto ctc1Dto) {
		super();
		this.ctc1Dto = ctc1Dto;
	}

}
