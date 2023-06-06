package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.RCTC2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoRCTC2ResponsetDto;
import org.springframework.stereotype.Service;


@Service
public class SolicitudEstadoPagoMapper {
	
	public SolicitudEstadoPagoRCTC2ResponsetDto getSolicitudEstadoPagoRCTC1(SolicitudEstadoPagoRCTC1RequestDto request)
	{
		SolicitudEstadoPagoRCTC2ResponsetDto solicitudEstadoPagoRCTC2ResponsetDto = new SolicitudEstadoPagoRCTC2ResponsetDto();
		
		
		RCTC2Dto rctc2Dto = new RCTC2Dto();
		rctc2Dto.setDebtorParticipantCode(null);
		rctc2Dto.setCreditorParticipantCode(request.getRctc1Dto().getCreditorParticipantCode());
		rctc2Dto.setResponseDate(null);
		rctc2Dto.setResponseTime(null);
		rctc2Dto.setTerminalId(null);
		rctc2Dto.setRetrievalReferenteNumber(null);
		rctc2Dto.setTrace(null);
		rctc2Dto.setAmount(null);
		rctc2Dto.setCurrency(request.getRctc1Dto().getCreditorParticipantCode());
		rctc2Dto.setTransactionReference(request.getRctc1Dto().getCreditorParticipantCode());
		rctc2Dto.setResponseCode(request.getRctc1Dto().getCurrency());
		rctc2Dto.setReasonCode(null);
		rctc2Dto.setFeeAmount(null);
		rctc2Dto.setSettlementDate(null);
		rctc2Dto.setTransactionType(null);
		rctc2Dto.setDebtorCCI(null);
		rctc2Dto.setCreditorCCI(null);
		rctc2Dto.setCreditorCreditCard(null);
		rctc2Dto.setSameCustomerFlag(null);
		rctc2Dto.setInstructionId(request.getRctc1Dto().getInstructionId());
		rctc2Dto.setInterbankSettlementAmount(null);
		solicitudEstadoPagoRCTC2ResponsetDto.setCtc2Dto(rctc2Dto);
		return solicitudEstadoPagoRCTC2ResponsetDto;
		
	}
	

}
