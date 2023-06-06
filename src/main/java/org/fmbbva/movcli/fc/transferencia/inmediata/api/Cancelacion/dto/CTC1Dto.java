package org.fmbbva.movcli.fc.transferencia.inmediata.api.Cancelacion.dto;

public class CTC1Dto {
	
	
	private String creditorParticipantCode;
	private String creationDate;
	private String creationTime;
	private String currency;
	private String transactionReference;
	private String referenceInstructionId;
	private String instructionId;
	private String branchId;
	public CTC1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTC1Dto(String creditorParticipantCode, String creationDate, String creationTime, String currency,
			String transactionReference, String referenceInstructionId, String instructionId, String branchId) {
		super();
		this.creditorParticipantCode = creditorParticipantCode;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.currency = currency;
		this.transactionReference = transactionReference;
		this.referenceInstructionId = referenceInstructionId;
		this.instructionId = instructionId;
		this.branchId = branchId;
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
	public String getReferenceInstructionId() {
		return referenceInstructionId;
	}
	public void setReferenceInstructionId(String referenceInstructionId) {
		this.referenceInstructionId = referenceInstructionId;
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
	

	
}
