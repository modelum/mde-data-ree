package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Actividades (convocatorias)
@Entity
@Table(schema="jpa")
public class Otg_actividades implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_ACT_CODIGO)
	@Id
	@Column(name="ACT_CODIGO")
	private int act_codigo;
	@OneToMany(mappedBy="otg_actividades")
	private List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_actividades_fk1;
	@OneToMany(mappedBy="otg_actividades")
	private List<Otg_modalidades> otg_modalidadess_modalidades_actividades_fk1;
	@OneToMany(mappedBy="otg_actividades")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_actividades_fk2;
	//Codigo de la convocatoria (FK - OTG_CONVOCATORIAS)
	@Column(name="ACT_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_convocatorias otg_convocatorias_actividades_convocatorias_fk1;
	//Codigo O.T.R.I.
	@Column(name="ACT_CODIGOOTRI")
	private String act_codigootri;
	//Nombre
	@Column(name="ACT_NOMBRE")
	private String act_nombre;
	//Descripcion
	@Column(name="ACT_DESCRIPCION")
	private String act_descripcion;
	//Destinatarios
	@Column(name="ACT_DESTINATARIO")
	private String act_destinatario;
	//Objetivos
	@Column(name="ACT_OBJETIVOS")
	private String act_objetivos;
	//Condiciones
	@Column(name="ACT_CONDICIONES")
	private String act_condiciones;
	//Financiacion
	@Column(name="ACT_FINANCIACION")
	private String act_financiacion;
	//Tipo de solicitud (P : Proyecto, B : Beca, I : Infraestructura, V : Viaje)
	@Column(name="ACT_TIPOSOLI")
	private String act_tiposoli;
	//Actividad con modalidades (S, N)
	@Column(name="ACT_MODALIDADES")
	private String act_modalidades;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	//Contabilidad horaria
	@Column(name="ACT_DEDICA")
	private String act_dedica;
	
	public Otg_actividades() {
		super();
	}
		
	public Otg_actividades(int act_codigo, List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_actividades_fk1, List<Otg_modalidades> otg_modalidadess_modalidades_actividades_fk1, List<Otg_solicitudes> otg_solicitudess_solicitudes_actividades_fk2, Otg_convocatorias otg_convocatorias_actividades_convocatorias_fk1, String act_codigootri, String act_nombre, String act_descripcion, String act_destinatario, String act_objetivos, String act_condiciones, String act_financiacion, String act_tiposoli, String act_modalidades, int log, String act_dedica) {
		this.act_codigo = act_codigo;
		this.otg_pconvocatoriass_pconvocatorias_actividades_fk1 = otg_pconvocatoriass_pconvocatorias_actividades_fk1;
		this.otg_modalidadess_modalidades_actividades_fk1 = otg_modalidadess_modalidades_actividades_fk1;
		this.otg_solicitudess_solicitudes_actividades_fk2 = otg_solicitudess_solicitudes_actividades_fk2;
		this.otg_convocatorias_actividades_convocatorias_fk1 = otg_convocatorias_actividades_convocatorias_fk1;
		this.act_codigootri = act_codigootri;
		this.act_nombre = act_nombre;
		this.act_descripcion = act_descripcion;
		this.act_destinatario = act_destinatario;
		this.act_objetivos = act_objetivos;
		this.act_condiciones = act_condiciones;
		this.act_financiacion = act_financiacion;
		this.act_tiposoli = act_tiposoli;
		this.act_modalidades = act_modalidades;
		this.log = log;
		this.act_dedica = act_dedica;
	}
	
	public int getAct_codigo() {
		return this.act_codigo;
	}
			
	public void setAct_codigo(int act_codigo) {
		this.act_codigo = act_codigo;
	}
	public List<Otg_pconvocatorias> getOtg_pconvocatoriass_pconvocatorias_actividades_fk1() {
		return this.otg_pconvocatoriass_pconvocatorias_actividades_fk1;
	}
			
	public void setOtg_pconvocatoriass_pconvocatorias_actividades_fk1(List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_actividades_fk1) {
		this.otg_pconvocatoriass_pconvocatorias_actividades_fk1 = otg_pconvocatoriass_pconvocatorias_actividades_fk1;
	}

	public List<Otg_modalidades> getOtg_modalidadess_modalidades_actividades_fk1() {
		return this.otg_modalidadess_modalidades_actividades_fk1;
	}
			
	public void setOtg_modalidadess_modalidades_actividades_fk1(List<Otg_modalidades> otg_modalidadess_modalidades_actividades_fk1) {
		this.otg_modalidadess_modalidades_actividades_fk1 = otg_modalidadess_modalidades_actividades_fk1;
	}

	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_actividades_fk2() {
		return this.otg_solicitudess_solicitudes_actividades_fk2;
	}
			
	public void setOtg_solicitudess_solicitudes_actividades_fk2(List<Otg_solicitudes> otg_solicitudess_solicitudes_actividades_fk2) {
		this.otg_solicitudess_solicitudes_actividades_fk2 = otg_solicitudess_solicitudes_actividades_fk2;
	}


	public Otg_convocatorias getOtg_convocatorias_actividades_convocatorias_fk1() {
		return this.otg_convocatorias_actividades_convocatorias_fk1;
	}
			
	public void setOtg_convocatorias_actividades_convocatorias_fk1(Otg_convocatorias otg_convocatorias_actividades_convocatorias_fk1) {
		this.otg_convocatorias_actividades_convocatorias_fk1 = otg_convocatorias_actividades_convocatorias_fk1;
	}


	public String getAct_codigootri() {
		return this.act_codigootri;
	}
			
	public void setAct_codigootri(String act_codigootri) {
		this.act_codigootri = act_codigootri;
	}


	public String getAct_nombre() {
		return this.act_nombre;
	}
			
	public void setAct_nombre(String act_nombre) {
		this.act_nombre = act_nombre;
	}


	public String getAct_descripcion() {
		return this.act_descripcion;
	}
			
	public void setAct_descripcion(String act_descripcion) {
		this.act_descripcion = act_descripcion;
	}


	public String getAct_destinatario() {
		return this.act_destinatario;
	}
			
	public void setAct_destinatario(String act_destinatario) {
		this.act_destinatario = act_destinatario;
	}


	public String getAct_objetivos() {
		return this.act_objetivos;
	}
			
	public void setAct_objetivos(String act_objetivos) {
		this.act_objetivos = act_objetivos;
	}


	public String getAct_condiciones() {
		return this.act_condiciones;
	}
			
	public void setAct_condiciones(String act_condiciones) {
		this.act_condiciones = act_condiciones;
	}


	public String getAct_financiacion() {
		return this.act_financiacion;
	}
			
	public void setAct_financiacion(String act_financiacion) {
		this.act_financiacion = act_financiacion;
	}


	public String getAct_tiposoli() {
		return this.act_tiposoli;
	}
			
	public void setAct_tiposoli(String act_tiposoli) {
		this.act_tiposoli = act_tiposoli;
	}


	public String getAct_modalidades() {
		return this.act_modalidades;
	}
			
	public void setAct_modalidades(String act_modalidades) {
		this.act_modalidades = act_modalidades;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getAct_dedica() {
		return this.act_dedica;
	}
			
	public void setAct_dedica(String act_dedica) {
		this.act_dedica = act_dedica;
	}


}