package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Contratos de la Secretaria
@Entity
@Table(schema="jpa")
public class Otg_contratos_secretaria implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo interno
	@Id
	@Column(name="COS_CODIGO")
	private int cos_codigo;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	//Ano
	@Column(name="COS_ANO")
	private int cos_ano;
	//Titulo del contrato
	@Column(name="COS_TITULO")
	private String cos_titulo;
	//Organismo encargado de la tramitacion (FK - OTG_TRAMITADORES)
	@Column(name="COS_TRA_CODIGO")
	@ManyToOne
	@JoinColumn(name="TRA_CODIGO")
	private Otg_tramitadores otg_tramitadores_contratos_sec_tramitadores_fk1;
	//Profesor responsable (FK - OTG_PERSONAS)
	@Column(name="COS_PER_ID")
	private int cos_per_id;
	//Importe
	@Column(name="COS_IMP")
	private int cos_imp;
	//Tipo de moneda (FK - OTG_MONEDAS)
	@Column(name="COS_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_contratos_sec_monedas_fk2;
	//Importe en pesetas
	@Column(name="COS_IMPP")
	private int cos_impp;
	//Importe en euros
	@Column(name="COS_IMPE")
	private int cos_impe;
	@Column(name="LOG")
	private int log;
	
	public Otg_contratos_secretaria() {
		super();
	}
		
	public Otg_contratos_secretaria(int cos_codigo, Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1, int cos_ano, String cos_titulo, Otg_tramitadores otg_tramitadores_contratos_sec_tramitadores_fk1, int cos_per_id, int cos_imp, Otg_monedas otg_monedas_contratos_sec_monedas_fk2, int cos_impp, int cos_impe, int log) {
		this.cos_codigo = cos_codigo;
		this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1 = otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
		this.cos_ano = cos_ano;
		this.cos_titulo = cos_titulo;
		this.otg_tramitadores_contratos_sec_tramitadores_fk1 = otg_tramitadores_contratos_sec_tramitadores_fk1;
		this.cos_per_id = cos_per_id;
		this.cos_imp = cos_imp;
		this.otg_monedas_contratos_sec_monedas_fk2 = otg_monedas_contratos_sec_monedas_fk2;
		this.cos_impp = cos_impp;
		this.cos_impe = cos_impe;
		this.log = log;
	}
	
	public int getCos_codigo() {
		return this.cos_codigo;
	}
			
	public void setCos_codigo(int cos_codigo) {
		this.cos_codigo = cos_codigo;
	}
	public Otg_contratos_secretaria getOtg_contratos_secretaria_tcontr_sec_contr_sec_fk1() {
		return this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	}
			
	public void setOtg_contratos_secretaria_tcontr_sec_contr_sec_fk1(Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1) {
		this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1 = otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	}


	public int getCos_ano() {
		return this.cos_ano;
	}
			
	public void setCos_ano(int cos_ano) {
		this.cos_ano = cos_ano;
	}


	public String getCos_titulo() {
		return this.cos_titulo;
	}
			
	public void setCos_titulo(String cos_titulo) {
		this.cos_titulo = cos_titulo;
	}


	public Otg_tramitadores getOtg_tramitadores_contratos_sec_tramitadores_fk1() {
		return this.otg_tramitadores_contratos_sec_tramitadores_fk1;
	}
			
	public void setOtg_tramitadores_contratos_sec_tramitadores_fk1(Otg_tramitadores otg_tramitadores_contratos_sec_tramitadores_fk1) {
		this.otg_tramitadores_contratos_sec_tramitadores_fk1 = otg_tramitadores_contratos_sec_tramitadores_fk1;
	}


	public int getCos_per_id() {
		return this.cos_per_id;
	}
			
	public void setCos_per_id(int cos_per_id) {
		this.cos_per_id = cos_per_id;
	}


	public int getCos_imp() {
		return this.cos_imp;
	}
			
	public void setCos_imp(int cos_imp) {
		this.cos_imp = cos_imp;
	}


	public Otg_monedas getOtg_monedas_contratos_sec_monedas_fk2() {
		return this.otg_monedas_contratos_sec_monedas_fk2;
	}
			
	public void setOtg_monedas_contratos_sec_monedas_fk2(Otg_monedas otg_monedas_contratos_sec_monedas_fk2) {
		this.otg_monedas_contratos_sec_monedas_fk2 = otg_monedas_contratos_sec_monedas_fk2;
	}


	public int getCos_impp() {
		return this.cos_impp;
	}
			
	public void setCos_impp(int cos_impp) {
		this.cos_impp = cos_impp;
	}


	public int getCos_impe() {
		return this.cos_impe;
	}
			
	public void setCos_impe(int cos_impe) {
		this.cos_impe = cos_impe;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}