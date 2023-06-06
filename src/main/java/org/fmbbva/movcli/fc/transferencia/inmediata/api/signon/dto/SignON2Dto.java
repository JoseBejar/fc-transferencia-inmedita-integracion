package org.fmbbva.movcli.fc.transferencia.inmediata.api.signon.dto;

public class SignON2Dto {
	
	private String participantCode;
	private String responseDate;
	private String responseTime;
	private String status;
	private String reasonCode;
	private String trace;
	public SignON2Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignON2Dto(String participantCode, String responseDate, String responseTime, String status,
			String reasonCode, String trace) {
		super();
		this.participantCode = participantCode;
		this.responseDate = responseDate;
		this.responseTime = responseTime;
		this.status = status;
		this.reasonCode = reasonCode;
		this.trace = trace;
	}
	public String getParticipantCode() {
		return participantCode;
	}
	public void setParticipantCode(String participantCode) {
		this.participantCode = participantCode;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}

	
}
