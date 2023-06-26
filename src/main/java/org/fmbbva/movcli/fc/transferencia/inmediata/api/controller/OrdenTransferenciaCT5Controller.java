package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT5RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class OrdenTransferenciaCT5Controller {
	

	private static final Logger  logger= Logger.getLogger(OrdenTransferenciaCT5Controller.class);

	@Autowired
	public OrdenTransferenciaService ordenTransferenciaService;
	
	@PostMapping(value = "/soap/CT5")
	public ResponseEntity<OrdenTransferenciaCT5ResponseDto> getWsBTOrdenTransferenciaCT5(@RequestBody OrdenTransferenciaSoapCT5RequestDto request) throws Exception {
		logger.info("Recibiendo Consulta del servicio SOAP CT5");
		
		OrdenTransferenciaCT5ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaSOAPCT5(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
	

}
