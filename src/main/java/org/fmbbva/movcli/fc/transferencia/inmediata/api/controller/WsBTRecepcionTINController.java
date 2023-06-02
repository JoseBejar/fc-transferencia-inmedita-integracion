package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class WsBTRecepcionTINController {
	
	
	@PostMapping(value = "/AV1")
	public ResponseEntity<?> getWsBTRecepcion(@RequestBody WsBTRecepcionTINDto request) {
		return new ResponseEntity<String>("servicio de Recepcion", HttpStatus.CREATED);
	}

}
