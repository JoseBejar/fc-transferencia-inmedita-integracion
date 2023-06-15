package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class ConsultaCuentaAV2Controller {
	
	@Autowired
	public ConsultaCuentaService consultaCuentaService;
	
	@PostMapping(value = "/soap/AV2")
	public ResponseEntity<ConsultaCuentaAV3ResponseDto> getWsBTConsultaCuentaAV2(@RequestBody ConsultaCuentaSoapAV2Request request) throws Exception {
		ConsultaCuentaAV3ResponseDto response = consultaCuentaService.getConsultaCuentaSoapAV2(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}

}
