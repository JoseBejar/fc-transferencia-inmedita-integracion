package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTConsultaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTConsultaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTOrdenTranferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTOrdenTranferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINResponseDto;
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
	public ResponseEntity<WsBTRecepcionTINResponseDto> getWsBTRecepcion(@RequestBody WsBTRecepcionTINDto request) {
		
		
		WsBTRecepcionTINResponseDto respuestaReception = new WsBTRecepcionTINResponseDto();
		respuestaReception.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaReception.setCreditorParticipantCode(request.getCreditorParticipantCode());
		respuestaReception.setCreationDate(request.getCreationDate());
		respuestaReception.setCreationTime(request.getCreationTime());
		respuestaReception.setTerminalId(request.getTerminalId());
		respuestaReception.setRetrievalReferenteNumber(request.getRetrievalReferenteNumber());
		respuestaReception.setTrace(request.getTrace());
		respuestaReception.setDebtorName(request.getDebtorName());
		respuestaReception.setDebtorId(request.getDebtorId());
		respuestaReception.setDebtorIdCode(request.getDebtorIdCode());
		respuestaReception.setDebtorPhoneNumber(request.getDebtorPhoneNumber());
		respuestaReception.setDebtorAddressLine(request.getDebtorAddressLine());
		respuestaReception.setDebtorMobileNumber(request.getDebtorMobileNumber());
		respuestaReception.setTransactionType(request.getTransactionType());
		respuestaReception.setChannel(request.getChannel());
		respuestaReception.setInstructionId(null);
		respuestaReception.setResponseCode(null);
		respuestaReception.setReasonCode(null);
		respuestaReception.setCreditorName(null);
		respuestaReception.setCreditorAddressLine(request.getCreditorAddressLine());
		respuestaReception.setCreditorId(null);
		respuestaReception.setCreditorIdCode(null);
		respuestaReception.setCreditorPhoneNumber(request.getCreditorPhoneNumber());
		respuestaReception.setCreditorMobileNumber(request.getCreditorMobileNumber());
		respuestaReception.setCreditorCCI(request.getCreditorCCI());
		respuestaReception.setCreditorCreditCard(request.getCreditorCreditCard());
		respuestaReception.setSameCustomerFlag(null);
		respuestaReception.setCurrency(request.getCurrency());
		respuestaReception.setProxyValue(request.getProxyValue());
		respuestaReception.setProxyType(request.getProxyType());
		
		
		return new ResponseEntity<WsBTRecepcionTINResponseDto>(respuestaReception, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/AV2")
	public ResponseEntity<WsBTConsultaTINResponseDto> getWsBTConsulta(@RequestBody WsBTConsultaTINDto request) {
		
		
		WsBTConsultaTINResponseDto respuestaConsulta = new WsBTConsultaTINResponseDto();
		respuestaConsulta.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaConsulta.setCreditorParticipantCode(request.getCreditorParticipantCode());
		respuestaConsulta.setCreationDate(request.getCreationDate());
		respuestaConsulta.setCreationTime(request.getCreationTime());
		respuestaConsulta.setTerminalId(request.getTerminalId());
		respuestaConsulta.setRetrievalReferenteNumber(request.getRetrievalReferenteNumber());
		respuestaConsulta.setTrace(request.getTrace());
		respuestaConsulta.setBranchId(request.getBranchId());
		respuestaConsulta.setDebtorName(request.getDebtorName());
		respuestaConsulta.setDebtorId(request.getDebtorId());
		respuestaConsulta.setDebtorIdCode(request.getDebtorIdCode());
		respuestaConsulta.setDebtorPhoneNumber(request.getDebtorPhoneNumber());
		respuestaConsulta.setTransactionType(request.getTransactionType());
		respuestaConsulta.setChannel(request.getChannel());
		respuestaConsulta.setInstructionId(request.getInstructionId());
		respuestaConsulta.setResponseCode(null);
		respuestaConsulta.setReasonCode(null);
		respuestaConsulta.setCreditorName(null);
		respuestaConsulta.setCreditorAddressLine(request.getCreditorAddressLine());
		respuestaConsulta.setCreditorId(null);
		respuestaConsulta.setCreditorIdCode(null);
		respuestaConsulta.setCreditorPhoneNumber(request.getCreditorPhoneNumber());
		respuestaConsulta.setCreditorMobileNumber(request.getCreditorMobileNumber());
		respuestaConsulta.setCreditorCCI(request.getCreditorCCI());
		respuestaConsulta.setCreditorCreditCard(request.getCreditorCreditCard());
		respuestaConsulta.setSameCustomerFlag(null);
		respuestaConsulta.setCurrency(request.getCurrency());
		respuestaConsulta.setProxyType(request.getProxyType());
		
		
		
		return new ResponseEntity<WsBTConsultaTINResponseDto>(respuestaConsulta, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/CT1")
	public ResponseEntity<WsBTTransferenciaTINResponseDto> getWsBTConsultaTransferencia(@RequestBody WsBTTransferenciaTINDto request) {
		
		
		WsBTTransferenciaTINResponseDto respuestaTransferencia = new WsBTTransferenciaTINResponseDto();
		respuestaTransferencia.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaTransferencia.setCreditorParticipantCode(request.getCreditorParticipantCode());
		respuestaTransferencia.setResponseDate(null);
		respuestaTransferencia.setResponseTime(null);
		respuestaTransferencia.setTerminalId(request.getTerminalId());
		respuestaTransferencia.setRetrievalReferenteNumber(request.getRetrievalReferenteNumber());
		respuestaTransferencia.setTrace(request.getTrace());
		respuestaTransferencia.setAmount(request.getAmount());respuestaTransferencia.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaTransferencia.setCurrency(request.getCurrency());
		respuestaTransferencia.setTransactionReference(request.getTransactionReference());
		respuestaTransferencia.setResponseCode(null);
		respuestaTransferencia.setReasonCode(null);
		respuestaTransferencia.setFeeAmount(request.getFeeAmount());
		respuestaTransferencia.setSettlementDate(null);
		respuestaTransferencia.setTransactionType(request.getTransactionType());
		respuestaTransferencia.setDebtorCCI(request.getDebtorCCI());
		respuestaTransferencia.setCreditorCCI(request.getCreditorCCI());
		respuestaTransferencia.setCreditorCreditCard(request.getCreditorCreditCard());
		respuestaTransferencia.setSameCustomerFlag(request.getSameCustomerFlag());
		respuestaTransferencia.setInstructionId(null);
		respuestaTransferencia.setCreationDate(request.getCreationDate());
		respuestaTransferencia.setCreationTime(request.getCreationTime());
		respuestaTransferencia.setChannel(request.getChannel());
		respuestaTransferencia.setInterbankSettlementAmount(null);
		
		
		return new ResponseEntity<WsBTTransferenciaTINResponseDto>(respuestaTransferencia, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/CT2")
	public ResponseEntity<WsBTOrdenTranferenciaTINResponseDto> getWsBTOrdenTransferencia(@RequestBody WsBTOrdenTranferenciaTINDto request) {
		
		
		WsBTOrdenTranferenciaTINResponseDto respuestaOrdenTransferencia = new WsBTOrdenTranferenciaTINResponseDto();
		respuestaOrdenTransferencia.setDebtorParticipantCode(request.getDebtorParticipantCode());
		respuestaOrdenTransferencia.setCreditorParticipantCode(request.getCreditorParticipantCode());
		respuestaOrdenTransferencia.setResponseDate(null);
		respuestaOrdenTransferencia.setResponseTime(null);
		respuestaOrdenTransferencia.setTerminalId(request.getTerminalId());
		respuestaOrdenTransferencia.setRetrievalReferenteNumber(request.getRetrievalReferenteNumber());
		respuestaOrdenTransferencia.setTrace(request.getTrace());
		respuestaOrdenTransferencia.setAmount(null);
		respuestaOrdenTransferencia.setCurrency(null);
		respuestaOrdenTransferencia.setTransactionReference(request.getTransactionReference());
		respuestaOrdenTransferencia.setResponseCode(request.getDebtorParticipantCode());
		respuestaOrdenTransferencia.setReasonCode(null);
		respuestaOrdenTransferencia.setFeeAmount(request.getFeeAmount());
		respuestaOrdenTransferencia.setSettlementDate(request.getSettlementDate());
		respuestaOrdenTransferencia.setTransactionType(request.getTransactionType());
		respuestaOrdenTransferencia.setDebtorCCI(request.getDebtorCCI());
		respuestaOrdenTransferencia.setCreditorCCI(request.getCreditorCCI());
		respuestaOrdenTransferencia.setCreditorCreditCard(request.getCreditorCreditCard());
		respuestaOrdenTransferencia.setSameCustomerFlag(request.getSameCustomerFlag());
		respuestaOrdenTransferencia.setBranchId(request.getBranchId());
		respuestaOrdenTransferencia.setInstructionId(request.getInstructionId());
		
		return new ResponseEntity<WsBTOrdenTranferenciaTINResponseDto>(respuestaOrdenTransferencia, HttpStatus.CREATED);
		
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
	
	

