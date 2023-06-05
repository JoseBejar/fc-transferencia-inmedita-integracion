package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT4ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.OrdenTransferenciaCT5ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT4Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT5Dto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.CT3Dto;
import org.springframework.stereotype.Service;

@Service
public class OrdenTransferenciaMapper {

	public OrdenTransferenciaCT4ResponseDto getOrdenTransferenciaCT1Mapper(OrdenTransferenciaCT1RequestDto request) {
		OrdenTransferenciaCT4ResponseDto ordenTransferenciaCT4ResponseDto = new OrdenTransferenciaCT4ResponseDto();
		CT4Dto ct4Dto = new CT4Dto();
		ct4Dto.setDebtorParticipantCode(request.getCt1Dto().getDebtorParticipantCode());
		ct4Dto.setCreditorParticipantCode(request.getCt1Dto().getCreditorParticipantCode());
		ct4Dto.setResponseDate(null);
		ct4Dto.setResponseTime(null);
		ct4Dto.setTerminalId(request.getCt1Dto().getTerminalId());
		ct4Dto.setRetrievalReferenteNumber(request.getCt1Dto().getRetrievalReferenteNumber());
		ct4Dto.setTrace(request.getCt1Dto().getTrace());
		ct4Dto.setAmount(request.getCt1Dto().getAmount());
		ct4Dto.setCurrency(request.getCt1Dto().getCurrency());
		ct4Dto.setTransactionReference(request.getCt1Dto().getTransactionReference());
		ct4Dto.setResponseCode(null);
		ct4Dto.setReasonCode(null);
		ct4Dto.setFeeAmount(request.getCt1Dto().getFeeAmount());
		ct4Dto.setSettlementDate(null);
		ct4Dto.setTransactionType(request.getCt1Dto().getTransactionType());
		ct4Dto.setDebtorCCI(request.getCt1Dto().getDebtorCCI());
		ct4Dto.setCreditorCCI(request.getCt1Dto().getCreditorCCI());
		ct4Dto.setCreditorCreditCard(request.getCt1Dto().getCreditorCreditCard());
		ct4Dto.setSameCustomerFlag(request.getCt1Dto().getSameCustomerFlag());
		ct4Dto.setInstructionId(null);
		ct4Dto.setCreationDate(request.getCt1Dto().getCreationDate());
		ct4Dto.setCreationTime(request.getCt1Dto().getCreationTime());
		ct4Dto.setChannel(request.getCt1Dto().getChannel());
		ct4Dto.setInterbankSettlementAmount(null);
		ordenTransferenciaCT4ResponseDto.setCt4Dto(ct4Dto);
		return ordenTransferenciaCT4ResponseDto;
	}
	
	public OrdenTransferenciaCT3ResponseDto getOrdenTransferenciaCT2Mapper(OrdenTransferenciaCT2RequestDto request) {
		OrdenTransferenciaCT3ResponseDto ordenTransferenciaCT3ResponseDto = new OrdenTransferenciaCT3ResponseDto();
		CT3Dto ct3Dto = new CT3Dto();
		ct3Dto.setDebtorParticipantCode(request.getCt2Dto().getDebtorParticipantCode());
		ct3Dto.setCreditorParticipantCode(request.getCt2Dto().getCreditorParticipantCode());
		ct3Dto.setResponseDate(null);
		ct3Dto.setResponseTime(null);
		ct3Dto.setTerminalId(request.getCt2Dto().getTerminalId());
		ct3Dto.setRetrievalReferenteNumber(request.getCt2Dto().getRetrievalReferenteNumber());
		ct3Dto.setTrace(request.getCt2Dto().getTrace());
		ct3Dto.setAmount(null);
		ct3Dto.setCurrency(null);
		ct3Dto.setTransactionReference(request.getCt2Dto().getTransactionReference());
		ct3Dto.setResponseCode(request.getCt2Dto().getDebtorParticipantCode());
		ct3Dto.setReasonCode(null);
		ct3Dto.setFeeAmount(request.getCt2Dto().getFeeAmount());
		ct3Dto.setSettlementDate(request.getCt2Dto().getSettlementDate());
		ct3Dto.setTransactionType(request.getCt2Dto().getTransactionType());
		ct3Dto.setDebtorCCI(request.getCt2Dto().getDebtorCCI());
		ct3Dto.setCreditorCCI(request.getCt2Dto().getCreditorCCI());
		ct3Dto.setCreditorCreditCard(request.getCt2Dto().getCreditorCreditCard());
		ct3Dto.setSameCustomerFlag(request.getCt2Dto().getSameCustomerFlag());
		ct3Dto.setBranchId(request.getCt2Dto().getBranchId());
		ct3Dto.setInstructionId(request.getCt2Dto().getInstructionId());
		ordenTransferenciaCT3ResponseDto.setCt3Dto(ct3Dto);
		return ordenTransferenciaCT3ResponseDto;
	}
	
	public OrdenTransferenciaCT5ResponseDto getOrdenTransferenciaCT5Mapper(OrdenTransferenciaCT5RequestDto request) {
		
		OrdenTransferenciaCT5ResponseDto ordenTransferenciaCT5ResponseDto = new OrdenTransferenciaCT5ResponseDto();
		CT5Dto ct5Dto = new CT5Dto();
		ct5Dto.setDebtorParticipantCode(request.getCt5dto().getDebtorParticipantCode());
		ct5Dto.setCreditorParticipantCode(request.getCt5dto().getCreditorParticipantCode());
		ct5Dto.setResponseDate(request.getCt5dto().getResponseDate());
		ct5Dto.setResponseTime(request.getCt5dto().getResponseTime());
		ct5Dto.setTerminalId(request.getCt5dto().getTerminalId());
		ct5Dto.setRetrievalReferenteNumber(request.getCt5dto().getRetrievalReferenteNumber());
		ct5Dto.setTrace(request.getCt5dto().getTrace());
		ct5Dto.setCurrency(request.getCt5dto().getCurrency());
		ct5Dto.setTransactionReference(request.getCt5dto().getTransactionReference());
		ct5Dto.setResponseCode(request.getCt5dto().getResponseCode());
		ct5Dto.setFeeAmount(request.getCt5dto().getFeeAmount());
		ct5Dto.setSettlementDate(request.getCt5dto().getSettlementDate());
		ct5Dto.setTransactionType(request.getCt5dto().getTransactionType());
		ct5Dto.setDebtorCCI(request.getCt5dto().getDebtorCCI());
		ct5Dto.setCreditorCCI(request.getCt5dto().getCreditorCCI());
		ct5Dto.setCreditorCreditCard(request.getCt5dto().getCreditorCreditCard());
		ct5Dto.setSameCustomerFlag(request.getCt5dto().getSameCustomerFlag());
		ct5Dto.setInstructionId(request.getCt5dto().getInstructionId());
		ct5Dto.setCreationDate(request.getCt5dto().getCreationDate());
		ct5Dto.setCreationTime(request.getCt5dto().getCreationTime());
		ct5Dto.setChannel(request.getCt5dto().getChannel());
		ct5Dto.setInterbankSettlementAmount(request.getCt5dto().getInterbankSettlementAmount());
	
		ordenTransferenciaCT5ResponseDto.setCt5dto(ct5Dto);
		
		return ordenTransferenciaCT5ResponseDto;
		
		
		
		
		
			
		}
		
}
