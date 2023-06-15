package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import java.security.cert.CertificateException;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;

public interface EchoTestService {
	
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto echoTestRequestET1Dto);
	
	public EchoTestResponseET2Dto getEchoTestSoap1(EchoTestSoapET1Request consultaCuentaSoapAV2Request) throws CertificateException;
	
	

}
