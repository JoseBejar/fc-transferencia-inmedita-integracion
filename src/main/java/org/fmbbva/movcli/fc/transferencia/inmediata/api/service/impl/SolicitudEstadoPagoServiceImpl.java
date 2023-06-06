package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.SolicitudEstadoPagoMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.SolicitudEstadoPagoService;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC2ResponsetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudEstadoPagoServiceImpl implements SolicitudEstadoPagoService {

	@Autowired(required = true)
	private SolicitudEstadoPagoMapper solicitudEstadoPagoMapper;
	
	@Override
	public SolicitudEstadoPagoRCTC2ResponsetDto getSolicitudEstadoPagoRCTC1(
			SolicitudEstadoPagoRCTC1RequestDto solicitudEstadoPagoRCTC1RequestDto) {
		SolicitudEstadoPagoRCTC2ResponsetDto response =  solicitudEstadoPagoMapper.getSolicitudEstadoPagoRCTC1(solicitudEstadoPagoRCTC1RequestDto);

		return  response;
	}

}
