package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.ConsultaCuentaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCuentaServiceImpl implements ConsultaCuentaService{
	
	@Autowired
	private ConsultaCuentaMapper consultaCuentaMapper;

	@Override
	public ConsultaCuentaAV4ResponseDto getConsultaCuentaAV1(ConsultaCuentaAV1RequestDto consultaCuentaAV1RequestDto) {
		
		ConsultaCuentaAV4ResponseDto consultaCuentaAV4ResponseDto = consultaCuentaMapper.getConsultaCuentaAV1Mapper(consultaCuentaAV1RequestDto);
		return consultaCuentaAV4ResponseDto;
	}

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaAV2(ConsultaCuentaAV2RequestDto consultaCuentaAV2RequestDto) {
		ConsultaCuentaAV3ResponseDto consultaCuentaAV3ResponseDto = consultaCuentaMapper.getConsultaCuentaAV2Mapper(consultaCuentaAV2RequestDto);
		return consultaCuentaAV3ResponseDto;
	}

}
