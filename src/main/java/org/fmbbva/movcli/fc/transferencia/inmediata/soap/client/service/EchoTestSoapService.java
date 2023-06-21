package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;

public interface EchoTestSoapService {
	
	public EchoTestResponseET2Dto getEchotestSoapET1(EchoTestSoapET1Request echoTestSoapET1Request)throws Exception;

}
