package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.json.JSONParser;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT5RequestDto;
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
		log.info("Inicio - getAV2SoapMapper -  mappeo de propiedades Av2 ");
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short)request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getAv2Dto().buildJSON());
		
		log.info("Fin- getAV2SoapMapper -  mappeo de propiedades Av2 ");
		return wsBTRecepcionTIN;
		}
	
	public ConsultaCuentaAV3ResponseDto getAV3SoapMapper(WsBTRecepcionTINExecuteResponse request) {
		
		ConsultaCuentaAV3ResponseDto response = new ConsultaCuentaAV3ResponseDto();
		try {
			log.info("Inicio - getAV3SoapMapper - conversion  de propiedades a Json  Av3");
			response =  new ObjectMapper().readValue(request.getPayload(), ConsultaCuentaAV3ResponseDto.class);
		} catch (JsonMappingException e) {
			log.error("Erorr -getAV3SoapMapper - no se pudo realizar la conversión  de las propiedades Av3 " + e);
			
		} catch (JsonProcessingException e) {
			log.error("Eror -getAV3SoapMapper - no se pudo realizar la conversión de las propiedades Av3 "+ e);
			
			
		}
		log.info("Fin -getAV3SoapMapper -  de  conversion  de propiedades a Json getAV3SoapMapper ");
		return response;
	}
	
	public WsBTRecepcionTINExecute getCT2SoapMapper(OrdenTransferenciaSoapCT2RequestDto request) {
		log.info("Ingresando  al mappeo de atributos en getCT2SoapMapper ");
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short) request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getCt2Dto().buildJSON());
		log.info("Fin del mappeo  de atributos en getCT2SoapMapper ");

		return wsBTRecepcionTIN;
	}
	
	public OrdenTransferenciaCT3ResponseDto getCT3SoapMapper(WsBTRecepcionTINExecuteResponse request) {
		log.info("Iniciando conversion  de datos a Json getCT3SoapMapper ");
		OrdenTransferenciaCT3ResponseDto response = new OrdenTransferenciaCT3ResponseDto();
		try {
			response = new ObjectMapper().readValue(request.getPayload(), OrdenTransferenciaCT3ResponseDto.class);
		} catch (JsonMappingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT3SoapMapper");

			e.printStackTrace();
		}catch (JsonProcessingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT3SoapMapper");

			e.printStackTrace();
		}
		
		log.info("Fin de  conversion  de datos a Json getCT3SoapMapper ");
		return response;
	}
	
	public WsBTRecepcionTINExecute getCT1SoapMapper(OrdenTransferenciaSoapCT1RequestDto request) {
		log.info("Ingresando  al mappeo de atributos en getCT1SoapMapper ");

		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short) request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getCt1Dto().buildJSON());
		log.info("Fin del mappeo  de atributos en getCT1SoapMapper ");

		return wsBTRecepcionTIN;
	}
	
	public OrdenTransferenciaCT4ResponseDto getCT4SoapMapper(WsBTRecepcionTINExecuteResponse request) {
		log.info("Iniciando conversion  de datos a Json getCT4SoapMapper");
		
		OrdenTransferenciaCT4ResponseDto response = new OrdenTransferenciaCT4ResponseDto();
		
		try {
			response  = new ObjectMapper().readValue(request.getPayload(), OrdenTransferenciaCT4ResponseDto.class);
		} catch (JsonMappingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT4SoapMapper");
			e.printStackTrace();
			

		}catch (JsonProcessingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT4SoapMapper");
			e.printStackTrace();
		}
		
		log.info("Fin de  conversion  de datos a Json getCT4SoapMapper ");
		return response;

	}
	
	public WsBTRecepcionTINExecute getCT5SoapMapper(OrdenTransferenciaSoapCT5RequestDto request) {
		log.info("Ingresando  al mappeo de atributos en getCT5SoapMapper ");
		
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short) request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getCt5Dto().buildJSON());
		
		log.info("Fin  del mappeo de atributos en getCT5SoapMapper ");
		
		return wsBTRecepcionTIN;
	}
	public OrdenTransferenciaCT5ResponseDto getCT5ResponseSoapMappper(WsBTRecepcionTINExecuteResponse request) {
		log.info("Iniciando conversion  de datos a Json getCT5ResponseSoapMappper");


		OrdenTransferenciaCT5ResponseDto response = new OrdenTransferenciaCT5ResponseDto();
		try {
			response  = new ObjectMapper().readValue(request.getPayload(), OrdenTransferenciaCT5ResponseDto.class);
		} catch (JsonMappingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT5ResponseSoapMappper");
			e.printStackTrace();
		}catch (JsonProcessingException e) {
			log.error("Erorr no se pudo realizar la conversión getCT5ResponseSoapMappper");
			e.printStackTrace();
		}
		log.info("Fin de  conversion  de datos a Json getCT5ResponseSoapMappper");
		
		return response;
	}
}