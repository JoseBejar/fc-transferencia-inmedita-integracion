package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT3Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRecepcionTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTRespuestaTranferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.WsBTTransferenciaTINResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.CancelacionOrdenTransService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOfService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOnService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.SolicitudEstadoPagoService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC2ResponsetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
	
	@Autowired
	private CancelacionOrdenTransService cancelacionOrdenTransService;
	
	@Autowired
	private SolicitudEstadoPagoService solicitudEstadoPagoService;
	
	@Autowired
	private RespuestaSignOnService respuestaSignOnService;
	
	@Autowired
	private RespuestaSignOfService respuestaSignOfService;
	
	
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
	public ResponseEntity<OrdenTransferenciaCT5ResponseDto> getWsBTOrdenTransferenciaCT5(@RequestBody OrdenTransferenciaCT5RequestDto request) {
		
		OrdenTransferenciaCT5ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT5(request);
		return new ResponseEntity<OrdenTransferenciaCT5ResponseDto>(response, HttpStatus.CREATED);
		
	}
	

	@PostMapping(value = "/CTC1")
	public ResponseEntity<CancelacionOrdenTransfCTC2ResponseDto> getOrdenCancelTransCTC1(@RequestBody CancelacionOrdenTransfCTC1RequestDto request) {
		
		CancelacionOrdenTransfCTC2ResponseDto response = cancelacionOrdenTransService.getCancelacionOrdenTransCTC1(request);
		return new ResponseEntity<CancelacionOrdenTransfCTC2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/RCTC1")
	public ResponseEntity<SolicitudEstadoPagoRCTC2ResponsetDto> getSolicitudEstadoPagoRCT1(@RequestBody SolicitudEstadoPagoRCTC1RequestDto request) {
		
		SolicitudEstadoPagoRCTC2ResponsetDto response = solicitudEstadoPagoService.getSolicitudEstadoPagoRCTC1(request);
		return new ResponseEntity<SolicitudEstadoPagoRCTC2ResponsetDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/SIGNON")
	public ResponseEntity<RespuestaSignOn2ResponseDto> getRespuestaSignOn1(@RequestBody RespuestaSignOn1RequestDto request) {
		
		RespuestaSignOn2ResponseDto response = respuestaSignOnService.getRespuestaSignOn1(request);
		return new ResponseEntity<RespuestaSignOn2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/SIGNOF")
	public ResponseEntity<RespuestaSignOf2ResponseDto> getRespuestaSignOf1(@RequestBody RespuestaSignOf1RequestDto request) {
		
		RespuestaSignOf2ResponseDto response = respuestaSignOfService.getRespuestaSignOf1(request);
		return new ResponseEntity<RespuestaSignOf2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	
	
	
	
	
		
}
	
	

