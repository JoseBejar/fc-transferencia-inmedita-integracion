package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT5Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaSoapCT5RequestDto {
	@JsonProperty("extreq")	
	   private BTExtReqDto bTExtReqDto;
	   
	   @JsonProperty("mpe005Idc")
	   private int mpe005idc;
	   
	   @JsonProperty("CT5")
	   private CT5Dto ct5Dto;

	public OrdenTransferenciaSoapCT5RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdenTransferenciaSoapCT5RequestDto(BTExtReqDto bTExtReqDto, int mpe005idc, CT5Dto ct5Dto) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.mpe005idc = mpe005idc;
		this.ct5Dto = ct5Dto;
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

	public CT5Dto getCt5Dto() {
		return ct5Dto;
	}

	public void setCt5Dto(CT5Dto ct5Dto) {
		this.ct5Dto = ct5Dto;
	}
	   
	   
	   
	   


}
