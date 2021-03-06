package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otw_contactos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CON_NUMERO")
	private int con_numero;
	@Column(name="CON_NOMBRE")
	private String con_nombre;
	@Column(name="CON_CARGO")
	private String con_cargo;
	@Column(name="CON_TLF")
	private String con_tlf;
	@Column(name="CON_MAIL")
	private String con_mail;
	
	public Otw_contactos() {
		super();
	}
		
	public Otw_contactos(int con_numero, String con_nombre, String con_cargo, String con_tlf, String con_mail) {
		this.con_numero = con_numero;
		this.con_nombre = con_nombre;
		this.con_cargo = con_cargo;
		this.con_tlf = con_tlf;
		this.con_mail = con_mail;
	}
	
	public int getCon_numero() {
		return this.con_numero;
	}
			
	public void setCon_numero(int con_numero) {
		this.con_numero = con_numero;
	}

	public String getCon_nombre() {
		return this.con_nombre;
	}
			
	public void setCon_nombre(String con_nombre) {
		this.con_nombre = con_nombre;
	}


	public String getCon_cargo() {
		return this.con_cargo;
	}
			
	public void setCon_cargo(String con_cargo) {
		this.con_cargo = con_cargo;
	}


	public String getCon_tlf() {
		return this.con_tlf;
	}
			
	public void setCon_tlf(String con_tlf) {
		this.con_tlf = con_tlf;
	}


	public String getCon_mail() {
		return this.con_mail;
	}
			
	public void setCon_mail(String con_mail) {
		this.con_mail = con_mail;
	}


}