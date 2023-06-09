package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class OrdenTransferenciaCT1Controller {

	private static final Logger  logger= Logger.getLogger(OrdenTransferenciaCT1Controller.class);

	@Autowired
	public OrdenTransferenciaService ordenTransferenciaService;
	
	
	@PostMapping(value = "/CT1")
	public ResponseEntity<OrdenTransferenciaCT4ResponseDto> getWsBTOrdenTransferenciaCT1(@RequestBody OrdenTransferenciaSoapCT1RequestDto request) throws Exception {
		logger.info("Inicio Consulta del servicio SOAP CT1 en getWsBTOrdenTransferenciaCT1");
		OrdenTransferenciaCT4ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaSOAPCT1(request);
		logger.info("Fin  Consulta del servicio SOAP CT1 en getWsBTOrdenTransferenciaCT1");

		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
}
