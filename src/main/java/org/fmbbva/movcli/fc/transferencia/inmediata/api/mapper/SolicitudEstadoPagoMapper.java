package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;


import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.PSR2Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto.SolicitudEstadoPagoPSR2ResponsetDto;
import org.springframework.stereotype.Service;


@Service
public class SolicitudEstadoPagoMapper {
	
	private static final Logger  logger= Logger.getLogger(SolicitudEstadoPagoMapper.class);

	public SolicitudEstadoPagoPSR2ResponsetDto getSolicitudEstadoPagoPSR1(SolicitudEstadoPagoPSR1RequestDto request)
	{
		
		logger.info("Ingresando  al mappeo de atributos en getSolicitudEstadoPagoPSR1 PSR1 ");

		SolicitudEstadoPagoPSR2ResponsetDto solicitudEstadoPagoPSR2ResponsetDto = new SolicitudEstadoPagoPSR2ResponsetDto();
		
		
		PSR2Dto rctc2Dto = new PSR2Dto();
		rctc2Dto.setDebtorParticipantCode(null);
		rctc2Dto.setCreditorParticipantCode(request.getPsr1Dto().getCreditorParticipantCode());
		rctc2Dto.setResponseDate(null);
		rctc2Dto.setResponseTime(null);
		rctc2Dto.setTerminalId(null);
		rctc2Dto.setRetrievalReferenteNumber(null);
		rctc2Dto.setTrace(null);
		rctc2Dto.setAmount(null);
		rctc2Dto.setCurrency(request.getPsr1Dto().getCreditorParticipantCode());
		rctc2Dto.setTransactionReference(request.getPsr1Dto().getCreditorParticipantCode());
		rctc2Dto.setResponseCode(request.getPsr1Dto().getCurrency());
		rctc2Dto.setReasonCode(null);
		rctc2Dto.setFeeAmount(null);
		rctc2Dto.setSettlementDate(null);
		rctc2Dto.setTransactionType(null);
		rctc2Dto.setDebtorCCI(null);
		rctc2Dto.setCreditorCCI(null);
		rctc2Dto.setCreditorCreditCard(null);
		rctc2Dto.setSameCustomerFlag(null);
		rctc2Dto.setInstructionId(request.getPsr1Dto().getInstructionId());
		rctc2Dto.setInterbankSettlementAmount(null);
		solicitudEstadoPagoPSR2ResponsetDto.setPsr2Dto(rctc2Dto);
		
		logger.info("Fin del mappeo de atributos en getSolicitudEstadoPagoPSR1 PSR1 ");

		return solicitudEstadoPagoPSR2ResponsetDto;
		
	}
	

}
