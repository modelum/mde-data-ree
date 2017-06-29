package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Codigos C.N.A.E.
@Entity
@Table(schema="jpa")
public class Otg_cnaes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo C.N.A.E.
	@Id
	@Column(name="CNA_CODIGO")
	private String cna_codigo;
	@OneToMany(mappedBy="otg_cnaes")
	private List<Otg_terceros> otg_terceross_terceros_cnaes_fk1;
	//Descripcion
	@Column(name="CNA_NOMBRE")
	private String cna_nombre;
	//Seccion C.N.A.E. (FK - OTG_SCNAES)
	@Column(name="CNA_SCN_CODIGO")
	@ManyToOne
	@JoinColumn(name="SCN_CODIGO")
	private Otg_scnaes otg_scnaes_cnaes_scnaes_fk1;
	
	public Otg_cnaes() {
		super();
	}
		
	public Otg_cnaes(String cna_codigo, List<Otg_terceros> otg_terceross_terceros_cnaes_fk1, String cna_nombre, Otg_scnaes otg_scnaes_cnaes_scnaes_fk1) {
		this.cna_codigo = cna_codigo;
		this.otg_terceross_terceros_cnaes_fk1 = otg_terceross_terceros_cnaes_fk1;
		this.cna_nombre = cna_nombre;
		this.otg_scnaes_cnaes_scnaes_fk1 = otg_scnaes_cnaes_scnaes_fk1;
	}
	
	public String getCna_codigo() {
		return this.cna_codigo;
	}
			
	public void setCna_codigo(String cna_codigo) {
		this.cna_codigo = cna_codigo;
	}
	public List<Otg_terceros> getOtg_terceross_terceros_cnaes_fk1() {
		return this.otg_terceross_terceros_cnaes_fk1;
	}
			
	public void setOtg_terceross_terceros_cnaes_fk1(List<Otg_terceros> otg_terceross_terceros_cnaes_fk1) {
		this.otg_terceross_terceros_cnaes_fk1 = otg_terceross_terceros_cnaes_fk1;
	}


	public String getCna_nombre() {
		return this.cna_nombre;
	}
			
	public void setCna_nombre(String cna_nombre) {
		this.cna_nombre = cna_nombre;
	}


	public Otg_scnaes getOtg_scnaes_cnaes_scnaes_fk1() {
		return this.otg_scnaes_cnaes_scnaes_fk1;
	}
			
	public void setOtg_scnaes_cnaes_scnaes_fk1(Otg_scnaes otg_scnaes_cnaes_scnaes_fk1) {
		this.otg_scnaes_cnaes_scnaes_fk1 = otg_scnaes_cnaes_scnaes_fk1;
	}


}