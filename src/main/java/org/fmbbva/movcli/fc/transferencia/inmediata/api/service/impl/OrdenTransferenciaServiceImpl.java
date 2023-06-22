package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import java.security.cert.CertificateException;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.OrdenTransferenciaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service.ClienteSoapService;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT5RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenTransferenciaServiceImpl implements OrdenTransferenciaService{

	private static final Logger  logger= Logger.getLogger(OrdenTransferenciaServiceImpl.class);


	@Autowired
	private OrdenTransferenciaMapper ordenTransferenciaMapper;

	
	@Autowired
	private ClienteSoapService clienteSoapService;
	
	@Override
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaCT1(OrdenTransferenciaCT1RequestDto ordenTransferenciaCT1RequestDto) {
		logger.info("Orden Transferencia CT4 service Implement");
		OrdenTransferenciaCT4ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT1Mapper(ordenTransferenciaCT1RequestDto);
		return response;
	}

	@Override
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaCT2(OrdenTransferenciaCT2RequestDto ordenTransferenciaCT2RequestDto) {
		logger.info("Orden Transferencia CT3 service Implement");
		OrdenTransferenciaCT3ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT2Mapper(ordenTransferenciaCT2RequestDto);
		return response;
	}	
	@Override
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaCT5(OrdenTransferenciaCT5RequestDto ordenTransferenciaCT5RequestDto) {
		logger.info("Orden Transferencia CT5 service Implement");
		OrdenTransferenciaCT5ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT5Mapper(ordenTransferenciaCT5RequestDto);
		return response;
	}

	@Override
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaSOAPCT2(
			OrdenTransferenciaSoapCT2RequestDto ordenTransferenciaSoapCT2RequestDto) throws CertificateException {
		
		OrdenTransferenciaCT3ResponseDto response = null;
		try {
			logger.info("Orden Transferencia CT3 SOAP service Implement");
			response = clienteSoapService.getOrdenTransferenciaSoapCT2(ordenTransferenciaSoapCT2RequestDto);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return response;
	}

	@Override
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaSOAPCT1(
			OrdenTransferenciaSoapCT1RequestDto ordenTransferenciaSoapCT1RequestDto) throws CertificateException {
		OrdenTransferenciaCT4ResponseDto response = null;
		try {
			logger.info("Orden Transferencia CT4 SOAP service Implement");
			response = clienteSoapService.getOrdenTransferenciaSoapCT1(ordenTransferenciaSoapCT1RequestDto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaSOAPCT5(
			OrdenTransferenciaSoapCT5RequestDto ordenTransferenciaSoapCT5RequestDto) throws CertificateException {
		OrdenTransferenciaCT5ResponseDto response = null;
		try {
			logger.info("Orden Transferencia CT4 SOAP service Implement");
			response = clienteSoapService.getOrdenTransferenciaSoapCT5(ordenTransferenciaSoapCT5RequestDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  response;
	}

	

	

		
}
