package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto.RespuestaSignOf2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto.RespuestaSignOn2ResponseDto;

public interface RespuestaSignOfService {
	
	public RespuestaSignOf2ResponseDto getRespuestaSignOf1(RespuestaSignOf1RequestDto respuestaSignOf1RequestDto);

}
