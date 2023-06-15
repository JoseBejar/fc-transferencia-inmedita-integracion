package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

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
	

	@Autowired
	public EchoTestService echoTestService;
	
	@PostMapping(value = "/soap/ET1")
	public ResponseEntity<EchoTestResponseET2Dto> getWsEchoTestET1(@RequestBody EchoTestSoapET1Request request) throws Exception {
		EchoTestResponseET2Dto response = echoTestService.getEchoTestSoap1(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}

}