package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.EchoTestSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.EchoTestSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.EchoTestSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.tempuri.action.WsBTHabilitarTINExecute;
import org.tempuri.action.WsBTHabilitarTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

public class EchoTestSoapServiceImpl implements EchoTestSoapService {

	@Autowired
	private EchoTestSoap echoTestSoap;
	
	@Autowired
	private EchoTestSoapMapper echoTestSoapMapper;
	@Override
	public EchoTestResponseET2Dto getEchotestSoapET1(EchoTestSoapET1Request echoTestSoapET1Request) {
		WsBTHabilitarTINExecute wsBTHabilitarTINExecute = echoTestSoapMapper.getET1SoapMapper(echoTestSoapET1Request);
		WsBTHabilitarTINExecuteResponse response = echoTestSoap.getWsBTHabilitarTIN(wsBTHabilitarTINExecute);
		
		EchoTestResponseET2Dto responseET2 =echoTestSoapMapper.getET2SoapMapper(response);
		
		return responseET2;
	}

}
