package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Becas
@Entity
@Table(schema="jpa")
public class Otg_becas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_BEC_CODIGO)
	@Id
	@Column(name="BEC_CODIGO")
	private int bec_codigo;
	@OneToMany(mappedBy="otg_becas")
	private List<Otg_abecas> otg_abecass_abecas_becas_fk1;
	@OneToMany(mappedBy="otg_becas")
	private List<Otg_sbecas> otg_sbecass_sbecas_becas_fk1;
	@OneToMany(mappedBy="otg_becas")
	private List<Otg_obecas> otg_obecass_obecas_becas_fk1;
	@OneToMany(mappedBy="otg_becas")
	private List<Otg_ebecas> otg_ebecass_ebecas_becas_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_becas otg_becas_tbecas_becas_fk1;
	//Centro de Gasto
	@Column(name="BEC_CG")
	private String bec_cg;
	//Codigo de la solicitud (FK - OTG_SOLICITUDES)
	@Column(name="BEC_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_becas_solicitudes_fk2;
	//Fecha de inicio
	@Column(name="BEC_FINI")
	private java.util.Date bec_fini;
	//Fecha de fin
	@Column(name="BEC_FFIN")
	private java.util.Date bec_ffin;
	//Importe total en euros
	@Column(name="BEC_IMPE")
	private int bec_impe;
	//Importe total en pesetas
	@Column(name="BEC_IMPP")
	private int bec_impp;
	//Codigo de la modalidad de la beca (FK - OTG_MBECAS)
	@Column(name="BEC_MBE_CODIGO")
	@ManyToOne
	@JoinColumn(name="MBE_CODIGO")
	private Otg_mbecas otg_mbecas_becas_mbecas_fk1;
	//Identificador del becario (FK - OTG_PERSONAS)
	@Column(name="BEC_PER_IDA")
	private int bec_per_ida;
	//Identificador del tutor (FK - OTG_PERSONAS)
	@Column(name="BEC_PER_IDP")
	private int bec_per_idp;
	//Tipo de beca (PU : Publica, PR : Privada)
	@Column(name="BEC_TIPOBEC")
	private String bec_tipobec;
	//Codigo de la unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Column(name="BEC_UOR_CODIGO")
	private int bec_uor_codigo;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	//Estado (R: Renuncia; FI: Finalizada; null: Activa; NI: No Iniciada)
	@Column(name="BEC_ESTADO")
	private String bec_estado;
	@Column(name="BEC_FESTADO")
	private java.util.Date bec_festado;
	//Convocatoria de la beca (FK - OTG_CONVOCATORIAS)
	@Column(name="BEC_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_convocatorias otg_convocatorias_becas_convocatorias_fk3;
	//Codigo del proyecto asociado (si es publico) (FK - OTG_PROYECTOS)
	@Column(name="BEC_PRO_ASOC_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_becas_proyectos_fk4;
	//Codigo del contrato asociado (si es publico) (FK - OTG_CONTRATOS)
	@Column(name="BEC_CON_ASOC_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_becas_contratos_fk5;
	
	public Otg_becas() {
		super();
	}
		
	public Otg_becas(int bec_codigo, List<Otg_abecas> otg_abecass_abecas_becas_fk1, List<Otg_sbecas> otg_sbecass_sbecas_becas_fk1, List<Otg_obecas> otg_obecass_obecas_becas_fk1, List<Otg_ebecas> otg_ebecass_ebecas_becas_fk1, Otg_becas otg_becas_tbecas_becas_fk1, String bec_cg, Otg_solicitudes otg_solicitudes_becas_solicitudes_fk2, java.util.Date bec_fini, java.util.Date bec_ffin, int bec_impe, int bec_impp, Otg_mbecas otg_mbecas_becas_mbecas_fk1, int bec_per_ida, int bec_per_idp, String bec_tipobec, int bec_uor_codigo, int log, String bec_estado, java.util.Date bec_festado, Otg_convocatorias otg_convocatorias_becas_convocatorias_fk3, Otg_proyectos otg_proyectos_becas_proyectos_fk4, Otg_contratos otg_contratos_becas_contratos_fk5) {
		this.bec_codigo = bec_codigo;
		this.otg_abecass_abecas_becas_fk1 = otg_abecass_abecas_becas_fk1;
		this.otg_sbecass_sbecas_becas_fk1 = otg_sbecass_sbecas_becas_fk1;
		this.otg_obecass_obecas_becas_fk1 = otg_obecass_obecas_becas_fk1;
		this.otg_ebecass_ebecas_becas_fk1 = otg_ebecass_ebecas_becas_fk1;
		this.otg_becas_tbecas_becas_fk1 = otg_becas_tbecas_becas_fk1;
		this.bec_cg = bec_cg;
		this.otg_solicitudes_becas_solicitudes_fk2 = otg_solicitudes_becas_solicitudes_fk2;
		this.bec_fini = bec_fini;
		this.bec_ffin = bec_ffin;
		this.bec_impe = bec_impe;
		this.bec_impp = bec_impp;
		this.otg_mbecas_becas_mbecas_fk1 = otg_mbecas_becas_mbecas_fk1;
		this.bec_per_ida = bec_per_ida;
		this.bec_per_idp = bec_per_idp;
		this.bec_tipobec = bec_tipobec;
		this.bec_uor_codigo = bec_uor_codigo;
		this.log = log;
		this.bec_estado = bec_estado;
		this.bec_festado = bec_festado;
		this.otg_convocatorias_becas_convocatorias_fk3 = otg_convocatorias_becas_convocatorias_fk3;
		this.otg_proyectos_becas_proyectos_fk4 = otg_proyectos_becas_proyectos_fk4;
		this.otg_contratos_becas_contratos_fk5 = otg_contratos_becas_contratos_fk5;
	}
	
	public int getBec_codigo() {
		return this.bec_codigo;
	}
			
	public void setBec_codigo(int bec_codigo) {
		this.bec_codigo = bec_codigo;
	}
	public List<Otg_abecas> getOtg_abecass_abecas_becas_fk1() {
		return this.otg_abecass_abecas_becas_fk1;
	}
			
	public void setOtg_abecass_abecas_becas_fk1(List<Otg_abecas> otg_abecass_abecas_becas_fk1) {
		this.otg_abecass_abecas_becas_fk1 = otg_abecass_abecas_becas_fk1;
	}

	public List<Otg_sbecas> getOtg_sbecass_sbecas_becas_fk1() {
		return this.otg_sbecass_sbecas_becas_fk1;
	}
			
	public void setOtg_sbecass_sbecas_becas_fk1(List<Otg_sbecas> otg_sbecass_sbecas_becas_fk1) {
		this.otg_sbecass_sbecas_becas_fk1 = otg_sbecass_sbecas_becas_fk1;
	}

	public List<Otg_obecas> getOtg_obecass_obecas_becas_fk1() {
		return this.otg_obecass_obecas_becas_fk1;
	}
			
	public void setOtg_obecass_obecas_becas_fk1(List<Otg_obecas> otg_obecass_obecas_becas_fk1) {
		this.otg_obecass_obecas_becas_fk1 = otg_obecass_obecas_becas_fk1;
	}

	public List<Otg_ebecas> getOtg_ebecass_ebecas_becas_fk1() {
		return this.otg_ebecass_ebecas_becas_fk1;
	}
			
	public void setOtg_ebecass_ebecas_becas_fk1(List<Otg_ebecas> otg_ebecass_ebecas_becas_fk1) {
		this.otg_ebecass_ebecas_becas_fk1 = otg_ebecass_ebecas_becas_fk1;
	}

	public Otg_becas getOtg_becas_tbecas_becas_fk1() {
		return this.otg_becas_tbecas_becas_fk1;
	}
			
	public void setOtg_becas_tbecas_becas_fk1(Otg_becas otg_becas_tbecas_becas_fk1) {
		this.otg_becas_tbecas_becas_fk1 = otg_becas_tbecas_becas_fk1;
	}


	public String getBec_cg() {
		return this.bec_cg;
	}
			
	public void setBec_cg(String bec_cg) {
		this.bec_cg = bec_cg;
	}


	public Otg_solicitudes getOtg_solicitudes_becas_solicitudes_fk2() {
		return this.otg_solicitudes_becas_solicitudes_fk2;
	}
			
	public void setOtg_solicitudes_becas_solicitudes_fk2(Otg_solicitudes otg_solicitudes_becas_solicitudes_fk2) {
		this.otg_solicitudes_becas_solicitudes_fk2 = otg_solicitudes_becas_solicitudes_fk2;
	}


	public java.util.Date getBec_fini() {
		return this.bec_fini;
	}
			
	public void setBec_fini(java.util.Date bec_fini) {
		this.bec_fini = bec_fini;
	}


	public java.util.Date getBec_ffin() {
		return this.bec_ffin;
	}
			
	public void setBec_ffin(java.util.Date bec_ffin) {
		this.bec_ffin = bec_ffin;
	}


	public int getBec_impe() {
		return this.bec_impe;
	}
			
	public void setBec_impe(int bec_impe) {
		this.bec_impe = bec_impe;
	}


	public int getBec_impp() {
		return this.bec_impp;
	}
			
	public void setBec_impp(int bec_impp) {
		this.bec_impp = bec_impp;
	}


	public Otg_mbecas getOtg_mbecas_becas_mbecas_fk1() {
		return this.otg_mbecas_becas_mbecas_fk1;
	}
			
	public void setOtg_mbecas_becas_mbecas_fk1(Otg_mbecas otg_mbecas_becas_mbecas_fk1) {
		this.otg_mbecas_becas_mbecas_fk1 = otg_mbecas_becas_mbecas_fk1;
	}


	public int getBec_per_ida() {
		return this.bec_per_ida;
	}
			
	public void setBec_per_ida(int bec_per_ida) {
		this.bec_per_ida = bec_per_ida;
	}


	public int getBec_per_idp() {
		return this.bec_per_idp;
	}
			
	public void setBec_per_idp(int bec_per_idp) {
		this.bec_per_idp = bec_per_idp;
	}


	public String getBec_tipobec() {
		return this.bec_tipobec;
	}
			
	public void setBec_tipobec(String bec_tipobec) {
		this.bec_tipobec = bec_tipobec;
	}


	public int getBec_uor_codigo() {
		return this.bec_uor_codigo;
	}
			
	public void setBec_uor_codigo(int bec_uor_codigo) {
		this.bec_uor_codigo = bec_uor_codigo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getBec_estado() {
		return this.bec_estado;
	}
			
	public void setBec_estado(String bec_estado) {
		this.bec_estado = bec_estado;
	}


	public java.util.Date getBec_festado() {
		return this.bec_festado;
	}
			
	public void setBec_festado(java.util.Date bec_festado) {
		this.bec_festado = bec_festado;
	}


	public Otg_convocatorias getOtg_convocatorias_becas_convocatorias_fk3() {
		return this.otg_convocatorias_becas_convocatorias_fk3;
	}
			
	public void setOtg_convocatorias_becas_convocatorias_fk3(Otg_convocatorias otg_convocatorias_becas_convocatorias_fk3) {
		this.otg_convocatorias_becas_convocatorias_fk3 = otg_convocatorias_becas_convocatorias_fk3;
	}


	public Otg_proyectos getOtg_proyectos_becas_proyectos_fk4() {
		return this.otg_proyectos_becas_proyectos_fk4;
	}
			
	public void setOtg_proyectos_becas_proyectos_fk4(Otg_proyectos otg_proyectos_becas_proyectos_fk4) {
		this.otg_proyectos_becas_proyectos_fk4 = otg_proyectos_becas_proyectos_fk4;
	}


	public Otg_contratos getOtg_contratos_becas_contratos_fk5() {
		return this.otg_contratos_becas_contratos_fk5;
	}
			
	public void setOtg_contratos_becas_contratos_fk5(Otg_contratos otg_contratos_becas_contratos_fk5) {
		this.otg_contratos_becas_contratos_fk5 = otg_contratos_becas_contratos_fk5;
	}


}