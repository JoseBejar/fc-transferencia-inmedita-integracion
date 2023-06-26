package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
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
public class EchoTestController {
	
	private static final Logger  logger= Logger.getLogger(EchoTestController.class);


	@Autowired
	private EchoTestService echoTestService;
	
	@PostMapping(value = "/ET1")
	public ResponseEntity<EchoTestResponseET2Dto> getWsEchoTestET1(@RequestBody EchoTestSoapET1Request request) throws Exception {
		logger.info("Inicio Consulta del servicio SOAP ECHO TEST  en getWsEchoTestET1");
		EchoTestResponseET2Dto response = echoTestService.getEchoTestSoap1(request);
		logger.info("Fin Consulta del servicio SOAP ECHO TEST getWsEchoTestET1");

		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}

}
