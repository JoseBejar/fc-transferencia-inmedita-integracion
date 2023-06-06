package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.RespuestaSignOfMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOfService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signOf.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signOf.dto.RespuestaSignOf2ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaSignOfServiceImpl implements RespuestaSignOfService {

	
	
	@Autowired
	public RespuestaSignOfMapper respuestaSignOf1Mapper;
	
	@Override
	public RespuestaSignOf2ResponseDto getRespuestaSignOf1(RespuestaSignOf1RequestDto respuestaSignOf1RequestDto) {
		RespuestaSignOf2ResponseDto response = respuestaSignOf1Mapper.getRespuestaSignOf1(respuestaSignOf1RequestDto);
		return response;
	}
	

}
