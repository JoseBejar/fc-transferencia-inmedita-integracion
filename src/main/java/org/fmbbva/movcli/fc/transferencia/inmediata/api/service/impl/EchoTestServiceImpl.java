package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import java.security.cert.CertificateException;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.EchoTestMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoTestServiceImpl implements EchoTestService {

	@Autowired
	private EchoTestMapper echoTestMapper;
	@Autowired
	private EchoTestService echoTestService;

	@Override
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto echoTestRequestET1Dto) {
		
		EchoTestResponseET2Dto consultaEchoTestResponseET2Dto = echoTestMapper.getEchoTest1(echoTestRequestET1Dto);
		
		return consultaEchoTestResponseET2Dto;
	}

	@Override
	public EchoTestResponseET2Dto getEchoTestSoap1(EchoTestSoapET1Request echoTestSoapET1Request)
			throws CertificateException {
		EchoTestResponseET2Dto response = null;
		try {
			response=  echoTestService.getEchoTestSoap1(echoTestSoapET1Request);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	

}
