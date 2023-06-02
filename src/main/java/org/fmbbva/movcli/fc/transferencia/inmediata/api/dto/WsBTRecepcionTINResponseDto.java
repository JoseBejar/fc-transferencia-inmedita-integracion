package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;



public class WsBTRecepcionTINResponseDto {
	
    private BTExtReqDto extreq;
    private String payload;
    private BTErroresNegocioDto erroresnegocio;
    
	public WsBTRecepcionTINResponseDto() {
		super();
	}

	public WsBTRecepcionTINResponseDto(BTExtReqDto extreq, String payload, BTErroresNegocioDto erroresnegocio) {
		super();
		this.extreq = extreq;
		this.payload = payload;
		this.erroresnegocio = erroresnegocio;
	}

	public BTExtReqDto getExtreq() {
		return extreq;
	}

	public void setExtreq(BTExtReqDto extreq) {
		this.extreq = extreq;
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
