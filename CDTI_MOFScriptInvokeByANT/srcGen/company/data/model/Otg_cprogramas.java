package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Convocatorias de Programas Europeos
@Entity
@Table(schema="jpa")
public class Otg_cprogramas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_CPE_CODIGO)
	@Id
	@Column(name="CPR_CODIGO")
	private int cpr_codigo;
	@OneToMany(mappedBy="otg_cprogramas")
	private List<Otg_seuropeos> otg_seuropeoss_seuropeos_cprogramas_fk1;
	@OneToMany(mappedBy="otg_cprogramas")
	private List<Otg_acciones_fcprogramas> otg_acciones_fcprogramass_accfcp_cprogramas_fk1;
	@OneToMany(mappedBy="otg_cprogramas")
	private List<Otg_fcprogramas> otg_fcprogramass_fcprogramas_cprogramas_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1;
	//Codigo del programa europeo (FK - OTG_PROGRAMAS)
	@Column(name="CPR_PRO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_programas otg_programas_cprogramas_programas_fk1;
	//Texto de difusion
	@Column(name="CPR_TDIFUSION")
	private String cpr_tdifusion;
	//Direccion de Internet (URL)
	@Column(name="CPR_LINK")
	private String cpr_link;
	//Fecha de publicacion
	@Column(name="CPR_FPUB")
	private java.util.Date cpr_fpub;
	//Fecha de cierre
	@Column(name="CPR_FCIERRE")
	private java.util.Date cpr_fcierre;
	//D.O.C.E.
	@Column(name="CPR_DOCE")
	private String cpr_doce;
	//Codigo identificador
	@Column(name="CPR_CODIGOOTRI")
	private String cpr_codigootri;
	//Codigo del programa especifico (FK - OTG_PESPECIFICOS)
	@Column(name="CPR_PES_CODIGO")
	@ManyToOne
	@JoinColumn(name="PES_CODIGO")
	private Otg_pespecificos otg_pespecificos_cprogramas_pespecificos_fk1;
	//Tipo de Convocatoria (A : Abierta, C : Cerrada)
	@Column(name="CPR_TIPO")
	private String cpr_tipo;
	
	public Otg_cprogramas() {
		super();
	}
		
	public Otg_cprogramas(int cpr_codigo, List<Otg_seuropeos> otg_seuropeoss_seuropeos_cprogramas_fk1, List<Otg_acciones_fcprogramas> otg_acciones_fcprogramass_accfcp_cprogramas_fk1, List<Otg_fcprogramas> otg_fcprogramass_fcprogramas_cprogramas_fk1, Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1, Otg_programas otg_programas_cprogramas_programas_fk1, String cpr_tdifusion, String cpr_link, java.util.Date cpr_fpub, java.util.Date cpr_fcierre, String cpr_doce, String cpr_codigootri, Otg_pespecificos otg_pespecificos_cprogramas_pespecificos_fk1, String cpr_tipo) {
		this.cpr_codigo = cpr_codigo;
		this.otg_seuropeoss_seuropeos_cprogramas_fk1 = otg_seuropeoss_seuropeos_cprogramas_fk1;
		this.otg_acciones_fcprogramass_accfcp_cprogramas_fk1 = otg_acciones_fcprogramass_accfcp_cprogramas_fk1;
		this.otg_fcprogramass_fcprogramas_cprogramas_fk1 = otg_fcprogramass_fcprogramas_cprogramas_fk1;
		this.otg_cprogramas_tcprogramas_cprogramas_fk1 = otg_cprogramas_tcprogramas_cprogramas_fk1;
		this.otg_programas_cprogramas_programas_fk1 = otg_programas_cprogramas_programas_fk1;
		this.cpr_tdifusion = cpr_tdifusion;
		this.cpr_link = cpr_link;
		this.cpr_fpub = cpr_fpub;
		this.cpr_fcierre = cpr_fcierre;
		this.cpr_doce = cpr_doce;
		this.cpr_codigootri = cpr_codigootri;
		this.otg_pespecificos_cprogramas_pespecificos_fk1 = otg_pespecificos_cprogramas_pespecificos_fk1;
		this.cpr_tipo = cpr_tipo;
	}
	
	public int getCpr_codigo() {
		return this.cpr_codigo;
	}
			
	public void setCpr_codigo(int cpr_codigo) {
		this.cpr_codigo = cpr_codigo;
	}
	public List<Otg_seuropeos> getOtg_seuropeoss_seuropeos_cprogramas_fk1() {
		return this.otg_seuropeoss_seuropeos_cprogramas_fk1;
	}
			
	public void setOtg_seuropeoss_seuropeos_cprogramas_fk1(List<Otg_seuropeos> otg_seuropeoss_seuropeos_cprogramas_fk1) {
		this.otg_seuropeoss_seuropeos_cprogramas_fk1 = otg_seuropeoss_seuropeos_cprogramas_fk1;
	}

	public List<Otg_acciones_fcprogramas> getOtg_acciones_fcprogramass_accfcp_cprogramas_fk1() {
		return this.otg_acciones_fcprogramass_accfcp_cprogramas_fk1;
	}
			
	public void setOtg_acciones_fcprogramass_accfcp_cprogramas_fk1(List<Otg_acciones_fcprogramas> otg_acciones_fcprogramass_accfcp_cprogramas_fk1) {
		this.otg_acciones_fcprogramass_accfcp_cprogramas_fk1 = otg_acciones_fcprogramass_accfcp_cprogramas_fk1;
	}

	public List<Otg_fcprogramas> getOtg_fcprogramass_fcprogramas_cprogramas_fk1() {
		return this.otg_fcprogramass_fcprogramas_cprogramas_fk1;
	}
			
	public void setOtg_fcprogramass_fcprogramas_cprogramas_fk1(List<Otg_fcprogramas> otg_fcprogramass_fcprogramas_cprogramas_fk1) {
		this.otg_fcprogramass_fcprogramas_cprogramas_fk1 = otg_fcprogramass_fcprogramas_cprogramas_fk1;
	}

	public Otg_cprogramas getOtg_cprogramas_tcprogramas_cprogramas_fk1() {
		return this.otg_cprogramas_tcprogramas_cprogramas_fk1;
	}
			
	public void setOtg_cprogramas_tcprogramas_cprogramas_fk1(Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1) {
		this.otg_cprogramas_tcprogramas_cprogramas_fk1 = otg_cprogramas_tcprogramas_cprogramas_fk1;
	}


	public Otg_programas getOtg_programas_cprogramas_programas_fk1() {
		return this.otg_programas_cprogramas_programas_fk1;
	}
			
	public void setOtg_programas_cprogramas_programas_fk1(Otg_programas otg_programas_cprogramas_programas_fk1) {
		this.otg_programas_cprogramas_programas_fk1 = otg_programas_cprogramas_programas_fk1;
	}


	public String getCpr_tdifusion() {
		return this.cpr_tdifusion;
	}
			
	public void setCpr_tdifusion(String cpr_tdifusion) {
		this.cpr_tdifusion = cpr_tdifusion;
	}


	public String getCpr_link() {
		return this.cpr_link;
	}
			
	public void setCpr_link(String cpr_link) {
		this.cpr_link = cpr_link;
	}


	public java.util.Date getCpr_fpub() {
		return this.cpr_fpub;
	}
			
	public void setCpr_fpub(java.util.Date cpr_fpub) {
		this.cpr_fpub = cpr_fpub;
	}


	public java.util.Date getCpr_fcierre() {
		return this.cpr_fcierre;
	}
			
	public void setCpr_fcierre(java.util.Date cpr_fcierre) {
		this.cpr_fcierre = cpr_fcierre;
	}


	public String getCpr_doce() {
		return this.cpr_doce;
	}
			
	public void setCpr_doce(String cpr_doce) {
		this.cpr_doce = cpr_doce;
	}


	public String getCpr_codigootri() {
		return this.cpr_codigootri;
	}
			
	public void setCpr_codigootri(String cpr_codigootri) {
		this.cpr_codigootri = cpr_codigootri;
	}


	public Otg_pespecificos getOtg_pespecificos_cprogramas_pespecificos_fk1() {
		return this.otg_pespecificos_cprogramas_pespecificos_fk1;
	}
			
	public void setOtg_pespecificos_cprogramas_pespecificos_fk1(Otg_pespecificos otg_pespecificos_cprogramas_pespecificos_fk1) {
		this.otg_pespecificos_cprogramas_pespecificos_fk1 = otg_pespecificos_cprogramas_pespecificos_fk1;
	}


	public String getCpr_tipo() {
		return this.cpr_tipo;
	}
			
	public void setCpr_tipo(String cpr_tipo) {
		this.cpr_tipo = cpr_tipo;
	}


}