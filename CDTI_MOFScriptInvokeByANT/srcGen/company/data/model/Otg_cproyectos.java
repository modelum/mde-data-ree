package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Prevision de Cobros (proyectos)
@Entity
@Table(schema="jpa")
public class Otg_cproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la anualidad (FK - OTG_APROYECTOS)
	@Id
	@Column(name="CPR_APR_CODIGO")
	private int cpr_apr_codigo;
	@OneToOne(mappedBy="otg_cproyectos")
	@PrimaryKeyJoinColumn
	private Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1;
	//Codigo del concepto economico (FK - OTG_CONCEPTOS)
	@Id
	@Column(name="CPR_CON_CODIGO")
	private String cpr_con_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_conceptos otg_conceptos_cproyectos_conceptos_fk2;
	//Importe
	@Column(name="CPR_IMP")
	private int cpr_imp;
	//Codigo de la moneda (FK - OTG_MONEDAS)
	@Column(name="CPR_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_cproyectos_monedas_fk3;
	//Importe en pesetas
	@Column(name="CPR_IMPP")
	private int cpr_impp;
	//Importe en euros
	@Column(name="CPR_IMPE")
	private int cpr_impe;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_cproyectos() {
		super();
	}
		
	public Otg_cproyectos(int cpr_apr_codigo, Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1, String cpr_con_codigo, Otg_conceptos otg_conceptos_cproyectos_conceptos_fk2, int cpr_imp, Otg_monedas otg_monedas_cproyectos_monedas_fk3, int cpr_impp, int cpr_impe, int log) {
		this.cpr_apr_codigo = cpr_apr_codigo;
		this.otg_aproyectos_cproyectos_aproyectos_fk1 = otg_aproyectos_cproyectos_aproyectos_fk1;
		this.cpr_con_codigo = cpr_con_codigo;
		this.otg_conceptos_cproyectos_conceptos_fk2 = otg_conceptos_cproyectos_conceptos_fk2;
		this.cpr_imp = cpr_imp;
		this.otg_monedas_cproyectos_monedas_fk3 = otg_monedas_cproyectos_monedas_fk3;
		this.cpr_impp = cpr_impp;
		this.cpr_impe = cpr_impe;
		this.log = log;
	}
	
	public int getCpr_apr_codigo() {
		return this.cpr_apr_codigo;
	}
			
	public void setCpr_apr_codigo(int cpr_apr_codigo) {
		this.cpr_apr_codigo = cpr_apr_codigo;
	}
	public Otg_aproyectos getOtg_aproyectos_cproyectos_aproyectos_fk1() {
		return this.otg_aproyectos_cproyectos_aproyectos_fk1;
	}
			
	public void setOtg_aproyectos_cproyectos_aproyectos_fk1(Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1) {
		this.otg_aproyectos_cproyectos_aproyectos_fk1 = otg_aproyectos_cproyectos_aproyectos_fk1;
	}


	public String getCpr_con_codigo() {
		return this.cpr_con_codigo;
	}
			
	public void setCpr_con_codigo(String cpr_con_codigo) {
		this.cpr_con_codigo = cpr_con_codigo;
	}
	public Otg_conceptos getOtg_conceptos_cproyectos_conceptos_fk2() {
		return this.otg_conceptos_cproyectos_conceptos_fk2;
	}
			
	public void setOtg_conceptos_cproyectos_conceptos_fk2(Otg_conceptos otg_conceptos_cproyectos_conceptos_fk2) {
		this.otg_conceptos_cproyectos_conceptos_fk2 = otg_conceptos_cproyectos_conceptos_fk2;
	}


	public int getCpr_imp() {
		return this.cpr_imp;
	}
			
	public void setCpr_imp(int cpr_imp) {
		this.cpr_imp = cpr_imp;
	}


	public Otg_monedas getOtg_monedas_cproyectos_monedas_fk3() {
		return this.otg_monedas_cproyectos_monedas_fk3;
	}
			
	public void setOtg_monedas_cproyectos_monedas_fk3(Otg_monedas otg_monedas_cproyectos_monedas_fk3) {
		this.otg_monedas_cproyectos_monedas_fk3 = otg_monedas_cproyectos_monedas_fk3;
	}


	public int getCpr_impp() {
		return this.cpr_impp;
	}
			
	public void setCpr_impp(int cpr_impp) {
		this.cpr_impp = cpr_impp;
	}


	public int getCpr_impe() {
		return this.cpr_impe;
	}
			
	public void setCpr_impe(int cpr_impe) {
		this.cpr_impe = cpr_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}