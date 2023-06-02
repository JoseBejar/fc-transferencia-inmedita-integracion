package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

public class BTErrorNegocioDto {
	private int codigo;
	private String descripcion;
	private String severidad;
	
	public BTErrorNegocioDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BTErrorNegocioDto(int codigo, String descripcion, String severidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.severidad = severidad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSeveridad() {
		return severidad;
	}
	public void setSeveridad(String severidad) {
		this.severidad = severidad;
	}
	
	

}
