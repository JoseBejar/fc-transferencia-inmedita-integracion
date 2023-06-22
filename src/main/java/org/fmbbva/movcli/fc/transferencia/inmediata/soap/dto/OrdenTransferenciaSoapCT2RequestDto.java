package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT2Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaSoapCT2RequestDto {
	 
	  @JsonProperty("extreq")	
	   private BTExtReqDto bTExtReqDto;
	   
	   @JsonProperty("mpe005Idc")
	   private int mpe005idc;
	   
	   @JsonProperty("CT2")
	   private CT2Dto ct2Dto;

	public OrdenTransferenciaSoapCT2RequestDto() {
		super();
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

	public CT2Dto getCt2Dto() {
		return ct2Dto;
	}

	public void setCt2Dto(CT2Dto ct2Dto) {
		this.ct2Dto = ct2Dto;
	}

	public OrdenTransferenciaSoapCT2RequestDto(BTExtReqDto bTExtReqDto, int mpe005idc, CT2Dto ct2Dto) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.mpe005idc = mpe005idc;
		this.ct2Dto = ct2Dto;
	}
	   
	   
	   

}
