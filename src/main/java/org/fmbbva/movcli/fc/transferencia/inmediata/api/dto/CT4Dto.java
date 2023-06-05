package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

public class CT4Dto {
	
	private String debtorParticipantCode;
	private String creditorParticipantCode;
	private String responseDate;
	private String responseTime;
	private String terminalId;
	private String retrievalReferenteNumber;
	private String trace;
	private String amount;
	private String currency;
	private String transactionReference;
	private String responseCode;
	private String reasonCode;
	private String feeAmount;
	private String settlementDate;
	private String transactionType;
	private String debtorCCI;
	private String creditorCCI;
	private String creditorCreditCard;
	private String sameCustomerFlag;
	private String instructionId;
	private String creationDate;
	private String creationTime;
	private String channel;
	private String interbankSettlementAmount;
	
	public CT4Dto() {
		super();
	}

	public CT4Dto(String debtorParticipantCode, String creditorParticipantCode, String responseDate,
			String responseTime, String terminalId, String retrievalReferenteNumber, String trace, String amount,
			String currency, String transactionReference, String responseCode, String reasonCode, String feeAmount,
			String settlementDate, String transactionType, String debtorCCI, String creditorCCI,
			String creditorCreditCard, String sameCustomerFlag, String instructionId, String creationDate,
			String creationTime, String channel, String interbankSettlementAmount) {
		super();
		this.debtorParticipantCode = debtorParticipantCode;
		this.creditorParticipantCode = creditorParticipantCode;
		this.responseDate = responseDate;
		this.responseTime = responseTime;
		this.terminalId = terminalId;
		this.retrievalReferenteNumber = retrievalReferenteNumber;
		this.trace = trace;
		this.amount = amount;
		this.currency = currency;
		this.transactionReference = transactionReference;
		this.responseCode = responseCode;
		this.reasonCode = reasonCode;
		this.feeAmount = feeAmount;
		this.settlementDate = settlementDate;
		this.transactionType = transactionType;
		this.debtorCCI = debtorCCI;
		this.creditorCCI = creditorCCI;
		this.creditorCreditCard = creditorCreditCard;
		this.sameCustomerFlag = sameCustomerFlag;
		this.instructionId = instructionId;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.channel = channel;
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	public String getDebtorParticipantCode() {
		return debtorParticipantCode;
	}

	public void setDebtorParticipantCode(String debtorParticipantCode) {
		this.debtorParticipantCode = debtorParticipantCode;
	}

	public String getCreditorParticipantCode() {
		return creditorParticipantCode;
	}

	public void setCreditorParticipantCode(String creditorParticipantCode) {
		this.creditorParticipantCode = creditorParticipantCode;
	}

	public String getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getRetrievalReferenteNumber() {
		return retrievalReferenteNumber;
	}

	public void setRetrievalReferenteNumber(String retrievalReferenteNumber) {
		this.retrievalReferenteNumber = retrievalReferenteNumber;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDebtorCCI() {
		return debtorCCI;
	}

	public void setDebtorCCI(String debtorCCI) {
		this.debtorCCI = debtorCCI;
	}

	public String getCreditorCCI() {
		return creditorCCI;
	}

	public void setCreditorCCI(String creditorCCI) {
		this.creditorCCI = creditorCCI;
	}

	public String getCreditorCreditCard() {
		return creditorCreditCard;
	}

	public void setCreditorCreditCard(String creditorCreditCard) {
		this.creditorCreditCard = creditorCreditCard;
	}

	public String getSameCustomerFlag() {
		return sameCustomerFlag;
	}

	public void setSameCustomerFlag(String sameCustomerFlag) {
		this.sameCustomerFlag = sameCustomerFlag;
	}

	public String getInstructionId() {
		return instructionId;
	}

	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(String interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}
}
