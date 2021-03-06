package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Convocatorias Nacionales
@Entity
@Table(schema="jpa")
public class Otg_convocatorias implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_CON_CODIGO)
	@Id
	@Column(name="CON_CODIGO")
	private int con_codigo;
	@OneToMany(mappedBy="otg_convocatorias")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_convocatorias_fk1;
	@OneToMany(mappedBy="otg_convocatorias")
	private List<Otg_becas> otg_becass_becas_convocatorias_fk3;
	@OneToMany(mappedBy="otg_convocatorias")
	private List<Otg_actividades> otg_actividadess_actividades_convocatorias_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_convocatorias otg_convocatorias_tconvocator_convocatorias_fk1;
	//Codigo O.T.R.I.
	@Column(name="CON_CODIGOOTRI")
	private String con_codigootri;
	//Nombre
	@Column(name="CON_NOMBRE")
	private String con_nombre;
	//Fecha de publicacion
	@Column(name="CON_FPUB")
	private java.util.Date con_fpub;
	//Fecha de resolucion
	@Column(name="CON_FRES")
	private java.util.Date con_fres;
	//Fecha de 1  correccion
	@Column(name="CON_FCOR1")
	private java.util.Date con_fcor1;
	//Fecha de 2  correccion
	@Column(name="CON_FCOR2")
	private java.util.Date con_fcor2;
	//Lugar donde se encuentra accesible la documentacion
	@Column(name="CON_ACCESO")
	private String con_acceso;
	//Tipo de Convocatoria (R: Regional, N: Nacional)
	@Column(name="CON_TIPO")
	private String con_tipo;
	//Codigo de la Publicacion Oficial (FK - OTG_PUBLICAOFI)
	@Column(name="CON_PUB_CODIGO")
	@ManyToOne
	@JoinColumn(name="PUB_CODIGO")
	private Otg_publicaofi otg_publicaofi_convocatorias_publicaofi_fk1;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//Localizacion de informacion
	@Column(name="CON_INFOR")
	private String con_infor;
	//Obsoleto
	@Column(name="CON_DEDICA")
	private String con_dedica;
	@Column(name="CON_TIPOWEB")
	private String con_tipoweb;
	@Column(name="CON_WEB")
	private String con_web;
	
	public Otg_convocatorias() {
		super();
	}
		
	public Otg_convocatorias(int con_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudes_convocatorias_fk1, List<Otg_becas> otg_becass_becas_convocatorias_fk3, List<Otg_actividades> otg_actividadess_actividades_convocatorias_fk1, Otg_convocatorias otg_convocatorias_tconvocator_convocatorias_fk1, String con_codigootri, String con_nombre, java.util.Date con_fpub, java.util.Date con_fres, java.util.Date con_fcor1, java.util.Date con_fcor2, String con_acceso, String con_tipo, Otg_publicaofi otg_publicaofi_convocatorias_publicaofi_fk1, int log, String con_infor, String con_dedica, String con_tipoweb, String con_web) {
		this.con_codigo = con_codigo;
		this.otg_solicitudess_solicitudes_convocatorias_fk1 = otg_solicitudess_solicitudes_convocatorias_fk1;
		this.otg_becass_becas_convocatorias_fk3 = otg_becass_becas_convocatorias_fk3;
		this.otg_actividadess_actividades_convocatorias_fk1 = otg_actividadess_actividades_convocatorias_fk1;
		this.otg_convocatorias_tconvocator_convocatorias_fk1 = otg_convocatorias_tconvocator_convocatorias_fk1;
		this.con_codigootri = con_codigootri;
		this.con_nombre = con_nombre;
		this.con_fpub = con_fpub;
		this.con_fres = con_fres;
		this.con_fcor1 = con_fcor1;
		this.con_fcor2 = con_fcor2;
		this.con_acceso = con_acceso;
		this.con_tipo = con_tipo;
		this.otg_publicaofi_convocatorias_publicaofi_fk1 = otg_publicaofi_convocatorias_publicaofi_fk1;
		this.log = log;
		this.con_infor = con_infor;
		this.con_dedica = con_dedica;
		this.con_tipoweb = con_tipoweb;
		this.con_web = con_web;
	}
	
	public int getCon_codigo() {
		return this.con_codigo;
	}
			
	public void setCon_codigo(int con_codigo) {
		this.con_codigo = con_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_convocatorias_fk1() {
		return this.otg_solicitudess_solicitudes_convocatorias_fk1;
	}
			
	public void setOtg_solicitudess_solicitudes_convocatorias_fk1(List<Otg_solicitudes> otg_solicitudess_solicitudes_convocatorias_fk1) {
		this.otg_solicitudess_solicitudes_convocatorias_fk1 = otg_solicitudess_solicitudes_convocatorias_fk1;
	}

	public List<Otg_becas> getOtg_becass_becas_convocatorias_fk3() {
		return this.otg_becass_becas_convocatorias_fk3;
	}
			
	public void setOtg_becass_becas_convocatorias_fk3(List<Otg_becas> otg_becass_becas_convocatorias_fk3) {
		this.otg_becass_becas_convocatorias_fk3 = otg_becass_becas_convocatorias_fk3;
	}

	public List<Otg_actividades> getOtg_actividadess_actividades_convocatorias_fk1() {
		return this.otg_actividadess_actividades_convocatorias_fk1;
	}
			
	public void setOtg_actividadess_actividades_convocatorias_fk1(List<Otg_actividades> otg_actividadess_actividades_convocatorias_fk1) {
		this.otg_actividadess_actividades_convocatorias_fk1 = otg_actividadess_actividades_convocatorias_fk1;
	}

	public Otg_convocatorias getOtg_convocatorias_tconvocator_convocatorias_fk1() {
		return this.otg_convocatorias_tconvocator_convocatorias_fk1;
	}
			
	public void setOtg_convocatorias_tconvocator_convocatorias_fk1(Otg_convocatorias otg_convocatorias_tconvocator_convocatorias_fk1) {
		this.otg_convocatorias_tconvocator_convocatorias_fk1 = otg_convocatorias_tconvocator_convocatorias_fk1;
	}


	public String getCon_codigootri() {
		return this.con_codigootri;
	}
			
	public void setCon_codigootri(String con_codigootri) {
		this.con_codigootri = con_codigootri;
	}


	public String getCon_nombre() {
		return this.con_nombre;
	}
			
	public void setCon_nombre(String con_nombre) {
		this.con_nombre = con_nombre;
	}


	public java.util.Date getCon_fpub() {
		return this.con_fpub;
	}
			
	public void setCon_fpub(java.util.Date con_fpub) {
		this.con_fpub = con_fpub;
	}


	public java.util.Date getCon_fres() {
		return this.con_fres;
	}
			
	public void setCon_fres(java.util.Date con_fres) {
		this.con_fres = con_fres;
	}


	public java.util.Date getCon_fcor1() {
		return this.con_fcor1;
	}
			
	public void setCon_fcor1(java.util.Date con_fcor1) {
		this.con_fcor1 = con_fcor1;
	}


	public java.util.Date getCon_fcor2() {
		return this.con_fcor2;
	}
			
	public void setCon_fcor2(java.util.Date con_fcor2) {
		this.con_fcor2 = con_fcor2;
	}


	public String getCon_acceso() {
		return this.con_acceso;
	}
			
	public void setCon_acceso(String con_acceso) {
		this.con_acceso = con_acceso;
	}


	public String getCon_tipo() {
		return this.con_tipo;
	}
			
	public void setCon_tipo(String con_tipo) {
		this.con_tipo = con_tipo;
	}


	public Otg_publicaofi getOtg_publicaofi_convocatorias_publicaofi_fk1() {
		return this.otg_publicaofi_convocatorias_publicaofi_fk1;
	}
			
	public void setOtg_publicaofi_convocatorias_publicaofi_fk1(Otg_publicaofi otg_publicaofi_convocatorias_publicaofi_fk1) {
		this.otg_publicaofi_convocatorias_publicaofi_fk1 = otg_publicaofi_convocatorias_publicaofi_fk1;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getCon_infor() {
		return this.con_infor;
	}
			
	public void setCon_infor(String con_infor) {
		this.con_infor = con_infor;
	}


	public String getCon_dedica() {
		return this.con_dedica;
	}
			
	public void setCon_dedica(String con_dedica) {
		this.con_dedica = con_dedica;
	}


	public String getCon_tipoweb() {
		return this.con_tipoweb;
	}
			
	public void setCon_tipoweb(String con_tipoweb) {
		this.con_tipoweb = con_tipoweb;
	}


	public String getCon_web() {
		return this.con_web;
	}
			
	public void setCon_web(String con_web) {
		this.con_web = con_web;
	}


}