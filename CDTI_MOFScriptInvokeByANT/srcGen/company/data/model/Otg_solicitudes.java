package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Solicitudes de convocatorias nacionales
@Entity
@Table(schema="jpa")
public class Otg_solicitudes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SOL_CODIGO)
	@Id
	@Column(name="SOL_CODIGO")
	private int sol_codigo;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_infraest> otg_infraests_infraest_solicitudes_fk4;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_proyectos> otg_proyectoss_proyectos_solicitudes_fk2;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_persolicitudes> otg_persolicitudess_persolicitudes_solicitudes_fk1;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_becas> otg_becass_becas_solicitudes_fk2;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_ssolicitudes> otg_ssolicitudess_ssolicitudes_solicitudes_fk1;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_solicitudes_fk6;
	@OneToMany(mappedBy="otg_solicitudes")
	private List<Otg_viajes> otg_viajess_viajes_solicitudes_fk1;
	//Codigo de la convocatoria (FK - OTG_CONVOCATORIAS)
	@Column(name="SOL_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_convocatorias otg_convocatorias_solicitudes_convocatorias_fk1;
	//Codigo de la actividad (FK - OTG_ACTIVIDADES)
	@Column(name="SOL_ACT_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACT_CODIGO")
	private Otg_actividades otg_actividades_solicitudes_actividades_fk2;
	//Codigo de la modalidad (FK - OTG_MODALIDADES)
	@Column(name="SOL_MOD_CODIGO")
	@ManyToOne
	@JoinColumn(name="MOD_CODIGO")
	private Otg_modalidades otg_modalidades_solicitudes_modalidades_fk3;
	//Codigo del plazo de convocatoria (FK - OTG_PCONVOCATORIAS)
	@Column(name="SOL_PCO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PCO_CODIGO")
	private Otg_pconvocatorias otg_pconvocatorias_solicitudes_pconvocator_fk9;
	//Titulo
	@Column(name="SOL_TITULO")
	private String sol_titulo;
	//Fecha de entrega
	@Column(name="SOL_FENTREGA")
	private java.util.Date sol_fentrega;
	//Codigo del estado de la solicitud (FK - OTG_ESOLICITUDES)
	@Column(name="SOL_ESO_CODIGO")
	@ManyToOne
	@JoinColumn(name="ESO_CODIGO")
	private Otg_esolicitudes otg_esolicitudes_solicitudes_esolicitudes_fk8;
	//Fecha de resolucion (Solicitudes Aprobadas)
	@Column(name="SOL_FRES")
	private java.util.Date sol_fres;
	//Fecha de publicacion (Solicitudes aprobadas)
	@Column(name="SOL_FPUB")
	private java.util.Date sol_fpub;
	//Duracion en meses
	@Column(name="SOL_DURACION")
	private int sol_duracion;
	//Codigo de la Unidad Organizativa solicitante (FK - GEA_UORGANIZATIVA)
	@Column(name="SOL_UOR_CODIGO")
	private int sol_uor_codigo;
	//Importe solicitado
	@Column(name="SOL_IMP")
	private int sol_imp;
	//Codigo de moneda (FK - OTG_MONEDAS)
	@Column(name="SOL_MON_CODIGO")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_solicitudes_monedas_fk10;
	//Importe en pesetas
	@Column(name="SOL_IMPP")
	private int sol_impp;
	//Importe en euros
	@Column(name="SOL_IMPE")
	private int sol_impe;
	//Codigo del area productiva (FK - OTG_APRODUCTIVAS)
	@Column(name="SOL_APR_CODIGO")
	@ManyToOne
	@JoinColumn(name="APR_CODIGO")
	private Otg_aproductivas otg_aproductivas_solicitudess_aproductivas_fk12;
	//Coordinado (S, N)
	@Column(name="SOL_COORDINADO")
	private String sol_coordinado;
	//Codigo del Macro-proyecto (FK - OTG_SUPERPROYECTOS)
	@Column(name="SOL_SUP_CODIGO")
	@ManyToOne
	@JoinColumn(name="SUP_CODIGO")
	private Otg_superproyectos otg_superproyectos_solicitudes_superproyecto_fk5;
	//Fechas por anualidades (S, N)
	@Column(name="SOL_FANUAL")
	private String sol_fanual;
	//Codigo del proyecto solicitado asociado.- Becas (FK - OTG_SOLICITUDES)
	@Column(name="SOL_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_solicitudes_solicitudes_fk6;
	//Codigo del proyecto asociado.- Becas (FK - OTG_PROYECTOS)
	@Column(name="SOL_PRO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_solicitudes_proyectos_fk4;
	//Codigo del contrato asociado.- Becas (FK - OTG_CONTRATOS)
	@Column(name="SOL_CTR_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_solicitudes_contratos_fk7;
	//Codigo de la Modalidad de la Beca (FK - OTG_MBECAS)
	@Column(name="SOL_MBE_CODIGO")
	@ManyToOne
	@JoinColumn(name="MBE_CODIGO")
	private Otg_mbecas otg_mbecas_solicitudess_mbecas_fk13;
	//Importe subvencion.- Infraestructuras
	@Column(name="SOL_IMPS")
	private int sol_imps;
	//Codigo de moneda subvencion .- Infraestructuras (FK - OTG_MONEDAS)
	@Column(name="SOL_MON_CODIGOS")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_solicitudes_monedas_fk11;
	//Importe en pesetas de subvencion .- Infraestructuras
	@Column(name="SOL_IMPPS")
	private int sol_impps;
	//Importe en euros de subvencion .- Infraestructuras
	@Column(name="SOL_IMPES")
	private int sol_impes;
	//Importe U.M.H. .- Infraestructuras
	@Column(name="SOL_IMPU")
	private int sol_impu;
	//Codigo de moneda U.M.H. - Infraestructuras (FK - OTG_MONEDAS)
	@Column(name="SOL_MON_CODIGOU")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_solicitudes_monedas_fk12;
	//Importe en pesetas de U.H.M. .- Infraestructuras
	@Column(name="SOL_IMPPU")
	private int sol_imppu;
	//Importe en euros de U.H.M. .- Infraestructuras
	@Column(name="SOL_IMPEU")
	private int sol_impeu;
	//Tipo de solicitud (P: Proyecto, B: Beca, V: Viaje, I: Infraestructura)
	@Column(name="SOL_TIPO")
	private String sol_tipo;
	//Identificador del tutor .- Becas (FK - OTG_PERSONAS)
	@Column(name="SOL_PER_IDT")
	private int sol_per_idt;
	//Identificador del Becario .- Becas (FK - OTG_PERSONAS)
	@Column(name="SOL_PER_IDB")
	private int sol_per_idb;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_solicitudes() {
		super();
	}
		
	public Otg_solicitudes(int sol_codigo, List<Otg_infraest> otg_infraests_infraest_solicitudes_fk4, List<Otg_proyectos> otg_proyectoss_proyectos_solicitudes_fk2, List<Otg_persolicitudes> otg_persolicitudess_persolicitudes_solicitudes_fk1, List<Otg_becas> otg_becass_becas_solicitudes_fk2, List<Otg_ssolicitudes> otg_ssolicitudess_ssolicitudes_solicitudes_fk1, List<Otg_solicitudes> otg_solicitudess_solicitudes_solicitudes_fk6, List<Otg_viajes> otg_viajess_viajes_solicitudes_fk1, Otg_convocatorias otg_convocatorias_solicitudes_convocatorias_fk1, Otg_actividades otg_actividades_solicitudes_actividades_fk2, Otg_modalidades otg_modalidades_solicitudes_modalidades_fk3, Otg_pconvocatorias otg_pconvocatorias_solicitudes_pconvocator_fk9, String sol_titulo, java.util.Date sol_fentrega, Otg_esolicitudes otg_esolicitudes_solicitudes_esolicitudes_fk8, java.util.Date sol_fres, java.util.Date sol_fpub, int sol_duracion, int sol_uor_codigo, int sol_imp, Otg_monedas otg_monedas_solicitudes_monedas_fk10, int sol_impp, int sol_impe, Otg_aproductivas otg_aproductivas_solicitudess_aproductivas_fk12, String sol_coordinado, Otg_superproyectos otg_superproyectos_solicitudes_superproyecto_fk5, String sol_fanual, Otg_solicitudes otg_solicitudes_solicitudes_solicitudes_fk6, Otg_proyectos otg_proyectos_solicitudes_proyectos_fk4, Otg_contratos otg_contratos_solicitudes_contratos_fk7, Otg_mbecas otg_mbecas_solicitudess_mbecas_fk13, int sol_imps, Otg_monedas otg_monedas_solicitudes_monedas_fk11, int sol_impps, int sol_impes, int sol_impu, Otg_monedas otg_monedas_solicitudes_monedas_fk12, int sol_imppu, int sol_impeu, String sol_tipo, int sol_per_idt, int sol_per_idb, int log) {
		this.sol_codigo = sol_codigo;
		this.otg_infraests_infraest_solicitudes_fk4 = otg_infraests_infraest_solicitudes_fk4;
		this.otg_proyectoss_proyectos_solicitudes_fk2 = otg_proyectoss_proyectos_solicitudes_fk2;
		this.otg_persolicitudess_persolicitudes_solicitudes_fk1 = otg_persolicitudess_persolicitudes_solicitudes_fk1;
		this.otg_becass_becas_solicitudes_fk2 = otg_becass_becas_solicitudes_fk2;
		this.otg_ssolicitudess_ssolicitudes_solicitudes_fk1 = otg_ssolicitudess_ssolicitudes_solicitudes_fk1;
		this.otg_solicitudess_solicitudes_solicitudes_fk6 = otg_solicitudess_solicitudes_solicitudes_fk6;
		this.otg_viajess_viajes_solicitudes_fk1 = otg_viajess_viajes_solicitudes_fk1;
		this.otg_convocatorias_solicitudes_convocatorias_fk1 = otg_convocatorias_solicitudes_convocatorias_fk1;
		this.otg_actividades_solicitudes_actividades_fk2 = otg_actividades_solicitudes_actividades_fk2;
		this.otg_modalidades_solicitudes_modalidades_fk3 = otg_modalidades_solicitudes_modalidades_fk3;
		this.otg_pconvocatorias_solicitudes_pconvocator_fk9 = otg_pconvocatorias_solicitudes_pconvocator_fk9;
		this.sol_titulo = sol_titulo;
		this.sol_fentrega = sol_fentrega;
		this.otg_esolicitudes_solicitudes_esolicitudes_fk8 = otg_esolicitudes_solicitudes_esolicitudes_fk8;
		this.sol_fres = sol_fres;
		this.sol_fpub = sol_fpub;
		this.sol_duracion = sol_duracion;
		this.sol_uor_codigo = sol_uor_codigo;
		this.sol_imp = sol_imp;
		this.otg_monedas_solicitudes_monedas_fk10 = otg_monedas_solicitudes_monedas_fk10;
		this.sol_impp = sol_impp;
		this.sol_impe = sol_impe;
		this.otg_aproductivas_solicitudess_aproductivas_fk12 = otg_aproductivas_solicitudess_aproductivas_fk12;
		this.sol_coordinado = sol_coordinado;
		this.otg_superproyectos_solicitudes_superproyecto_fk5 = otg_superproyectos_solicitudes_superproyecto_fk5;
		this.sol_fanual = sol_fanual;
		this.otg_solicitudes_solicitudes_solicitudes_fk6 = otg_solicitudes_solicitudes_solicitudes_fk6;
		this.otg_proyectos_solicitudes_proyectos_fk4 = otg_proyectos_solicitudes_proyectos_fk4;
		this.otg_contratos_solicitudes_contratos_fk7 = otg_contratos_solicitudes_contratos_fk7;
		this.otg_mbecas_solicitudess_mbecas_fk13 = otg_mbecas_solicitudess_mbecas_fk13;
		this.sol_imps = sol_imps;
		this.otg_monedas_solicitudes_monedas_fk11 = otg_monedas_solicitudes_monedas_fk11;
		this.sol_impps = sol_impps;
		this.sol_impes = sol_impes;
		this.sol_impu = sol_impu;
		this.otg_monedas_solicitudes_monedas_fk12 = otg_monedas_solicitudes_monedas_fk12;
		this.sol_imppu = sol_imppu;
		this.sol_impeu = sol_impeu;
		this.sol_tipo = sol_tipo;
		this.sol_per_idt = sol_per_idt;
		this.sol_per_idb = sol_per_idb;
		this.log = log;
	}
	
	public int getSol_codigo() {
		return this.sol_codigo;
	}
			
	public void setSol_codigo(int sol_codigo) {
		this.sol_codigo = sol_codigo;
	}
	public List<Otg_infraest> getOtg_infraests_infraest_solicitudes_fk4() {
		return this.otg_infraests_infraest_solicitudes_fk4;
	}
			
	public void setOtg_infraests_infraest_solicitudes_fk4(List<Otg_infraest> otg_infraests_infraest_solicitudes_fk4) {
		this.otg_infraests_infraest_solicitudes_fk4 = otg_infraests_infraest_solicitudes_fk4;
	}

	public List<Otg_proyectos> getOtg_proyectoss_proyectos_solicitudes_fk2() {
		return this.otg_proyectoss_proyectos_solicitudes_fk2;
	}
			
	public void setOtg_proyectoss_proyectos_solicitudes_fk2(List<Otg_proyectos> otg_proyectoss_proyectos_solicitudes_fk2) {
		this.otg_proyectoss_proyectos_solicitudes_fk2 = otg_proyectoss_proyectos_solicitudes_fk2;
	}

	public List<Otg_persolicitudes> getOtg_persolicitudess_persolicitudes_solicitudes_fk1() {
		return this.otg_persolicitudess_persolicitudes_solicitudes_fk1;
	}
			
	public void setOtg_persolicitudess_persolicitudes_solicitudes_fk1(List<Otg_persolicitudes> otg_persolicitudess_persolicitudes_solicitudes_fk1) {
		this.otg_persolicitudess_persolicitudes_solicitudes_fk1 = otg_persolicitudess_persolicitudes_solicitudes_fk1;
	}

	public List<Otg_becas> getOtg_becass_becas_solicitudes_fk2() {
		return this.otg_becass_becas_solicitudes_fk2;
	}
			
	public void setOtg_becass_becas_solicitudes_fk2(List<Otg_becas> otg_becass_becas_solicitudes_fk2) {
		this.otg_becass_becas_solicitudes_fk2 = otg_becass_becas_solicitudes_fk2;
	}

	public List<Otg_ssolicitudes> getOtg_ssolicitudess_ssolicitudes_solicitudes_fk1() {
		return this.otg_ssolicitudess_ssolicitudes_solicitudes_fk1;
	}
			
	public void setOtg_ssolicitudess_ssolicitudes_solicitudes_fk1(List<Otg_ssolicitudes> otg_ssolicitudess_ssolicitudes_solicitudes_fk1) {
		this.otg_ssolicitudess_ssolicitudes_solicitudes_fk1 = otg_ssolicitudess_ssolicitudes_solicitudes_fk1;
	}

	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_solicitudes_fk6() {
		return this.otg_solicitudess_solicitudes_solicitudes_fk6;
	}
			
	public void setOtg_solicitudess_solicitudes_solicitudes_fk6(List<Otg_solicitudes> otg_solicitudess_solicitudes_solicitudes_fk6) {
		this.otg_solicitudess_solicitudes_solicitudes_fk6 = otg_solicitudess_solicitudes_solicitudes_fk6;
	}

	public List<Otg_viajes> getOtg_viajess_viajes_solicitudes_fk1() {
		return this.otg_viajess_viajes_solicitudes_fk1;
	}
			
	public void setOtg_viajess_viajes_solicitudes_fk1(List<Otg_viajes> otg_viajess_viajes_solicitudes_fk1) {
		this.otg_viajess_viajes_solicitudes_fk1 = otg_viajess_viajes_solicitudes_fk1;
	}


	public Otg_convocatorias getOtg_convocatorias_solicitudes_convocatorias_fk1() {
		return this.otg_convocatorias_solicitudes_convocatorias_fk1;
	}
			
	public void setOtg_convocatorias_solicitudes_convocatorias_fk1(Otg_convocatorias otg_convocatorias_solicitudes_convocatorias_fk1) {
		this.otg_convocatorias_solicitudes_convocatorias_fk1 = otg_convocatorias_solicitudes_convocatorias_fk1;
	}


	public Otg_actividades getOtg_actividades_solicitudes_actividades_fk2() {
		return this.otg_actividades_solicitudes_actividades_fk2;
	}
			
	public void setOtg_actividades_solicitudes_actividades_fk2(Otg_actividades otg_actividades_solicitudes_actividades_fk2) {
		this.otg_actividades_solicitudes_actividades_fk2 = otg_actividades_solicitudes_actividades_fk2;
	}


	public Otg_modalidades getOtg_modalidades_solicitudes_modalidades_fk3() {
		return this.otg_modalidades_solicitudes_modalidades_fk3;
	}
			
	public void setOtg_modalidades_solicitudes_modalidades_fk3(Otg_modalidades otg_modalidades_solicitudes_modalidades_fk3) {
		this.otg_modalidades_solicitudes_modalidades_fk3 = otg_modalidades_solicitudes_modalidades_fk3;
	}


	public Otg_pconvocatorias getOtg_pconvocatorias_solicitudes_pconvocator_fk9() {
		return this.otg_pconvocatorias_solicitudes_pconvocator_fk9;
	}
			
	public void setOtg_pconvocatorias_solicitudes_pconvocator_fk9(Otg_pconvocatorias otg_pconvocatorias_solicitudes_pconvocator_fk9) {
		this.otg_pconvocatorias_solicitudes_pconvocator_fk9 = otg_pconvocatorias_solicitudes_pconvocator_fk9;
	}


	public String getSol_titulo() {
		return this.sol_titulo;
	}
			
	public void setSol_titulo(String sol_titulo) {
		this.sol_titulo = sol_titulo;
	}


	public java.util.Date getSol_fentrega() {
		return this.sol_fentrega;
	}
			
	public void setSol_fentrega(java.util.Date sol_fentrega) {
		this.sol_fentrega = sol_fentrega;
	}


	public Otg_esolicitudes getOtg_esolicitudes_solicitudes_esolicitudes_fk8() {
		return this.otg_esolicitudes_solicitudes_esolicitudes_fk8;
	}
			
	public void setOtg_esolicitudes_solicitudes_esolicitudes_fk8(Otg_esolicitudes otg_esolicitudes_solicitudes_esolicitudes_fk8) {
		this.otg_esolicitudes_solicitudes_esolicitudes_fk8 = otg_esolicitudes_solicitudes_esolicitudes_fk8;
	}


	public java.util.Date getSol_fres() {
		return this.sol_fres;
	}
			
	public void setSol_fres(java.util.Date sol_fres) {
		this.sol_fres = sol_fres;
	}


	public java.util.Date getSol_fpub() {
		return this.sol_fpub;
	}
			
	public void setSol_fpub(java.util.Date sol_fpub) {
		this.sol_fpub = sol_fpub;
	}


	public int getSol_duracion() {
		return this.sol_duracion;
	}
			
	public void setSol_duracion(int sol_duracion) {
		this.sol_duracion = sol_duracion;
	}


	public int getSol_uor_codigo() {
		return this.sol_uor_codigo;
	}
			
	public void setSol_uor_codigo(int sol_uor_codigo) {
		this.sol_uor_codigo = sol_uor_codigo;
	}


	public int getSol_imp() {
		return this.sol_imp;
	}
			
	public void setSol_imp(int sol_imp) {
		this.sol_imp = sol_imp;
	}


	public Otg_monedas getOtg_monedas_solicitudes_monedas_fk10() {
		return this.otg_monedas_solicitudes_monedas_fk10;
	}
			
	public void setOtg_monedas_solicitudes_monedas_fk10(Otg_monedas otg_monedas_solicitudes_monedas_fk10) {
		this.otg_monedas_solicitudes_monedas_fk10 = otg_monedas_solicitudes_monedas_fk10;
	}


	public int getSol_impp() {
		return this.sol_impp;
	}
			
	public void setSol_impp(int sol_impp) {
		this.sol_impp = sol_impp;
	}


	public int getSol_impe() {
		return this.sol_impe;
	}
			
	public void setSol_impe(int sol_impe) {
		this.sol_impe = sol_impe;
	}


	public Otg_aproductivas getOtg_aproductivas_solicitudess_aproductivas_fk12() {
		return this.otg_aproductivas_solicitudess_aproductivas_fk12;
	}
			
	public void setOtg_aproductivas_solicitudess_aproductivas_fk12(Otg_aproductivas otg_aproductivas_solicitudess_aproductivas_fk12) {
		this.otg_aproductivas_solicitudess_aproductivas_fk12 = otg_aproductivas_solicitudess_aproductivas_fk12;
	}


	public String getSol_coordinado() {
		return this.sol_coordinado;
	}
			
	public void setSol_coordinado(String sol_coordinado) {
		this.sol_coordinado = sol_coordinado;
	}


	public Otg_superproyectos getOtg_superproyectos_solicitudes_superproyecto_fk5() {
		return this.otg_superproyectos_solicitudes_superproyecto_fk5;
	}
			
	public void setOtg_superproyectos_solicitudes_superproyecto_fk5(Otg_superproyectos otg_superproyectos_solicitudes_superproyecto_fk5) {
		this.otg_superproyectos_solicitudes_superproyecto_fk5 = otg_superproyectos_solicitudes_superproyecto_fk5;
	}


	public String getSol_fanual() {
		return this.sol_fanual;
	}
			
	public void setSol_fanual(String sol_fanual) {
		this.sol_fanual = sol_fanual;
	}


	public Otg_solicitudes getOtg_solicitudes_solicitudes_solicitudes_fk6() {
		return this.otg_solicitudes_solicitudes_solicitudes_fk6;
	}
			
	public void setOtg_solicitudes_solicitudes_solicitudes_fk6(Otg_solicitudes otg_solicitudes_solicitudes_solicitudes_fk6) {
		this.otg_solicitudes_solicitudes_solicitudes_fk6 = otg_solicitudes_solicitudes_solicitudes_fk6;
	}


	public Otg_proyectos getOtg_proyectos_solicitudes_proyectos_fk4() {
		return this.otg_proyectos_solicitudes_proyectos_fk4;
	}
			
	public void setOtg_proyectos_solicitudes_proyectos_fk4(Otg_proyectos otg_proyectos_solicitudes_proyectos_fk4) {
		this.otg_proyectos_solicitudes_proyectos_fk4 = otg_proyectos_solicitudes_proyectos_fk4;
	}


	public Otg_contratos getOtg_contratos_solicitudes_contratos_fk7() {
		return this.otg_contratos_solicitudes_contratos_fk7;
	}
			
	public void setOtg_contratos_solicitudes_contratos_fk7(Otg_contratos otg_contratos_solicitudes_contratos_fk7) {
		this.otg_contratos_solicitudes_contratos_fk7 = otg_contratos_solicitudes_contratos_fk7;
	}


	public Otg_mbecas getOtg_mbecas_solicitudess_mbecas_fk13() {
		return this.otg_mbecas_solicitudess_mbecas_fk13;
	}
			
	public void setOtg_mbecas_solicitudess_mbecas_fk13(Otg_mbecas otg_mbecas_solicitudess_mbecas_fk13) {
		this.otg_mbecas_solicitudess_mbecas_fk13 = otg_mbecas_solicitudess_mbecas_fk13;
	}


	public int getSol_imps() {
		return this.sol_imps;
	}
			
	public void setSol_imps(int sol_imps) {
		this.sol_imps = sol_imps;
	}


	public Otg_monedas getOtg_monedas_solicitudes_monedas_fk11() {
		return this.otg_monedas_solicitudes_monedas_fk11;
	}
			
	public void setOtg_monedas_solicitudes_monedas_fk11(Otg_monedas otg_monedas_solicitudes_monedas_fk11) {
		this.otg_monedas_solicitudes_monedas_fk11 = otg_monedas_solicitudes_monedas_fk11;
	}


	public int getSol_impps() {
		return this.sol_impps;
	}
			
	public void setSol_impps(int sol_impps) {
		this.sol_impps = sol_impps;
	}


	public int getSol_impes() {
		return this.sol_impes;
	}
			
	public void setSol_impes(int sol_impes) {
		this.sol_impes = sol_impes;
	}


	public int getSol_impu() {
		return this.sol_impu;
	}
			
	public void setSol_impu(int sol_impu) {
		this.sol_impu = sol_impu;
	}


	public Otg_monedas getOtg_monedas_solicitudes_monedas_fk12() {
		return this.otg_monedas_solicitudes_monedas_fk12;
	}
			
	public void setOtg_monedas_solicitudes_monedas_fk12(Otg_monedas otg_monedas_solicitudes_monedas_fk12) {
		this.otg_monedas_solicitudes_monedas_fk12 = otg_monedas_solicitudes_monedas_fk12;
	}


	public int getSol_imppu() {
		return this.sol_imppu;
	}
			
	public void setSol_imppu(int sol_imppu) {
		this.sol_imppu = sol_imppu;
	}


	public int getSol_impeu() {
		return this.sol_impeu;
	}
			
	public void setSol_impeu(int sol_impeu) {
		this.sol_impeu = sol_impeu;
	}


	public String getSol_tipo() {
		return this.sol_tipo;
	}
			
	public void setSol_tipo(String sol_tipo) {
		this.sol_tipo = sol_tipo;
	}


	public int getSol_per_idt() {
		return this.sol_per_idt;
	}
			
	public void setSol_per_idt(int sol_per_idt) {
		this.sol_per_idt = sol_per_idt;
	}


	public int getSol_per_idb() {
		return this.sol_per_idb;
	}
			
	public void setSol_per_idb(int sol_per_idb) {
		this.sol_per_idb = sol_per_idb;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}