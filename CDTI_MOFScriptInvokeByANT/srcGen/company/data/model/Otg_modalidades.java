package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Modalidades (Actividades de convocatorias)
@Entity
@Table(schema="jpa")
public class Otg_modalidades implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_MOD_CODIGO)
	@Id
	@Column(name="MOD_CODIGO")
	private int mod_codigo;
	@OneToMany(mappedBy="otg_modalidades")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_modalidades_fk3;
	@OneToMany(mappedBy="otg_modalidades")
	private List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_modalidades_fk1;
	//Codigo de la Acitvidad (FK - OTG_ACTIVIDADES)
	@Column(name="MOD_ACT_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACT_CODIGO")
	private Otg_actividades otg_actividades_modalidades_actividades_fk1;
	//Codigo O.T.R.I.
	@Column(name="MOD_CODIGOOTRI")
	private String mod_codigootri;
	//Nombre
	@Column(name="MOD_NOMBRE")
	private String mod_nombre;
	//Descripcion
	@Column(name="MOD_DESCRIPCION")
	private String mod_descripcion;
	//Destinatarios
	@Column(name="MOD_DESTINATARIO")
	private String mod_destinatario;
	//Objetivos
	@Column(name="MOD_OBJETIVOS")
	private String mod_objetivos;
	//Financiacion
	@Column(name="MOD_FINANCIACION")
	private String mod_financiacion;
	//Condiciones
	@Column(name="MOD_CONDICIONES")
	private String mod_condiciones;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//Contabilidad horaria
	@Column(name="MOD_DEDICA")
	private String mod_dedica;
	
	public Otg_modalidades() {
		super();
	}
		
	public Otg_modalidades(int mod_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudes_modalidades_fk3, List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_modalidades_fk1, Otg_actividades otg_actividades_modalidades_actividades_fk1, String mod_codigootri, String mod_nombre, String mod_descripcion, String mod_destinatario, String mod_objetivos, String mod_financiacion, String mod_condiciones, int log, String mod_dedica) {
		this.mod_codigo = mod_codigo;
		this.otg_solicitudess_solicitudes_modalidades_fk3 = otg_solicitudess_solicitudes_modalidades_fk3;
		this.otg_pconvocatoriass_pconvocatorias_modalidades_fk1 = otg_pconvocatoriass_pconvocatorias_modalidades_fk1;
		this.otg_actividades_modalidades_actividades_fk1 = otg_actividades_modalidades_actividades_fk1;
		this.mod_codigootri = mod_codigootri;
		this.mod_nombre = mod_nombre;
		this.mod_descripcion = mod_descripcion;
		this.mod_destinatario = mod_destinatario;
		this.mod_objetivos = mod_objetivos;
		this.mod_financiacion = mod_financiacion;
		this.mod_condiciones = mod_condiciones;
		this.log = log;
		this.mod_dedica = mod_dedica;
	}
	
	public int getMod_codigo() {
		return this.mod_codigo;
	}
			
	public void setMod_codigo(int mod_codigo) {
		this.mod_codigo = mod_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_modalidades_fk3() {
		return this.otg_solicitudess_solicitudes_modalidades_fk3;
	}
			
	public void setOtg_solicitudess_solicitudes_modalidades_fk3(List<Otg_solicitudes> otg_solicitudess_solicitudes_modalidades_fk3) {
		this.otg_solicitudess_solicitudes_modalidades_fk3 = otg_solicitudess_solicitudes_modalidades_fk3;
	}

	public List<Otg_pconvocatorias> getOtg_pconvocatoriass_pconvocatorias_modalidades_fk1() {
		return this.otg_pconvocatoriass_pconvocatorias_modalidades_fk1;
	}
			
	public void setOtg_pconvocatoriass_pconvocatorias_modalidades_fk1(List<Otg_pconvocatorias> otg_pconvocatoriass_pconvocatorias_modalidades_fk1) {
		this.otg_pconvocatoriass_pconvocatorias_modalidades_fk1 = otg_pconvocatoriass_pconvocatorias_modalidades_fk1;
	}


	public Otg_actividades getOtg_actividades_modalidades_actividades_fk1() {
		return this.otg_actividades_modalidades_actividades_fk1;
	}
			
	public void setOtg_actividades_modalidades_actividades_fk1(Otg_actividades otg_actividades_modalidades_actividades_fk1) {
		this.otg_actividades_modalidades_actividades_fk1 = otg_actividades_modalidades_actividades_fk1;
	}


	public String getMod_codigootri() {
		return this.mod_codigootri;
	}
			
	public void setMod_codigootri(String mod_codigootri) {
		this.mod_codigootri = mod_codigootri;
	}


	public String getMod_nombre() {
		return this.mod_nombre;
	}
			
	public void setMod_nombre(String mod_nombre) {
		this.mod_nombre = mod_nombre;
	}


	public String getMod_descripcion() {
		return this.mod_descripcion;
	}
			
	public void setMod_descripcion(String mod_descripcion) {
		this.mod_descripcion = mod_descripcion;
	}


	public String getMod_destinatario() {
		return this.mod_destinatario;
	}
			
	public void setMod_destinatario(String mod_destinatario) {
		this.mod_destinatario = mod_destinatario;
	}


	public String getMod_objetivos() {
		return this.mod_objetivos;
	}
			
	public void setMod_objetivos(String mod_objetivos) {
		this.mod_objetivos = mod_objetivos;
	}


	public String getMod_financiacion() {
		return this.mod_financiacion;
	}
			
	public void setMod_financiacion(String mod_financiacion) {
		this.mod_financiacion = mod_financiacion;
	}


	public String getMod_condiciones() {
		return this.mod_condiciones;
	}
			
	public void setMod_condiciones(String mod_condiciones) {
		this.mod_condiciones = mod_condiciones;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getMod_dedica() {
		return this.mod_dedica;
	}
			
	public void setMod_dedica(String mod_dedica) {
		this.mod_dedica = mod_dedica;
	}


}