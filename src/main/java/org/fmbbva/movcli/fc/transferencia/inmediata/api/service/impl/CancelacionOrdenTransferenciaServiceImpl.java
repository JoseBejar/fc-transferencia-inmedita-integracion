package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.OrdenCancelacionTransferenciaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.CancelacionOrdenTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancelacionOrdenTransferenciaServiceImpl implements CancelacionOrdenTransService{

	@Autowired
	private OrdenCancelacionTransferenciaMapper ordenCancelacionTransferenciaMapper;

	@Override
	public CancelacionOrdenTransfCTC2ResponseDto getCancelacionOrdenTransCTC1(
			CancelacionOrdenTransfCTC1RequestDto cancelacionOrdenTransfCTC1RequestDto) {
		CancelacionOrdenTransfCTC2ResponseDto response = ordenCancelacionTransferenciaMapper.getCancelacionOrdenCTC1(cancelacionOrdenTransfCTC1RequestDto);
		return response;
	}
	
	
	


}
