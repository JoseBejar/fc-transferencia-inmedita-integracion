package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import java.util.List;

public class BTErroresNegocioDto {
	
	private List<BTErrorNegocioDto> btErrorNegocio;

	public BTErroresNegocioDto() {
		super();
	}

	public BTErroresNegocioDto(List<BTErrorNegocioDto> btErrorNegocio) {
		super();
		this.btErrorNegocio = btErrorNegocio;
	}

	public List<BTErrorNegocioDto> getBtErrorNegocio() {
		return btErrorNegocio;
	}

	public void setBtErrorNegocio(List<BTErrorNegocioDto> btErrorNegocio) {
		this.btErrorNegocio = btErrorNegocio;
	}


	

}
