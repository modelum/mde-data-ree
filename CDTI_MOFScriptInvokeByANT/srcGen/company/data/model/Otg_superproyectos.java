package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Macro-proyectos (Nacionales - Europeos)
@Entity
@Table(schema="jpa")
public class Otg_superproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SUP_CODIGO)
	@Id
	@Column(name="SUP_CODIGO")
	private int sup_codigo;
	@OneToMany(mappedBy="otg_superproyectos")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_superproyecto_fk5;
	@OneToMany(mappedBy="otg_superproyectos")
	private List<Otg_seuropeos> otg_seuropeoss_seuropeos_superproyec_fk5;
	@OneToMany(mappedBy="otg_superproyectos")
	private List<Otg_peuropeos> otg_peuropeoss_peuropeos_superproyectos_fk2;
	@OneToMany(mappedBy="otg_superproyectos")
	private List<Otg_proyectos> otg_proyectoss_proyectos_superproyectos_fk3;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1;
	//Titulo
	@Column(name="SUP_TITULO")
	private String sup_titulo;
	//Descripcion
	@Column(name="SUP_DESCRIPCION")
	private String sup_descripcion;
	//Identificador del Investigador Responsable (FK - OTG_PERSONAS)
	@Column(name="SUP_PER_ID")
	private int sup_per_id;
	//Importe total solicitado
	@Column(name="SUP_IMPS")
	private int sup_imps;
	//Importe total concedido
	@Column(name="SUP_IMPC")
	private int sup_impc;
	//Codigo de moneda solicitado (FK - OTG_MONEDAS)
	@Column(name="SUP_MON_CODIGOS")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_superproyectos_monedas_fk1;
	//Codigo de moneda concedido (FK - OTG_MONEDAS)
	@Column(name="SUP_MON_CODIGOC")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_superproyectos_monedas_fk2;
	//Importe solicitado en pesetas
	@Column(name="SUP_IMPSP")
	private int sup_impsp;
	//Importe solicitado en euros
	@Column(name="SUP_IMPSE")
	private int sup_impse;
	//Importe concedido en pesetas
	@Column(name="SUP_IMPCP")
	private int sup_impcp;
	//Importe concedido en euros
	@Column(name="SUP_IMPCE")
	private int sup_impce;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_superproyectos() {
		super();
	}
		
	public Otg_superproyectos(int sup_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudes_superproyecto_fk5, List<Otg_seuropeos> otg_seuropeoss_seuropeos_superproyec_fk5, List<Otg_peuropeos> otg_peuropeoss_peuropeos_superproyectos_fk2, List<Otg_proyectos> otg_proyectoss_proyectos_superproyectos_fk3, Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1, String sup_titulo, String sup_descripcion, int sup_per_id, int sup_imps, int sup_impc, Otg_monedas otg_monedas_superproyectos_monedas_fk1, Otg_monedas otg_monedas_superproyectos_monedas_fk2, int sup_impsp, int sup_impse, int sup_impcp, int sup_impce, int log) {
		this.sup_codigo = sup_codigo;
		this.otg_solicitudess_solicitudes_superproyecto_fk5 = otg_solicitudess_solicitudes_superproyecto_fk5;
		this.otg_seuropeoss_seuropeos_superproyec_fk5 = otg_seuropeoss_seuropeos_superproyec_fk5;
		this.otg_peuropeoss_peuropeos_superproyectos_fk2 = otg_peuropeoss_peuropeos_superproyectos_fk2;
		this.otg_proyectoss_proyectos_superproyectos_fk3 = otg_proyectoss_proyectos_superproyectos_fk3;
		this.otg_superproyectos_tsuperproy_superproy_fk1 = otg_superproyectos_tsuperproy_superproy_fk1;
		this.sup_titulo = sup_titulo;
		this.sup_descripcion = sup_descripcion;
		this.sup_per_id = sup_per_id;
		this.sup_imps = sup_imps;
		this.sup_impc = sup_impc;
		this.otg_monedas_superproyectos_monedas_fk1 = otg_monedas_superproyectos_monedas_fk1;
		this.otg_monedas_superproyectos_monedas_fk2 = otg_monedas_superproyectos_monedas_fk2;
		this.sup_impsp = sup_impsp;
		this.sup_impse = sup_impse;
		this.sup_impcp = sup_impcp;
		this.sup_impce = sup_impce;
		this.log = log;
	}
	
	public int getSup_codigo() {
		return this.sup_codigo;
	}
			
	public void setSup_codigo(int sup_codigo) {
		this.sup_codigo = sup_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_superproyecto_fk5() {
		return this.otg_solicitudess_solicitudes_superproyecto_fk5;
	}
			
	public void setOtg_solicitudess_solicitudes_superproyecto_fk5(List<Otg_solicitudes> otg_solicitudess_solicitudes_superproyecto_fk5) {
		this.otg_solicitudess_solicitudes_superproyecto_fk5 = otg_solicitudess_solicitudes_superproyecto_fk5;
	}

	public List<Otg_seuropeos> getOtg_seuropeoss_seuropeos_superproyec_fk5() {
		return this.otg_seuropeoss_seuropeos_superproyec_fk5;
	}
			
	public void setOtg_seuropeoss_seuropeos_superproyec_fk5(List<Otg_seuropeos> otg_seuropeoss_seuropeos_superproyec_fk5) {
		this.otg_seuropeoss_seuropeos_superproyec_fk5 = otg_seuropeoss_seuropeos_superproyec_fk5;
	}

	public List<Otg_peuropeos> getOtg_peuropeoss_peuropeos_superproyectos_fk2() {
		return this.otg_peuropeoss_peuropeos_superproyectos_fk2;
	}
			
	public void setOtg_peuropeoss_peuropeos_superproyectos_fk2(List<Otg_peuropeos> otg_peuropeoss_peuropeos_superproyectos_fk2) {
		this.otg_peuropeoss_peuropeos_superproyectos_fk2 = otg_peuropeoss_peuropeos_superproyectos_fk2;
	}

	public List<Otg_proyectos> getOtg_proyectoss_proyectos_superproyectos_fk3() {
		return this.otg_proyectoss_proyectos_superproyectos_fk3;
	}
			
	public void setOtg_proyectoss_proyectos_superproyectos_fk3(List<Otg_proyectos> otg_proyectoss_proyectos_superproyectos_fk3) {
		this.otg_proyectoss_proyectos_superproyectos_fk3 = otg_proyectoss_proyectos_superproyectos_fk3;
	}

	public Otg_superproyectos getOtg_superproyectos_tsuperproy_superproy_fk1() {
		return this.otg_superproyectos_tsuperproy_superproy_fk1;
	}
			
	public void setOtg_superproyectos_tsuperproy_superproy_fk1(Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1) {
		this.otg_superproyectos_tsuperproy_superproy_fk1 = otg_superproyectos_tsuperproy_superproy_fk1;
	}


	public String getSup_titulo() {
		return this.sup_titulo;
	}
			
	public void setSup_titulo(String sup_titulo) {
		this.sup_titulo = sup_titulo;
	}


	public String getSup_descripcion() {
		return this.sup_descripcion;
	}
			
	public void setSup_descripcion(String sup_descripcion) {
		this.sup_descripcion = sup_descripcion;
	}


	public int getSup_per_id() {
		return this.sup_per_id;
	}
			
	public void setSup_per_id(int sup_per_id) {
		this.sup_per_id = sup_per_id;
	}


	public int getSup_imps() {
		return this.sup_imps;
	}
			
	public void setSup_imps(int sup_imps) {
		this.sup_imps = sup_imps;
	}


	public int getSup_impc() {
		return this.sup_impc;
	}
			
	public void setSup_impc(int sup_impc) {
		this.sup_impc = sup_impc;
	}


	public Otg_monedas getOtg_monedas_superproyectos_monedas_fk1() {
		return this.otg_monedas_superproyectos_monedas_fk1;
	}
			
	public void setOtg_monedas_superproyectos_monedas_fk1(Otg_monedas otg_monedas_superproyectos_monedas_fk1) {
		this.otg_monedas_superproyectos_monedas_fk1 = otg_monedas_superproyectos_monedas_fk1;
	}


	public Otg_monedas getOtg_monedas_superproyectos_monedas_fk2() {
		return this.otg_monedas_superproyectos_monedas_fk2;
	}
			
	public void setOtg_monedas_superproyectos_monedas_fk2(Otg_monedas otg_monedas_superproyectos_monedas_fk2) {
		this.otg_monedas_superproyectos_monedas_fk2 = otg_monedas_superproyectos_monedas_fk2;
	}


	public int getSup_impsp() {
		return this.sup_impsp;
	}
			
	public void setSup_impsp(int sup_impsp) {
		this.sup_impsp = sup_impsp;
	}


	public int getSup_impse() {
		return this.sup_impse;
	}
			
	public void setSup_impse(int sup_impse) {
		this.sup_impse = sup_impse;
	}


	public int getSup_impcp() {
		return this.sup_impcp;
	}
			
	public void setSup_impcp(int sup_impcp) {
		this.sup_impcp = sup_impcp;
	}


	public int getSup_impce() {
		return this.sup_impce;
	}
			
	public void setSup_impce(int sup_impce) {
		this.sup_impce = sup_impce;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}