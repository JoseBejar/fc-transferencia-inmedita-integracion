package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestRequestET1Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto.EchoTestResponseET2Dto;

public interface EchoTestService {
	
	public EchoTestResponseET2Dto getEchoTest1(EchoTestRequestET1Dto echoTestRequestET1Dto);
	
	
	

}
