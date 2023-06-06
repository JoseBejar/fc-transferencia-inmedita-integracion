package org.fmbbva.movcli.fc.transferencia.inmediata.api.echotest.dto;

public class ET1 {
	
	
	private String participantCode;
	private String creationDate;
	private String creationTime;
	private String trace;
	public ET1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ET1(String participantCode, String creationDate, String creationTime, String trace) {
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
