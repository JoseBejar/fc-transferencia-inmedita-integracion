package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;



import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.SolicitudEstadoPagoMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.SolicitudEstadoPagoService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR2ResponsetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudEstadoPagoServiceImpl implements SolicitudEstadoPagoService {


	private static final Logger  logger= Logger.getLogger(SolicitudEstadoPagoServiceImpl.class);


	@Autowired(required = true)
	private SolicitudEstadoPagoMapper solicitudEstadoPagoMapper;
	
	@Override
	public SolicitudEstadoPagoPSR2ResponsetDto getSolicitudEstadoPagoPSR1(
			SolicitudEstadoPagoPSR1RequestDto solicitudEstadoPagoPSR1RequestDto) {
		logger.info("Solicitud Estado de Pago PSR2 service Implement");
		SolicitudEstadoPagoPSR2ResponsetDto response =  solicitudEstadoPagoMapper.getSolicitudEstadoPagoPSR1(solicitudEstadoPagoPSR1RequestDto);

		return  response;
	}

}
