package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_speuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SPE_CODIGO)
	@Id
	@Column(name="SPE_CODIGO")
	private int spe_codigo;
	//Codigo del proyecto europeo (FK - OTG_PEUROPEOS)
	@Column(name="SPE_PEU_CODIGO")
	@ManyToOne
	@JoinColumn(name="PEU_CODIGO")
	private Otg_peuropeos otg_peuropeos_speuropeos_peuropeos_fk1;
	//Descripcion
	@Column(name="SPE_DESCRIP")
	private String spe_descrip;
	//Fecha
	@Column(name="SPE_FECHA")
	private java.util.Date spe_fecha;
	
	public Otg_speuropeos() {
		super();
	}
		
	public Otg_speuropeos(int spe_codigo, Otg_peuropeos otg_peuropeos_speuropeos_peuropeos_fk1, String spe_descrip, java.util.Date spe_fecha) {
		this.spe_codigo = spe_codigo;
		this.otg_peuropeos_speuropeos_peuropeos_fk1 = otg_peuropeos_speuropeos_peuropeos_fk1;
		this.spe_descrip = spe_descrip;
		this.spe_fecha = spe_fecha;
	}
	
	public int getSpe_codigo() {
		return this.spe_codigo;
	}
			
	public void setSpe_codigo(int spe_codigo) {
		this.spe_codigo = spe_codigo;
	}

	public Otg_peuropeos getOtg_peuropeos_speuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_speuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_speuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_speuropeos_peuropeos_fk1) {
		this.otg_peuropeos_speuropeos_peuropeos_fk1 = otg_peuropeos_speuropeos_peuropeos_fk1;
	}


	public String getSpe_descrip() {
		return this.spe_descrip;
	}
			
	public void setSpe_descrip(String spe_descrip) {
		this.spe_descrip = spe_descrip;
	}


	public java.util.Date getSpe_fecha() {
		return this.spe_fecha;
	}
			
	public void setSpe_fecha(java.util.Date spe_fecha) {
		this.spe_fecha = spe_fecha;
	}


}