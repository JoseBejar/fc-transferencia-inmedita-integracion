package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import java.security.cert.CertificateException;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;

public interface ConsultaCuentaService {
	
	public ConsultaCuentaAV4ResponseDto getConsultaCuentaAV1(ConsultaCuentaAV1RequestDto consultaCuentaAV1RequestDto);
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaAV2(ConsultaCuentaAV2RequestDto consultaCuentaAV2RequestDto);
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request) throws CertificateException;

}
