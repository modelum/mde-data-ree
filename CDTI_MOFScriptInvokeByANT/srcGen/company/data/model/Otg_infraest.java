package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Infraestructuras
@Entity
@Table(schema="jpa")
public class Otg_infraest implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_INF_CODIGO)
	@Id
	@Column(name="INF_CODIGO")
	private int inf_codigo;
	@OneToMany(mappedBy="otg_infraest")
	private List<Otg_perinfraest> otg_perinfraests_perinfraest_infraest_fk1;
	@OneToMany(mappedBy="otg_infraest")
	private List<Otg_oinfraest> otg_oinfraests_oinfraest_infraest_fk1;
	@OneToMany(mappedBy="otg_infraest")
	private List<Otg_sinfraest> otg_sinfraests_sinfraest_infraest_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_infraest otg_infraest_tinfraest_infraest_fk1;
	//Centro de Gasto
	@Column(name="INF_CG")
	private String inf_cg;
	//Referencia
	@Column(name="INF_REFER")
	private String inf_refer;
	//Titulo
	@Column(name="INF_TITULO")
	private String inf_titulo;
	//Codigo de solicitud (FK - OTG_SOLICITUDES)
	@Column(name="INF_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_infraest_solicitudes_fk4;
	//Descripcion
	@Column(name="INF_DESCRIP")
	private String inf_descrip;
	//Estado (FA: Fallido)
	@Column(name="INF_ESTADO")
	private String inf_estado;
	//Importe total
	@Column(name="INF_IMPTOTAL")
	private int inf_imptotal;
	//Codigo de moneda (FK - OTG_MONEDAS)
	@Column(name="INF_MON_CODIGOT")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_infraest_monedas_fk1;
	//Importe total en pesetas
	@Column(name="INF_IMPTOTALP")
	private int inf_imptotalp;
	//Importe total en euros
	@Column(name="INF_IMPTOTALE")
	private int inf_imptotale;
	//Importe subvencion
	@Column(name="INF_IMPSUBV")
	private int inf_impsubv;
	//Codigo de moneda subvencion (FK - OTG_MONEDAS)
	@Column(name="INF_MON_CODIGOS")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_infraest_monedas_fk2;
	//Importe subvencion en pesetas
	@Column(name="INF_IMPSUBVP")
	private int inf_impsubvp;
	//Importe subvencion en euros
	@Column(name="INF_IMPSUBVE")
	private int inf_impsubve;
	//Importe U.M.H.
	@Column(name="INF_IMPUMH")
	private int inf_impumh;
	//Codigo de moneda U.M.H. (FK - OTG_MONEDAS)
	@Column(name="INF_MON_CODIGOU")
	@ManyToOne
	@JoinColumn(name="MON_CODIGO")
	private Otg_monedas otg_monedas_infraest_monedas_fk3;
	//Importe U.M.H. en pesetas
	@Column(name="INF_IMPUMHP")
	private int inf_impumhp;
	//Importe U.M.H. en euros
	@Column(name="INF_IMPUMHE")
	private int inf_impumhe;
	//Fecha de resolucion
	@Column(name="INF_FRES")
	private java.util.Date inf_fres;
	//Fecha de publicacion
	@Column(name="INF_FPUB")
	private java.util.Date inf_fpub;
	//Fecha inicio
	@Column(name="INF_FINI")
	private java.util.Date inf_fini;
	//Fecha fin
	@Column(name="INF_FFIN")
	private java.util.Date inf_ffin;
	//Codigo de la Unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Column(name="INF_UOR_CODIGO")
	private int inf_uor_codigo;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_infraest() {
		super();
	}
		
	public Otg_infraest(int inf_codigo, List<Otg_perinfraest> otg_perinfraests_perinfraest_infraest_fk1, List<Otg_oinfraest> otg_oinfraests_oinfraest_infraest_fk1, List<Otg_sinfraest> otg_sinfraests_sinfraest_infraest_fk1, Otg_infraest otg_infraest_tinfraest_infraest_fk1, String inf_cg, String inf_refer, String inf_titulo, Otg_solicitudes otg_solicitudes_infraest_solicitudes_fk4, String inf_descrip, String inf_estado, int inf_imptotal, Otg_monedas otg_monedas_infraest_monedas_fk1, int inf_imptotalp, int inf_imptotale, int inf_impsubv, Otg_monedas otg_monedas_infraest_monedas_fk2, int inf_impsubvp, int inf_impsubve, int inf_impumh, Otg_monedas otg_monedas_infraest_monedas_fk3, int inf_impumhp, int inf_impumhe, java.util.Date inf_fres, java.util.Date inf_fpub, java.util.Date inf_fini, java.util.Date inf_ffin, int inf_uor_codigo, int log) {
		this.inf_codigo = inf_codigo;
		this.otg_perinfraests_perinfraest_infraest_fk1 = otg_perinfraests_perinfraest_infraest_fk1;
		this.otg_oinfraests_oinfraest_infraest_fk1 = otg_oinfraests_oinfraest_infraest_fk1;
		this.otg_sinfraests_sinfraest_infraest_fk1 = otg_sinfraests_sinfraest_infraest_fk1;
		this.otg_infraest_tinfraest_infraest_fk1 = otg_infraest_tinfraest_infraest_fk1;
		this.inf_cg = inf_cg;
		this.inf_refer = inf_refer;
		this.inf_titulo = inf_titulo;
		this.otg_solicitudes_infraest_solicitudes_fk4 = otg_solicitudes_infraest_solicitudes_fk4;
		this.inf_descrip = inf_descrip;
		this.inf_estado = inf_estado;
		this.inf_imptotal = inf_imptotal;
		this.otg_monedas_infraest_monedas_fk1 = otg_monedas_infraest_monedas_fk1;
		this.inf_imptotalp = inf_imptotalp;
		this.inf_imptotale = inf_imptotale;
		this.inf_impsubv = inf_impsubv;
		this.otg_monedas_infraest_monedas_fk2 = otg_monedas_infraest_monedas_fk2;
		this.inf_impsubvp = inf_impsubvp;
		this.inf_impsubve = inf_impsubve;
		this.inf_impumh = inf_impumh;
		this.otg_monedas_infraest_monedas_fk3 = otg_monedas_infraest_monedas_fk3;
		this.inf_impumhp = inf_impumhp;
		this.inf_impumhe = inf_impumhe;
		this.inf_fres = inf_fres;
		this.inf_fpub = inf_fpub;
		this.inf_fini = inf_fini;
		this.inf_ffin = inf_ffin;
		this.inf_uor_codigo = inf_uor_codigo;
		this.log = log;
	}
	
	public int getInf_codigo() {
		return this.inf_codigo;
	}
			
	public void setInf_codigo(int inf_codigo) {
		this.inf_codigo = inf_codigo;
	}
	public List<Otg_perinfraest> getOtg_perinfraests_perinfraest_infraest_fk1() {
		return this.otg_perinfraests_perinfraest_infraest_fk1;
	}
			
	public void setOtg_perinfraests_perinfraest_infraest_fk1(List<Otg_perinfraest> otg_perinfraests_perinfraest_infraest_fk1) {
		this.otg_perinfraests_perinfraest_infraest_fk1 = otg_perinfraests_perinfraest_infraest_fk1;
	}

	public List<Otg_oinfraest> getOtg_oinfraests_oinfraest_infraest_fk1() {
		return this.otg_oinfraests_oinfraest_infraest_fk1;
	}
			
	public void setOtg_oinfraests_oinfraest_infraest_fk1(List<Otg_oinfraest> otg_oinfraests_oinfraest_infraest_fk1) {
		this.otg_oinfraests_oinfraest_infraest_fk1 = otg_oinfraests_oinfraest_infraest_fk1;
	}

	public List<Otg_sinfraest> getOtg_sinfraests_sinfraest_infraest_fk1() {
		return this.otg_sinfraests_sinfraest_infraest_fk1;
	}
			
	public void setOtg_sinfraests_sinfraest_infraest_fk1(List<Otg_sinfraest> otg_sinfraests_sinfraest_infraest_fk1) {
		this.otg_sinfraests_sinfraest_infraest_fk1 = otg_sinfraests_sinfraest_infraest_fk1;
	}

	public Otg_infraest getOtg_infraest_tinfraest_infraest_fk1() {
		return this.otg_infraest_tinfraest_infraest_fk1;
	}
			
	public void setOtg_infraest_tinfraest_infraest_fk1(Otg_infraest otg_infraest_tinfraest_infraest_fk1) {
		this.otg_infraest_tinfraest_infraest_fk1 = otg_infraest_tinfraest_infraest_fk1;
	}


	public String getInf_cg() {
		return this.inf_cg;
	}
			
	public void setInf_cg(String inf_cg) {
		this.inf_cg = inf_cg;
	}


	public String getInf_refer() {
		return this.inf_refer;
	}
			
	public void setInf_refer(String inf_refer) {
		this.inf_refer = inf_refer;
	}


	public String getInf_titulo() {
		return this.inf_titulo;
	}
			
	public void setInf_titulo(String inf_titulo) {
		this.inf_titulo = inf_titulo;
	}


	public Otg_solicitudes getOtg_solicitudes_infraest_solicitudes_fk4() {
		return this.otg_solicitudes_infraest_solicitudes_fk4;
	}
			
	public void setOtg_solicitudes_infraest_solicitudes_fk4(Otg_solicitudes otg_solicitudes_infraest_solicitudes_fk4) {
		this.otg_solicitudes_infraest_solicitudes_fk4 = otg_solicitudes_infraest_solicitudes_fk4;
	}


	public String getInf_descrip() {
		return this.inf_descrip;
	}
			
	public void setInf_descrip(String inf_descrip) {
		this.inf_descrip = inf_descrip;
	}


	public String getInf_estado() {
		return this.inf_estado;
	}
			
	public void setInf_estado(String inf_estado) {
		this.inf_estado = inf_estado;
	}


	public int getInf_imptotal() {
		return this.inf_imptotal;
	}
			
	public void setInf_imptotal(int inf_imptotal) {
		this.inf_imptotal = inf_imptotal;
	}


	public Otg_monedas getOtg_monedas_infraest_monedas_fk1() {
		return this.otg_monedas_infraest_monedas_fk1;
	}
			
	public void setOtg_monedas_infraest_monedas_fk1(Otg_monedas otg_monedas_infraest_monedas_fk1) {
		this.otg_monedas_infraest_monedas_fk1 = otg_monedas_infraest_monedas_fk1;
	}


	public int getInf_imptotalp() {
		return this.inf_imptotalp;
	}
			
	public void setInf_imptotalp(int inf_imptotalp) {
		this.inf_imptotalp = inf_imptotalp;
	}


	public int getInf_imptotale() {
		return this.inf_imptotale;
	}
			
	public void setInf_imptotale(int inf_imptotale) {
		this.inf_imptotale = inf_imptotale;
	}


	public int getInf_impsubv() {
		return this.inf_impsubv;
	}
			
	public void setInf_impsubv(int inf_impsubv) {
		this.inf_impsubv = inf_impsubv;
	}


	public Otg_monedas getOtg_monedas_infraest_monedas_fk2() {
		return this.otg_monedas_infraest_monedas_fk2;
	}
			
	public void setOtg_monedas_infraest_monedas_fk2(Otg_monedas otg_monedas_infraest_monedas_fk2) {
		this.otg_monedas_infraest_monedas_fk2 = otg_monedas_infraest_monedas_fk2;
	}


	public int getInf_impsubvp() {
		return this.inf_impsubvp;
	}
			
	public void setInf_impsubvp(int inf_impsubvp) {
		this.inf_impsubvp = inf_impsubvp;
	}


	public int getInf_impsubve() {
		return this.inf_impsubve;
	}
			
	public void setInf_impsubve(int inf_impsubve) {
		this.inf_impsubve = inf_impsubve;
	}


	public int getInf_impumh() {
		return this.inf_impumh;
	}
			
	public void setInf_impumh(int inf_impumh) {
		this.inf_impumh = inf_impumh;
	}


	public Otg_monedas getOtg_monedas_infraest_monedas_fk3() {
		return this.otg_monedas_infraest_monedas_fk3;
	}
			
	public void setOtg_monedas_infraest_monedas_fk3(Otg_monedas otg_monedas_infraest_monedas_fk3) {
		this.otg_monedas_infraest_monedas_fk3 = otg_monedas_infraest_monedas_fk3;
	}


	public int getInf_impumhp() {
		return this.inf_impumhp;
	}
			
	public void setInf_impumhp(int inf_impumhp) {
		this.inf_impumhp = inf_impumhp;
	}


	public int getInf_impumhe() {
		return this.inf_impumhe;
	}
			
	public void setInf_impumhe(int inf_impumhe) {
		this.inf_impumhe = inf_impumhe;
	}


	public java.util.Date getInf_fres() {
		return this.inf_fres;
	}
			
	public void setInf_fres(java.util.Date inf_fres) {
		this.inf_fres = inf_fres;
	}


	public java.util.Date getInf_fpub() {
		return this.inf_fpub;
	}
			
	public void setInf_fpub(java.util.Date inf_fpub) {
		this.inf_fpub = inf_fpub;
	}


	public java.util.Date getInf_fini() {
		return this.inf_fini;
	}
			
	public void setInf_fini(java.util.Date inf_fini) {
		this.inf_fini = inf_fini;
	}


	public java.util.Date getInf_ffin() {
		return this.inf_ffin;
	}
			
	public void setInf_ffin(java.util.Date inf_ffin) {
		this.inf_ffin = inf_ffin;
	}


	public int getInf_uor_codigo() {
		return this.inf_uor_codigo;
	}
			
	public void setInf_uor_codigo(int inf_uor_codigo) {
		this.inf_uor_codigo = inf_uor_codigo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}