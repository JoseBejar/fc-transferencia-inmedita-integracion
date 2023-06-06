package org.fmbbva.movcli.fc.transferencia.inmediata.api.Cancelacion.dto;

public class CTC2Dto {
	
	private String creditorParticipantCode;
	private String responseDate;
	private String responseTime;
	private String currency;
	private String responseCode;
	private String reasonCode;
	private String branchId;
	private String instructionId;
	public CTC2Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTC2Dto(String creditorParticipantCode, String responseDate, String responseTime, String currency,
			String responseCode, String reasonCode, String branchId, String instructionId) {
		super();
		this.creditorParticipantCode = creditorParticipantCode;
		this.responseDate = responseDate;
		this.responseTime = responseTime;
		this.currency = currency;
		this.responseCode = responseCode;
		this.reasonCode = reasonCode;
		this.branchId = branchId;
		this.instructionId = instructionId;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}
	
	

}
