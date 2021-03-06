package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Secciones de codigos C.N.A.E.
@Entity
@Table(schema="jpa")
public class Otg_scnaes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo seccion C.N.A.E.
	@Id
	@Column(name="SCN_CODIGO")
	private String scn_codigo;
	@OneToMany(mappedBy="otg_scnaes")
	private List<Otg_cnaes> otg_cnaess_cnaes_scnaes_fk1;
	//Nombre
	@Column(name="SCN_NOMBRE")
	private String scn_nombre;
	
	public Otg_scnaes() {
		super();
	}
		
	public Otg_scnaes(String scn_codigo, List<Otg_cnaes> otg_cnaess_cnaes_scnaes_fk1, String scn_nombre) {
		this.scn_codigo = scn_codigo;
		this.otg_cnaess_cnaes_scnaes_fk1 = otg_cnaess_cnaes_scnaes_fk1;
		this.scn_nombre = scn_nombre;
	}
	
	public String getScn_codigo() {
		return this.scn_codigo;
	}
			
	public void setScn_codigo(String scn_codigo) {
		this.scn_codigo = scn_codigo;
	}
	public List<Otg_cnaes> getOtg_cnaess_cnaes_scnaes_fk1() {
		return this.otg_cnaess_cnaes_scnaes_fk1;
	}
			
	public void setOtg_cnaess_cnaes_scnaes_fk1(List<Otg_cnaes> otg_cnaess_cnaes_scnaes_fk1) {
		this.otg_cnaess_cnaes_scnaes_fk1 = otg_cnaess_cnaes_scnaes_fk1;
	}


	public String getScn_nombre() {
		return this.scn_nombre;
	}
			
	public void setScn_nombre(String scn_nombre) {
		this.scn_nombre = scn_nombre;
	}


}