package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Fechas de la convocatoria (fechas de evaluacion y fechas de cierre)
@Entity
@Table(schema="jpa")
public class Otg_listas_correo_sup implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la direccion (FK - OTG_LISTAS_CORREO)
	@Id
	@Column(name="LCS_LCO_CODIGO")
	private int lcs_lco_codigo;
	@OneToOne(mappedBy="otg_listas_correo_sup")
	@PrimaryKeyJoinColumn
	private Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1;
	//Codigo de la direccion superior (FK - OTG_LISTAS_CORREO)
	@Id
	@Column(name="LCS_LCO_CODIGO_SUP")
	private int lcs_lco_codigo_sup;
	@ManyToOne
	@JoinColumn(name="LCO_CODIGO")
	private Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk2;
	
	public Otg_listas_correo_sup() {
		super();
	}
		
	public Otg_listas_correo_sup(int lcs_lco_codigo, Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1, int lcs_lco_codigo_sup, Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk2) {
		this.lcs_lco_codigo = lcs_lco_codigo;
		this.otg_listas_correo_l_correo_l_correo_sup_fk1 = otg_listas_correo_l_correo_l_correo_sup_fk1;
		this.lcs_lco_codigo_sup = lcs_lco_codigo_sup;
		this.otg_listas_correo_l_correo_l_correo_sup_fk2 = otg_listas_correo_l_correo_l_correo_sup_fk2;
	}
	
	public int getLcs_lco_codigo() {
		return this.lcs_lco_codigo;
	}
			
	public void setLcs_lco_codigo(int lcs_lco_codigo) {
		this.lcs_lco_codigo = lcs_lco_codigo;
	}
	public Otg_listas_correo getOtg_listas_correo_l_correo_l_correo_sup_fk1() {
		return this.otg_listas_correo_l_correo_l_correo_sup_fk1;
	}
			
	public void setOtg_listas_correo_l_correo_l_correo_sup_fk1(Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk1) {
		this.otg_listas_correo_l_correo_l_correo_sup_fk1 = otg_listas_correo_l_correo_l_correo_sup_fk1;
	}


	public int getLcs_lco_codigo_sup() {
		return this.lcs_lco_codigo_sup;
	}
			
	public void setLcs_lco_codigo_sup(int lcs_lco_codigo_sup) {
		this.lcs_lco_codigo_sup = lcs_lco_codigo_sup;
	}
	public Otg_listas_correo getOtg_listas_correo_l_correo_l_correo_sup_fk2() {
		return this.otg_listas_correo_l_correo_l_correo_sup_fk2;
	}
			
	public void setOtg_listas_correo_l_correo_l_correo_sup_fk2(Otg_listas_correo otg_listas_correo_l_correo_l_correo_sup_fk2) {
		this.otg_listas_correo_l_correo_l_correo_sup_fk2 = otg_listas_correo_l_correo_l_correo_sup_fk2;
	}


}