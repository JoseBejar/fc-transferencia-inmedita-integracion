package org.fmbbva.movcli.fc.transferencia.inmediata.api.service;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;

public interface CancelacionOrdenTransService {
	
	public CancelacionOrdenTransfCTC2ResponseDto getCancelacionOrdenTransCTC1(CancelacionOrdenTransfCTC1RequestDto cancelacionOrdenTransfCTC1RequestDto);
	

}
