package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;


public class WsBTRecepcionTINDto {
	

    private BTExtReqDto extreq;
    private short mpe005Idc;
    private String payload;
    private BTErroresNegocioDto erroresnegocio;
    
	public WsBTRecepcionTINDto() {
		super();
	}

	public WsBTRecepcionTINDto(BTExtReqDto extreq, short mpe005Idc, String payload, BTErroresNegocioDto erroresnegocio) {
		super();
		this.extreq = extreq;
		this.mpe005Idc = mpe005Idc;
		this.payload = payload;
		this.erroresnegocio = erroresnegocio;
	}

	public BTExtReqDto getExtreq() {
		return extreq;
	}

	public void setExtreq(BTExtReqDto extreq) {
		this.extreq = extreq;
	}

	public short getMpe005Idc() {
		return mpe005Idc;
	}

	public void setMpe005Idc(short mpe005Idc) {
		this.mpe005Idc = mpe005Idc;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public BTErroresNegocioDto getErroresnegocio() {
		return erroresnegocio;
	}

	public void setErroresnegocio(BTErroresNegocioDto erroresnegocio) {
		this.erroresnegocio = erroresnegocio;
	}
    
    

}
