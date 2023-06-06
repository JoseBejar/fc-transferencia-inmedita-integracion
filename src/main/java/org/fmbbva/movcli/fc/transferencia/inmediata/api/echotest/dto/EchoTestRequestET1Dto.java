package org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EchoTestRequestET1Dto {
	
	@JsonProperty("ET1")
	private ET1 et1;

	public EchoTestRequestET1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoTestRequestET1Dto(ET1 et1) {
		super();
		this.et1 = et1;
	}

	public ET1 getEt1() {
		return et1;
	}

	public void setEt1(ET1 et1) {
		this.et1 = et1;
	}
	
	
	
	

}
