package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

public class WsBTConsultaTINResponseDto {
	
    private BTExtReqDto extreq;
    private short tipodocbeneficiario;  
    private String documentobeneficiario;    
    private String nombrebeneficiario;   
    private String direccionbeneficiario;
    private int telefonobeneficiario;
    private String movilbeneficiario;
    private String mismotitular;
    private String idtransferencia;
    private double itf;
    private double comisionoriginante;
    private double comisionbeneficiario;
    private int mpe001Idl;
    private String codrespuesta;
    private String dscrespuesta;
    private BTErroresNegocioDto erroresnegocio;
	public WsBTConsultaTINResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WsBTConsultaTINResponseDto(BTExtReqDto extreq, short tipodocbeneficiario, String documentobeneficiario,
			String nombrebeneficiario, String direccionbeneficiario, int telefonobeneficiario, String movilbeneficiario,
			String mismotitular, String idtransferencia, double itf, double comisionoriginante,
			double comisionbeneficiario, int mpe001Idl, String codrespuesta, String dscrespuesta,
			BTErroresNegocioDto erroresnegocio) {
		super();
		this.extreq = extreq;
		this.tipodocbeneficiario = tipodocbeneficiario;
		this.documentobeneficiario = documentobeneficiario;
		this.nombrebeneficiario = nombrebeneficiario;
		this.direccionbeneficiario = direccionbeneficiario;
		this.telefonobeneficiario = telefonobeneficiario;
		this.movilbeneficiario = movilbeneficiario;
		this.mismotitular = mismotitular;
		this.idtransferencia = idtransferencia;
		this.itf = itf;
		this.comisionoriginante = comisionoriginante;
		this.comisionbeneficiario = comisionbeneficiario;
		this.mpe001Idl = mpe001Idl;
		this.codrespuesta = codrespuesta;
		this.dscrespuesta = dscrespuesta;
		this.erroresnegocio = erroresnegocio;
	}
	public BTExtReqDto getExtreq() {
		return extreq;
	}
	public void setExtreq(BTExtReqDto extreq) {
		this.extreq = extreq;
	}
	public short getTipodocbeneficiario() {
		return tipodocbeneficiario;
	}
	public void setTipodocbeneficiario(short tipodocbeneficiario) {
		this.tipodocbeneficiario = tipodocbeneficiario;
	}
	public String getDocumentobeneficiario() {
		return documentobeneficiario;
	}
	public void setDocumentobeneficiario(String documentobeneficiario) {
		this.documentobeneficiario = documentobeneficiario;
	}
	public String getNombrebeneficiario() {
		return nombrebeneficiario;
	}
	public void setNombrebeneficiario(String nombrebeneficiario) {
		this.nombrebeneficiario = nombrebeneficiario;
	}
	public String getDireccionbeneficiario() {
		return direccionbeneficiario;
	}
	public void setDireccionbeneficiario(String direccionbeneficiario) {
		this.direccionbeneficiario = direccionbeneficiario;
	}
	public int getTelefonobeneficiario() {
		return telefonobeneficiario;
	}
	public void setTelefonobeneficiario(int telefonobeneficiario) {
		this.telefonobeneficiario = telefonobeneficiario;
	}
	public String getMovilbeneficiario() {
		return movilbeneficiario;
	}
	public void setMovilbeneficiario(String movilbeneficiario) {
		this.movilbeneficiario = movilbeneficiario;
	}
	public String getMismotitular() {
		return mismotitular;
	}
	public void setMismotitular(String mismotitular) {
		this.mismotitular = mismotitular;
	}
	public String getIdtransferencia() {
		return idtransferencia;
	}
	public void setIdtransferencia(String idtransferencia) {
		this.idtransferencia = idtransferencia;
	}
	public double getItf() {
		return itf;
	}
	public void setItf(double itf) {
		this.itf = itf;
	}
	public double getComisionoriginante() {
		return comisionoriginante;
	}
	public void setComisionoriginante(double comisionoriginante) {
		this.comisionoriginante = comisionoriginante;
	}
	public double getComisionbeneficiario() {
		return comisionbeneficiario;
	}
	public void setComisionbeneficiario(double comisionbeneficiario) {
		this.comisionbeneficiario = comisionbeneficiario;
	}
	public int getMpe001Idl() {
		return mpe001Idl;
	}
	public void setMpe001Idl(int mpe001Idl) {
		this.mpe001Idl = mpe001Idl;
	}
	public String getCodrespuesta() {
		return codrespuesta;
	}
	public void setCodrespuesta(String codrespuesta) {
		this.codrespuesta = codrespuesta;
	}
	public String getDscrespuesta() {
		return dscrespuesta;
	}
	public void setDscrespuesta(String dscrespuesta) {
		this.dscrespuesta = dscrespuesta;
	}
	public BTErroresNegocioDto getErroresnegocio() {
		return erroresnegocio;
	}
	public void setErroresnegocio(BTErroresNegocioDto erroresnegocio) {
		this.erroresnegocio = erroresnegocio;
	}
    
    
	
	

}
