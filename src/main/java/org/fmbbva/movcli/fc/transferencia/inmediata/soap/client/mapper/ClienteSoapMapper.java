package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.json.JSONParser;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import bantotal.dlya.com.uy.btservice.BTExtReq;

@Service
public class ClienteSoapMapper {
	
	private static final Logger log = LogManager.getLogger(ClienteSoapMapper.class); 	

	public WsBTRecepcionTINExecute getAV2SoapMapper(ConsultaCuentaSoapAV2Request request) {
		log.info("Setteando atributos AV2 MAPPER");
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short)request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getAv2Dto().buildJSON());
		return wsBTRecepcionTIN;
		}
	
	public ConsultaCuentaAV3ResponseDto getAV3SoapMapper(WsBTRecepcionTINExecuteResponse request) {
		log.info("Setteando atributos AV3 MAPPER");
		ConsultaCuentaAV3ResponseDto response = new ConsultaCuentaAV3ResponseDto();
		try {
			response =  new ObjectMapper().readValue(request.getPayload(), ConsultaCuentaAV3ResponseDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		return response;
	}
	
	public WsBTRecepcionTINExecute getOrdenTransfCT2SoapMapper(OrdenTransferenciaSoapCT2RequestDto request) {
		log.info("Setteando atributos Orden Transferencia CT2");
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short) request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getCt2Dto().buildJSON());
		return wsBTRecepcionTIN;
	}
	
	public OrdenTransferenciaCT3ResponseDto getCT3Mapper(WsBTRecepcionTINExecuteResponse request) {
		log.info("Setteando atributos Orden Transferencia CT3");
		OrdenTransferenciaCT3ResponseDto response = new OrdenTransferenciaCT3ResponseDto();
		try {
			response = new ObjectMapper().readValue(request.getPayload(), OrdenTransferenciaCT3ResponseDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return response;
	}
}