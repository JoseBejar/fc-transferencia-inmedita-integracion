package org.fmbbva.movcli.fc.transferencia.inmediata.api.solicitud.dto;

public class PSR1Dto {
	
	
	private String creditorParticipantCode;
	private String creationDate;
	private String creationTime;
	private String currency;
	private String instructionId;
	private String originalCreationDate;
	private String originalCreationTime;
	public PSR1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PSR1Dto(String creditorParticipantCode, String creationDate, String creationTime, String currency,
			String instructionId, String originalCreationDate, String originalCreationTime) {
		super();
		this.creditorParticipantCode = creditorParticipantCode;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.currency = currency;
		this.instructionId = instructionId;
		this.originalCreationDate = originalCreationDate;
		this.originalCreationTime = originalCreationTime;
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
	public String getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}
	public String getOriginalCreationDate() {
		return originalCreationDate;
	}
	public void setOriginalCreationDate(String originalCreationDate) {
		this.originalCreationDate = originalCreationDate;
	}
	public String getOriginalCreationTime() {
		return originalCreationTime;
	}
	public void setOriginalCreationTime(String originalCreationTime) {
		this.originalCreationTime = originalCreationTime;
	}
	
	

}
