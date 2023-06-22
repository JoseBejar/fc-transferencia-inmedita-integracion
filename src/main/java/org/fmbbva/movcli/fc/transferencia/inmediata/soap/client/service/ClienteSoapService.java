package org.fmbbva.movcli.fc.transferencia.inmediata.soap.client.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.ConsultaCuentaSoapAV2Request;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.soap.dto.OrdenTransferenciaSoapCT5RequestDto;

public interface ClienteSoapService {
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaSoapAV2(ConsultaCuentaSoapAV2Request consultaCuentaSoapAV2Request)throws Exception;

	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaSoapCT2(OrdenTransferenciaSoapCT2RequestDto ordenTransferenciaSoapCT2RequestDto) throws Exception;
	
	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaSoapCT1(OrdenTransferenciaSoapCT1RequestDto ordenTransferenciaSoapCT1RequestDto) throws Exception;
	
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaSoapCT5(OrdenTransferenciaSoapCT5RequestDto ordenTransferenciaSoapCT5RequestDto) throws Exception;
	
}
