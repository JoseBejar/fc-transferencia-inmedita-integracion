package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

public class CT1Dto {
	
	private String debtorParticipantCode;
	private String creditorParticipantCode;
	private String creationDate;
	private String creationTime;
	private String messageTypeId;
	private String terminalId;
	private String retrievalReferenteNumber;
	private String trace;
	private String channel;
	private String amount;
	private String currency;
	private String transactionReference;
	private String referenceTransactionId;
	private String transactionType;
	private String feeAmount;
	private String feeCode;
	private String applicationCriteria;
	private String debtorTypeOfPerson;
	private String debtorName;
	private String debtorAddressLine;
	private String debtorIdCode;
	private String debtorId;
	private String debtorPhoneNumber;
	private String debtorMobileNumber;
	private String debtorCCI;
	private String creditorName;
	private String creditorAddressLine;
	private String creditorPhoneNumber;
	private String creditorMobileNumber;
	private String creditorCCI;
	private String creditorCreditCard;
	private String sameCustomerFlag;
	private String purposeCode;
	private String unstructuredInformation;
	private String grossSalaryAmount;
	private String salaryPaymentIndicator;
	private String monthOfThePayment;
	private String yearOfThePayment;
	
	public CT1Dto() {
		super();
	}

	public CT1Dto(String debtorParticipantCode, String creditorParticipantCode, String creationDate,
			String creationTime, String messageTypeId, String terminalId, String retrievalReferenteNumber, String trace,
			String channel, String amount, String currency, String transactionReference, String referenceTransactionId,
			String transactionType, String feeAmount, String feeCode, String applicationCriteria,
			String debtorTypeOfPerson, String debtorName, String debtorAddressLine, String debtorIdCode,
			String debtorId, String debtorPhoneNumber, String debtorMobileNumber, String debtorCCI, String creditorName,
			String creditorAddressLine, String creditorPhoneNumber, String creditorMobileNumber, String creditorCCI,
			String creditorCreditCard, String sameCustomerFlag, String purposeCode, String unstructuredInformation,
			String grossSalaryAmount, String salaryPaymentIndicator, String monthOfThePayment,
			String yearOfThePayment) {
		super();
		this.debtorParticipantCode = debtorParticipantCode;
		this.creditorParticipantCode = creditorParticipantCode;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.messageTypeId = messageTypeId;
		this.terminalId = terminalId;
		this.retrievalReferenteNumber = retrievalReferenteNumber;
		this.trace = trace;
		this.channel = channel;
		this.amount = amount;
		this.currency = currency;
		this.transactionReference = transactionReference;
		this.referenceTransactionId = referenceTransactionId;
		this.transactionType = transactionType;
		this.feeAmount = feeAmount;
		this.feeCode = feeCode;
		this.applicationCriteria = applicationCriteria;
		this.debtorTypeOfPerson = debtorTypeOfPerson;
		this.debtorName = debtorName;
		this.debtorAddressLine = debtorAddressLine;
		this.debtorIdCode = debtorIdCode;
		this.debtorId = debtorId;
		this.debtorPhoneNumber = debtorPhoneNumber;
		this.debtorMobileNumber = debtorMobileNumber;
		this.debtorCCI = debtorCCI;
		this.creditorName = creditorName;
		this.creditorAddressLine = creditorAddressLine;
		this.creditorPhoneNumber = creditorPhoneNumber;
		this.creditorMobileNumber = creditorMobileNumber;
		this.creditorCCI = creditorCCI;
		this.creditorCreditCard = creditorCreditCard;
		this.sameCustomerFlag = sameCustomerFlag;
		this.purposeCode = purposeCode;
		this.unstructuredInformation = unstructuredInformation;
		this.grossSalaryAmount = grossSalaryAmount;
		this.salaryPaymentIndicator = salaryPaymentIndicator;
		this.monthOfThePayment = monthOfThePayment;
		this.yearOfThePayment = yearOfThePayment;
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

	public String getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(String messageTypeId) {
		this.messageTypeId = messageTypeId;
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

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getReferenceTransactionId() {
		return referenceTransactionId;
	}

	public void setReferenceTransactionId(String referenceTransactionId) {
		this.referenceTransactionId = referenceTransactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeCode() {
		return feeCode;
	}

	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	public String getApplicationCriteria() {
		return applicationCriteria;
	}

	public void setApplicationCriteria(String applicationCriteria) {
		this.applicationCriteria = applicationCriteria;
	}

	public String getDebtorTypeOfPerson() {
		return debtorTypeOfPerson;
	}

	public void setDebtorTypeOfPerson(String debtorTypeOfPerson) {
		this.debtorTypeOfPerson = debtorTypeOfPerson;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public String getDebtorAddressLine() {
		return debtorAddressLine;
	}

	public void setDebtorAddressLine(String debtorAddressLine) {
		this.debtorAddressLine = debtorAddressLine;
	}

	public String getDebtorIdCode() {
		return debtorIdCode;
	}

	public void setDebtorIdCode(String debtorIdCode) {
		this.debtorIdCode = debtorIdCode;
	}

	public String getDebtorId() {
		return debtorId;
	}

	public void setDebtorId(String debtorId) {
		this.debtorId = debtorId;
	}

	public String getDebtorPhoneNumber() {
		return debtorPhoneNumber;
	}

	public void setDebtorPhoneNumber(String debtorPhoneNumber) {
		this.debtorPhoneNumber = debtorPhoneNumber;
	}

	public String getDebtorMobileNumber() {
		return debtorMobileNumber;
	}

	public void setDebtorMobileNumber(String debtorMobileNumber) {
		this.debtorMobileNumber = debtorMobileNumber;
	}

	public String getDebtorCCI() {
		return debtorCCI;
	}

	public void setDebtorCCI(String debtorCCI) {
		this.debtorCCI = debtorCCI;
	}

	public String getCreditorName() {
		return creditorName;
	}

	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}

	public String getCreditorAddressLine() {
		return creditorAddressLine;
	}

	public void setCreditorAddressLine(String creditorAddressLine) {
		this.creditorAddressLine = creditorAddressLine;
	}

	public String getCreditorPhoneNumber() {
		return creditorPhoneNumber;
	}

	public void setCreditorPhoneNumber(String creditorPhoneNumber) {
		this.creditorPhoneNumber = creditorPhoneNumber;
	}

	public String getCreditorMobileNumber() {
		return creditorMobileNumber;
	}

	public void setCreditorMobileNumber(String creditorMobileNumber) {
		this.creditorMobileNumber = creditorMobileNumber;
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

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getUnstructuredInformation() {
		return unstructuredInformation;
	}

	public void setUnstructuredInformation(String unstructuredInformation) {
		this.unstructuredInformation = unstructuredInformation;
	}

	public String getGrossSalaryAmount() {
		return grossSalaryAmount;
	}

	public void setGrossSalaryAmount(String grossSalaryAmount) {
		this.grossSalaryAmount = grossSalaryAmount;
	}

	public String getSalaryPaymentIndicator() {
		return salaryPaymentIndicator;
	}

	public void setSalaryPaymentIndicator(String salaryPaymentIndicator) {
		this.salaryPaymentIndicator = salaryPaymentIndicator;
	}

	public String getMonthOfThePayment() {
		return monthOfThePayment;
	}

	public void setMonthOfThePayment(String monthOfThePayment) {
		this.monthOfThePayment = monthOfThePayment;
	}

	public String getYearOfThePayment() {
		return yearOfThePayment;
	}

	public void setYearOfThePayment(String yearOfThePayment) {
		this.yearOfThePayment = yearOfThePayment;
	}

	
}
