package org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto;

public class AV2Dto {

	   private String debtorParticipantCode;
	   private String  creditorParticipantCode;
	   private String creationDate;
	   private String creationTime;
	   private String terminalId;
	   private String retrievalReferenteNumber;
	   private String trace;
	   private String debtorName;
	   private String debtorId;
	   private String debtorIdCode;
	   private String debtorPhoneNumber;
	   private String debtorAddressLine;
	   private String debtorMobileNumber;
	   private String transactionType;
	   private String channel;
	   private String creditorAddressLine;
	   private String creditorPhoneNumber;
	   private String creditorMobileNumber;
	   private String creditorCCI;
	   private String creditorCreditCard;
	   private String debtorTypeOfPerson;
	   private String currency;
	   private String proxyValue;
	   private String proxyType;
	   private String instructionId;
	   private String branchId;
	
	   public AV2Dto() {
		super();
	   }

	   public AV2Dto(String debtorParticipantCode, String creditorParticipantCode, String creationDate,
			String creationTime, String terminalId, String retrievalReferenteNumber, String trace, String debtorName,
			String debtorId, String debtorIdCode, String debtorPhoneNumber, String debtorAddressLine,
			String debtorMobileNumber, String transactionType, String channel, String creditorAddressLine,
			String creditorPhoneNumber, String creditorMobileNumber, String creditorCCI, String creditorCreditCard,
			String debtorTypeOfPerson, String currency, String proxyValue, String proxyType, String instructionId,
			String branchId) {
		super();
		this.debtorParticipantCode = debtorParticipantCode;
		this.creditorParticipantCode = creditorParticipantCode;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.terminalId = terminalId;
		this.retrievalReferenteNumber = retrievalReferenteNumber;
		this.trace = trace;
		this.debtorName = debtorName;
		this.debtorId = debtorId;
		this.debtorIdCode = debtorIdCode;
		this.debtorPhoneNumber = debtorPhoneNumber;
		this.debtorAddressLine = debtorAddressLine;
		this.debtorMobileNumber = debtorMobileNumber;
		this.transactionType = transactionType;
		this.channel = channel;
		this.creditorAddressLine = creditorAddressLine;
		this.creditorPhoneNumber = creditorPhoneNumber;
		this.creditorMobileNumber = creditorMobileNumber;
		this.creditorCCI = creditorCCI;
		this.creditorCreditCard = creditorCreditCard;
		this.debtorTypeOfPerson = debtorTypeOfPerson;
		this.currency = currency;
		this.proxyValue = proxyValue;
		this.proxyType = proxyType;
		this.instructionId = instructionId;
		this.branchId = branchId;
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

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public String getDebtorId() {
		return debtorId;
	}

	public void setDebtorId(String debtorId) {
		this.debtorId = debtorId;
	}

	public String getDebtorIdCode() {
		return debtorIdCode;
	}

	public void setDebtorIdCode(String debtorIdCode) {
		this.debtorIdCode = debtorIdCode;
	}

	public String getDebtorPhoneNumber() {
		return debtorPhoneNumber;
	}

	public void setDebtorPhoneNumber(String debtorPhoneNumber) {
		this.debtorPhoneNumber = debtorPhoneNumber;
	}

	public String getDebtorAddressLine() {
		return debtorAddressLine;
	}

	public void setDebtorAddressLine(String debtorAddressLine) {
		this.debtorAddressLine = debtorAddressLine;
	}

	public String getDebtorMobileNumber() {
		return debtorMobileNumber;
	}

	public void setDebtorMobileNumber(String debtorMobileNumber) {
		this.debtorMobileNumber = debtorMobileNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getDebtorTypeOfPerson() {
		return debtorTypeOfPerson;
	}

	public void setDebtorTypeOfPerson(String debtorTypeOfPerson) {
		this.debtorTypeOfPerson = debtorTypeOfPerson;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProxyValue() {
		return proxyValue;
	}

	public void setProxyValue(String proxyValue) {
		this.proxyValue = proxyValue;
	}

	public String getProxyType() {
		return proxyType;
	}

	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
	}

	public String getInstructionId() {
		return instructionId;
	}

	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	} 
	
	   @Override
	public String toString() {
		return "AV2Dto [debtorParticipantCode=" + debtorParticipantCode + ", creditorParticipantCode="
				+ creditorParticipantCode + ", creationDate=" + creationDate + ", creationTime=" + creationTime
				+ ", terminalId=" + terminalId + ", retrievalReferenteNumber=" + retrievalReferenteNumber + ", trace="
				+ trace + ", debtorName=" + debtorName + ", debtorId=" + debtorId + ", debtorIdCode=" + debtorIdCode
				+ ", debtorPhoneNumber=" + debtorPhoneNumber + ", debtorAddressLine=" + debtorAddressLine
				+ ", debtorMobileNumber=" + debtorMobileNumber + ", transactionType=" + transactionType + ", channel="
				+ channel + ", creditorAddressLine=" + creditorAddressLine + ", creditorPhoneNumber="
				+ creditorPhoneNumber + ", creditorMobileNumber=" + creditorMobileNumber + ", creditorCCI="
				+ creditorCCI + ", creditorCreditCard=" + creditorCreditCard + ", debtorTypeOfPerson="
				+ debtorTypeOfPerson + ", currency=" + currency + ", proxyValue=" + proxyValue + ", proxyType="
				+ proxyType + ", instructionId=" + instructionId + ", branchId=" + branchId + "]";
	}
	   
	   public String buildJSON() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("{\"AV2\":{");
		    sb.append("\"debtorParticipantCode\": \"" + getDebtorParticipantCode() + "\",");
		    sb.append("\"creditorParticipantCode\": \"" + getCreditorParticipantCode()+ "\",");
		    sb.append("\"creationDate\": \"" + getCreationDate() + "\",");
			sb.append("\"creationTime\": \"" + getCreationTime() + "\",");
		    sb.append("\"terminalId\": \"" + getTerminalId() + "\",");
		    sb.append("\"retrievalReferenteNumber\": \"" + getRetrievalReferenteNumber() + "\",");
			sb.append("\"trace\": \"" + getTrace() + "\",");
		    sb.append("\"debtorName\": \"" + getDebtorName() + "\",");
			sb.append("\"debtorId\": \"" + getDebtorId() + "\",");
		    sb.append("\"debtorIdCode\": \"" + getDebtorIdCode() + "\",");
			sb.append("\"debtorPhoneNumber\": \"" + getDebtorPhoneNumber() + "\",");
		    sb.append("\"debtorAddressLine\": \"" + getRetrievalReferenteNumber() + "\",");
			sb.append("\"debtorMobileNumber\": \"" + getDebtorAddressLine() + "\",");
		    sb.append("\"transactionType\": \"" + getTransactionType() + "\",");
			sb.append("\"channel\": \"" + getChannel() + "\",");
		    sb.append("\"creditorAddressLine\": \"" + getCreditorAddressLine() + "\",");
			sb.append("\"creditorPhoneNumber\": \"" + getCreditorPhoneNumber() + "\",");
		    sb.append("\"creditorMobileNumber\": \"" + getCreditorMobileNumber() + "\",");
			sb.append("\"creditorCCI\": \"" + getCreditorCCI() + "\",");
		    sb.append("\"creditorCreditCard\": \"" + getCreditorCreditCard() + "\",");
			sb.append("\"debtorTypeOfPerson\": \"" + getDebtorTypeOfPerson() + "\",");
		    sb.append("\"currency\": \"" + getCurrency() + "\",");
			sb.append("\"proxyValue\": \"" + getProxyValue() + "\",");
		    sb.append("\"proxyType\": \"" + getProxyType() + "\",");
		    sb.append("\"instructionId\": \"" + getInstructionId() + "\",");
		    sb.append("\"branchId\": \"" + getBranchId() + "\"");
		    sb.append("}");
		    sb.append("}");
		    return sb.toString();
		}

	   
}
