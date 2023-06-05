package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT3Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class TransferenciaInmediataController {
	
	@Autowired
	private ConsultaCuentaService consultaCuentaAV1Service;
	
	@Autowired
	private OrdenTransferenciaService ordenTransferenciaService;
	
	
	@PostMapping(value = "/AV1")
	public ResponseEntity<ConsultaCuentaAV4ResponseDto> getWsBTConsultaCuentaAV1(@RequestBody ConsultaCuentaAV1RequestDto request) {
		
		ConsultaCuentaAV4ResponseDto response =  new ConsultaCuentaAV4ResponseDto();
		response = consultaCuentaAV1Service.getConsultaCuentaAV1(request);
		return new ResponseEntity<ConsultaCuentaAV4ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/AV2")
	public ResponseEntity<ConsultaCuentaAV3ResponseDto> getWsBTConsultaCuentaAV2(@RequestBody ConsultaCuentaAV2RequestDto request) {
		
		ConsultaCuentaAV3ResponseDto response = consultaCuentaAV1Service.getConsultaCuentaAV2(request);
		return new ResponseEntity<ConsultaCuentaAV3ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/CT1")
	public ResponseEntity<OrdenTransferenciaCT4ResponseDto> getWsBTOrdenTransferencia(@RequestBody OrdenTransferenciaCT1RequestDto request) {
		
		OrdenTransferenciaCT4ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT1(request);
		return new ResponseEntity<OrdenTransferenciaCT4ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/CT2")
	public ResponseEntity<OrdenTransferenciaCT3ResponseDto> getWsBTOrdenTransferencia(@RequestBody OrdenTransferenciaCT2RequestDto request) {
		
		OrdenTransferenciaCT3ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT2(request);
		return new ResponseEntity<OrdenTransferenciaCT3ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/CT5")
	public ResponseEntity<WsBTRespuestaTranferenciaTINResponseDto> getWsBTrespuestaTransferencia(@RequestBody WsBTRespuestaTranferenciaTINDto request) {
		
		
		WsBTRespuestaTranferenciaTINResponseDto respuestaTransferenciaresponse = new WsBTRespuestaTranferenciaTINResponseDto();
		respuestaTransferenciaresponse.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaTransferenciaresponse.setCreditorParticipantCode(request.getCreditorParticipantCode());
		respuestaTransferenciaresponse.setResponseDate(request.getResponseDate());
		respuestaTransferenciaresponse.setResponseTime(request.getResponseTime());
		respuestaTransferenciaresponse.setTerminalId(request.getTerminalId());
		respuestaTransferenciaresponse.setRetrievalReferenteNumber(request.getRetrievalReferenteNumber());
		respuestaTransferenciaresponse.setTrace(request.getTrace());
		respuestaTransferenciaresponse.setAmountprivate(request.getAmountprivate());
		respuestaTransferenciaresponse.setCurrency(request.getCurrency());
		respuestaTransferenciaresponse.setTransactionReference(request.getTransactionReference());
		respuestaTransferenciaresponse.setResponseCode(request.getResponseCode());
		respuestaTransferenciaresponse.setFeeAmount(request.getFeeAmount());
		respuestaTransferenciaresponse.setSettlementDate(request.getSettlementDate());
		respuestaTransferenciaresponse.setTransactionType(request.getTransactionType());
		respuestaTransferenciaresponse.setDebtorCCI(request.getDebtorCCI());
		respuestaTransferenciaresponse.setCreditorCCI(request.getCreditorCCI());
		respuestaTransferenciaresponse.setCreditorCreditCard(request.getCreditorCreditCard());
		respuestaTransferenciaresponse.setSameCustomerFlag(request.getSameCustomerFlag());
		respuestaTransferenciaresponse.setInstructionId(request.getInstructionId());
		respuestaTransferenciaresponse.setCreationDate(request.getCreationDate());
		respuestaTransferenciaresponse.setCreationTime(request.getCreationTime());
		respuestaTransferenciaresponse.setChannel(request.getChannel());
		respuestaTransferenciaresponse.setInterbankSettlementAmount(request.getInterbankSettlementAmount());
		
		
		return new ResponseEntity<WsBTRespuestaTranferenciaTINResponseDto>(respuestaTransferenciaresponse, HttpStatus.CREATED);
		
	}
	
	
	
	
		
}
	
	

