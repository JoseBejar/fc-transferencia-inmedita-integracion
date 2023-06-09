package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
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
public class OrdenTransferenciaCT2Controller {
	
	private static final Logger  logger= Logger.getLogger(OrdenTransferenciaCT2Controller.class);

	@Autowired
	public OrdenTransferenciaService ordenTransferenciaService;
	
	@PostMapping(value = "/CT2")
	public ResponseEntity<OrdenTransferenciaCT3ResponseDto> getWsBTOrdenTransferenciaCT2(@RequestBody OrdenTransferenciaSoapCT2RequestDto request) throws Exception {
		logger.info("Inicio Consulta del servicio SOAP CT2 en getWsBTOrdenTransferenciaCT2");

		OrdenTransferenciaCT3ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaSOAPCT2(request);
		logger.info("Fin Consulta del servicio SOAP CT2 en getWsBTOrdenTransferenciaCT2");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
	

}
