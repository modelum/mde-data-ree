package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Estancias en el extranjero de Beca
@Entity
@Table(schema="jpa")
public class Otg_ebecas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_EBE_CODIGO)
	@Id
	@Column(name="EBE_CODIGO")
	private int ebe_codigo;
	//Codigo de la Beca (FK - OTG_BECAS)
	@Column(name="EBE_BEC_CODIGO")
	@ManyToOne
	@JoinColumn(name="BEC_CODIGO")
	private Otg_becas otg_becas_ebecas_becas_fk1;
	//Fecha de inicio
	@Column(name="EBE_FINI")
	private java.util.Date ebe_fini;
	//Duracion en meses
	@Column(name="EBE_DURS")
	private int ebe_durs;
	//Centro de acogida
	@Column(name="EBE_CENTRO")
	private String ebe_centro;
	//Codigo del pais (FK - CODIGOS.PAISES)
	@Column(name="EBE_PAI_CODIGO")
	private String ebe_pai_codigo;
	//Importe gastos en pesetas
	@Column(name="EBE_IMPGP")
	private int ebe_impgp;
	//Importe gastos en euros
	@Column(name="EBE_IMPGE")
	private int ebe_impge;
	//Importe dietas en pesetas
	@Column(name="EBE_IMPDP")
	private int ebe_impdp;
	//Importe dietas en euros
	@Column(name="EBE_IMPDE")
	private int ebe_impde;
	//Estado del Informe (PRE: Presentado, NPR: No Presentado, PEN: Pendiente, REN: Renuncia)
	@Column(name="EBE_INFORME")
	private String ebe_informe;
	
	public Otg_ebecas() {
		super();
	}
		
	public Otg_ebecas(int ebe_codigo, Otg_becas otg_becas_ebecas_becas_fk1, java.util.Date ebe_fini, int ebe_durs, String ebe_centro, String ebe_pai_codigo, int ebe_impgp, int ebe_impge, int ebe_impdp, int ebe_impde, String ebe_informe) {
		this.ebe_codigo = ebe_codigo;
		this.otg_becas_ebecas_becas_fk1 = otg_becas_ebecas_becas_fk1;
		this.ebe_fini = ebe_fini;
		this.ebe_durs = ebe_durs;
		this.ebe_centro = ebe_centro;
		this.ebe_pai_codigo = ebe_pai_codigo;
		this.ebe_impgp = ebe_impgp;
		this.ebe_impge = ebe_impge;
		this.ebe_impdp = ebe_impdp;
		this.ebe_impde = ebe_impde;
		this.ebe_informe = ebe_informe;
	}
	
	public int getEbe_codigo() {
		return this.ebe_codigo;
	}
			
	public void setEbe_codigo(int ebe_codigo) {
		this.ebe_codigo = ebe_codigo;
	}

	public Otg_becas getOtg_becas_ebecas_becas_fk1() {
		return this.otg_becas_ebecas_becas_fk1;
	}
			
	public void setOtg_becas_ebecas_becas_fk1(Otg_becas otg_becas_ebecas_becas_fk1) {
		this.otg_becas_ebecas_becas_fk1 = otg_becas_ebecas_becas_fk1;
	}


	public java.util.Date getEbe_fini() {
		return this.ebe_fini;
	}
			
	public void setEbe_fini(java.util.Date ebe_fini) {
		this.ebe_fini = ebe_fini;
	}


	public int getEbe_durs() {
		return this.ebe_durs;
	}
			
	public void setEbe_durs(int ebe_durs) {
		this.ebe_durs = ebe_durs;
	}


	public String getEbe_centro() {
		return this.ebe_centro;
	}
			
	public void setEbe_centro(String ebe_centro) {
		this.ebe_centro = ebe_centro;
	}


	public String getEbe_pai_codigo() {
		return this.ebe_pai_codigo;
	}
			
	public void setEbe_pai_codigo(String ebe_pai_codigo) {
		this.ebe_pai_codigo = ebe_pai_codigo;
	}


	public int getEbe_impgp() {
		return this.ebe_impgp;
	}
			
	public void setEbe_impgp(int ebe_impgp) {
		this.ebe_impgp = ebe_impgp;
	}


	public int getEbe_impge() {
		return this.ebe_impge;
	}
			
	public void setEbe_impge(int ebe_impge) {
		this.ebe_impge = ebe_impge;
	}


	public int getEbe_impdp() {
		return this.ebe_impdp;
	}
			
	public void setEbe_impdp(int ebe_impdp) {
		this.ebe_impdp = ebe_impdp;
	}


	public int getEbe_impde() {
		return this.ebe_impde;
	}
			
	public void setEbe_impde(int ebe_impde) {
		this.ebe_impde = ebe_impde;
	}


	public String getEbe_informe() {
		return this.ebe_informe;
	}
			
	public void setEbe_informe(String ebe_informe) {
		this.ebe_informe = ebe_informe;
	}


}