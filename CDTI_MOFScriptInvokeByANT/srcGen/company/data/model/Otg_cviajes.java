package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Cobros de Viajes
@Entity
@Table(schema="jpa")
public class Otg_cviajes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la anualidad (FK - OTG_AVIAJES)
	@Id
	@Column(name="CVI_AVI_CODIGO")
	private int cvi_avi_codigo;
	@OneToOne(mappedBy="otg_cviajes")
	@PrimaryKeyJoinColumn
	private Otg_aviajes otg_aviajes_cviajes_aviajes_fk1;
	//Codigo del concepto economico (FK - OTG_CONCEPTOS)
	@Id
	@Column(name="CVI_CON_CODIGO")
	private String cvi_con_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_conceptos otg_conceptos_cviajes_conceptos_fk2;
	//Importe
	@Column(name="CVI_IMP")
	private int cvi_imp;
	//Codigo de moneda (FK OTG_MONEDAS)
	@Column(name="CVI_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_cviajes_monedas_fk3;
	//Importe en pesetas
	@Column(name="CVI_IMPP")
	private int cvi_impp;
	//Importe en euros
	@Column(name="CVI_IMPE")
	private int cvi_impe;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_cviajes() {
		super();
	}
		
	public Otg_cviajes(int cvi_avi_codigo, Otg_aviajes otg_aviajes_cviajes_aviajes_fk1, String cvi_con_codigo, Otg_conceptos otg_conceptos_cviajes_conceptos_fk2, int cvi_imp, Otg_monedas otg_monedas_cviajes_monedas_fk3, int cvi_impp, int cvi_impe, int log) {
		this.cvi_avi_codigo = cvi_avi_codigo;
		this.otg_aviajes_cviajes_aviajes_fk1 = otg_aviajes_cviajes_aviajes_fk1;
		this.cvi_con_codigo = cvi_con_codigo;
		this.otg_conceptos_cviajes_conceptos_fk2 = otg_conceptos_cviajes_conceptos_fk2;
		this.cvi_imp = cvi_imp;
		this.otg_monedas_cviajes_monedas_fk3 = otg_monedas_cviajes_monedas_fk3;
		this.cvi_impp = cvi_impp;
		this.cvi_impe = cvi_impe;
		this.log = log;
	}
	
	public int getCvi_avi_codigo() {
		return this.cvi_avi_codigo;
	}
			
	public void setCvi_avi_codigo(int cvi_avi_codigo) {
		this.cvi_avi_codigo = cvi_avi_codigo;
	}
	public Otg_aviajes getOtg_aviajes_cviajes_aviajes_fk1() {
		return this.otg_aviajes_cviajes_aviajes_fk1;
	}
			
	public void setOtg_aviajes_cviajes_aviajes_fk1(Otg_aviajes otg_aviajes_cviajes_aviajes_fk1) {
		this.otg_aviajes_cviajes_aviajes_fk1 = otg_aviajes_cviajes_aviajes_fk1;
	}


	public String getCvi_con_codigo() {
		return this.cvi_con_codigo;
	}
			
	public void setCvi_con_codigo(String cvi_con_codigo) {
		this.cvi_con_codigo = cvi_con_codigo;
	}
	public Otg_conceptos getOtg_conceptos_cviajes_conceptos_fk2() {
		return this.otg_conceptos_cviajes_conceptos_fk2;
	}
			
	public void setOtg_conceptos_cviajes_conceptos_fk2(Otg_conceptos otg_conceptos_cviajes_conceptos_fk2) {
		this.otg_conceptos_cviajes_conceptos_fk2 = otg_conceptos_cviajes_conceptos_fk2;
	}


	public int getCvi_imp() {
		return this.cvi_imp;
	}
			
	public void setCvi_imp(int cvi_imp) {
		this.cvi_imp = cvi_imp;
	}


	public Otg_monedas getOtg_monedas_cviajes_monedas_fk3() {
		return this.otg_monedas_cviajes_monedas_fk3;
	}
			
	public void setOtg_monedas_cviajes_monedas_fk3(Otg_monedas otg_monedas_cviajes_monedas_fk3) {
		this.otg_monedas_cviajes_monedas_fk3 = otg_monedas_cviajes_monedas_fk3;
	}


	public int getCvi_impp() {
		return this.cvi_impp;
	}
			
	public void setCvi_impp(int cvi_impp) {
		this.cvi_impp = cvi_impp;
	}


	public int getCvi_impe() {
		return this.cvi_impe;
	}
			
	public void setCvi_impe(int cvi_impe) {
		this.cvi_impe = cvi_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}