package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.RespuestaSignOn1Mapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.RespuestaSignOnService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn2ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaSignOnServiceImpl implements RespuestaSignOnService{


	private static final Logger  logger= Logger.getLogger(RespuestaSignOnServiceImpl.class);

	@Autowired
	private RespuestaSignOn1Mapper respuestaSignOn1Mapper;
	
	
	@Override
	public RespuestaSignOn2ResponseDto getRespuestaSignOn1(RespuestaSignOn1RequestDto respuestaSignOn1RequestDto) {
		logger.info("Respuesta SignOn2 service Implement");
		RespuestaSignOn2ResponseDto response =  respuestaSignOn1Mapper.getRespuestaSignOn1(respuestaSignOn1RequestDto);
		return response;
	}

	

	

}
