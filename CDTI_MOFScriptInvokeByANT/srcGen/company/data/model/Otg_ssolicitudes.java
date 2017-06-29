package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de solicitudes (nacionales)
@Entity
@Table(schema="jpa")
public class Otg_ssolicitudes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SSO_CODIGO)
	@Id
	@Column(name="SSO_CODIGO")
	private int sso_codigo;
	//Codigo de la Solicitud (FK - OTG_SOLICITUDES)
	@Column(name="SSO_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_ssolicitudes_solicitudes_fk1;
	//Descripcion
	@Column(name="SSO_DESCRIPCION")
	private String sso_descripcion;
	//Fecha
	@Column(name="SSO_FECHA")
	private java.util.Date sso_fecha;
	
	public Otg_ssolicitudes() {
		super();
	}
		
	public Otg_ssolicitudes(int sso_codigo, Otg_solicitudes otg_solicitudes_ssolicitudes_solicitudes_fk1, String sso_descripcion, java.util.Date sso_fecha) {
		this.sso_codigo = sso_codigo;
		this.otg_solicitudes_ssolicitudes_solicitudes_fk1 = otg_solicitudes_ssolicitudes_solicitudes_fk1;
		this.sso_descripcion = sso_descripcion;
		this.sso_fecha = sso_fecha;
	}
	
	public int getSso_codigo() {
		return this.sso_codigo;
	}
			
	public void setSso_codigo(int sso_codigo) {
		this.sso_codigo = sso_codigo;
	}

	public Otg_solicitudes getOtg_solicitudes_ssolicitudes_solicitudes_fk1() {
		return this.otg_solicitudes_ssolicitudes_solicitudes_fk1;
	}
			
	public void setOtg_solicitudes_ssolicitudes_solicitudes_fk1(Otg_solicitudes otg_solicitudes_ssolicitudes_solicitudes_fk1) {
		this.otg_solicitudes_ssolicitudes_solicitudes_fk1 = otg_solicitudes_ssolicitudes_solicitudes_fk1;
	}


	public String getSso_descripcion() {
		return this.sso_descripcion;
	}
			
	public void setSso_descripcion(String sso_descripcion) {
		this.sso_descripcion = sso_descripcion;
	}


	public java.util.Date getSso_fecha() {
		return this.sso_fecha;
	}
			
	public void setSso_fecha(java.util.Date sso_fecha) {
		this.sso_fecha = sso_fecha;
	}


}