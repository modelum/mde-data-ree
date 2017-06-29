package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Listas de distribucion de correo
@Entity
@Table(schema="jpa")
public class Otg_listas_correo implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo secuencial (S_LCO_CODIGO)
	@Id
	@Column(name="LCO_CODIGO")
	private int lco_codigo;
	@OneToMany(mappedBy="otg_listas_correo")
	private List<Otg_listas_correo> otg_listas_correos_listas_correo_fk1;
	@OneToMany(mappedBy="otg_listas_correo")
	private List<Otg_listas_correo_sup> otg_listas_correo_sups_l_correo_l_correo_sup_fk2;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1;
	//Nombre de la lista de distribucion
	@Column(name="LCO_NOMBRE")
	private String lco_nombre;
	//Direccion mail de la lista de distribucion
	@Column(name="LCO_MAIL")
	private String lco_mail;
	//Codigo de la direccion a la que pertenece
	@Column(name="LCO_CODIGO_SUP")
	@ManyToOne
	@JoinColumn(name="LCO_CODIGO")
	private Otg_listas_correo otg_listas_correo_listas_correo_fk1;
	
	public Otg_listas_correo() {
		super();
	}
		
	public Otg_listas_correo(int lco_codigo, List<Otg_listas_correo> otg_listas_correos_listas_correo_fk1, List<Otg_listas_correo_sup> otg_listas_correo_sups_l_correo_l_correo_sup_fk2, Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1, String lco_nombre, String lco_mail, Otg_listas_correo otg_listas_correo_listas_correo_fk1) {
		this.lco_codigo = lco_codigo;
		this.otg_listas_correos_listas_correo_fk1 = otg_listas_correos_listas_correo_fk1;
		this.otg_listas_correo_sups_l_correo_l_correo_sup_fk2 = otg_listas_correo_sups_l_correo_l_correo_sup_fk2;
		this.otg_listas_correo_l_correo_l_correo_sup_fk1 = otg_listas_correo_l_correo_l_correo_sup_fk1;
		this.lco_nombre = lco_nombre;
		this.lco_mail = lco_mail;
		this.otg_listas_correo_listas_correo_fk1 = otg_listas_correo_listas_correo_fk1;
	}
	
	public int getLco_codigo() {
		return this.lco_codigo;
	}
			
	public void setLco_codigo(int lco_codigo) {
		this.lco_codigo = lco_codigo;
	}
	public List<Otg_listas_correo> getOtg_listas_correos_listas_correo_fk1() {
		return this.otg_listas_correos_listas_correo_fk1;
	}
			
	public void setOtg_listas_correos_listas_correo_fk1(List<Otg_listas_correo> otg_listas_correos_listas_correo_fk1) {
		this.otg_listas_correos_listas_correo_fk1 = otg_listas_correos_listas_correo_fk1;
	}

	public List<Otg_listas_correo_sup> getOtg_listas_correo_sups_l_correo_l_correo_sup_fk2() {
		return this.otg_listas_correo_sups_l_correo_l_correo_sup_fk2;
	}
			
	public void setOtg_listas_correo_sups_l_correo_l_correo_sup_fk2(List<Otg_listas_correo_sup> otg_listas_correo_sups_l_correo_l_correo_sup_fk2) {
		this.otg_listas_correo_sups_l_correo_l_correo_sup_fk2 = otg_listas_correo_sups_l_correo_l_correo_sup_fk2;
	}

	public Otg_listas_correo getOtg_listas_correo_l_correo_l_correo_sup_fk1() {
		return this.otg_listas_correo_l_correo_l_correo_sup_fk1;
	}
			
	public void setOtg_listas_correo_l_correo_l_correo_sup_fk1(Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1) {
		this.otg_listas_correo_l_correo_l_correo_sup_fk1 = otg_listas_correo_l_correo_l_correo_sup_fk1;
	}


	public String getLco_nombre() {
		return this.lco_nombre;
	}
			
	public void setLco_nombre(String lco_nombre) {
		this.lco_nombre = lco_nombre;
	}


	public String getLco_mail() {
		return this.lco_mail;
	}
			
	public void setLco_mail(String lco_mail) {
		this.lco_mail = lco_mail;
	}


	public Otg_listas_correo getOtg_listas_correo_listas_correo_fk1() {
		return this.otg_listas_correo_listas_correo_fk1;
	}
			
	public void setOtg_listas_correo_listas_correo_fk1(Otg_listas_correo otg_listas_correo_listas_correo_fk1) {
		this.otg_listas_correo_listas_correo_fk1 = otg_listas_correo_listas_correo_fk1;
	}


}