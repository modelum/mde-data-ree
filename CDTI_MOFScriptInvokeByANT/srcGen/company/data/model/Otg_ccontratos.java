package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Prevision de cobros (contratos)
@Entity
@Table(schema="jpa")
public class Otg_ccontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del contrato (FK - OTG_CONTRATO)
	@Id
	@Column(name="CCO_CON_CODIGO")
	private int cco_con_codigo;
	@OneToOne(mappedBy="otg_ccontratos")
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_ccontratos_contratos_fk1;
	//Fecha
	@Id
	@Column(name="CCO_FECHA")
	private java.util.Date cco_fecha;
	//Importe
	@Column(name="CCO_IMP")
	private int cco_imp;
	//Codigo de la moneda (FK - OTG_MONEDAS)
	@Column(name="CCO_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_ccontratos_monedas_fk1;
	//Importe (pesetas)
	@Column(name="CCO_IMPP")
	private int cco_impp;
	//Importe (euros)
	@Column(name="CCO_IMPE")
	private int cco_impe;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	
	public Otg_ccontratos() {
		super();
	}
		
	public Otg_ccontratos(int cco_con_codigo, Otg_contratos otg_contratos_ccontratos_contratos_fk1, java.util.Date cco_fecha, int cco_imp, Otg_monedas otg_monedas_ccontratos_monedas_fk1, int cco_impp, int cco_impe, int log) {
		this.cco_con_codigo = cco_con_codigo;
		this.otg_contratos_ccontratos_contratos_fk1 = otg_contratos_ccontratos_contratos_fk1;
		this.cco_fecha = cco_fecha;
		this.cco_imp = cco_imp;
		this.otg_monedas_ccontratos_monedas_fk1 = otg_monedas_ccontratos_monedas_fk1;
		this.cco_impp = cco_impp;
		this.cco_impe = cco_impe;
		this.log = log;
	}
	
	public int getCco_con_codigo() {
		return this.cco_con_codigo;
	}
			
	public void setCco_con_codigo(int cco_con_codigo) {
		this.cco_con_codigo = cco_con_codigo;
	}
	public Otg_contratos getOtg_contratos_ccontratos_contratos_fk1() {
		return this.otg_contratos_ccontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_ccontratos_contratos_fk1(Otg_contratos otg_contratos_ccontratos_contratos_fk1) {
		this.otg_contratos_ccontratos_contratos_fk1 = otg_contratos_ccontratos_contratos_fk1;
	}


	public java.util.Date getCco_fecha() {
		return this.cco_fecha;
	}
			
	public void setCco_fecha(java.util.Date cco_fecha) {
		this.cco_fecha = cco_fecha;
	}

	public int getCco_imp() {
		return this.cco_imp;
	}
			
	public void setCco_imp(int cco_imp) {
		this.cco_imp = cco_imp;
	}


	public Otg_monedas getOtg_monedas_ccontratos_monedas_fk1() {
		return this.otg_monedas_ccontratos_monedas_fk1;
	}
			
	public void setOtg_monedas_ccontratos_monedas_fk1(Otg_monedas otg_monedas_ccontratos_monedas_fk1) {
		this.otg_monedas_ccontratos_monedas_fk1 = otg_monedas_ccontratos_monedas_fk1;
	}


	public int getCco_impp() {
		return this.cco_impp;
	}
			
	public void setCco_impp(int cco_impp) {
		this.cco_impp = cco_impp;
	}


	public int getCco_impe() {
		return this.cco_impe;
	}
			
	public void setCco_impe(int cco_impe) {
		this.cco_impe = cco_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}