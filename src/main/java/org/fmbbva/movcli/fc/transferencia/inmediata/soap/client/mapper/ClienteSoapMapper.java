package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper;

import java.util.ArrayList;
import java.util.List;

import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;
import bantotal.dlya.com.uy.btservice.BTErrorNegocio;
import bantotal.dlya.com.uy.btservice.BTErroresNegocio;
import bantotal.dlya.com.uy.btservice.BTExtReq;

@Service
public class ClienteSoapMapper {
	
	public WsBTRecepcionTINExecute getAV2SoapMapper(ConsultaCuentaSoapAV2Request request) {
		
		WsBTRecepcionTINExecute wsBTRecepcionTIN = new WsBTRecepcionTINExecute();
		BTExtReq bTExtReq = new BTExtReq();
		BTErrorNegocio bTErrorNegocio = new BTErrorNegocio();
		List<BTErrorNegocio> listBTErrorNegocio = new ArrayList<>();
		BTErroresNegocio bTErroresNegocio = new BTErroresNegocio();
		bTExtReq.setCanal(request.getbTExtReqDto().getCanal());
		bTExtReq.setRequerimiento(request.getbTExtReqDto().getRequerimiento());
		bTExtReq.setToken(request.getbTExtReqDto().getToken());
		bTExtReq.setUsuario(request.getbTExtReqDto().getUsuario());
		wsBTRecepcionTIN.setExtreq(bTExtReq);
		wsBTRecepcionTIN.setMpe005Idc((short)request.getMpe005idc());
		wsBTRecepcionTIN.setPayload(request.getAv2Dto().buildJSON());
		for(int i = 0 ; i < request.getErroresnegocio().getBtErrorNegocio().size() ; i++ ) {
			bTErrorNegocio.setCodigo(request.getErroresnegocio().getBtErrorNegocio().get(i).getCodigo());
			bTErrorNegocio.setDescripcion(request.getErroresnegocio().getBtErrorNegocio().get(i).getDescripcion());
			bTErrorNegocio.setSeveridad(request.getErroresnegocio().getBtErrorNegocio().get(i).getSeveridad());
			listBTErrorNegocio.add(bTErrorNegocio);
		}
		bTErroresNegocio.setBtErrorNegocio(listBTErrorNegocio);
		wsBTRecepcionTIN.setErroresnegocio(bTErroresNegocio);
		System.out.print("Payload : "+request.getAv2Dto().buildJSON());
		return wsBTRecepcionTIN;
		}
	}