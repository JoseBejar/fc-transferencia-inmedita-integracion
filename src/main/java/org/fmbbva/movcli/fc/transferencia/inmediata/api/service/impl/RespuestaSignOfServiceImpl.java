package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.RespuestaSignOfMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOfService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf2ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaSignOfServiceImpl implements RespuestaSignOfService {


	private static final Logger  logger= Logger.getLogger(RespuestaSignOfServiceImpl.class);

	
	@Autowired
	public RespuestaSignOfMapper respuestaSignOf1Mapper;
	
	@Override
	public RespuestaSignOf2ResponseDto getRespuestaSignOf1(RespuestaSignOf1RequestDto respuestaSignOf1RequestDto) {
		logger.info("Respuesta SignOf2 service Implement");

		RespuestaSignOf2ResponseDto response = respuestaSignOf1Mapper.getRespuestaSignOf1(respuestaSignOf1RequestDto);
		return response;
	}
	

}
