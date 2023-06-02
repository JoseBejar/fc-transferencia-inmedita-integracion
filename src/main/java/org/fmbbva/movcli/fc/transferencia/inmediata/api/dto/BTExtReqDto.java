package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;


public class BTExtReqDto {
	
	private String canal;
    private String requerimiento;
    private String usuario;
    private String token;
    
	public BTExtReqDto() {
		super();
	}

	public BTExtReqDto(String canal, String requerimiento, String usuario, String token) {
		super();
		this.canal = canal;
		this.requerimiento = requerimiento;
		this.usuario = usuario;
		this.token = token;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getRequerimiento() {
		return requerimiento;
	}

	public void setRequerimiento(String requerimiento) {
		this.requerimiento = requerimiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
    
    

}
