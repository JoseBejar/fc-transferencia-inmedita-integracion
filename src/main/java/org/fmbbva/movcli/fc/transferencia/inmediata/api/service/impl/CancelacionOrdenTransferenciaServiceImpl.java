package org.fmbbva.movcli.fc.transferencia.inmediata.api.service.impl;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.ConsultaCuentaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.EchoTestMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper.OrdenCancelacionTransferenciaMapper;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.service.CancelacionOrdenTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancelacionOrdenTransferenciaServiceImpl implements CancelacionOrdenTransService{

	private static final Logger  logger= Logger.getLogger(CancelacionOrdenTransferenciaServiceImpl.class);


	@Autowired
	private OrdenCancelacionTransferenciaMapper ordenCancelacionTransferenciaMapper;

	@Override
	public CancelacionOrdenTransfCTC2ResponseDto getCancelacionOrdenTransCTC1(
			CancelacionOrdenTransfCTC1RequestDto cancelacionOrdenTransfCTC1RequestDto) {
		logger.info("Ingresando al servicio Orden Cancelacion Transferencia CTC2");
		CancelacionOrdenTransfCTC2ResponseDto response = ordenCancelacionTransferenciaMapper.getCancelacionOrdenCTC1(cancelacionOrdenTransfCTC1RequestDto);
		logger.info("Fin del servicio Orden Cancelacion Transferencia CTC2");
		return response;
	}
	
	
	


}
