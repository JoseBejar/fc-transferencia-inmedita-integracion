package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;

public interface ClienteSoapService {
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request)throws Exception;

}
