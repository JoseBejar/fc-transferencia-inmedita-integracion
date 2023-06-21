package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import java.security.cert.CertificateException;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.EchoTestMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.EchoTestSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.EchoTestSoapET1Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoTestServiceImpl implements EchoTestService {

	private static final Logger  logger= Logger.getLogger(EchoTestServiceImpl.class);

	@Autowired
	private EchoTestMapper echoTestMapper;
	
	@Autowired
	private EchoTestSoapService  echoTestSoapService;

	@Override
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto echoTestRequestET1Dto) {
		
		logger.info("Echo Test ET2 Service impl");
		EchoTestResponseET2Dto consultaEchoTestResponseET2Dto = echoTestMapper.getEchoTest1(echoTestRequestET1Dto);
		
		return consultaEchoTestResponseET2Dto;
	}

	@Override
	public EchoTestResponseET2Dto getEchoTestSoap1(EchoTestSoapET1Request echoTestSoapET1Request)
			throws CertificateException {
		EchoTestResponseET2Dto response = null;
		try {
			logger.info("Echo Test ET2 Soap Service impl");
			response=  echoTestSoapService.getEchotestSoapET1(echoTestSoapET1Request);
		} catch (Exception e) {

		}
		return response;
	}
	
	

}
