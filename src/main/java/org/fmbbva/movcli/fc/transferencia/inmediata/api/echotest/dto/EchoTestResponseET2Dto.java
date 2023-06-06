package org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EchoTestResponseET2Dto {
	
	
	@JsonProperty("ET2")
	private ET2 et2;

	public EchoTestResponseET2Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoTestResponseET2Dto(ET2 et2) {
		super();
		this.et2 = et2;
	}

	public ET2 getEt2() {
		return et2;
	}

	public void setEt2(ET2 et2) {
		this.et2 = et2;
	}
	
	

}
