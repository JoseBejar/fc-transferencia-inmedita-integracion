package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;
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
	
	private static final Logger  logger= Logger.getLogger(ConsultaCuentaAV2Controller.class);

	@Autowired
	private ConsultaCuentaService consultaCuentaService;
	

	
	@PostMapping(value = "/AV2")
	public ResponseEntity<ConsultaCuentaAV3ResponseDto> getWsBTConsultaCuentaAV2(@RequestBody ConsultaCuentaSoapAV2Request request) throws Exception {
		logger.info("Inicio getWsBTConsultaCuentaAV2 de Consulta AV2");
		ConsultaCuentaAV3ResponseDto response = consultaCuentaService.getConsultaCuentaSoapAV2(request);
		logger.info("Fin getWsBTConsultaCuentaAV2 de consulta AV2");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
		
	}
	
	

}
