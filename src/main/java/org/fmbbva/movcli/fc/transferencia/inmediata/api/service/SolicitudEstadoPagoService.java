package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR2ResponsetDto;

public interface SolicitudEstadoPagoService {
	
	public SolicitudEstadoPagoPSR2ResponsetDto getSolicitudEstadoPagoPSR1(SolicitudEstadoPagoPSR1RequestDto solicitudEstadoPagoPSR1RequestDto);

}
