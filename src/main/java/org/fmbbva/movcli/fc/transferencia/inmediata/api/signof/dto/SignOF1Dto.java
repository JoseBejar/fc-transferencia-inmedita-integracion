package org.fmbbva.movcli.fc.transferencia.inmediata.api.signof.dto;

public class SignOF1Dto {
	private String participantCode;
	private String creationDate;
	private String creationTime;
	private String trace;
	public SignOF1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignOF1Dto(String participantCode, String creationDate, String creationTime, String trace) {
		super();
		this.participantCode = participantCode;
		this.creationDate = creationDate;
		this.creationTime = creationTime;
		this.trace = trace;
	}
	public String getParticipantCode() {
		return participantCode;
	}
	public void setParticipantCode(String participantCode) {
		this.participantCode = participantCode;
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
	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}
	
	

}
