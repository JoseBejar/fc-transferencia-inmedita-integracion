package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.apache.tomcat.util.json.JSONParser;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import bantotal.dlya.com.uy.btservice.BTExtReq;

@Service
public class ClienteSoapMapper {
	
	public WsBTRecepcionTINExecute getAV2SoapMapper(ConsultaCuentaSoapAV2Request request) {
		
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
	}