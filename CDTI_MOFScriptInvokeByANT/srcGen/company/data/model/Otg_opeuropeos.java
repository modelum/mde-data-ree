package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_opeuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OEU_CODIGO)
	@Id
	@Column(name="OPE_CODIGO")
	private int ope_codigo;
	//Codigo del proyecto europeo (FK - OTG_PEUROPEOS)
	@Column(name="OPE_PEU_CODIGO")
	@ManyToOne
	@JoinColumn(name="PEU_CODIGO")
	private Otg_peuropeos otg_peuropeos_opeuropeos_peuropeos_fk1;
	//Observacion
	@Column(name="OPE_OBSERVACION")
	private String ope_observacion;
	
	public Otg_opeuropeos() {
		super();
	}
		
	public Otg_opeuropeos(int ope_codigo, Otg_peuropeos otg_peuropeos_opeuropeos_peuropeos_fk1, String ope_observacion) {
		this.ope_codigo = ope_codigo;
		this.otg_peuropeos_opeuropeos_peuropeos_fk1 = otg_peuropeos_opeuropeos_peuropeos_fk1;
		this.ope_observacion = ope_observacion;
	}
	
	public int getOpe_codigo() {
		return this.ope_codigo;
	}
			
	public void setOpe_codigo(int ope_codigo) {
		this.ope_codigo = ope_codigo;
	}

	public Otg_peuropeos getOtg_peuropeos_opeuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_opeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_opeuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_opeuropeos_peuropeos_fk1) {
		this.otg_peuropeos_opeuropeos_peuropeos_fk1 = otg_peuropeos_opeuropeos_peuropeos_fk1;
	}


	public String getOpe_observacion() {
		return this.ope_observacion;
	}
			
	public void setOpe_observacion(String ope_observacion) {
		this.ope_observacion = ope_observacion;
	}


}