package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EchoTestSoapET1Request {
	
	
	@JsonProperty("extreq")
	 private BTExtReqDto bTExtReqDto;
	
	@JsonProperty("ET1")
	private EchoTestRequestET1Dto echoTestRequestET1Dto;

	@JsonProperty("idcamara")
	private int idcamara;
	
	@JsonProperty("accion")
	private String accion;

	public EchoTestSoapET1Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoTestSoapET1Request(BTExtReqDto bTExtReqDto, EchoTestRequestET1Dto echoTestRequestET1Dto, int idcamara,
			String accion) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.echoTestRequestET1Dto = echoTestRequestET1Dto;
		this.idcamara = idcamara;
		this.accion = accion;
	}

	public BTExtReqDto getbTExtReqDto() {
		return bTExtReqDto;
	}

	public void setbTExtReqDto(BTExtReqDto bTExtReqDto) {
		this.bTExtReqDto = bTExtReqDto;
	}

	public EchoTestRequestET1Dto getEchoTestRequestET1Dto() {
		return echoTestRequestET1Dto;
	}

	public void setEchoTestRequestET1Dto(EchoTestRequestET1Dto echoTestRequestET1Dto) {
		this.echoTestRequestET1Dto = echoTestRequestET1Dto;
	}

	public int getIdcamara() {
		return idcamara;
	}

	public void setIdcamara(int idcamara) {
		this.idcamara = idcamara;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	
	
	
	
	
}
