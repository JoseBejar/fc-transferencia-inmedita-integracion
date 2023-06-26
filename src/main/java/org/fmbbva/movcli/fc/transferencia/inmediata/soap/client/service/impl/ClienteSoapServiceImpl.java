package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.impl;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.ClienteSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.ClienteSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT5RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;




@Service
public class ClienteSoapServiceImpl implements ClienteSoapService{
	
	private static final Logger log = LogManager.getLogger(ClienteSoapServiceImpl.class); 	

	@Autowired
	private ClienteSoapMapper clienteSoapMapper;
	
	@Autowired
	private ClientSoap clientSoap;
	

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request) throws Exception {
		log.info("Inicio -getConsultaCuentaSoapAV2 - invocando WsBTRecepcionTINExecute, WsBTRecepcionTINExecuteResponse, ConsultaCuentaAV3ResponseDto");


		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getAV2SoapMapper(consultaCuentaSoapAV2Request);
		log.info("Inicio - getConsultaCuentaSoapAV2 - invocando a cliente mapper av2 ");

		WsBTRecepcionTINExecuteResponse response = clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		log.info("Inicio - getConsultaCuentaSoapAV2 - invocando BtsRecepcionTin ");
		
		ConsultaCuentaAV3ResponseDto responseAv3 = clienteSoapMapper.getAV3SoapMapper(response);
		log.info("Inicio - getConsultaCuentaSoapAV2 - invocando cliente mapper av3 ");

	
		log.info("Fin -getConsultaCuentaSoapAV2 - llamado de WsBTRecepcionTINExecute, WsBTRecepcionTINExecuteResponse, ConsultaCuentaAV3ResponseDto");
		return responseAv3;
	}


	@Override
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaSoapCT2(
			OrdenTransferenciaSoapCT2RequestDto ordenTransferenciaSoapCT2RequestDto) throws Exception {
		log.info("Ingresando al servicio  Soap getOrdenTransferenciaSoapCT2 ");
		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getCT2SoapMapper(ordenTransferenciaSoapCT2RequestDto);
		WsBTRecepcionTINExecuteResponse response =clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		OrdenTransferenciaCT3ResponseDto responseCT3 = clienteSoapMapper.getCT3SoapMapper(response);
		log.info("Fin del  servicio  Soap getOrdenTransferenciaSoapCT2");
		return responseCT3;
	}


	@Override
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaSoapCT1(
			OrdenTransferenciaSoapCT1RequestDto ordenTransferenciaSoapCT1RequestDto) throws Exception {
		
		log.info("Ingresando al servicio  Soap getOrdenTransferenciaSoapCT1 ");
		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getCT1SoapMapper(ordenTransferenciaSoapCT1RequestDto);
		WsBTRecepcionTINExecuteResponse response = clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		OrdenTransferenciaCT4ResponseDto responseCT4 = clienteSoapMapper.getCT4SoapMapper(response);
		log.info("Fin del  servicio  Soap getOrdenTransferenciaSoapCT1");
		return responseCT4;
	}


	@Override
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaSoapCT5(
			OrdenTransferenciaSoapCT5RequestDto ordenTransferenciaSoapCT5RequestDto) throws Exception {
		log.info("Ingresando al servicio  Soap getOrdenTransferenciaSoapCT5 ");

		WsBTRecepcionTINExecute wsBTRecepcionTINExecute =clienteSoapMapper.getCT5SoapMapper(ordenTransferenciaSoapCT5RequestDto);
		WsBTRecepcionTINExecuteResponse response = clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		OrdenTransferenciaCT5ResponseDto responseCT5 = clienteSoapMapper.getCT5ResponseSoapMappper(response);
		log.info("Fin del  servicio  Soap getOrdenTransferenciaSoapCT5");

		return responseCT5;
	}
	

	
	
	

}
