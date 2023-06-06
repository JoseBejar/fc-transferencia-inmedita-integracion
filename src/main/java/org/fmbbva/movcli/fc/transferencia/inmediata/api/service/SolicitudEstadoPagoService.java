package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC2ResponsetDto;

public interface SolicitudEstadoPagoService {
	
	public SolicitudEstadoPagoRCTC2ResponsetDto getSolicitudEstadoPagoRCTC1(SolicitudEstadoPagoRCTC1RequestDto solicitudEstadoPagoRCTC1RequestDto);

}
