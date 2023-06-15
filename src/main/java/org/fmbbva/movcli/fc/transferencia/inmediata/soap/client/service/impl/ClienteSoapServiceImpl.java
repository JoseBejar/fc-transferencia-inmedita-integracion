package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.impl;



import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.ClienteSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.ClienteSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;




@Service
public class ClienteSoapServiceImpl implements ClienteSoapService{
	
	@Autowired
	private ClienteSoapMapper clienteSoapMapper;
	
	@Autowired
	private ClientSoap clientSoap;
	

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request) throws Exception {
		
		
		WsBTRecepcionTINExecute wsBTRecepcionTINExecute = clienteSoapMapper.getAV2SoapMapper(consultaCuentaSoapAV2Request);
		WsBTRecepcionTINExecuteResponse response = clientSoap.getWsBTRecepcionTIN(wsBTRecepcionTINExecute);
		
		//JSONObject json = WSDLUtil.convertResponseWSDLtoString(response, "Errores");
		ConsultaCuentaAV3ResponseDto responseAv3 = clienteSoapMapper.getAV3SoapMapper(response);
		
		return responseAv3;
	}
	
	

}
