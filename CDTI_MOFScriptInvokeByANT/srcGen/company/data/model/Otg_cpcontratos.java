package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Prevision de Cobros (contratos)
@Entity
@Table(schema="jpa")
public class Otg_cpcontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del contrato (FK - OTG_CONTRATOS)
	@Id
	@Column(name="CPC_CON_CODIGO")
	private int cpc_con_codigo;
	@OneToOne(mappedBy="otg_cpcontratos")
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_cpcontratos_contratos_fk1;
	//Codigo del concepto economico (FK - OTG_CONCEPTOS)
	@Id
	@Column(name="CPC_CP_CODIGO")
	private String cpc_cp_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_conceptos otg_conceptos_cpcontratos_conceptos_fk2;
	//Importe
	@Column(name="CPC_IMP")
	private int cpc_imp;
	//Codigo de la moneda (FK - OTG_MONEDAS)
	@Column(name="CPC_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_cpcontratos_monedas_fk3;
	//Importe en pesetas
	@Column(name="CPC_IMPP")
	private int cpc_impp;
	//Importe en euros
	@Column(name="CPC_IMPE")
	private int cpc_impe;
	
	public Otg_cpcontratos() {
		super();
	}
		
	public Otg_cpcontratos(int cpc_con_codigo, Otg_contratos otg_contratos_cpcontratos_contratos_fk1, String cpc_cp_codigo, Otg_conceptos otg_conceptos_cpcontratos_conceptos_fk2, int cpc_imp, Otg_monedas otg_monedas_cpcontratos_monedas_fk3, int cpc_impp, int cpc_impe) {
		this.cpc_con_codigo = cpc_con_codigo;
		this.otg_contratos_cpcontratos_contratos_fk1 = otg_contratos_cpcontratos_contratos_fk1;
		this.cpc_cp_codigo = cpc_cp_codigo;
		this.otg_conceptos_cpcontratos_conceptos_fk2 = otg_conceptos_cpcontratos_conceptos_fk2;
		this.cpc_imp = cpc_imp;
		this.otg_monedas_cpcontratos_monedas_fk3 = otg_monedas_cpcontratos_monedas_fk3;
		this.cpc_impp = cpc_impp;
		this.cpc_impe = cpc_impe;
	}
	
	public int getCpc_con_codigo() {
		return this.cpc_con_codigo;
	}
			
	public void setCpc_con_codigo(int cpc_con_codigo) {
		this.cpc_con_codigo = cpc_con_codigo;
	}
	public Otg_contratos getOtg_contratos_cpcontratos_contratos_fk1() {
		return this.otg_contratos_cpcontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_cpcontratos_contratos_fk1(Otg_contratos otg_contratos_cpcontratos_contratos_fk1) {
		this.otg_contratos_cpcontratos_contratos_fk1 = otg_contratos_cpcontratos_contratos_fk1;
	}


	public String getCpc_cp_codigo() {
		return this.cpc_cp_codigo;
	}
			
	public void setCpc_cp_codigo(String cpc_cp_codigo) {
		this.cpc_cp_codigo = cpc_cp_codigo;
	}
	public Otg_conceptos getOtg_conceptos_cpcontratos_conceptos_fk2() {
		return this.otg_conceptos_cpcontratos_conceptos_fk2;
	}
			
	public void setOtg_conceptos_cpcontratos_conceptos_fk2(Otg_conceptos otg_conceptos_cpcontratos_conceptos_fk2) {
		this.otg_conceptos_cpcontratos_conceptos_fk2 = otg_conceptos_cpcontratos_conceptos_fk2;
	}


	public int getCpc_imp() {
		return this.cpc_imp;
	}
			
	public void setCpc_imp(int cpc_imp) {
		this.cpc_imp = cpc_imp;
	}


	public Otg_monedas getOtg_monedas_cpcontratos_monedas_fk3() {
		return this.otg_monedas_cpcontratos_monedas_fk3;
	}
			
	public void setOtg_monedas_cpcontratos_monedas_fk3(Otg_monedas otg_monedas_cpcontratos_monedas_fk3) {
		this.otg_monedas_cpcontratos_monedas_fk3 = otg_monedas_cpcontratos_monedas_fk3;
	}


	public int getCpc_impp() {
		return this.cpc_impp;
	}
			
	public void setCpc_impp(int cpc_impp) {
		this.cpc_impp = cpc_impp;
	}


	public int getCpc_impe() {
		return this.cpc_impe;
	}
			
	public void setCpc_impe(int cpc_impe) {
		this.cpc_impe = cpc_impe;
	}


}