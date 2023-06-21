package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import java.security.cert.CertificateException;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;

public interface OrdenTransferenciaService {
	
	
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaCT1(OrdenTransferenciaCT1RequestDto ordenTransferenciaCT1RequestDto);

	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaCT2(OrdenTransferenciaCT2RequestDto ordenTransferenciaCT2RequestDto);

	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaCT5(OrdenTransferenciaCT5RequestDto ordenTransferenciaCT2RequestDto);
	
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaSOAPCT2(OrdenTransferenciaSoapCT2RequestDto ordenTransferenciaSoapCT2RequestDto)throws CertificateException;
	
}
