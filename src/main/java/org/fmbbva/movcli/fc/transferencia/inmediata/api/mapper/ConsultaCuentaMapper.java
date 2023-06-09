package org.fmbbva.movcli.fc.transferencia.inmediata.api.mapper;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV1RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV2RequestDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV3ResponseDto;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.dto.ConsultaCuentaAV4ResponseDto;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV3;
import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV4Dto;

@Service
public class ConsultaCuentaMapper {
	
	private static final Logger  logger= Logger.getLogger(ConsultaCuentaMapper.class);

	
	public ConsultaCuentaAV4ResponseDto getConsultaCuentaAV1Mapper(ConsultaCuentaAV1RequestDto request) {
		logger.info("Inicio -  getConsultaCuentaAV1Mapper -  mappeo de propiedades   AV1");

		ConsultaCuentaAV4ResponseDto consultaCuentaAV4ResponseDto = new ConsultaCuentaAV4ResponseDto();
		AV4Dto response = new AV4Dto();
		response.setDebtorParticipantCode(request.getAv1().getDebtorParticipantCode());
		response.setCreditorParticipantCode(request.getAv1().getCreditorParticipantCode());
		response.setCreationDate(request.getAv1().getCreationDate());
		response.setCreationTime(request.getAv1().getCreationTime());
		response.setTerminalId(request.getAv1().getTerminalId());
		response.setRetrievalReferenteNumber(request.getAv1().getRetrievalReferenteNumber());
		response.setTrace(request.getAv1().getTrace());
		response.setDebtorName(request.getAv1().getDebtorName());
		response.setDebtorId(request.getAv1().getDebtorId());
		response.setDebtorIdCode(request.getAv1().getDebtorIdCode());
		response.setDebtorPhoneNumber(request.getAv1().getDebtorPhoneNumber());
		response.setDebtorAddressLine(request.getAv1().getDebtorAddressLine());
		response.setDebtorMobileNumber(request.getAv1().getDebtorMobileNumber());
		response.setTransactionType(request.getAv1().getTransactionType());
		response.setChannel(request.getAv1().getChannel());
		response.setInstructionId(null);
		response.setResponseCode(null);
		response.setReasonCode(null);
		response.setCreditorName(null);
		response.setCreditorAddressLine(request.getAv1().getCreditorAddressLine());
		response.setCreditorId(null);
		response.setCreditorIdCode(null);
		response.setCreditorPhoneNumber(request.getAv1().getCreditorPhoneNumber());
		response.setCreditorMobileNumber(request.getAv1().getCreditorMobileNumber());
		response.setCreditorCCI(request.getAv1().getCreditorCCI());
		response.setCreditorCreditCard(request.getAv1().getCreditorCreditCard());
		response.setSameCustomerFlag(null);
		response.setCurrency(request.getAv1().getCurrency());
		response.setProxyValue(request.getAv1().getProxyValue());
		response.setProxyType(request.getAv1().getProxyType());
		consultaCuentaAV4ResponseDto.setAv4(response);
		logger.info("Fin - getConsultaCuentaAV1Mapper -  mappeo de propiedades AV1 ");

		return consultaCuentaAV4ResponseDto;
	}
	
	public ConsultaCuentaAV3ResponseDto getConsultaCuentaAV2Mapper(ConsultaCuentaAV2RequestDto request) {
		
		logger.info("Inicio -getConsultaCuentaAV2Mapper - mappeo de propiedades en AV2 ");

		AV3 aV3Dto = new AV3();
		aV3Dto.setDebtorParticipantCode(request.getAv2Dto().getDebtorParticipantCode());
		aV3Dto.setCreditorParticipantCode(request.getAv2Dto().getCreditorParticipantCode());
		aV3Dto.setCreationDate(request.getAv2Dto().getCreationDate());
		aV3Dto.setCreationTime(request.getAv2Dto().getCreationTime());
		aV3Dto.setTerminalId(request.getAv2Dto().getTerminalId());
		aV3Dto.setTrace(request.getAv2Dto().getTrace());
		aV3Dto.setBranchId(request.getAv2Dto().getBranchId());
		aV3Dto.setDebtorName(request.getAv2Dto().getDebtorName());
		aV3Dto.setDebtorId(request.getAv2Dto().getDebtorId());
		aV3Dto.setDebtorIdCode(request.getAv2Dto().getDebtorIdCode());
		aV3Dto.setDebtorPhoneNumber(request.getAv2Dto().getDebtorPhoneNumber());
		aV3Dto.setDebtorAddressLine(request.getAv2Dto().getDebtorAddressLine());
		aV3Dto.setDebtorMobileNumber(request.getAv2Dto().getDebtorMobileNumber());
		aV3Dto.setTransactionType(request.getAv2Dto().getTransactionType());
		aV3Dto.setChannel(request.getAv2Dto().getChannel());
		aV3Dto.setInstructionId(request.getAv2Dto().getInstructionId());
		aV3Dto.setResponseCode(null);
		aV3Dto.setCreditorAddressLine(request.getAv2Dto().getCreditorAddressLine());
		aV3Dto.setCreditorPhoneNumber(request.getAv2Dto().getCreditorPhoneNumber());
		aV3Dto.setCreditorMobileNumber(request.getAv2Dto().getCreditorMobileNumber());
		aV3Dto.setCreditorCCI(request.getAv2Dto().getCreditorCCI());
		aV3Dto.setCurrency(request.getAv2Dto().getCurrency());
		aV3Dto.setProxyValue(request.getAv2Dto().getProxyValue());
		aV3Dto.setProxyType(request.getAv2Dto().getProxyType());
		ConsultaCuentaAV3ResponseDto response =  new ConsultaCuentaAV3ResponseDto(aV3Dto);
		logger.info("Fin - getConsultaCuentaAV2Mapper -  mappeo de propiedades en AV2 ");

		return response;
	}
	

	
	

}
