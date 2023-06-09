package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;

import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CTC2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.cancelacion.dto.CancelacionOrdenTransfCTC2ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class OrdenCancelacionTransferenciaMapper {
	
	private static final Logger  logger= Logger.getLogger(OrdenCancelacionTransferenciaMapper.class);

	public CancelacionOrdenTransfCTC2ResponseDto getCancelacionOrdenCTC1(CancelacionOrdenTransfCTC1RequestDto request)
	{
		logger.info("Ingresando  al mappeo de atributos en getCancelacionOrdenCTC1 CTC1 ");

		CancelacionOrdenTransfCTC2ResponseDto cancelacionOrdenTransfCTC2ResponseDto = new CancelacionOrdenTransfCTC2ResponseDto();
		CTC2Dto ctc2Dto = new CTC2Dto();
		ctc2Dto.setCreditorParticipantCode(request.getCtc1Dto().getCreditorParticipantCode());
		ctc2Dto.setResponseDate(null);
		ctc2Dto.setResponseTime(null);
		ctc2Dto.setCurrency(request.getCtc1Dto().getCurrency());
		ctc2Dto.setResponseCode(null);
		ctc2Dto.setReasonCode(null);
		ctc2Dto.setBranchId(request.getCtc1Dto().getBranchId());
		ctc2Dto.setInstructionId(request.getCtc1Dto().getInstructionId());
		cancelacionOrdenTransfCTC2ResponseDto.setCtc2Dto(ctc2Dto);
		logger.info("Fin del mappeo de atributos en getCancelacionOrdenCTC1 CTC1 ");

		return cancelacionOrdenTransfCTC2ResponseDto;
	}
	

}
