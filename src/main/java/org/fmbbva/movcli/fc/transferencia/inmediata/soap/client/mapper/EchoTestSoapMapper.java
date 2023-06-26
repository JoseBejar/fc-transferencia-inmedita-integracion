package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;


import org.springframework.stereotype.Service;

import org.tempuri.action.WsBTHabilitarTINExecute;
import org.tempuri.action.WsBTHabilitarTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bantotal.dlya.com.uy.btservice.BTExtReq;


@Service

public class EchoTestSoapMapper {
	private static final Logger log = LogManager.getLogger(EchoTestSoapMapper.class); 	

	public WsBTHabilitarTINExecute getET1SoapMapper(EchoTestSoapET1Request request) {
			
			log.info("Ingresando  al mappeo de atributos en getET1SoapMapper ");

			WsBTHabilitarTINExecute wsBTHabilitarTINExecute = new WsBTHabilitarTINExecute();
			BTExtReq btExtReq = new BTExtReq();
			btExtReq.setCanal(request.getbTExtReqDto().getCanal());
			btExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
			btExtReq.setToken(request.getbTExtReqDto().getToken());
			btExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
			wsBTHabilitarTINExecute.setExtreq(btExtReq);
			wsBTHabilitarTINExecute.setIdcamara((short) request.getIdcamara());
			wsBTHabilitarTINExecute.setPayload(request.getEt1Dto().buildJSON());
			log.info("Fin del mappeo de atributos en getET1SoapMapper ");

			return wsBTHabilitarTINExecute;
		
	}
	public EchoTestResponseET2Dto getET2SoapMapper(WsBTHabilitarTINExecuteResponse request) {
		
		log.info("Iniciando conversión de datos getET2SoapMapper");
		EchoTestResponseET2Dto response = new EchoTestResponseET2Dto();
		
		try {
			response = new ObjectMapper().readValue(request.getPayload(), EchoTestResponseET2Dto.class);
		} catch (JsonMappingException e) {
			log.error("Error en la conversión de datos getET2SoapMapper ");
			e.printStackTrace();
		}catch (JsonProcessingException e) {
			log.error("Error conversión de datos getET2SoapMapper ");
			e.printStackTrace();
		}
		log.info("Fin conversión de datos getET2SoapMapper ");

		return response;
	}


}
