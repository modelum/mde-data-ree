package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Proyectos Nacionales
@Entity
@Table(schema="jpa")
public class Otg_proyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_PRO_CODIGO)
	@Id
	@Column(name="PRO_CODIGO")
	private int pro_codigo;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_proyectos_fk4;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_perproyectos> otg_perproyectoss_perproyectos_proyectos_fk1;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_oproyectos> otg_oproyectoss_oproyectos_proyectos_fk1;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_becas> otg_becass_becas_proyectos_fk4;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_aproyectos> otg_aproyectoss_aproyectos_proyectos_fk1;
	@OneToMany(mappedBy="otg_proyectos")
	private List<Otg_sproyectos> otg_sproyectoss_sproyectos_proyectos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_proyectos otg_proyectos_scproyectos_proyectos_fk1;
	//Centro de Gasto
	@Column(name="PRO_CG")
	private String pro_cg;
	//Referencia
	@Column(name="PRO_REFER")
	private String pro_refer;
	//Codigo de la solicitud (FK - OTG_SOLICITUDES)
	@Column(name="PRO_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_proyectos_solicitudes_fk2;
	//Estado (FA: Fallido; TR: Transferido; FI: Finalizado; null : Activo; NI: No Iniciado)
	@Column(name="PRO_ESTADO")
	private String pro_estado;
	//Tipo del proyecto
	@Column(name="PRO_TIPO")
	private String pro_tipo;
	//Titulo
	@Column(name="PRO_TITULO")
	private String pro_titulo;
	//Acronimo
	@Column(name="PRO_ALIAS")
	private String pro_alias;
	//Importe concedido
	@Column(name="PRO_IMP")
	private int pro_imp;
	//Codigo de moneda (FK - OTG_MONEDAS)
	@Column(name="PRO_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_proyectos_monedas_fk4;
	//Importe concedido en pesetas
	@Column(name="PRO_IMPP")
	private int pro_impp;
	//Importe concedido en euros
	@Column(name="PRO_IMPE")
	private int pro_impe;
	//Fecha inicio
	@Column(name="PRO_FINI")
	private java.util.Date pro_fini;
	//Fecha fin
	@Column(name="PRO_FFIN")
	private java.util.Date pro_ffin;
	//Utilidad practica de los resultados. Informe Final
	@Column(name="PRO_IFUTIL")
	private String pro_ifutil;
	//Otras consideraciones. Informe Final
	@Column(name="PRO_IFOTROS")
	private String pro_ifotros;
	//Resultados. Informe Final
	@Column(name="PRO_IFRESULTADOS")
	private String pro_ifresultados;
	//Plan de explotacion. Informe Final
	@Column(name="PRO_IFEXPLOTACION")
	private String pro_ifexplotacion;
	//Coordinado (S, N)
	@Column(name="PRO_COORDINADO")
	private String pro_coordinado;
	//Codigo del Macro-proyecto (FK - OTG_SUPERPROYECTOS)
	@Column(name="PRO_SUP_CODIGO")
	@ManyToOne
	@JoinColumn(name="SUP_CODIGO")
	private Otg_superproyectos otg_superproyectos_proyectos_superproyectos_fk3;
	//Codigo del area productiva (FK - OTG_APRODUCTIVAS)
	@Column(name="PRO_APR_CODIGO")
	@ManyToOne
	@JoinColumn(name="APR_CODIGO")
	private Otg_aproductivas otg_aproductivas_proyectos_aproductivas_fk3;
	//Fecha de resolucion
	@Column(name="PRO_FRES")
	private java.util.Date pro_fres;
	//Fecha de publicacion
	@Column(name="PRO_FPUB")
	private java.util.Date pro_fpub;
	//Fechas por anualidades (S, N)
	@Column(name="PRO_ANUAL")
	private String pro_anual;
	//Codigo de la unidad organizativa (FK - GEA_UORGANIZATIVAS)
	@Column(name="PRO_UOR_CODIGO")
	private int pro_uor_codigo;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	@Column(name="PRO_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_proyectos_contratos_fk5;
	//El proyecto se compone de suma de conceptos (S o Null)
	@Column(name="PRO_SUMA")
	private String pro_suma;
	
	public Otg_proyectos() {
		super();
	}
		
	public Otg_proyectos(int pro_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudes_proyectos_fk4, List<Otg_perproyectos> otg_perproyectoss_perproyectos_proyectos_fk1, List<Otg_oproyectos> otg_oproyectoss_oproyectos_proyectos_fk1, List<Otg_becas> otg_becass_becas_proyectos_fk4, List<Otg_aproyectos> otg_aproyectoss_aproyectos_proyectos_fk1, List<Otg_sproyectos> otg_sproyectoss_sproyectos_proyectos_fk1, Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2, Otg_proyectos otg_proyectos_scproyectos_proyectos_fk1, String pro_cg, String pro_refer, Otg_solicitudes otg_solicitudes_proyectos_solicitudes_fk2, String pro_estado, String pro_tipo, String pro_titulo, String pro_alias, int pro_imp, Otg_monedas otg_monedas_proyectos_monedas_fk4, int pro_impp, int pro_impe, java.util.Date pro_fini, java.util.Date pro_ffin, String pro_ifutil, String pro_ifotros, String pro_ifresultados, String pro_ifexplotacion, String pro_coordinado, Otg_superproyectos otg_superproyectos_proyectos_superproyectos_fk3, Otg_aproductivas otg_aproductivas_proyectos_aproductivas_fk3, java.util.Date pro_fres, java.util.Date pro_fpub, String pro_anual, int pro_uor_codigo, int log, Otg_contratos otg_contratos_proyectos_contratos_fk5, String pro_suma) {
		this.pro_codigo = pro_codigo;
		this.otg_solicitudess_solicitudes_proyectos_fk4 = otg_solicitudess_solicitudes_proyectos_fk4;
		this.otg_perproyectoss_perproyectos_proyectos_fk1 = otg_perproyectoss_perproyectos_proyectos_fk1;
		this.otg_oproyectoss_oproyectos_proyectos_fk1 = otg_oproyectoss_oproyectos_proyectos_fk1;
		this.otg_becass_becas_proyectos_fk4 = otg_becass_becas_proyectos_fk4;
		this.otg_aproyectoss_aproyectos_proyectos_fk1 = otg_aproyectoss_aproyectos_proyectos_fk1;
		this.otg_sproyectoss_sproyectos_proyectos_fk1 = otg_sproyectoss_sproyectos_proyectos_fk1;
		this.otg_proyectos_tproyectos_proyectos_fk2 = otg_proyectos_tproyectos_proyectos_fk2;
		this.otg_proyectos_scproyectos_proyectos_fk1 = otg_proyectos_scproyectos_proyectos_fk1;
		this.pro_cg = pro_cg;
		this.pro_refer = pro_refer;
		this.otg_solicitudes_proyectos_solicitudes_fk2 = otg_solicitudes_proyectos_solicitudes_fk2;
		this.pro_estado = pro_estado;
		this.pro_tipo = pro_tipo;
		this.pro_titulo = pro_titulo;
		this.pro_alias = pro_alias;
		this.pro_imp = pro_imp;
		this.otg_monedas_proyectos_monedas_fk4 = otg_monedas_proyectos_monedas_fk4;
		this.pro_impp = pro_impp;
		this.pro_impe = pro_impe;
		this.pro_fini = pro_fini;
		this.pro_ffin = pro_ffin;
		this.pro_ifutil = pro_ifutil;
		this.pro_ifotros = pro_ifotros;
		this.pro_ifresultados = pro_ifresultados;
		this.pro_ifexplotacion = pro_ifexplotacion;
		this.pro_coordinado = pro_coordinado;
		this.otg_superproyectos_proyectos_superproyectos_fk3 = otg_superproyectos_proyectos_superproyectos_fk3;
		this.otg_aproductivas_proyectos_aproductivas_fk3 = otg_aproductivas_proyectos_aproductivas_fk3;
		this.pro_fres = pro_fres;
		this.pro_fpub = pro_fpub;
		this.pro_anual = pro_anual;
		this.pro_uor_codigo = pro_uor_codigo;
		this.log = log;
		this.otg_contratos_proyectos_contratos_fk5 = otg_contratos_proyectos_contratos_fk5;
		this.pro_suma = pro_suma;
	}
	
	public int getPro_codigo() {
		return this.pro_codigo;
	}
			
	public void setPro_codigo(int pro_codigo) {
		this.pro_codigo = pro_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_proyectos_fk4() {
		return this.otg_solicitudess_solicitudes_proyectos_fk4;
	}
			
	public void setOtg_solicitudess_solicitudes_proyectos_fk4(List<Otg_solicitudes> otg_solicitudess_solicitudes_proyectos_fk4) {
		this.otg_solicitudess_solicitudes_proyectos_fk4 = otg_solicitudess_solicitudes_proyectos_fk4;
	}

	public List<Otg_perproyectos> getOtg_perproyectoss_perproyectos_proyectos_fk1() {
		return this.otg_perproyectoss_perproyectos_proyectos_fk1;
	}
			
	public void setOtg_perproyectoss_perproyectos_proyectos_fk1(List<Otg_perproyectos> otg_perproyectoss_perproyectos_proyectos_fk1) {
		this.otg_perproyectoss_perproyectos_proyectos_fk1 = otg_perproyectoss_perproyectos_proyectos_fk1;
	}

	public List<Otg_oproyectos> getOtg_oproyectoss_oproyectos_proyectos_fk1() {
		return this.otg_oproyectoss_oproyectos_proyectos_fk1;
	}
			
	public void setOtg_oproyectoss_oproyectos_proyectos_fk1(List<Otg_oproyectos> otg_oproyectoss_oproyectos_proyectos_fk1) {
		this.otg_oproyectoss_oproyectos_proyectos_fk1 = otg_oproyectoss_oproyectos_proyectos_fk1;
	}

	public List<Otg_becas> getOtg_becass_becas_proyectos_fk4() {
		return this.otg_becass_becas_proyectos_fk4;
	}
			
	public void setOtg_becass_becas_proyectos_fk4(List<Otg_becas> otg_becass_becas_proyectos_fk4) {
		this.otg_becass_becas_proyectos_fk4 = otg_becass_becas_proyectos_fk4;
	}

	public List<Otg_aproyectos> getOtg_aproyectoss_aproyectos_proyectos_fk1() {
		return this.otg_aproyectoss_aproyectos_proyectos_fk1;
	}
			
	public void setOtg_aproyectoss_aproyectos_proyectos_fk1(List<Otg_aproyectos> otg_aproyectoss_aproyectos_proyectos_fk1) {
		this.otg_aproyectoss_aproyectos_proyectos_fk1 = otg_aproyectoss_aproyectos_proyectos_fk1;
	}

	public List<Otg_sproyectos> getOtg_sproyectoss_sproyectos_proyectos_fk1() {
		return this.otg_sproyectoss_sproyectos_proyectos_fk1;
	}
			
	public void setOtg_sproyectoss_sproyectos_proyectos_fk1(List<Otg_sproyectos> otg_sproyectoss_sproyectos_proyectos_fk1) {
		this.otg_sproyectoss_sproyectos_proyectos_fk1 = otg_sproyectoss_sproyectos_proyectos_fk1;
	}

	public Otg_proyectos getOtg_proyectos_tproyectos_proyectos_fk2() {
		return this.otg_proyectos_tproyectos_proyectos_fk2;
	}
			
	public void setOtg_proyectos_tproyectos_proyectos_fk2(Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2) {
		this.otg_proyectos_tproyectos_proyectos_fk2 = otg_proyectos_tproyectos_proyectos_fk2;
	}

	public Otg_proyectos getOtg_proyectos_scproyectos_proyectos_fk1() {
		return this.otg_proyectos_scproyectos_proyectos_fk1;
	}
			
	public void setOtg_proyectos_scproyectos_proyectos_fk1(Otg_proyectos otg_proyectos_scproyectos_proyectos_fk1) {
		this.otg_proyectos_scproyectos_proyectos_fk1 = otg_proyectos_scproyectos_proyectos_fk1;
	}


	public String getPro_cg() {
		return this.pro_cg;
	}
			
	public void setPro_cg(String pro_cg) {
		this.pro_cg = pro_cg;
	}


	public String getPro_refer() {
		return this.pro_refer;
	}
			
	public void setPro_refer(String pro_refer) {
		this.pro_refer = pro_refer;
	}


	public Otg_solicitudes getOtg_solicitudes_proyectos_solicitudes_fk2() {
		return this.otg_solicitudes_proyectos_solicitudes_fk2;
	}
			
	public void setOtg_solicitudes_proyectos_solicitudes_fk2(Otg_solicitudes otg_solicitudes_proyectos_solicitudes_fk2) {
		this.otg_solicitudes_proyectos_solicitudes_fk2 = otg_solicitudes_proyectos_solicitudes_fk2;
	}


	public String getPro_estado() {
		return this.pro_estado;
	}
			
	public void setPro_estado(String pro_estado) {
		this.pro_estado = pro_estado;
	}


	public String getPro_tipo() {
		return this.pro_tipo;
	}
			
	public void setPro_tipo(String pro_tipo) {
		this.pro_tipo = pro_tipo;
	}


	public String getPro_titulo() {
		return this.pro_titulo;
	}
			
	public void setPro_titulo(String pro_titulo) {
		this.pro_titulo = pro_titulo;
	}


	public String getPro_alias() {
		return this.pro_alias;
	}
			
	public void setPro_alias(String pro_alias) {
		this.pro_alias = pro_alias;
	}


	public int getPro_imp() {
		return this.pro_imp;
	}
			
	public void setPro_imp(int pro_imp) {
		this.pro_imp = pro_imp;
	}


	public Otg_monedas getOtg_monedas_proyectos_monedas_fk4() {
		return this.otg_monedas_proyectos_monedas_fk4;
	}
			
	public void setOtg_monedas_proyectos_monedas_fk4(Otg_monedas otg_monedas_proyectos_monedas_fk4) {
		this.otg_monedas_proyectos_monedas_fk4 = otg_monedas_proyectos_monedas_fk4;
	}


	public int getPro_impp() {
		return this.pro_impp;
	}
			
	public void setPro_impp(int pro_impp) {
		this.pro_impp = pro_impp;
	}


	public int getPro_impe() {
		return this.pro_impe;
	}
			
	public void setPro_impe(int pro_impe) {
		this.pro_impe = pro_impe;
	}


	public java.util.Date getPro_fini() {
		return this.pro_fini;
	}
			
	public void setPro_fini(java.util.Date pro_fini) {
		this.pro_fini = pro_fini;
	}


	public java.util.Date getPro_ffin() {
		return this.pro_ffin;
	}
			
	public void setPro_ffin(java.util.Date pro_ffin) {
		this.pro_ffin = pro_ffin;
	}


	public String getPro_ifutil() {
		return this.pro_ifutil;
	}
			
	public void setPro_ifutil(String pro_ifutil) {
		this.pro_ifutil = pro_ifutil;
	}


	public String getPro_ifotros() {
		return this.pro_ifotros;
	}
			
	public void setPro_ifotros(String pro_ifotros) {
		this.pro_ifotros = pro_ifotros;
	}


	public String getPro_ifresultados() {
		return this.pro_ifresultados;
	}
			
	public void setPro_ifresultados(String pro_ifresultados) {
		this.pro_ifresultados = pro_ifresultados;
	}


	public String getPro_ifexplotacion() {
		return this.pro_ifexplotacion;
	}
			
	public void setPro_ifexplotacion(String pro_ifexplotacion) {
		this.pro_ifexplotacion = pro_ifexplotacion;
	}


	public String getPro_coordinado() {
		return this.pro_coordinado;
	}
			
	public void setPro_coordinado(String pro_coordinado) {
		this.pro_coordinado = pro_coordinado;
	}


	public Otg_superproyectos getOtg_superproyectos_proyectos_superproyectos_fk3() {
		return this.otg_superproyectos_proyectos_superproyectos_fk3;
	}
			
	public void setOtg_superproyectos_proyectos_superproyectos_fk3(Otg_superproyectos otg_superproyectos_proyectos_superproyectos_fk3) {
		this.otg_superproyectos_proyectos_superproyectos_fk3 = otg_superproyectos_proyectos_superproyectos_fk3;
	}


	public Otg_aproductivas getOtg_aproductivas_proyectos_aproductivas_fk3() {
		return this.otg_aproductivas_proyectos_aproductivas_fk3;
	}
			
	public void setOtg_aproductivas_proyectos_aproductivas_fk3(Otg_aproductivas otg_aproductivas_proyectos_aproductivas_fk3) {
		this.otg_aproductivas_proyectos_aproductivas_fk3 = otg_aproductivas_proyectos_aproductivas_fk3;
	}


	public java.util.Date getPro_fres() {
		return this.pro_fres;
	}
			
	public void setPro_fres(java.util.Date pro_fres) {
		this.pro_fres = pro_fres;
	}


	public java.util.Date getPro_fpub() {
		return this.pro_fpub;
	}
			
	public void setPro_fpub(java.util.Date pro_fpub) {
		this.pro_fpub = pro_fpub;
	}


	public String getPro_anual() {
		return this.pro_anual;
	}
			
	public void setPro_anual(String pro_anual) {
		this.pro_anual = pro_anual;
	}


	public int getPro_uor_codigo() {
		return this.pro_uor_codigo;
	}
			
	public void setPro_uor_codigo(int pro_uor_codigo) {
		this.pro_uor_codigo = pro_uor_codigo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public Otg_contratos getOtg_contratos_proyectos_contratos_fk5() {
		return this.otg_contratos_proyectos_contratos_fk5;
	}
			
	public void setOtg_contratos_proyectos_contratos_fk5(Otg_contratos otg_contratos_proyectos_contratos_fk5) {
		this.otg_contratos_proyectos_contratos_fk5 = otg_contratos_proyectos_contratos_fk5;
	}


	public String getPro_suma() {
		return this.pro_suma;
	}
			
	public void setPro_suma(String pro_suma) {
		this.pro_suma = pro_suma;
	}


}