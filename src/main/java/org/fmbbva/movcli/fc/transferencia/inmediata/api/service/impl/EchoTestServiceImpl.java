package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.EchoTestMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.EchoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoTestServiceImpl implements EchoTestService {

	@Autowired
	private EchoTestMapper echoTestMapper;
	
	@Override
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto echoTestRequestET1Dto) {
		EchoTestResponseET2Dto response = echoTestMapper.getEchoTest1(echoTestRequestET1Dto);
		
		return response;
	}

}
