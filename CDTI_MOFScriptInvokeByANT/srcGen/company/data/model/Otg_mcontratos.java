package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Modelos de Contratos
@Entity
@Table(schema="jpa")
public class Otg_mcontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno
	@Id
	@Column(name="MCO_CODIGO")
	private String mco_codigo;
	@OneToMany(mappedBy="otg_mcontratos")
	private List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk1;
	@OneToMany(mappedBy="otg_mcontratos")
	private List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk6;
	//Numero
	@Column(name="MCO_NUMERO")
	private int mco_numero;
	//Nombre
	@Column(name="MCO_NOMBRE")
	private String mco_nombre;
	
	public Otg_mcontratos() {
		super();
	}
		
	public Otg_mcontratos(String mco_codigo, List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk1, List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk6, int mco_numero, String mco_nombre) {
		this.mco_codigo = mco_codigo;
		this.otg_contratoss_contratos_mcontratos_fk1 = otg_contratoss_contratos_mcontratos_fk1;
		this.otg_contratoss_contratos_mcontratos_fk6 = otg_contratoss_contratos_mcontratos_fk6;
		this.mco_numero = mco_numero;
		this.mco_nombre = mco_nombre;
	}
	
	public String getMco_codigo() {
		return this.mco_codigo;
	}
			
	public void setMco_codigo(String mco_codigo) {
		this.mco_codigo = mco_codigo;
	}
	public List<Otg_contratos> getOtg_contratoss_contratos_mcontratos_fk1() {
		return this.otg_contratoss_contratos_mcontratos_fk1;
	}
			
	public void setOtg_contratoss_contratos_mcontratos_fk1(List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk1) {
		this.otg_contratoss_contratos_mcontratos_fk1 = otg_contratoss_contratos_mcontratos_fk1;
	}

	public List<Otg_contratos> getOtg_contratoss_contratos_mcontratos_fk6() {
		return this.otg_contratoss_contratos_mcontratos_fk6;
	}
			
	public void setOtg_contratoss_contratos_mcontratos_fk6(List<Otg_contratos> otg_contratoss_contratos_mcontratos_fk6) {
		this.otg_contratoss_contratos_mcontratos_fk6 = otg_contratoss_contratos_mcontratos_fk6;
	}


	public int getMco_numero() {
		return this.mco_numero;
	}
			
	public void setMco_numero(int mco_numero) {
		this.mco_numero = mco_numero;
	}


	public String getMco_nombre() {
		return this.mco_nombre;
	}
			
	public void setMco_nombre(String mco_nombre) {
		this.mco_nombre = mco_nombre;
	}


}