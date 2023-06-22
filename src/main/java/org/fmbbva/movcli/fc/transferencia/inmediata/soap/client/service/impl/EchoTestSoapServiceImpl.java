package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.ClientSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.EchoTestSoap;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.EchoTestSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.EchoTestSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTHabilitarTINExecute;
import org.tempuri.action.WsBTHabilitarTINExecuteResponse;
import org.tempuri.action.WsBTRecepcionTINExecute;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;

@Service
public class EchoTestSoapServiceImpl implements EchoTestSoapService {

	private static final Logger log = LogManager.getLogger(EchoTestSoapServiceImpl.class);

	@Autowired
	private EchoTestSoap echoTestSoap;
	
	@Autowired
	private EchoTestSoapMapper echoTestSoapMapper;
	@Override
	
	public EchoTestResponseET2Dto getEchotestSoapET1(EchoTestSoapET1Request echoTestSoapET1Request) {
		log.info("EchoTesti Implements");
		WsBTHabilitarTINExecute wsBTHabilitarTINExecute = echoTestSoapMapper.getET1SoapMapper(echoTestSoapET1Request);
		WsBTHabilitarTINExecuteResponse response = echoTestSoap.getWsBTHabilitarTIN(wsBTHabilitarTINExecute);
		
		EchoTestResponseET2Dto responseET2 =echoTestSoapMapper.getET2SoapMapper(response);
		
		return responseET2;
	}

}
