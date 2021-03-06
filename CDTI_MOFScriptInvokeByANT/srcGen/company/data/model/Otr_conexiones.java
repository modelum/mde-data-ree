package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Conexiones realizadas
@Entity
@Table(schema="jpa")
public class Otr_conexiones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COX_CODIGO")
	private int cox_codigo;
	@Column(name="COX_USUARIO_BD")
	private String cox_usuario_bd;
	@Column(name="COX_USUARIO_BDR")
	private String cox_usuario_bdr;
	@Column(name="COX_USUARIO_SO")
	private String cox_usuario_so;
	@Column(name="COX_USUARIO_APLI")
	private String cox_usuario_apli;
	@Column(name="COX_MAQUINA")
	private String cox_maquina;
	@Column(name="COX_FECHAINI")
	private java.util.Date cox_fechaini;
	@Column(name="COX_FECHAFIN")
	private java.util.Date cox_fechafin;
	
	public Otr_conexiones() {
		super();
	}
		
	public Otr_conexiones(int cox_codigo, String cox_usuario_bd, String cox_usuario_bdr, String cox_usuario_so, String cox_usuario_apli, String cox_maquina, java.util.Date cox_fechaini, java.util.Date cox_fechafin) {
		this.cox_codigo = cox_codigo;
		this.cox_usuario_bd = cox_usuario_bd;
		this.cox_usuario_bdr = cox_usuario_bdr;
		this.cox_usuario_so = cox_usuario_so;
		this.cox_usuario_apli = cox_usuario_apli;
		this.cox_maquina = cox_maquina;
		this.cox_fechaini = cox_fechaini;
		this.cox_fechafin = cox_fechafin;
	}
	
	public int getCox_codigo() {
		return this.cox_codigo;
	}
			
	public void setCox_codigo(int cox_codigo) {
		this.cox_codigo = cox_codigo;
	}

	public String getCox_usuario_bd() {
		return this.cox_usuario_bd;
	}
			
	public void setCox_usuario_bd(String cox_usuario_bd) {
		this.cox_usuario_bd = cox_usuario_bd;
	}


	public String getCox_usuario_bdr() {
		return this.cox_usuario_bdr;
	}
			
	public void setCox_usuario_bdr(String cox_usuario_bdr) {
		this.cox_usuario_bdr = cox_usuario_bdr;
	}


	public String getCox_usuario_so() {
		return this.cox_usuario_so;
	}
			
	public void setCox_usuario_so(String cox_usuario_so) {
		this.cox_usuario_so = cox_usuario_so;
	}


	public String getCox_usuario_apli() {
		return this.cox_usuario_apli;
	}
			
	public void setCox_usuario_apli(String cox_usuario_apli) {
		this.cox_usuario_apli = cox_usuario_apli;
	}


	public String getCox_maquina() {
		return this.cox_maquina;
	}
			
	public void setCox_maquina(String cox_maquina) {
		this.cox_maquina = cox_maquina;
	}


	public java.util.Date getCox_fechaini() {
		return this.cox_fechaini;
	}
			
	public void setCox_fechaini(java.util.Date cox_fechaini) {
		this.cox_fechaini = cox_fechaini;
	}


	public java.util.Date getCox_fechafin() {
		return this.cox_fechafin;
	}
			
	public void setCox_fechafin(java.util.Date cox_fechafin) {
		this.cox_fechafin = cox_fechafin;
	}


}