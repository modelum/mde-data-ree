package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Distribucion planificada de conceptos economicos en proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_diseuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del proyecto europeo (FK - OTG_PEUROPEOS)
	@Id
	@Column(name="DPE_PEU_CODIGO")
	private int dpe_peu_codigo;
	@OneToOne(mappedBy="otg_diseuropeos")
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1;
	//Codigo del concepto economico (FK - OTG_CONCEPTOS)
	@Id
	@Column(name="DPE_CON_CODIGO")
	private String dpe_con_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_conceptos otg_conceptos_diseuropeos_conceptos_fk2;
	//Importe en euros
	@Column(name="DPE_IMPE")
	private int dpe_impe;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_diseuropeos() {
		super();
	}
		
	public Otg_diseuropeos(int dpe_peu_codigo, Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1, String dpe_con_codigo, Otg_conceptos otg_conceptos_diseuropeos_conceptos_fk2, int dpe_impe, int log) {
		this.dpe_peu_codigo = dpe_peu_codigo;
		this.otg_peuropeos_diseuropeos_peuropeos_fk1 = otg_peuropeos_diseuropeos_peuropeos_fk1;
		this.dpe_con_codigo = dpe_con_codigo;
		this.otg_conceptos_diseuropeos_conceptos_fk2 = otg_conceptos_diseuropeos_conceptos_fk2;
		this.dpe_impe = dpe_impe;
		this.log = log;
	}
	
	public int getDpe_peu_codigo() {
		return this.dpe_peu_codigo;
	}
			
	public void setDpe_peu_codigo(int dpe_peu_codigo) {
		this.dpe_peu_codigo = dpe_peu_codigo;
	}
	public Otg_peuropeos getOtg_peuropeos_diseuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_diseuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_diseuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1) {
		this.otg_peuropeos_diseuropeos_peuropeos_fk1 = otg_peuropeos_diseuropeos_peuropeos_fk1;
	}


	public String getDpe_con_codigo() {
		return this.dpe_con_codigo;
	}
			
	public void setDpe_con_codigo(String dpe_con_codigo) {
		this.dpe_con_codigo = dpe_con_codigo;
	}
	public Otg_conceptos getOtg_conceptos_diseuropeos_conceptos_fk2() {
		return this.otg_conceptos_diseuropeos_conceptos_fk2;
	}
			
	public void setOtg_conceptos_diseuropeos_conceptos_fk2(Otg_conceptos otg_conceptos_diseuropeos_conceptos_fk2) {
		this.otg_conceptos_diseuropeos_conceptos_fk2 = otg_conceptos_diseuropeos_conceptos_fk2;
	}


	public int getDpe_impe() {
		return this.dpe_impe;
	}
			
	public void setDpe_impe(int dpe_impe) {
		this.dpe_impe = dpe_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}