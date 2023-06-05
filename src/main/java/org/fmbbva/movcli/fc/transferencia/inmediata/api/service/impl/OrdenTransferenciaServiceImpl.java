package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.OrdenTransferenciaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.OrdenTransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenTransferenciaServiceImpl implements OrdenTransferenciaService{

	@Autowired
	private OrdenTransferenciaMapper ordenTransferenciaMapper;

	@Override
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaCT1(OrdenTransferenciaCT1RequestDto ordenTransferenciaCT1RequestDto) {
		OrdenTransferenciaCT4ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT1Mapper(ordenTransferenciaCT1RequestDto);
		return response;
	}

	@Override
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaCT2(OrdenTransferenciaCT2RequestDto ordenTransferenciaCT2RequestDto) {
		OrdenTransferenciaCT3ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT2Mapper(ordenTransferenciaCT2RequestDto);
		return response;
	}	
	@Override
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaCT5(OrdenTransferenciaCT5RequestDto ordenTransferenciaCT5RequestDto) {
		OrdenTransferenciaCT5ResponseDto response = ordenTransferenciaMapper.getOrdenTransferenciaCT5Mapper(ordenTransferenciaCT5RequestDto);
		return response;
	}	
}
