package org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.BTExtReqDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT2Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenTransferenciaSoapCT1RequestDto {

	 @JsonProperty("extreq")	
	   private BTExtReqDto bTExtReqDto;
	   
	   @JsonProperty("mpe005Idc")
	   private int mpe005idc;
	   
	   @JsonProperty("CT1")
	   private CT1Dto ct1Dto;

	public OrdenTransferenciaSoapCT1RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdenTransferenciaSoapCT1RequestDto(BTExtReqDto bTExtReqDto, int mpe005idc, CT1Dto ct1Dto) {
		super();
		this.bTExtReqDto = bTExtReqDto;
		this.mpe005idc = mpe005idc;
		this.ct1Dto = ct1Dto;
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

	public CT1Dto getCt1Dto() {
		return ct1Dto;
	}

	public void setCt1Dto(CT1Dto ct1Dto) {
		this.ct1Dto = ct1Dto;
	}
	   
	   

}
