package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.impl;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.ClienteSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.ClienteSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
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
		log.info("Consulta Cuenta AV3 SOAP Implement");
		
		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getAV2SoapMapper(consultaCuentaSoapAV2Request);
		WsBTRecepcionTINExecuteResponse response = clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		//JSONObject json = WSDLUtil.convertResponseWSDLtoString(response, "Errores");
		ConsultaCuentaAV3ResponseDto responseAv3 = clienteSoapMapper.getAV3SoapMapper(response);
		
		return responseAv3;
	}


	@Override
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaSoapCT2(
			OrdenTransferenciaSoapCT2RequestDto ordenTransferenciaSoapCT2RequestDto) throws Exception {
		log.info("Orden Transferencia CT3 SOAP Implement");
		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getOrdenTransfCT2SoapMapper(ordenTransferenciaSoapCT2RequestDto);
		WsBTRecepcionTINExecuteResponse response =clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		OrdenTransferenciaCT3ResponseDto responseCT3 = clienteSoapMapper.getCT3Mapper(response);
		return responseCT3;
	}
	

	
	
	

}
