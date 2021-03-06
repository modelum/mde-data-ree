package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Contratos
@Entity
@Table(schema="jpa")
public class Otg_contratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_CTR_CODIGO)
	@Id
	@Column(name="CON_CODIGO")
	private int con_codigo;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_proyectos> otg_proyectoss_proyectos_contratos_fk5;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_contratos_fk7;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_percontratos> otg_percontratoss_percontratos_contratos_fk1;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_becas> otg_becass_becas_contratos_fk5;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_ocontratos> otg_ocontratoss_ocontratos_contratos_fk1;
	@OneToMany(mappedBy="otg_contratos")
	private List<Otg_contratos> otg_contratoss_contratos_contratos_fk5;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_cpcontratos_contratos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_tcontratos_contratos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_ccontratos_contratos_fk1;
	//Codigo de la modalidad (FK - OTG_MCONTRATOS)
	@Column(name="CON_MCO_CODIGO")
	@ManyToOne
	@JoinColumn(name="MCO_CODIGO")
	private Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk1;
	//Alias del terceros
	@Column(name="CON_TERALIAS")
	private String con_teralias;
	//Ano
	@Column(name="CON_ANO")
	private int con_ano;
	//Referencia O.T.R.I.
	@Column(name="CON_REFER")
	private String con_refer;
	//Centro de gasto
	@Column(name="CON_CG")
	private String con_cg;
	//Codigo de la unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Column(name="CON_UOR_CODIGO")
	private int con_uor_codigo;
	//Titulo
	@Column(name="CON_TITULO")
	private String con_titulo;
	//Visto bueno del director del departamento (S, N)
	@Column(name="CON_VB")
	private String con_vb;
	//Listo para Comision Gestora (S, N)
	@Column(name="CON_LGESTORA")
	private String con_lgestora;
	//Aprobado por Comision Gestora (S, N)
	@Column(name="CON_AGESTORA")
	private String con_agestora;
	//Fecha de aprobacion por C. Gestora
	@Column(name="CON_FAGESTORA")
	private java.util.Date con_fagestora;
	//Conformidad del profesor (S, N)
	@Column(name="CON_CONPROFE")
	private String con_conprofe;
	//Conformidad de la empresa (S, N)
	@Column(name="CON_CONEMPRESA")
	private String con_conempresa;
	//Conformidad de la asesoria (S, N)
	@Column(name="CON_CONASESOR")
	private String con_conasesor;
	//Firmado por el profesor (S, N)
	@Column(name="CON_FIRPROFE")
	private String con_firprofe;
	//Fecha de firma del profesor
	@Column(name="CON_FFIRPROFE")
	private java.util.Date con_ffirprofe;
	//Firmado por la empresa (S, N)
	@Column(name="CON_FIREMPRESA")
	private String con_firempresa;
	//Fecha de firma de la empresa
	@Column(name="CON_FFIREMPRESA")
	private java.util.Date con_ffirempresa;
	//Firmado por la U.M.H. (S, N)
	@Column(name="CON_FIRUMH")
	private String con_firumh;
	//Fecha de firma de la U.H.M.
	@Column(name="CON_FFIRUMH")
	private java.util.Date con_ffirumh;
	//Importe total del contrato
	@Column(name="CON_IMP")
	private int con_imp;
	//Codigo de la moneda (FK - OTG_MONEDAS)
	@Column(name="CON_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_contratos_monedas_fk2;
	//Importe total del contrato (pesetas)
	@Column(name="CON_IMPP")
	private int con_impp;
	//Importe total del contrato (euros)
	@Column(name="CON_IMPE")
	private int con_impe;
	//IVA aplicable
	@Column(name="CON_IVAA")
	private int con_ivaa;
	//Retencion de la UMH
	@Column(name="CON_RETUMH")
	private int con_retumh;
	//Codigo de la forma de pago (FK - OTG_FPAGOS)
	@Column(name="CON_FPA_CODIGO")
	@ManyToOne
	@JoinColumn(name="FPA_CODIGO")
	private Otg_fpagos otg_fpagos_contratos_fpagos_fk4;
	//Fecha de firma
	@Column(name="CON_FFIR")
	private java.util.Date con_ffir;
	//Fecha de inicio
	@Column(name="CON_FINI")
	private java.util.Date con_fini;
	//Fecha de fin
	@Column(name="CON_FFIN")
	private java.util.Date con_ffin;
	//Duracion en meses
	@Column(name="CON_DURACION")
	private int con_duracion;
	//Codigo del Area productiva (FK - OTG_APRODUCTIVAS)
	@Column(name="CON_APR_CODIGO")
	@ManyToOne
	@JoinColumn(name="APR_CODIGO")
	private Otg_aproductivas otg_aproductivas_contratos_aproductivas_fk3;
	//Addendas. Codigo del contrato asociado (FK - OTG_CONTRATOS)
	@Column(name="CON_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_contratos_contratos_fk5;
	//Borrado (S, N)
	@Column(name="CON_BORRADO")
	private String con_borrado;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	//Estado (A: Anulado)
	@Column(name="CON_ESTADO")
	private String con_estado;
	//Renovacion Automatica (S, N)
	@Column(name="CON_RENOV")
	private String con_renov;
	//Fecha fin de renovacion
	@Column(name="CON_FFINRENOV")
	private java.util.Date con_ffinrenov;
	//Observacion
	@Column(name="CON_OBSERVACION")
	private String con_observacion;
	//Obsoleto
	@Column(name="CON_NUMREG")
	private String con_numreg;
	//Fecha de Registro
	@Column(name="CON_FREG")
	private java.util.Date con_freg;
	//Tipo de contrato (NULL: Contrato,V: Convenio,M:Acuerdo Marco)
	@Column(name="CON_TIPO")
	private String con_tipo;
	//Numero de Registro
	@Column(name="CON_NREG")
	private int con_nreg;
	//Codigo de la modalidad del contrato asociado a la addenda (FK - OTG_MCONTRATOS)
	@Column(name="CON_CON_MCO_CODIGO")
	@ManyToOne
	@JoinColumn(name="MCO_CODIGO")
	private Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk6;
	
	public Otg_contratos() {
		super();
	}
		
	public Otg_contratos(int con_codigo, List<Otg_proyectos> otg_proyectoss_proyectos_contratos_fk5, List<Otg_solicitudes> otg_solicitudess_solicitudes_contratos_fk7, List<Otg_percontratos> otg_percontratoss_percontratos_contratos_fk1, List<Otg_becas> otg_becass_becas_contratos_fk5, List<Otg_ocontratos> otg_ocontratoss_ocontratos_contratos_fk1, List<Otg_contratos> otg_contratoss_contratos_contratos_fk5, Otg_contratos otg_contratos_cpcontratos_contratos_fk1, Otg_contratos otg_contratos_tcontratos_contratos_fk1, Otg_contratos otg_contratos_ccontratos_contratos_fk1, Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk1, String con_teralias, int con_ano, String con_refer, String con_cg, int con_uor_codigo, String con_titulo, String con_vb, String con_lgestora, String con_agestora, java.util.Date con_fagestora, String con_conprofe, String con_conempresa, String con_conasesor, String con_firprofe, java.util.Date con_ffirprofe, String con_firempresa, java.util.Date con_ffirempresa, String con_firumh, java.util.Date con_ffirumh, int con_imp, Otg_monedas otg_monedas_contratos_monedas_fk2, int con_impp, int con_impe, int con_ivaa, int con_retumh, Otg_fpagos otg_fpagos_contratos_fpagos_fk4, java.util.Date con_ffir, java.util.Date con_fini, java.util.Date con_ffin, int con_duracion, Otg_aproductivas otg_aproductivas_contratos_aproductivas_fk3, Otg_contratos otg_contratos_contratos_contratos_fk5, String con_borrado, int log, String con_estado, String con_renov, java.util.Date con_ffinrenov, String con_observacion, String con_numreg, java.util.Date con_freg, String con_tipo, int con_nreg, Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk6) {
		this.con_codigo = con_codigo;
		this.otg_proyectoss_proyectos_contratos_fk5 = otg_proyectoss_proyectos_contratos_fk5;
		this.otg_solicitudess_solicitudes_contratos_fk7 = otg_solicitudess_solicitudes_contratos_fk7;
		this.otg_percontratoss_percontratos_contratos_fk1 = otg_percontratoss_percontratos_contratos_fk1;
		this.otg_becass_becas_contratos_fk5 = otg_becass_becas_contratos_fk5;
		this.otg_ocontratoss_ocontratos_contratos_fk1 = otg_ocontratoss_ocontratos_contratos_fk1;
		this.otg_contratoss_contratos_contratos_fk5 = otg_contratoss_contratos_contratos_fk5;
		this.otg_contratos_cpcontratos_contratos_fk1 = otg_contratos_cpcontratos_contratos_fk1;
		this.otg_contratos_tcontratos_contratos_fk1 = otg_contratos_tcontratos_contratos_fk1;
		this.otg_contratos_ccontratos_contratos_fk1 = otg_contratos_ccontratos_contratos_fk1;
		this.otg_mcontratos_contratos_mcontratos_fk1 = otg_mcontratos_contratos_mcontratos_fk1;
		this.con_teralias = con_teralias;
		this.con_ano = con_ano;
		this.con_refer = con_refer;
		this.con_cg = con_cg;
		this.con_uor_codigo = con_uor_codigo;
		this.con_titulo = con_titulo;
		this.con_vb = con_vb;
		this.con_lgestora = con_lgestora;
		this.con_agestora = con_agestora;
		this.con_fagestora = con_fagestora;
		this.con_conprofe = con_conprofe;
		this.con_conempresa = con_conempresa;
		this.con_conasesor = con_conasesor;
		this.con_firprofe = con_firprofe;
		this.con_ffirprofe = con_ffirprofe;
		this.con_firempresa = con_firempresa;
		this.con_ffirempresa = con_ffirempresa;
		this.con_firumh = con_firumh;
		this.con_ffirumh = con_ffirumh;
		this.con_imp = con_imp;
		this.otg_monedas_contratos_monedas_fk2 = otg_monedas_contratos_monedas_fk2;
		this.con_impp = con_impp;
		this.con_impe = con_impe;
		this.con_ivaa = con_ivaa;
		this.con_retumh = con_retumh;
		this.otg_fpagos_contratos_fpagos_fk4 = otg_fpagos_contratos_fpagos_fk4;
		this.con_ffir = con_ffir;
		this.con_fini = con_fini;
		this.con_ffin = con_ffin;
		this.con_duracion = con_duracion;
		this.otg_aproductivas_contratos_aproductivas_fk3 = otg_aproductivas_contratos_aproductivas_fk3;
		this.otg_contratos_contratos_contratos_fk5 = otg_contratos_contratos_contratos_fk5;
		this.con_borrado = con_borrado;
		this.log = log;
		this.con_estado = con_estado;
		this.con_renov = con_renov;
		this.con_ffinrenov = con_ffinrenov;
		this.con_observacion = con_observacion;
		this.con_numreg = con_numreg;
		this.con_freg = con_freg;
		this.con_tipo = con_tipo;
		this.con_nreg = con_nreg;
		this.otg_mcontratos_contratos_mcontratos_fk6 = otg_mcontratos_contratos_mcontratos_fk6;
	}
	
	public int getCon_codigo() {
		return this.con_codigo;
	}
			
	public void setCon_codigo(int con_codigo) {
		this.con_codigo = con_codigo;
	}
	public List<Otg_proyectos> getOtg_proyectoss_proyectos_contratos_fk5() {
		return this.otg_proyectoss_proyectos_contratos_fk5;
	}
			
	public void setOtg_proyectoss_proyectos_contratos_fk5(List<Otg_proyectos> otg_proyectoss_proyectos_contratos_fk5) {
		this.otg_proyectoss_proyectos_contratos_fk5 = otg_proyectoss_proyectos_contratos_fk5;
	}

	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_contratos_fk7() {
		return this.otg_solicitudess_solicitudes_contratos_fk7;
	}
			
	public void setOtg_solicitudess_solicitudes_contratos_fk7(List<Otg_solicitudes> otg_solicitudess_solicitudes_contratos_fk7) {
		this.otg_solicitudess_solicitudes_contratos_fk7 = otg_solicitudess_solicitudes_contratos_fk7;
	}

	public List<Otg_percontratos> getOtg_percontratoss_percontratos_contratos_fk1() {
		return this.otg_percontratoss_percontratos_contratos_fk1;
	}
			
	public void setOtg_percontratoss_percontratos_contratos_fk1(List<Otg_percontratos> otg_percontratoss_percontratos_contratos_fk1) {
		this.otg_percontratoss_percontratos_contratos_fk1 = otg_percontratoss_percontratos_contratos_fk1;
	}

	public List<Otg_becas> getOtg_becass_becas_contratos_fk5() {
		return this.otg_becass_becas_contratos_fk5;
	}
			
	public void setOtg_becass_becas_contratos_fk5(List<Otg_becas> otg_becass_becas_contratos_fk5) {
		this.otg_becass_becas_contratos_fk5 = otg_becass_becas_contratos_fk5;
	}

	public List<Otg_ocontratos> getOtg_ocontratoss_ocontratos_contratos_fk1() {
		return this.otg_ocontratoss_ocontratos_contratos_fk1;
	}
			
	public void setOtg_ocontratoss_ocontratos_contratos_fk1(List<Otg_ocontratos> otg_ocontratoss_ocontratos_contratos_fk1) {
		this.otg_ocontratoss_ocontratos_contratos_fk1 = otg_ocontratoss_ocontratos_contratos_fk1;
	}

	public List<Otg_contratos> getOtg_contratoss_contratos_contratos_fk5() {
		return this.otg_contratoss_contratos_contratos_fk5;
	}
			
	public void setOtg_contratoss_contratos_contratos_fk5(List<Otg_contratos> otg_contratoss_contratos_contratos_fk5) {
		this.otg_contratoss_contratos_contratos_fk5 = otg_contratoss_contratos_contratos_fk5;
	}

	public Otg_contratos getOtg_contratos_cpcontratos_contratos_fk1() {
		return this.otg_contratos_cpcontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_cpcontratos_contratos_fk1(Otg_contratos otg_contratos_cpcontratos_contratos_fk1) {
		this.otg_contratos_cpcontratos_contratos_fk1 = otg_contratos_cpcontratos_contratos_fk1;
	}

	public Otg_contratos getOtg_contratos_tcontratos_contratos_fk1() {
		return this.otg_contratos_tcontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_tcontratos_contratos_fk1(Otg_contratos otg_contratos_tcontratos_contratos_fk1) {
		this.otg_contratos_tcontratos_contratos_fk1 = otg_contratos_tcontratos_contratos_fk1;
	}

	public Otg_contratos getOtg_contratos_ccontratos_contratos_fk1() {
		return this.otg_contratos_ccontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_ccontratos_contratos_fk1(Otg_contratos otg_contratos_ccontratos_contratos_fk1) {
		this.otg_contratos_ccontratos_contratos_fk1 = otg_contratos_ccontratos_contratos_fk1;
	}


	public Otg_mcontratos getOtg_mcontratos_contratos_mcontratos_fk1() {
		return this.otg_mcontratos_contratos_mcontratos_fk1;
	}
			
	public void setOtg_mcontratos_contratos_mcontratos_fk1(Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk1) {
		this.otg_mcontratos_contratos_mcontratos_fk1 = otg_mcontratos_contratos_mcontratos_fk1;
	}


	public String getCon_teralias() {
		return this.con_teralias;
	}
			
	public void setCon_teralias(String con_teralias) {
		this.con_teralias = con_teralias;
	}


	public int getCon_ano() {
		return this.con_ano;
	}
			
	public void setCon_ano(int con_ano) {
		this.con_ano = con_ano;
	}


	public String getCon_refer() {
		return this.con_refer;
	}
			
	public void setCon_refer(String con_refer) {
		this.con_refer = con_refer;
	}


	public String getCon_cg() {
		return this.con_cg;
	}
			
	public void setCon_cg(String con_cg) {
		this.con_cg = con_cg;
	}


	public int getCon_uor_codigo() {
		return this.con_uor_codigo;
	}
			
	public void setCon_uor_codigo(int con_uor_codigo) {
		this.con_uor_codigo = con_uor_codigo;
	}


	public String getCon_titulo() {
		return this.con_titulo;
	}
			
	public void setCon_titulo(String con_titulo) {
		this.con_titulo = con_titulo;
	}


	public String getCon_vb() {
		return this.con_vb;
	}
			
	public void setCon_vb(String con_vb) {
		this.con_vb = con_vb;
	}


	public String getCon_lgestora() {
		return this.con_lgestora;
	}
			
	public void setCon_lgestora(String con_lgestora) {
		this.con_lgestora = con_lgestora;
	}


	public String getCon_agestora() {
		return this.con_agestora;
	}
			
	public void setCon_agestora(String con_agestora) {
		this.con_agestora = con_agestora;
	}


	public java.util.Date getCon_fagestora() {
		return this.con_fagestora;
	}
			
	public void setCon_fagestora(java.util.Date con_fagestora) {
		this.con_fagestora = con_fagestora;
	}


	public String getCon_conprofe() {
		return this.con_conprofe;
	}
			
	public void setCon_conprofe(String con_conprofe) {
		this.con_conprofe = con_conprofe;
	}


	public String getCon_conempresa() {
		return this.con_conempresa;
	}
			
	public void setCon_conempresa(String con_conempresa) {
		this.con_conempresa = con_conempresa;
	}


	public String getCon_conasesor() {
		return this.con_conasesor;
	}
			
	public void setCon_conasesor(String con_conasesor) {
		this.con_conasesor = con_conasesor;
	}


	public String getCon_firprofe() {
		return this.con_firprofe;
	}
			
	public void setCon_firprofe(String con_firprofe) {
		this.con_firprofe = con_firprofe;
	}


	public java.util.Date getCon_ffirprofe() {
		return this.con_ffirprofe;
	}
			
	public void setCon_ffirprofe(java.util.Date con_ffirprofe) {
		this.con_ffirprofe = con_ffirprofe;
	}


	public String getCon_firempresa() {
		return this.con_firempresa;
	}
			
	public void setCon_firempresa(String con_firempresa) {
		this.con_firempresa = con_firempresa;
	}


	public java.util.Date getCon_ffirempresa() {
		return this.con_ffirempresa;
	}
			
	public void setCon_ffirempresa(java.util.Date con_ffirempresa) {
		this.con_ffirempresa = con_ffirempresa;
	}


	public String getCon_firumh() {
		return this.con_firumh;
	}
			
	public void setCon_firumh(String con_firumh) {
		this.con_firumh = con_firumh;
	}


	public java.util.Date getCon_ffirumh() {
		return this.con_ffirumh;
	}
			
	public void setCon_ffirumh(java.util.Date con_ffirumh) {
		this.con_ffirumh = con_ffirumh;
	}


	public int getCon_imp() {
		return this.con_imp;
	}
			
	public void setCon_imp(int con_imp) {
		this.con_imp = con_imp;
	}


	public Otg_monedas getOtg_monedas_contratos_monedas_fk2() {
		return this.otg_monedas_contratos_monedas_fk2;
	}
			
	public void setOtg_monedas_contratos_monedas_fk2(Otg_monedas otg_monedas_contratos_monedas_fk2) {
		this.otg_monedas_contratos_monedas_fk2 = otg_monedas_contratos_monedas_fk2;
	}


	public int getCon_impp() {
		return this.con_impp;
	}
			
	public void setCon_impp(int con_impp) {
		this.con_impp = con_impp;
	}


	public int getCon_impe() {
		return this.con_impe;
	}
			
	public void setCon_impe(int con_impe) {
		this.con_impe = con_impe;
	}


	public int getCon_ivaa() {
		return this.con_ivaa;
	}
			
	public void setCon_ivaa(int con_ivaa) {
		this.con_ivaa = con_ivaa;
	}


	public int getCon_retumh() {
		return this.con_retumh;
	}
			
	public void setCon_retumh(int con_retumh) {
		this.con_retumh = con_retumh;
	}


	public Otg_fpagos getOtg_fpagos_contratos_fpagos_fk4() {
		return this.otg_fpagos_contratos_fpagos_fk4;
	}
			
	public void setOtg_fpagos_contratos_fpagos_fk4(Otg_fpagos otg_fpagos_contratos_fpagos_fk4) {
		this.otg_fpagos_contratos_fpagos_fk4 = otg_fpagos_contratos_fpagos_fk4;
	}


	public java.util.Date getCon_ffir() {
		return this.con_ffir;
	}
			
	public void setCon_ffir(java.util.Date con_ffir) {
		this.con_ffir = con_ffir;
	}


	public java.util.Date getCon_fini() {
		return this.con_fini;
	}
			
	public void setCon_fini(java.util.Date con_fini) {
		this.con_fini = con_fini;
	}


	public java.util.Date getCon_ffin() {
		return this.con_ffin;
	}
			
	public void setCon_ffin(java.util.Date con_ffin) {
		this.con_ffin = con_ffin;
	}


	public int getCon_duracion() {
		return this.con_duracion;
	}
			
	public void setCon_duracion(int con_duracion) {
		this.con_duracion = con_duracion;
	}


	public Otg_aproductivas getOtg_aproductivas_contratos_aproductivas_fk3() {
		return this.otg_aproductivas_contratos_aproductivas_fk3;
	}
			
	public void setOtg_aproductivas_contratos_aproductivas_fk3(Otg_aproductivas otg_aproductivas_contratos_aproductivas_fk3) {
		this.otg_aproductivas_contratos_aproductivas_fk3 = otg_aproductivas_contratos_aproductivas_fk3;
	}


	public Otg_contratos getOtg_contratos_contratos_contratos_fk5() {
		return this.otg_contratos_contratos_contratos_fk5;
	}
			
	public void setOtg_contratos_contratos_contratos_fk5(Otg_contratos otg_contratos_contratos_contratos_fk5) {
		this.otg_contratos_contratos_contratos_fk5 = otg_contratos_contratos_contratos_fk5;
	}


	public String getCon_borrado() {
		return this.con_borrado;
	}
			
	public void setCon_borrado(String con_borrado) {
		this.con_borrado = con_borrado;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getCon_estado() {
		return this.con_estado;
	}
			
	public void setCon_estado(String con_estado) {
		this.con_estado = con_estado;
	}


	public String getCon_renov() {
		return this.con_renov;
	}
			
	public void setCon_renov(String con_renov) {
		this.con_renov = con_renov;
	}


	public java.util.Date getCon_ffinrenov() {
		return this.con_ffinrenov;
	}
			
	public void setCon_ffinrenov(java.util.Date con_ffinrenov) {
		this.con_ffinrenov = con_ffinrenov;
	}


	public String getCon_observacion() {
		return this.con_observacion;
	}
			
	public void setCon_observacion(String con_observacion) {
		this.con_observacion = con_observacion;
	}


	public String getCon_numreg() {
		return this.con_numreg;
	}
			
	public void setCon_numreg(String con_numreg) {
		this.con_numreg = con_numreg;
	}


	public java.util.Date getCon_freg() {
		return this.con_freg;
	}
			
	public void setCon_freg(java.util.Date con_freg) {
		this.con_freg = con_freg;
	}


	public String getCon_tipo() {
		return this.con_tipo;
	}
			
	public void setCon_tipo(String con_tipo) {
		this.con_tipo = con_tipo;
	}


	public int getCon_nreg() {
		return this.con_nreg;
	}
			
	public void setCon_nreg(int con_nreg) {
		this.con_nreg = con_nreg;
	}


	public Otg_mcontratos getOtg_mcontratos_contratos_mcontratos_fk6() {
		return this.otg_mcontratos_contratos_mcontratos_fk6;
	}
			
	public void setOtg_mcontratos_contratos_mcontratos_fk6(Otg_mcontratos otg_mcontratos_contratos_mcontratos_fk6) {
		this.otg_mcontratos_contratos_mcontratos_fk6 = otg_mcontratos_contratos_mcontratos_fk6;
	}


}