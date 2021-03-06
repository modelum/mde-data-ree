package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Prestaciones de Servicio
@Entity
@Table(schema="jpa")
public class Otg_pservicios implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_PSE_CODIGO)
	@Id
	@Column(name="PSE_CODIGO")
	private int pse_codigo;
	//Centro de Gasto
	@Column(name="PSE_CG")
	private String pse_cg;
	//Identificador del responsable (FK - OTG_PERSONAS)
	@Column(name="PSE_PER_ID")
	private int pse_per_id;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Column(name="PSE_TER_CODIGO")
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_pservicios_terceros_fk1;
	//Titulo
	@Column(name="PSE_TITULO")
	private String pse_titulo;
	//Codigo de la Unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Column(name="PSE_UOR_CODIGO")
	private int pse_uor_codigo;
	//Importe en pesetas
	@Column(name="PSE_IMPP")
	private int pse_impp;
	//Importe en euros
	@Column(name="PSE_IMPE")
	private int pse_impe;
	//Fecha firma
	@Column(name="PSE_FFIRMA")
	private java.util.Date pse_ffirma;
	//Visto Bueno
	@Column(name="PSE_VB")
	private String pse_vb;
	//Fecha de Gestora
	@Column(name="PSE_FGESTORA")
	private java.util.Date pse_fgestora;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//Codigo del Area productiva (FK - OTG_APRODUCTIVAS)
	@Column(name="PSE_APR_CODIGO")
	@ManyToOne
	@JoinColumn(name="APR_CODIGO")
	private Otg_aproductivas otg_aproductivas_pservicios_aproductivas_fk3;
	
	public Otg_pservicios() {
		super();
	}
		
	public Otg_pservicios(int pse_codigo, String pse_cg, int pse_per_id, Otg_terceros otg_terceros_pservicios_terceros_fk1, String pse_titulo, int pse_uor_codigo, int pse_impp, int pse_impe, java.util.Date pse_ffirma, String pse_vb, java.util.Date pse_fgestora, int log, Otg_aproductivas otg_aproductivas_pservicios_aproductivas_fk3) {
		this.pse_codigo = pse_codigo;
		this.pse_cg = pse_cg;
		this.pse_per_id = pse_per_id;
		this.otg_terceros_pservicios_terceros_fk1 = otg_terceros_pservicios_terceros_fk1;
		this.pse_titulo = pse_titulo;
		this.pse_uor_codigo = pse_uor_codigo;
		this.pse_impp = pse_impp;
		this.pse_impe = pse_impe;
		this.pse_ffirma = pse_ffirma;
		this.pse_vb = pse_vb;
		this.pse_fgestora = pse_fgestora;
		this.log = log;
		this.otg_aproductivas_pservicios_aproductivas_fk3 = otg_aproductivas_pservicios_aproductivas_fk3;
	}
	
	public int getPse_codigo() {
		return this.pse_codigo;
	}
			
	public void setPse_codigo(int pse_codigo) {
		this.pse_codigo = pse_codigo;
	}

	public String getPse_cg() {
		return this.pse_cg;
	}
			
	public void setPse_cg(String pse_cg) {
		this.pse_cg = pse_cg;
	}


	public int getPse_per_id() {
		return this.pse_per_id;
	}
			
	public void setPse_per_id(int pse_per_id) {
		this.pse_per_id = pse_per_id;
	}


	public Otg_terceros getOtg_terceros_pservicios_terceros_fk1() {
		return this.otg_terceros_pservicios_terceros_fk1;
	}
			
	public void setOtg_terceros_pservicios_terceros_fk1(Otg_terceros otg_terceros_pservicios_terceros_fk1) {
		this.otg_terceros_pservicios_terceros_fk1 = otg_terceros_pservicios_terceros_fk1;
	}


	public String getPse_titulo() {
		return this.pse_titulo;
	}
			
	public void setPse_titulo(String pse_titulo) {
		this.pse_titulo = pse_titulo;
	}


	public int getPse_uor_codigo() {
		return this.pse_uor_codigo;
	}
			
	public void setPse_uor_codigo(int pse_uor_codigo) {
		this.pse_uor_codigo = pse_uor_codigo;
	}


	public int getPse_impp() {
		return this.pse_impp;
	}
			
	public void setPse_impp(int pse_impp) {
		this.pse_impp = pse_impp;
	}


	public int getPse_impe() {
		return this.pse_impe;
	}
			
	public void setPse_impe(int pse_impe) {
		this.pse_impe = pse_impe;
	}


	public java.util.Date getPse_ffirma() {
		return this.pse_ffirma;
	}
			
	public void setPse_ffirma(java.util.Date pse_ffirma) {
		this.pse_ffirma = pse_ffirma;
	}


	public String getPse_vb() {
		return this.pse_vb;
	}
			
	public void setPse_vb(String pse_vb) {
		this.pse_vb = pse_vb;
	}


	public java.util.Date getPse_fgestora() {
		return this.pse_fgestora;
	}
			
	public void setPse_fgestora(java.util.Date pse_fgestora) {
		this.pse_fgestora = pse_fgestora;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public Otg_aproductivas getOtg_aproductivas_pservicios_aproductivas_fk3() {
		return this.otg_aproductivas_pservicios_aproductivas_fk3;
	}
			
	public void setOtg_aproductivas_pservicios_aproductivas_fk3(Otg_aproductivas otg_aproductivas_pservicios_aproductivas_fk3) {
		this.otg_aproductivas_pservicios_aproductivas_fk3 = otg_aproductivas_pservicios_aproductivas_fk3;
	}


}