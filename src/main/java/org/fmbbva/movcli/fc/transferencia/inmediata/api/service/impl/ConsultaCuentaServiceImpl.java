package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import java.security.cert.CertificateException;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.ConsultaCuentaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.ConsultaCuentaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.mapper.ClienteSoapMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.ClienteSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.action.WsBTRecepcionTINExecute;

@Service
public class ConsultaCuentaServiceImpl implements ConsultaCuentaService{
	
	@Autowired
	private ConsultaCuentaMapper consultaCuentaMapper;
	
	@Autowired
	private ClienteSoapService clienteSoapService;

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

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request){
		ConsultaCuentaAV3ResponseDto response = new ConsultaCuentaAV3ResponseDto();
		try {
			response = clienteSoapService.getConsultaCuentaSoapAV2(consultaCuentaSoapAV2Request);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error " +e.getMessage());
		}
		return response;
	}
	
	

	

}
