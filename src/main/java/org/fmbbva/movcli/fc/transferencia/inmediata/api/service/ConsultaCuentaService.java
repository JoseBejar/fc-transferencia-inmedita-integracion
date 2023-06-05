package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;

public interface ConsultaCuentaService {
	
	public ConsultaCuentaAV4ResponseDto getConsultaCuentaAV1(ConsultaCuentaAV1RequestDto consultaCuentaAV1RequestDto);
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaAV2(ConsultaCuentaAV2RequestDto consultaCuentaAV2RequestDto);

}
