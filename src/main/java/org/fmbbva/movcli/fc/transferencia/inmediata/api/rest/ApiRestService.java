package org.fmbbva.movcli.fc.transferencia.inmediata.api.rest;


import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV2Dto;
import org.springframework.web.client.RestTemplate;

public class ApiRestService {

	RestTemplate restTemplate = new RestTemplate();
	
	public AV2Dto getConsumerApiRest() {
	String resourceUrl = "http://localhost:8080/products";
	return null;
	}
}
