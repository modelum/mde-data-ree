package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_peuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_PEU_CODIGO)
	@Id
	@Column(name="PEU_CODIGO")
	private int peu_codigo;
	@OneToMany(mappedBy="otg_peuropeos")
	private List<Otg_speuropeos> otg_speuropeoss_speuropeos_peuropeos_fk1;
	@OneToMany(mappedBy="otg_peuropeos")
	private List<Otg_perpeuropeos> otg_perpeuropeoss_perpeuropeos_peuropeos_fk1;
	@OneToMany(mappedBy="otg_peuropeos")
	private List<Otg_opeuropeos> otg_opeuropeoss_opeuropeos_peuropeos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_jpeuropeos_peuropeos_fk1;
	//Centro de gasto
	@Column(name="PEU_CG")
	private String peu_cg;
	//Referencia
	@Column(name="PEU_REFER")
	private String peu_refer;
	//Codigo de la solicitud del proyecto (FK - OTG_SEUROPEOS)
	@Column(name="PEU_SEU_CODIGO")
	@ManyToOne
	@JoinColumn(name="SEU_CODIGO")
	private Otg_seuropeos otg_seuropeos_peuropeos_seuropeos_fk1;
	//Tipo programa (M: Programa Marco, E: Programa Europeo)
	@Column(name="PEU_TIPO")
	private String peu_tipo;
	//Titulo
	@Column(name="PEU_TITULO")
	private String peu_titulo;
	//Acronimo
	@Column(name="PEU_ACRONIMO")
	private String peu_acronimo;
	//Importe concedido en euros
	@Column(name="PEU_IMPE")
	private int peu_impe;
	//Fecha de inicio
	@Column(name="PEU_FINI")
	private java.util.Date peu_fini;
	//Fecha de firma
	@Column(name="PEU_FFIRMA")
	private java.util.Date peu_ffirma;
	//Duracion en meses
	@Column(name="PEU_DURACION")
	private int peu_duracion;
	//Coordinado por la U.M.H. (S, N)
	@Column(name="PEU_COORDINADO")
	private String peu_coordinado;
	//Codigo del superproyecto (FK - OTG_SUPERPROYECTOS)
	@Column(name="PEU_SUP_CODIGO")
	@ManyToOne
	@JoinColumn(name="SUP_CODIGO")
	private Otg_superproyectos otg_superproyectos_peuropeos_superproyectos_fk2;
	//Codigo del area productiva (FK - OTG_APRODUCTIVAS)
	@Column(name="PEU_APR_CODIGO")
	@ManyToOne
	@JoinColumn(name="APR_CODIGO")
	private Otg_aproductivas otg_aproductivas_peuropeos_aproductivas_fk3;
	//Obsoleto
	@Column(name="PEU_UOR_CODIGO")
	private int peu_uor_codigo;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//Codigo del tipo de accion (FK - OTG_ACCIONES)
	@Column(name="PEU_ACC_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACC_CODIGO")
	private Otg_acciones otg_acciones_peuropeos_acciones_fk4;
	//Codigo del sistema de costes (FK - OTG_SCOSTES)
	@Column(name="PEU_SCO_CODIGO")
	@ManyToOne
	@JoinColumn(name="SCO_CODIGO")
	private Otg_scostes otg_scostes_peuropeos_scostes_fk5;
	//Estado del proyecto (A : Aprobado, N : Negociando, F: Fallido, R: Renuncia)
	@Column(name="PEU_ESTADO")
	private String peu_estado;
	
	public Otg_peuropeos() {
		super();
	}
		
	public Otg_peuropeos(int peu_codigo, List<Otg_speuropeos> otg_speuropeoss_speuropeos_peuropeos_fk1, List<Otg_perpeuropeos> otg_perpeuropeoss_perpeuropeos_peuropeos_fk1, List<Otg_opeuropeos> otg_opeuropeoss_opeuropeos_peuropeos_fk1, Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1, Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1, Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1, Otg_peuropeos otg_peuropeos_jpeuropeos_peuropeos_fk1, String peu_cg, String peu_refer, Otg_seuropeos otg_seuropeos_peuropeos_seuropeos_fk1, String peu_tipo, String peu_titulo, String peu_acronimo, int peu_impe, java.util.Date peu_fini, java.util.Date peu_ffirma, int peu_duracion, String peu_coordinado, Otg_superproyectos otg_superproyectos_peuropeos_superproyectos_fk2, Otg_aproductivas otg_aproductivas_peuropeos_aproductivas_fk3, int peu_uor_codigo, int log, Otg_acciones otg_acciones_peuropeos_acciones_fk4, Otg_scostes otg_scostes_peuropeos_scostes_fk5, String peu_estado) {
		this.peu_codigo = peu_codigo;
		this.otg_speuropeoss_speuropeos_peuropeos_fk1 = otg_speuropeoss_speuropeos_peuropeos_fk1;
		this.otg_perpeuropeoss_perpeuropeos_peuropeos_fk1 = otg_perpeuropeoss_perpeuropeos_peuropeos_fk1;
		this.otg_opeuropeoss_opeuropeos_peuropeos_fk1 = otg_opeuropeoss_opeuropeos_peuropeos_fk1;
		this.otg_peuropeos_diseuropeos_peuropeos_fk1 = otg_peuropeos_diseuropeos_peuropeos_fk1;
		this.otg_peuropeos_useuropeos_peuropeos_fk1 = otg_peuropeos_useuropeos_peuropeos_fk1;
		this.otg_peuropeos_ppeuropeos_peuropeos_fk1 = otg_peuropeos_ppeuropeos_peuropeos_fk1;
		this.otg_peuropeos_jpeuropeos_peuropeos_fk1 = otg_peuropeos_jpeuropeos_peuropeos_fk1;
		this.peu_cg = peu_cg;
		this.peu_refer = peu_refer;
		this.otg_seuropeos_peuropeos_seuropeos_fk1 = otg_seuropeos_peuropeos_seuropeos_fk1;
		this.peu_tipo = peu_tipo;
		this.peu_titulo = peu_titulo;
		this.peu_acronimo = peu_acronimo;
		this.peu_impe = peu_impe;
		this.peu_fini = peu_fini;
		this.peu_ffirma = peu_ffirma;
		this.peu_duracion = peu_duracion;
		this.peu_coordinado = peu_coordinado;
		this.otg_superproyectos_peuropeos_superproyectos_fk2 = otg_superproyectos_peuropeos_superproyectos_fk2;
		this.otg_aproductivas_peuropeos_aproductivas_fk3 = otg_aproductivas_peuropeos_aproductivas_fk3;
		this.peu_uor_codigo = peu_uor_codigo;
		this.log = log;
		this.otg_acciones_peuropeos_acciones_fk4 = otg_acciones_peuropeos_acciones_fk4;
		this.otg_scostes_peuropeos_scostes_fk5 = otg_scostes_peuropeos_scostes_fk5;
		this.peu_estado = peu_estado;
	}
	
	public int getPeu_codigo() {
		return this.peu_codigo;
	}
			
	public void setPeu_codigo(int peu_codigo) {
		this.peu_codigo = peu_codigo;
	}
	public List<Otg_speuropeos> getOtg_speuropeoss_speuropeos_peuropeos_fk1() {
		return this.otg_speuropeoss_speuropeos_peuropeos_fk1;
	}
			
	public void setOtg_speuropeoss_speuropeos_peuropeos_fk1(List<Otg_speuropeos> otg_speuropeoss_speuropeos_peuropeos_fk1) {
		this.otg_speuropeoss_speuropeos_peuropeos_fk1 = otg_speuropeoss_speuropeos_peuropeos_fk1;
	}

	public List<Otg_perpeuropeos> getOtg_perpeuropeoss_perpeuropeos_peuropeos_fk1() {
		return this.otg_perpeuropeoss_perpeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_perpeuropeoss_perpeuropeos_peuropeos_fk1(List<Otg_perpeuropeos> otg_perpeuropeoss_perpeuropeos_peuropeos_fk1) {
		this.otg_perpeuropeoss_perpeuropeos_peuropeos_fk1 = otg_perpeuropeoss_perpeuropeos_peuropeos_fk1;
	}

	public List<Otg_opeuropeos> getOtg_opeuropeoss_opeuropeos_peuropeos_fk1() {
		return this.otg_opeuropeoss_opeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_opeuropeoss_opeuropeos_peuropeos_fk1(List<Otg_opeuropeos> otg_opeuropeoss_opeuropeos_peuropeos_fk1) {
		this.otg_opeuropeoss_opeuropeos_peuropeos_fk1 = otg_opeuropeoss_opeuropeos_peuropeos_fk1;
	}

	public Otg_peuropeos getOtg_peuropeos_diseuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_diseuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_diseuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_diseuropeos_peuropeos_fk1) {
		this.otg_peuropeos_diseuropeos_peuropeos_fk1 = otg_peuropeos_diseuropeos_peuropeos_fk1;
	}

	public Otg_peuropeos getOtg_peuropeos_useuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_useuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_useuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1) {
		this.otg_peuropeos_useuropeos_peuropeos_fk1 = otg_peuropeos_useuropeos_peuropeos_fk1;
	}

	public Otg_peuropeos getOtg_peuropeos_ppeuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_ppeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_ppeuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_ppeuropeos_peuropeos_fk1) {
		this.otg_peuropeos_ppeuropeos_peuropeos_fk1 = otg_peuropeos_ppeuropeos_peuropeos_fk1;
	}

	public Otg_peuropeos getOtg_peuropeos_jpeuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_jpeuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_jpeuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_jpeuropeos_peuropeos_fk1) {
		this.otg_peuropeos_jpeuropeos_peuropeos_fk1 = otg_peuropeos_jpeuropeos_peuropeos_fk1;
	}


	public String getPeu_cg() {
		return this.peu_cg;
	}
			
	public void setPeu_cg(String peu_cg) {
		this.peu_cg = peu_cg;
	}


	public String getPeu_refer() {
		return this.peu_refer;
	}
			
	public void setPeu_refer(String peu_refer) {
		this.peu_refer = peu_refer;
	}


	public Otg_seuropeos getOtg_seuropeos_peuropeos_seuropeos_fk1() {
		return this.otg_seuropeos_peuropeos_seuropeos_fk1;
	}
			
	public void setOtg_seuropeos_peuropeos_seuropeos_fk1(Otg_seuropeos otg_seuropeos_peuropeos_seuropeos_fk1) {
		this.otg_seuropeos_peuropeos_seuropeos_fk1 = otg_seuropeos_peuropeos_seuropeos_fk1;
	}


	public String getPeu_tipo() {
		return this.peu_tipo;
	}
			
	public void setPeu_tipo(String peu_tipo) {
		this.peu_tipo = peu_tipo;
	}


	public String getPeu_titulo() {
		return this.peu_titulo;
	}
			
	public void setPeu_titulo(String peu_titulo) {
		this.peu_titulo = peu_titulo;
	}


	public String getPeu_acronimo() {
		return this.peu_acronimo;
	}
			
	public void setPeu_acronimo(String peu_acronimo) {
		this.peu_acronimo = peu_acronimo;
	}


	public int getPeu_impe() {
		return this.peu_impe;
	}
			
	public void setPeu_impe(int peu_impe) {
		this.peu_impe = peu_impe;
	}


	public java.util.Date getPeu_fini() {
		return this.peu_fini;
	}
			
	public void setPeu_fini(java.util.Date peu_fini) {
		this.peu_fini = peu_fini;
	}


	public java.util.Date getPeu_ffirma() {
		return this.peu_ffirma;
	}
			
	public void setPeu_ffirma(java.util.Date peu_ffirma) {
		this.peu_ffirma = peu_ffirma;
	}


	public int getPeu_duracion() {
		return this.peu_duracion;
	}
			
	public void setPeu_duracion(int peu_duracion) {
		this.peu_duracion = peu_duracion;
	}


	public String getPeu_coordinado() {
		return this.peu_coordinado;
	}
			
	public void setPeu_coordinado(String peu_coordinado) {
		this.peu_coordinado = peu_coordinado;
	}


	public Otg_superproyectos getOtg_superproyectos_peuropeos_superproyectos_fk2() {
		return this.otg_superproyectos_peuropeos_superproyectos_fk2;
	}
			
	public void setOtg_superproyectos_peuropeos_superproyectos_fk2(Otg_superproyectos otg_superproyectos_peuropeos_superproyectos_fk2) {
		this.otg_superproyectos_peuropeos_superproyectos_fk2 = otg_superproyectos_peuropeos_superproyectos_fk2;
	}


	public Otg_aproductivas getOtg_aproductivas_peuropeos_aproductivas_fk3() {
		return this.otg_aproductivas_peuropeos_aproductivas_fk3;
	}
			
	public void setOtg_aproductivas_peuropeos_aproductivas_fk3(Otg_aproductivas otg_aproductivas_peuropeos_aproductivas_fk3) {
		this.otg_aproductivas_peuropeos_aproductivas_fk3 = otg_aproductivas_peuropeos_aproductivas_fk3;
	}


	public int getPeu_uor_codigo() {
		return this.peu_uor_codigo;
	}
			
	public void setPeu_uor_codigo(int peu_uor_codigo) {
		this.peu_uor_codigo = peu_uor_codigo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public Otg_acciones getOtg_acciones_peuropeos_acciones_fk4() {
		return this.otg_acciones_peuropeos_acciones_fk4;
	}
			
	public void setOtg_acciones_peuropeos_acciones_fk4(Otg_acciones otg_acciones_peuropeos_acciones_fk4) {
		this.otg_acciones_peuropeos_acciones_fk4 = otg_acciones_peuropeos_acciones_fk4;
	}


	public Otg_scostes getOtg_scostes_peuropeos_scostes_fk5() {
		return this.otg_scostes_peuropeos_scostes_fk5;
	}
			
	public void setOtg_scostes_peuropeos_scostes_fk5(Otg_scostes otg_scostes_peuropeos_scostes_fk5) {
		this.otg_scostes_peuropeos_scostes_fk5 = otg_scostes_peuropeos_scostes_fk5;
	}


	public String getPeu_estado() {
		return this.peu_estado;
	}
			
	public void setPeu_estado(String peu_estado) {
		this.peu_estado = peu_estado;
	}


}