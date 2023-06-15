package org.fmbbva.movcli.fc.transferencia.inmediata.api.controller;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.CancelacionOrdenTransService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOfService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOnService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.SolicitudEstadoPagoService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR2ResponsetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ssv2/payment-api/v3.5.0")
public class TransferenciaInmediataController {
	
	private static final Logger  logger= Logger.getLogger(TransferenciaInmediataController.class);
	
	
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
	
	@Autowired
	private EchoTestService echoTestService;
	
	
	
	
	@PostMapping(value = "/AV1")
	public ResponseEntity<ConsultaCuentaAV4ResponseDto> getWsBTConsultaCuentaAV1(@RequestBody ConsultaCuentaAV1RequestDto request) {

		
		logger.info("Recibiendo Consulta del servicio Av1");
		
		ConsultaCuentaAV4ResponseDto response =  new ConsultaCuentaAV4ResponseDto();
		response = consultaCuentaAV1Service.getConsultaCuentaAV1(request);
		return new ResponseEntity<ConsultaCuentaAV4ResponseDto>(response, HttpStatus.CREATED);
		
		
	}
	
	
	@PostMapping(value = "/AV2")
	public ResponseEntity<ConsultaCuentaAV3ResponseDto> getWsBTConsultaCuentaAV2(@RequestBody ConsultaCuentaAV2RequestDto request) {
		logger.info("Recibiendo Consulta del servicio Av1");
		ConsultaCuentaAV3ResponseDto response = consultaCuentaAV1Service.getConsultaCuentaAV2(request);
		return new ResponseEntity<ConsultaCuentaAV3ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/CT1")
	public ResponseEntity<OrdenTransferenciaCT4ResponseDto> getWsBTOrdenTransferencia(@RequestBody OrdenTransferenciaCT1RequestDto request) {
		logger.info("Recibiendo Orden de transferencia CT1");
		OrdenTransferenciaCT4ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT1(request);
		return new ResponseEntity<OrdenTransferenciaCT4ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/CT2")
	public ResponseEntity<OrdenTransferenciaCT3ResponseDto> getWsBTOrdenTransferencia(@RequestBody OrdenTransferenciaCT2RequestDto request) {
		logger.info("Recibiendo Orden de transferencia CT2");
		OrdenTransferenciaCT3ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT2(request);
		return new ResponseEntity<OrdenTransferenciaCT3ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	
	@PostMapping(value = "/CT5")
	public ResponseEntity<OrdenTransferenciaCT5ResponseDto> getWsBTOrdenTransferenciaCT5(@RequestBody OrdenTransferenciaCT5RequestDto request) {
		logger.info("Recibiendo Orden de transferencia CT5");
		OrdenTransferenciaCT5ResponseDto response = ordenTransferenciaService.getOrdenTransferenciaCT5(request);
		return new ResponseEntity<OrdenTransferenciaCT5ResponseDto>(response, HttpStatus.CREATED);
		
	}
	

	@PostMapping(value = "/CTC1")
	public ResponseEntity<CancelacionOrdenTransfCTC2ResponseDto> getOrdenCancelTransCTC1(@RequestBody CancelacionOrdenTransfCTC1RequestDto request) {
		logger.info("Recibiendo cancelacion orden de transferencia CTC1");
		CancelacionOrdenTransfCTC2ResponseDto response = cancelacionOrdenTransService.getCancelacionOrdenTransCTC1(request);
		return new ResponseEntity<CancelacionOrdenTransfCTC2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	
	@PostMapping(value = "/PSR1")
	public ResponseEntity<SolicitudEstadoPagoPSR2ResponsetDto> getSolicitudEstadoPagoRCT1(@RequestBody SolicitudEstadoPagoPSR1RequestDto request) {
		logger.info("Recibiendo Solicitud de estado de pago PSR1");
		SolicitudEstadoPagoPSR2ResponsetDto response = solicitudEstadoPagoService.getSolicitudEstadoPagoPSR1(request);
		return new ResponseEntity<SolicitudEstadoPagoPSR2ResponsetDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/SIGNON1")
	public ResponseEntity<RespuestaSignOn2ResponseDto> getRespuestaSignOn1(@RequestBody RespuestaSignOn1RequestDto request) {
		logger.info("Recibiendo respuesta signon1");
		RespuestaSignOn2ResponseDto response = respuestaSignOnService.getRespuestaSignOn1(request);
		return new ResponseEntity<RespuestaSignOn2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping(value = "/SIGNOF1")
	public ResponseEntity<RespuestaSignOf2ResponseDto> getRespuestaSignOf1(@RequestBody RespuestaSignOf1RequestDto request) {
		logger.info("Recibiendo respuesta signof1");
		RespuestaSignOf2ResponseDto response = respuestaSignOfService.getRespuestaSignOf1(request);
		return new ResponseEntity<RespuestaSignOf2ResponseDto>(response, HttpStatus.CREATED);
		
	}
	@PostMapping(value = "/ET1")
	public ResponseEntity<EchoTestResponseET2Dto> getEchoTestRespuesta1(@RequestBody EchoTestRequestET1Dto request){
		logger.info("Recibiendo respuesta echoTest et1");
		EchoTestResponseET2Dto response = echoTestService.getEchoTest1(request);
		return new ResponseEntity<EchoTestResponseET2Dto>(response,HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
		
}
	
	

