package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTErroresNegocioDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaSoapAV2Request {
	
	  @JsonProperty("extreq")	
	   private BTExtReqDto bTExtReqDto;
	   
	   @JsonProperty("mpe005Idc")
	   private int mpe005idc;
	   
	   @JsonProperty("AV2")
	   private AV2Dto av2Dto;

	public ConsultaCuentaSoapAV2Request() {
		super();
	}

	public ConsultaCuentaSoapAV2Request(BTExtReqDto bTExtReqDto, int mpe005idc, AV2Dto av2Dto) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.mpe005idc = mpe005idc;
		this.av2Dto = av2Dto;
	}

	public BTExtReqDto getbTExtReqDto() {
		return bTExtReqDto;
	}

	public void setbTExtReqDto(BTExtReqDto bTExtReqDto) {
		this.bTExtReqDto = bTExtReqDto;
	}

	public int getMpe005idc() {
		return mpe005idc;
	}

	public void setMpe005idc(int mpe005idc) {
		this.mpe005idc = mpe005idc;
	}

	public AV2Dto getAv2Dto() {
		return av2Dto;
	}

	public void setAv2Dto(AV2Dto av2Dto) {
		this.av2Dto = av2Dto;
	}
	   

}
