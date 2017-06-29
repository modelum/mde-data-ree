package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Presupuesto de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_ppeuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del proyecto europeo (FK - OTG_PEUROPEOS)
	@Id
	@Column(name="PPE_PEU_CODIGO")
	private int ppe_peu_codigo;
	@OneToOne(mappedBy="otg_ppeuropeos")
	@PrimaryKeyJoinColumn
	private Otg_jpeuropeos otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2;
	@OneToOne(mappedBy="otg_ppeuropeos")
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1;
	//N  de justificacion
	@Id
	@Column(name="PPE_JUSTIFICA")
	private int ppe_justifica;
	//Codigo del concepto economico (FK - OTG_CONCEPTOS)
	@Id
	@Column(name="PPE_CON_CODIGO")
	private String ppe_con_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_conceptos otg_conceptos_ppeuropeos_conceptos_fk3;
	//Fecha
	@Column(name="PPE_FECHA")
	private java.util.Date ppe_fecha;
	//Importe en euros
	@Column(name="PPE_IMPE")
	private int ppe_impe;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_ppeuropeos() {
		super();
	}
		
	public Otg_ppeuropeos(int ppe_peu_codigo, Otg_jpeuropeos otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2, Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1, int ppe_justifica, String ppe_con_codigo, Otg_conceptos otg_conceptos_ppeuropeos_conceptos_fk3, java.util.Date ppe_fecha, int ppe_impe, int log) {
		this.ppe_peu_codigo = ppe_peu_codigo;
		this.otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2 = otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2;
		this.otg_peuropeos_ppeuropeos_peuropeos_fk1 = otg_peuropeos_ppeuropeos_peuropeos_fk1;
		this.ppe_justifica = ppe_justifica;
		this.ppe_con_codigo = ppe_con_codigo;
		this.otg_conceptos_ppeuropeos_conceptos_fk3 = otg_conceptos_ppeuropeos_conceptos_fk3;
		this.ppe_fecha = ppe_fecha;
		this.ppe_impe = ppe_impe;
		this.log = log;
	}
	
	public int getPpe_peu_codigo() {
		return this.ppe_peu_codigo;
	}
			
	public void setPpe_peu_codigo(int ppe_peu_codigo) {
		this.ppe_peu_codigo = ppe_peu_codigo;
	}
	public Otg_jpeuropeos getOtg_jpeuropeos_ppeuropeos_jpeuropeos_fk2() {
		return this.otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2;
	}
			
	public void setOtg_jpeuropeos_ppeuropeos_jpeuropeos_fk2(Otg_jpeuropeos otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2) {
		this.otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2 = otg_jpeuropeos_ppeuropeos_jpeuropeos_fk2;
	}

	public Otg_peuropeos getOtg_peuropeos_ppeuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_ppeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_ppeuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1) {
		this.otg_peuropeos_ppeuropeos_peuropeos_fk1 = otg_peuropeos_ppeuropeos_peuropeos_fk1;
	}


	public int getPpe_justifica() {
		return this.ppe_justifica;
	}
			
	public void setPpe_justifica(int ppe_justifica) {
		this.ppe_justifica = ppe_justifica;
	}

	public String getPpe_con_codigo() {
		return this.ppe_con_codigo;
	}
			
	public void setPpe_con_codigo(String ppe_con_codigo) {
		this.ppe_con_codigo = ppe_con_codigo;
	}
	public Otg_conceptos getOtg_conceptos_ppeuropeos_conceptos_fk3() {
		return this.otg_conceptos_ppeuropeos_conceptos_fk3;
	}
			
	public void setOtg_conceptos_ppeuropeos_conceptos_fk3(Otg_conceptos otg_conceptos_ppeuropeos_conceptos_fk3) {
		this.otg_conceptos_ppeuropeos_conceptos_fk3 = otg_conceptos_ppeuropeos_conceptos_fk3;
	}


	public java.util.Date getPpe_fecha() {
		return this.ppe_fecha;
	}
			
	public void setPpe_fecha(java.util.Date ppe_fecha) {
		this.ppe_fecha = ppe_fecha;
	}


	public int getPpe_impe() {
		return this.ppe_impe;
	}
			
	public void setPpe_impe(int ppe_impe) {
		this.ppe_impe = ppe_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}