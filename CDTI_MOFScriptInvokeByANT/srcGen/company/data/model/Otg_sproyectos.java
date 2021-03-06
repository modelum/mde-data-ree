package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de proyectos nacionales
@Entity
@Table(schema="jpa")
public class Otg_sproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SPR_CODIGO)
	@Id
	@Column(name="SPR_CODIGO")
	private int spr_codigo;
	//Codigo del proyecto (FK - OTG_PROYECTOS)
	@Column(name="SPR_PRO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_sproyectos_proyectos_fk1;
	//Descripcion
	@Column(name="SPR_DESCRIP")
	private String spr_descrip;
	//Fecha
	@Column(name="SPR_FECHA")
	private java.util.Date spr_fecha;
	//Notificacion via e-mail( S, N )
	@Column(name="SPR_NOTIF")
	private String spr_notif;
	//Direccion de correo para la notificacion via e-mail
	@Column(name="SPR_MAIL")
	private String spr_mail;
	
	public Otg_sproyectos() {
		super();
	}
		
	public Otg_sproyectos(int spr_codigo, Otg_proyectos otg_proyectos_sproyectos_proyectos_fk1, String spr_descrip, java.util.Date spr_fecha, String spr_notif, String spr_mail) {
		this.spr_codigo = spr_codigo;
		this.otg_proyectos_sproyectos_proyectos_fk1 = otg_proyectos_sproyectos_proyectos_fk1;
		this.spr_descrip = spr_descrip;
		this.spr_fecha = spr_fecha;
		this.spr_notif = spr_notif;
		this.spr_mail = spr_mail;
	}
	
	public int getSpr_codigo() {
		return this.spr_codigo;
	}
			
	public void setSpr_codigo(int spr_codigo) {
		this.spr_codigo = spr_codigo;
	}

	public Otg_proyectos getOtg_proyectos_sproyectos_proyectos_fk1() {
		return this.otg_proyectos_sproyectos_proyectos_fk1;
	}
			
	public void setOtg_proyectos_sproyectos_proyectos_fk1(Otg_proyectos otg_proyectos_sproyectos_proyectos_fk1) {
		this.otg_proyectos_sproyectos_proyectos_fk1 = otg_proyectos_sproyectos_proyectos_fk1;
	}


	public String getSpr_descrip() {
		return this.spr_descrip;
	}
			
	public void setSpr_descrip(String spr_descrip) {
		this.spr_descrip = spr_descrip;
	}


	public java.util.Date getSpr_fecha() {
		return this.spr_fecha;
	}
			
	public void setSpr_fecha(java.util.Date spr_fecha) {
		this.spr_fecha = spr_fecha;
	}


	public String getSpr_notif() {
		return this.spr_notif;
	}
			
	public void setSpr_notif(String spr_notif) {
		this.spr_notif = spr_notif;
	}


	public String getSpr_mail() {
		return this.spr_mail;
	}
			
	public void setSpr_mail(String spr_mail) {
		this.spr_mail = spr_mail;
	}


}