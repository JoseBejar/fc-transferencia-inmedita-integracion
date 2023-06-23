package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.ET1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EchoTestSoapET1Request {
	
	
	@JsonProperty("extreq")
	 private BTExtReqDto bTExtReqDto;
	
	@JsonProperty("idcamara")
	private int idcamara;
	
	@JsonProperty("ET1")
	private ET1 et1Dto;

	public EchoTestSoapET1Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoTestSoapET1Request(BTExtReqDto bTExtReqDto, int idcamara, ET1 et1Dto) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.idcamara = idcamara;
		this.et1Dto = et1Dto;
	}

	public BTExtReqDto getbTExtReqDto() {
		return bTExtReqDto;
	}

	public void setbTExtReqDto(BTExtReqDto bTExtReqDto) {
		this.bTExtReqDto = bTExtReqDto;
	}

	public int getIdcamara() {
		return idcamara;
	}

	public void setIdcamara(int idcamara) {
		this.idcamara = idcamara;
	}

	public ET1 getEt1Dto() {
		return et1Dto;
	}

	public void setEt1Dto(ET1 et1Dto) {
		this.et1Dto = et1Dto;
	}
	
	
	
	

	
	
	
	
	
	
}
