package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Anualidades de Proyectos (nacionales)
@Entity
@Table(schema="jpa")
public class Otg_aproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_APR_CODIGO)
	@Id
	@Column(name="APR_CODIGO")
	private int apr_codigo;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1;
	//Codigo del proyecto (FK - OTG_PROYECTOS)
	@Column(name="APR_PRO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_aproyectos_proyectos_fk1;
	//Ano
	@Column(name="APR_ANO")
	private int apr_ano;
	//Fecha de inicio
	@Column(name="APR_FINI")
	private java.util.Date apr_fini;
	//Fecha de fin
	@Column(name="APR_FFIN")
	private java.util.Date apr_ffin;
	//Fecha de resolucion
	@Column(name="APR_FRES")
	private java.util.Date apr_fres;
	//Fecha de publicacion
	@Column(name="APR_FPUB")
	private java.util.Date apr_fpub;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	
	public Otg_aproyectos() {
		super();
	}
		
	public Otg_aproyectos(int apr_codigo, Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1, Otg_proyectos otg_proyectos_aproyectos_proyectos_fk1, int apr_ano, java.util.Date apr_fini, java.util.Date apr_ffin, java.util.Date apr_fres, java.util.Date apr_fpub, int log) {
		this.apr_codigo = apr_codigo;
		this.otg_aproyectos_cproyectos_aproyectos_fk1 = otg_aproyectos_cproyectos_aproyectos_fk1;
		this.otg_proyectos_aproyectos_proyectos_fk1 = otg_proyectos_aproyectos_proyectos_fk1;
		this.apr_ano = apr_ano;
		this.apr_fini = apr_fini;
		this.apr_ffin = apr_ffin;
		this.apr_fres = apr_fres;
		this.apr_fpub = apr_fpub;
		this.log = log;
	}
	
	public int getApr_codigo() {
		return this.apr_codigo;
	}
			
	public void setApr_codigo(int apr_codigo) {
		this.apr_codigo = apr_codigo;
	}
	public Otg_aproyectos getOtg_aproyectos_cproyectos_aproyectos_fk1() {
		return this.otg_aproyectos_cproyectos_aproyectos_fk1;
	}
			
	public void setOtg_aproyectos_cproyectos_aproyectos_fk1(Otg_aproyectos otg_aproyectos_cproyectos_aproyectos_fk1) {
		this.otg_aproyectos_cproyectos_aproyectos_fk1 = otg_aproyectos_cproyectos_aproyectos_fk1;
	}


	public Otg_proyectos getOtg_proyectos_aproyectos_proyectos_fk1() {
		return this.otg_proyectos_aproyectos_proyectos_fk1;
	}
			
	public void setOtg_proyectos_aproyectos_proyectos_fk1(Otg_proyectos otg_proyectos_aproyectos_proyectos_fk1) {
		this.otg_proyectos_aproyectos_proyectos_fk1 = otg_proyectos_aproyectos_proyectos_fk1;
	}


	public int getApr_ano() {
		return this.apr_ano;
	}
			
	public void setApr_ano(int apr_ano) {
		this.apr_ano = apr_ano;
	}


	public java.util.Date getApr_fini() {
		return this.apr_fini;
	}
			
	public void setApr_fini(java.util.Date apr_fini) {
		this.apr_fini = apr_fini;
	}


	public java.util.Date getApr_ffin() {
		return this.apr_ffin;
	}
			
	public void setApr_ffin(java.util.Date apr_ffin) {
		this.apr_ffin = apr_ffin;
	}


	public java.util.Date getApr_fres() {
		return this.apr_fres;
	}
			
	public void setApr_fres(java.util.Date apr_fres) {
		this.apr_fres = apr_fres;
	}


	public java.util.Date getApr_fpub() {
		return this.apr_fpub;
	}
			
	public void setApr_fpub(java.util.Date apr_fpub) {
		this.apr_fpub = apr_fpub;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}