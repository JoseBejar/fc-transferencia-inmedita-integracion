package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import java.security.cert.CertificateException;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.controller.TransferenciaInmediataController;
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
	
	private static final Logger  logger= Logger.getLogger(ConsultaCuentaServiceImpl.class);
	@Autowired
	private ConsultaCuentaMapper consultaCuentaMapper;
	
	@Autowired
	private ClienteSoapService clienteSoapService;

	@Override
	public ConsultaCuentaAV4ResponseDto getConsultaCuentaAV1(ConsultaCuentaAV1RequestDto consultaCuentaAV1RequestDto) {
		logger.info("Servicio Consulta Av4 Impl");
		ConsultaCuentaAV4ResponseDto consultaCuentaAV4ResponseDto = consultaCuentaMapper.getConsultaCuentaAV1Mapper(consultaCuentaAV1RequestDto);
		return consultaCuentaAV4ResponseDto;
	}

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaAV2(ConsultaCuentaAV2RequestDto consultaCuentaAV2RequestDto) {
		logger.info("Servicio Consulta Av3 Impl");
		ConsultaCuentaAV3ResponseDto consultaCuentaAV3ResponseDto = consultaCuentaMapper.getConsultaCuentaAV2Mapper(consultaCuentaAV2RequestDto);
		return consultaCuentaAV3ResponseDto;
	}

	@Override
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request){
		logger.info("Servicio Consulta SOAP AV3 Impl");

			ConsultaCuentaAV3ResponseDto response = null;
			try {
				response = clienteSoapService.getConsultaCuentaSoapAV2(consultaCuentaSoapAV2Request);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		return response;
	}
	
	

	

}
