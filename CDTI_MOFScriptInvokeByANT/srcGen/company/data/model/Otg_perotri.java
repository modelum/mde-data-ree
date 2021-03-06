package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas O.T.R.I.
@Entity
@Table(schema="jpa")
public class Otg_perotri implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (Secuencia -S_PER_ID)
	@Id
	@Column(name="PER_ID")
	private int per_id;
	@OneToMany(mappedBy="otg_perotri")
	private List<Otg_operotri> otg_operotris_operotri_perotri_fk1;
	//D.N.I.
	@Column(name="PER_DNI")
	private String per_dni;
	//Letra del D.N.I.
	@Column(name="PER_LDNI")
	private String per_ldni;
	//Nombre
	@Column(name="PER_NOMBRE")
	private String per_nombre;
	//Primer Apellido
	@Column(name="PER_APELLIDO1")
	private String per_apellido1;
	//Segundo Apellido
	@Column(name="PER_APELLIDO2")
	private String per_apellido2;
	//Sexo (H: Hombre, M: Mujer)
	@Column(name="PER_SEXO")
	private String per_sexo;
	//Domicilio
	@Column(name="PER_DOMICILIO")
	private String per_domicilio;
	//Codigo Postal
	@Column(name="PER_CP")
	private String per_cp;
	//Codigo de la poblacion (FK - PUEBLOS)
	@Column(name="PER_PUE_CODIGO")
	private int per_pue_codigo;
	//Poblacion (extranjeros)
	@Column(name="PER_POBLACIONEXT")
	private String per_poblacionext;
	//Codigo de la provincia (FK - PROVINCIAS)
	@Column(name="PER_PRO_CODIGO")
	private String per_pro_codigo;
	//Provincia (extranjeros)
	@Column(name="PER_PROVINCIAEXT")
	private String per_provinciaext;
	//Codigo del pais (FK - PAISES)
	@Column(name="PER_PAI_CODIGO")
	private String per_pai_codigo;
	//Telefonos
	@Column(name="PER_TELEFONO")
	private String per_telefono;
	//Fax
	@Column(name="PER_FAX")
	private String per_fax;
	//Mail
	@Column(name="PER_MAIL")
	private String per_mail;
	//Web personal
	@Column(name="PER_WEB")
	private String per_web;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//Insercion desde memoria (M)
	@Column(name="PER_INSERT")
	private String per_insert;
	
	public Otg_perotri() {
		super();
	}
		
	public Otg_perotri(int per_id, List<Otg_operotri> otg_operotris_operotri_perotri_fk1, String per_dni, String per_ldni, String per_nombre, String per_apellido1, String per_apellido2, String per_sexo, String per_domicilio, String per_cp, int per_pue_codigo, String per_poblacionext, String per_pro_codigo, String per_provinciaext, String per_pai_codigo, String per_telefono, String per_fax, String per_mail, String per_web, int log, String per_insert) {
		this.per_id = per_id;
		this.otg_operotris_operotri_perotri_fk1 = otg_operotris_operotri_perotri_fk1;
		this.per_dni = per_dni;
		this.per_ldni = per_ldni;
		this.per_nombre = per_nombre;
		this.per_apellido1 = per_apellido1;
		this.per_apellido2 = per_apellido2;
		this.per_sexo = per_sexo;
		this.per_domicilio = per_domicilio;
		this.per_cp = per_cp;
		this.per_pue_codigo = per_pue_codigo;
		this.per_poblacionext = per_poblacionext;
		this.per_pro_codigo = per_pro_codigo;
		this.per_provinciaext = per_provinciaext;
		this.per_pai_codigo = per_pai_codigo;
		this.per_telefono = per_telefono;
		this.per_fax = per_fax;
		this.per_mail = per_mail;
		this.per_web = per_web;
		this.log = log;
		this.per_insert = per_insert;
	}
	
	public int getPer_id() {
		return this.per_id;
	}
			
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	public List<Otg_operotri> getOtg_operotris_operotri_perotri_fk1() {
		return this.otg_operotris_operotri_perotri_fk1;
	}
			
	public void setOtg_operotris_operotri_perotri_fk1(List<Otg_operotri> otg_operotris_operotri_perotri_fk1) {
		this.otg_operotris_operotri_perotri_fk1 = otg_operotris_operotri_perotri_fk1;
	}


	public String getPer_dni() {
		return this.per_dni;
	}
			
	public void setPer_dni(String per_dni) {
		this.per_dni = per_dni;
	}


	public String getPer_ldni() {
		return this.per_ldni;
	}
			
	public void setPer_ldni(String per_ldni) {
		this.per_ldni = per_ldni;
	}


	public String getPer_nombre() {
		return this.per_nombre;
	}
			
	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}


	public String getPer_apellido1() {
		return this.per_apellido1;
	}
			
	public void setPer_apellido1(String per_apellido1) {
		this.per_apellido1 = per_apellido1;
	}


	public String getPer_apellido2() {
		return this.per_apellido2;
	}
			
	public void setPer_apellido2(String per_apellido2) {
		this.per_apellido2 = per_apellido2;
	}


	public String getPer_sexo() {
		return this.per_sexo;
	}
			
	public void setPer_sexo(String per_sexo) {
		this.per_sexo = per_sexo;
	}


	public String getPer_domicilio() {
		return this.per_domicilio;
	}
			
	public void setPer_domicilio(String per_domicilio) {
		this.per_domicilio = per_domicilio;
	}


	public String getPer_cp() {
		return this.per_cp;
	}
			
	public void setPer_cp(String per_cp) {
		this.per_cp = per_cp;
	}


	public int getPer_pue_codigo() {
		return this.per_pue_codigo;
	}
			
	public void setPer_pue_codigo(int per_pue_codigo) {
		this.per_pue_codigo = per_pue_codigo;
	}


	public String getPer_poblacionext() {
		return this.per_poblacionext;
	}
			
	public void setPer_poblacionext(String per_poblacionext) {
		this.per_poblacionext = per_poblacionext;
	}


	public String getPer_pro_codigo() {
		return this.per_pro_codigo;
	}
			
	public void setPer_pro_codigo(String per_pro_codigo) {
		this.per_pro_codigo = per_pro_codigo;
	}


	public String getPer_provinciaext() {
		return this.per_provinciaext;
	}
			
	public void setPer_provinciaext(String per_provinciaext) {
		this.per_provinciaext = per_provinciaext;
	}


	public String getPer_pai_codigo() {
		return this.per_pai_codigo;
	}
			
	public void setPer_pai_codigo(String per_pai_codigo) {
		this.per_pai_codigo = per_pai_codigo;
	}


	public String getPer_telefono() {
		return this.per_telefono;
	}
			
	public void setPer_telefono(String per_telefono) {
		this.per_telefono = per_telefono;
	}


	public String getPer_fax() {
		return this.per_fax;
	}
			
	public void setPer_fax(String per_fax) {
		this.per_fax = per_fax;
	}


	public String getPer_mail() {
		return this.per_mail;
	}
			
	public void setPer_mail(String per_mail) {
		this.per_mail = per_mail;
	}


	public String getPer_web() {
		return this.per_web;
	}
			
	public void setPer_web(String per_web) {
		this.per_web = per_web;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getPer_insert() {
		return this.per_insert;
	}
			
	public void setPer_insert(String per_insert) {
		this.per_insert = per_insert;
	}


}