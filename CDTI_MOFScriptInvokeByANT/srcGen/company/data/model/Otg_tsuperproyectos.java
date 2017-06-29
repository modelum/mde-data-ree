package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Macro-proyectos)
@Entity
@Table(schema="jpa")
public class Otg_tsuperproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del Macro-proyecto (FK - OTG_SUPERPROYECTOS)
	@Id
	@Column(name="TSU_SUP_CODIGO")
	private int tsu_sup_codigo;
	@OneToOne(mappedBy="otg_tsuperproyectos")
	@PrimaryKeyJoinColumn
	private Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TSU_TER_CODIGO")
	private int tsu_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tsuperproyectos_terceros_fk2;
	//Identificador de la personas de contacto (FK - OTG_PERSONAS)
	@Column(name="TSU_PER_ID")
	private int tsu_per_id;
	//Importe solicitado por el tercero
	@Column(name="TSU_IMPS")
	private int tsu_imps;
	//Codigo de moneda solicitado (FK OTG_MONEDAS)
	@Column(name="TSU_MON_CODIGOS")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_tsuperproy_monedas_fk3;
	//Importe solicitado en pesetas
	@Column(name="TSU_IMPSP")
	private int tsu_impsp;
	//Importe solicitado en euros
	@Column(name="TSU_IMPSE")
	private int tsu_impse;
	//Importe concedido al tercero
	@Column(name="TSU_IMPC")
	private int tsu_impc;
	//Codigo de moneda concedido (fk - OTG_MONEDAS)
	@Column(name="TSU_MON_CODIGOC")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_tsuperproy_monedas_fk4;
	//Importe concedido en pesetas
	@Column(name="TSU_IMPCP")
	private int tsu_impcp;
	//Importe concedido en euros
	@Column(name="TSU_IMPCE")
	private int tsu_impce;
	//Coordinador (S, N)
	@Column(name="TSU_COORDINADOR")
	private String tsu_coordinador;
	
	public Otg_tsuperproyectos() {
		super();
	}
		
	public Otg_tsuperproyectos(int tsu_sup_codigo, Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1, int tsu_ter_codigo, Otg_terceros otg_terceros_tsuperproyectos_terceros_fk2, int tsu_per_id, int tsu_imps, Otg_monedas otg_monedas_tsuperproy_monedas_fk3, int tsu_impsp, int tsu_impse, int tsu_impc, Otg_monedas otg_monedas_tsuperproy_monedas_fk4, int tsu_impcp, int tsu_impce, String tsu_coordinador) {
		this.tsu_sup_codigo = tsu_sup_codigo;
		this.otg_superproyectos_tsuperproy_superproy_fk1 = otg_superproyectos_tsuperproy_superproy_fk1;
		this.tsu_ter_codigo = tsu_ter_codigo;
		this.otg_terceros_tsuperproyectos_terceros_fk2 = otg_terceros_tsuperproyectos_terceros_fk2;
		this.tsu_per_id = tsu_per_id;
		this.tsu_imps = tsu_imps;
		this.otg_monedas_tsuperproy_monedas_fk3 = otg_monedas_tsuperproy_monedas_fk3;
		this.tsu_impsp = tsu_impsp;
		this.tsu_impse = tsu_impse;
		this.tsu_impc = tsu_impc;
		this.otg_monedas_tsuperproy_monedas_fk4 = otg_monedas_tsuperproy_monedas_fk4;
		this.tsu_impcp = tsu_impcp;
		this.tsu_impce = tsu_impce;
		this.tsu_coordinador = tsu_coordinador;
	}
	
	public int getTsu_sup_codigo() {
		return this.tsu_sup_codigo;
	}
			
	public void setTsu_sup_codigo(int tsu_sup_codigo) {
		this.tsu_sup_codigo = tsu_sup_codigo;
	}
	public Otg_superproyectos getOtg_superproyectos_tsuperproy_superproy_fk1() {
		return this.otg_superproyectos_tsuperproy_superproy_fk1;
	}
			
	public void setOtg_superproyectos_tsuperproy_superproy_fk1(Otg_superproyectos otg_superproyectos_tsuperproy_superproy_fk1) {
		this.otg_superproyectos_tsuperproy_superproy_fk1 = otg_superproyectos_tsuperproy_superproy_fk1;
	}


	public int getTsu_ter_codigo() {
		return this.tsu_ter_codigo;
	}
			
	public void setTsu_ter_codigo(int tsu_ter_codigo) {
		this.tsu_ter_codigo = tsu_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tsuperproyectos_terceros_fk2() {
		return this.otg_terceros_tsuperproyectos_terceros_fk2;
	}
			
	public void setOtg_terceros_tsuperproyectos_terceros_fk2(Otg_terceros otg_terceros_tsuperproyectos_terceros_fk2) {
		this.otg_terceros_tsuperproyectos_terceros_fk2 = otg_terceros_tsuperproyectos_terceros_fk2;
	}


	public int getTsu_per_id() {
		return this.tsu_per_id;
	}
			
	public void setTsu_per_id(int tsu_per_id) {
		this.tsu_per_id = tsu_per_id;
	}


	public int getTsu_imps() {
		return this.tsu_imps;
	}
			
	public void setTsu_imps(int tsu_imps) {
		this.tsu_imps = tsu_imps;
	}


	public Otg_monedas getOtg_monedas_tsuperproy_monedas_fk3() {
		return this.otg_monedas_tsuperproy_monedas_fk3;
	}
			
	public void setOtg_monedas_tsuperproy_monedas_fk3(Otg_monedas otg_monedas_tsuperproy_monedas_fk3) {
		this.otg_monedas_tsuperproy_monedas_fk3 = otg_monedas_tsuperproy_monedas_fk3;
	}


	public int getTsu_impsp() {
		return this.tsu_impsp;
	}
			
	public void setTsu_impsp(int tsu_impsp) {
		this.tsu_impsp = tsu_impsp;
	}


	public int getTsu_impse() {
		return this.tsu_impse;
	}
			
	public void setTsu_impse(int tsu_impse) {
		this.tsu_impse = tsu_impse;
	}


	public int getTsu_impc() {
		return this.tsu_impc;
	}
			
	public void setTsu_impc(int tsu_impc) {
		this.tsu_impc = tsu_impc;
	}


	public Otg_monedas getOtg_monedas_tsuperproy_monedas_fk4() {
		return this.otg_monedas_tsuperproy_monedas_fk4;
	}
			
	public void setOtg_monedas_tsuperproy_monedas_fk4(Otg_monedas otg_monedas_tsuperproy_monedas_fk4) {
		this.otg_monedas_tsuperproy_monedas_fk4 = otg_monedas_tsuperproy_monedas_fk4;
	}


	public int getTsu_impcp() {
		return this.tsu_impcp;
	}
			
	public void setTsu_impcp(int tsu_impcp) {
		this.tsu_impcp = tsu_impcp;
	}


	public int getTsu_impce() {
		return this.tsu_impce;
	}
			
	public void setTsu_impce(int tsu_impce) {
		this.tsu_impce = tsu_impce;
	}


	public String getTsu_coordinador() {
		return this.tsu_coordinador;
	}
			
	public void setTsu_coordinador(String tsu_coordinador) {
		this.tsu_coordinador = tsu_coordinador;
	}


}