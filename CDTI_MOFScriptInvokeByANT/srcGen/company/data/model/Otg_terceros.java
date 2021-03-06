package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros
@Entity
@Table(schema="jpa")
public class Otg_terceros implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_TER_CODIGO)
	@Id
	@Column(name="TER_CODIGO")
	private int ter_codigo;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_oterceros> otg_oterceross_oterceros_terceros_fk1;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tviajes> otg_tviajess_tviajes_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tcprogramas> otg_tcprogramass_tcprogramas_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tinfraest> otg_tinfraests_tinfraest_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_perterceros> otg_perterceross_perterceros_terceros_fk1;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tcontratos_secretaria> otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_terceros> otg_terceross_terceros_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tbecas> otg_tbecass_tbecas_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tsuperproyectos> otg_tsuperproyectoss_tsuperproyectos_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_pservicios> otg_pservicioss_pservicios_terceros_fk1;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tproyectos> otg_tproyectoss_tproyectos_terceros_fk1;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_pterceros> otg_pterceross_pterceros_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_tcontratos> otg_tcontratoss_tcontratos_terceros_fk2;
	@OneToMany(mappedBy="otg_terceros")
	private List<Otg_cterceros> otg_cterceross_cterceros_terceros_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_terceros otg_terceros_pterceros_terceros_fk1;
	//C.I.F.
	@Column(name="TER_CIF")
	private String ter_cif;
	//Nombre
	@Column(name="TER_NOMBRE")
	private String ter_nombre;
	//Acronimo
	@Column(name="TER_ALIAS")
	private String ter_alias;
	//Codigo C.N.A.E (FK - OTG_CNAES)
	@Column(name="TER_CNA_CODIGO")
	@ManyToOne
	@JoinColumn(name="CNA_CODIGO")
	private Otg_cnaes otg_cnaes_terceros_cnaes_fk1;
	//Domicilio
	@Column(name="TER_DOMICILIO")
	private String ter_domicilio;
	//Codigo Postal
	@Column(name="TER_CP")
	private String ter_cp;
	//Codigo de la poblacion (FK - PUEBLOS)
	@Column(name="TER_PUE_CODIGO")
	private int ter_pue_codigo;
	//Poblacion (extrajeros)
	@Column(name="TER_POBLACIONEXT")
	private String ter_poblacionext;
	//Codigo de la provincia (FK - PROVINCIAS)
	@Column(name="TER_PRO_CODIGO")
	private String ter_pro_codigo;
	//Provincia (Extranjeros)
	@Column(name="TER_PROVINCIAEXT")
	private String ter_provinciaext;
	//Codigo del Pais (FK - PAISES)
	@Column(name="TER_PAI_CODIGO")
	private String ter_pai_codigo;
	//Telefono
	@Column(name="TER_TELEFONO")
	private String ter_telefono;
	//Fax
	@Column(name="TER_FAX")
	private String ter_fax;
	//Direccion de correo electronico
	@Column(name="TER_MAIL")
	private String ter_mail;
	//Pagina Web
	@Column(name="TER_WEB")
	private String ter_web;
	//Tipo ( NA-EX (Nacional, Extranjera) VA (Comun. Valenc) PR-PU-MT (Privada, Publica, Mixta) EM-EN-AD-IN (Empresa, IPSFL, Administracion, OPI) CE-AU-LO (Central, Autonomica, Local) )
	@Column(name="TER_TIPO")
	private String ter_tipo;
	//Codigo del Tercero Superior (FK - OTG_TERCEROS)
	@Column(name="TER_TER_CODIGO")
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_terceros_terceros_fk2;
	//Domicilio de correspondencia
	@Column(name="TER_DOMICILIOF")
	private String ter_domiciliof;
	//Codigo Postal de correspondencia
	@Column(name="TER_CPF")
	private String ter_cpf;
	//Codigo de la Poblacion correspondencia (FK - PUEBLOS)
	@Column(name="TER_PUE_CODIGOF")
	private int ter_pue_codigof;
	//Poblacion correspondencia (extranjeros)
	@Column(name="TER_POBLACIONEXTF")
	private String ter_poblacionextf;
	//Codigo del pais correspondencia (FK - PAISES)
	@Column(name="TER_PAI_CODIGOF")
	private String ter_pai_codigof;
	//Codigo de la provincia correspondencia (FK - PROVINCIAS)
	@Column(name="TER_PRO_CODIGOF")
	private String ter_pro_codigof;
	//Provincia correspondencia (extranjeros)
	@Column(name="TER_PROVINCIAEXTF")
	private String ter_provinciaextf;
	//En desuso (S, N).
	@Column(name="TER_ANTIGUO")
	private String ter_antiguo;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	//N  de Cuenta
	@Column(name="TER_NCC")
	private String ter_ncc;
	
	public Otg_terceros() {
		super();
	}
		
	public Otg_terceros(int ter_codigo, List<Otg_oterceros> otg_oterceross_oterceros_terceros_fk1, List<Otg_tviajes> otg_tviajess_tviajes_terceros_fk2, List<Otg_tcprogramas> otg_tcprogramass_tcprogramas_terceros_fk2, List<Otg_tinfraest> otg_tinfraests_tinfraest_terceros_fk2, List<Otg_perterceros> otg_perterceross_perterceros_terceros_fk1, List<Otg_tcontratos_secretaria> otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2, List<Otg_terceros> otg_terceross_terceros_terceros_fk2, List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_terceros_fk2, List<Otg_tbecas> otg_tbecass_tbecas_terceros_fk2, List<Otg_tsuperproyectos> otg_tsuperproyectoss_tsuperproyectos_terceros_fk2, List<Otg_pservicios> otg_pservicioss_pservicios_terceros_fk1, List<Otg_tproyectos> otg_tproyectoss_tproyectos_terceros_fk1, List<Otg_pterceros> otg_pterceross_pterceros_terceros_fk2, List<Otg_tcontratos> otg_tcontratoss_tcontratos_terceros_fk2, List<Otg_cterceros> otg_cterceross_cterceros_terceros_fk1, Otg_terceros otg_terceros_pterceros_terceros_fk1, String ter_cif, String ter_nombre, String ter_alias, Otg_cnaes otg_cnaes_terceros_cnaes_fk1, String ter_domicilio, String ter_cp, int ter_pue_codigo, String ter_poblacionext, String ter_pro_codigo, String ter_provinciaext, String ter_pai_codigo, String ter_telefono, String ter_fax, String ter_mail, String ter_web, String ter_tipo, Otg_terceros otg_terceros_terceros_terceros_fk2, String ter_domiciliof, String ter_cpf, int ter_pue_codigof, String ter_poblacionextf, String ter_pai_codigof, String ter_pro_codigof, String ter_provinciaextf, String ter_antiguo, int log, String ter_ncc) {
		this.ter_codigo = ter_codigo;
		this.otg_oterceross_oterceros_terceros_fk1 = otg_oterceross_oterceros_terceros_fk1;
		this.otg_tviajess_tviajes_terceros_fk2 = otg_tviajess_tviajes_terceros_fk2;
		this.otg_tcprogramass_tcprogramas_terceros_fk2 = otg_tcprogramass_tcprogramas_terceros_fk2;
		this.otg_tinfraests_tinfraest_terceros_fk2 = otg_tinfraests_tinfraest_terceros_fk2;
		this.otg_perterceross_perterceros_terceros_fk1 = otg_perterceross_perterceros_terceros_fk1;
		this.otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2 = otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2;
		this.otg_terceross_terceros_terceros_fk2 = otg_terceross_terceros_terceros_fk2;
		this.otg_tconvocatoriass_tconvocator_terceros_fk2 = otg_tconvocatoriass_tconvocator_terceros_fk2;
		this.otg_tbecass_tbecas_terceros_fk2 = otg_tbecass_tbecas_terceros_fk2;
		this.otg_tsuperproyectoss_tsuperproyectos_terceros_fk2 = otg_tsuperproyectoss_tsuperproyectos_terceros_fk2;
		this.otg_pservicioss_pservicios_terceros_fk1 = otg_pservicioss_pservicios_terceros_fk1;
		this.otg_tproyectoss_tproyectos_terceros_fk1 = otg_tproyectoss_tproyectos_terceros_fk1;
		this.otg_pterceross_pterceros_terceros_fk2 = otg_pterceross_pterceros_terceros_fk2;
		this.otg_tcontratoss_tcontratos_terceros_fk2 = otg_tcontratoss_tcontratos_terceros_fk2;
		this.otg_cterceross_cterceros_terceros_fk1 = otg_cterceross_cterceros_terceros_fk1;
		this.otg_terceros_pterceros_terceros_fk1 = otg_terceros_pterceros_terceros_fk1;
		this.ter_cif = ter_cif;
		this.ter_nombre = ter_nombre;
		this.ter_alias = ter_alias;
		this.otg_cnaes_terceros_cnaes_fk1 = otg_cnaes_terceros_cnaes_fk1;
		this.ter_domicilio = ter_domicilio;
		this.ter_cp = ter_cp;
		this.ter_pue_codigo = ter_pue_codigo;
		this.ter_poblacionext = ter_poblacionext;
		this.ter_pro_codigo = ter_pro_codigo;
		this.ter_provinciaext = ter_provinciaext;
		this.ter_pai_codigo = ter_pai_codigo;
		this.ter_telefono = ter_telefono;
		this.ter_fax = ter_fax;
		this.ter_mail = ter_mail;
		this.ter_web = ter_web;
		this.ter_tipo = ter_tipo;
		this.otg_terceros_terceros_terceros_fk2 = otg_terceros_terceros_terceros_fk2;
		this.ter_domiciliof = ter_domiciliof;
		this.ter_cpf = ter_cpf;
		this.ter_pue_codigof = ter_pue_codigof;
		this.ter_poblacionextf = ter_poblacionextf;
		this.ter_pai_codigof = ter_pai_codigof;
		this.ter_pro_codigof = ter_pro_codigof;
		this.ter_provinciaextf = ter_provinciaextf;
		this.ter_antiguo = ter_antiguo;
		this.log = log;
		this.ter_ncc = ter_ncc;
	}
	
	public int getTer_codigo() {
		return this.ter_codigo;
	}
			
	public void setTer_codigo(int ter_codigo) {
		this.ter_codigo = ter_codigo;
	}
	public List<Otg_oterceros> getOtg_oterceross_oterceros_terceros_fk1() {
		return this.otg_oterceross_oterceros_terceros_fk1;
	}
			
	public void setOtg_oterceross_oterceros_terceros_fk1(List<Otg_oterceros> otg_oterceross_oterceros_terceros_fk1) {
		this.otg_oterceross_oterceros_terceros_fk1 = otg_oterceross_oterceros_terceros_fk1;
	}

	public List<Otg_tviajes> getOtg_tviajess_tviajes_terceros_fk2() {
		return this.otg_tviajess_tviajes_terceros_fk2;
	}
			
	public void setOtg_tviajess_tviajes_terceros_fk2(List<Otg_tviajes> otg_tviajess_tviajes_terceros_fk2) {
		this.otg_tviajess_tviajes_terceros_fk2 = otg_tviajess_tviajes_terceros_fk2;
	}

	public List<Otg_tcprogramas> getOtg_tcprogramass_tcprogramas_terceros_fk2() {
		return this.otg_tcprogramass_tcprogramas_terceros_fk2;
	}
			
	public void setOtg_tcprogramass_tcprogramas_terceros_fk2(List<Otg_tcprogramas> otg_tcprogramass_tcprogramas_terceros_fk2) {
		this.otg_tcprogramass_tcprogramas_terceros_fk2 = otg_tcprogramass_tcprogramas_terceros_fk2;
	}

	public List<Otg_tinfraest> getOtg_tinfraests_tinfraest_terceros_fk2() {
		return this.otg_tinfraests_tinfraest_terceros_fk2;
	}
			
	public void setOtg_tinfraests_tinfraest_terceros_fk2(List<Otg_tinfraest> otg_tinfraests_tinfraest_terceros_fk2) {
		this.otg_tinfraests_tinfraest_terceros_fk2 = otg_tinfraests_tinfraest_terceros_fk2;
	}

	public List<Otg_perterceros> getOtg_perterceross_perterceros_terceros_fk1() {
		return this.otg_perterceross_perterceros_terceros_fk1;
	}
			
	public void setOtg_perterceross_perterceros_terceros_fk1(List<Otg_perterceros> otg_perterceross_perterceros_terceros_fk1) {
		this.otg_perterceross_perterceros_terceros_fk1 = otg_perterceross_perterceros_terceros_fk1;
	}

	public List<Otg_tcontratos_secretaria> getOtg_tcontratos_secretarias_tcontratos_sec_terceros_fk2() {
		return this.otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2;
	}
			
	public void setOtg_tcontratos_secretarias_tcontratos_sec_terceros_fk2(List<Otg_tcontratos_secretaria> otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2) {
		this.otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2 = otg_tcontratos_secretarias_tcontratos_sec_terceros_fk2;
	}

	public List<Otg_terceros> getOtg_terceross_terceros_terceros_fk2() {
		return this.otg_terceross_terceros_terceros_fk2;
	}
			
	public void setOtg_terceross_terceros_terceros_fk2(List<Otg_terceros> otg_terceross_terceros_terceros_fk2) {
		this.otg_terceross_terceros_terceros_fk2 = otg_terceross_terceros_terceros_fk2;
	}

	public List<Otg_tconvocatorias> getOtg_tconvocatoriass_tconvocator_terceros_fk2() {
		return this.otg_tconvocatoriass_tconvocator_terceros_fk2;
	}
			
	public void setOtg_tconvocatoriass_tconvocator_terceros_fk2(List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_terceros_fk2) {
		this.otg_tconvocatoriass_tconvocator_terceros_fk2 = otg_tconvocatoriass_tconvocator_terceros_fk2;
	}

	public List<Otg_tbecas> getOtg_tbecass_tbecas_terceros_fk2() {
		return this.otg_tbecass_tbecas_terceros_fk2;
	}
			
	public void setOtg_tbecass_tbecas_terceros_fk2(List<Otg_tbecas> otg_tbecass_tbecas_terceros_fk2) {
		this.otg_tbecass_tbecas_terceros_fk2 = otg_tbecass_tbecas_terceros_fk2;
	}

	public List<Otg_tsuperproyectos> getOtg_tsuperproyectoss_tsuperproyectos_terceros_fk2() {
		return this.otg_tsuperproyectoss_tsuperproyectos_terceros_fk2;
	}
			
	public void setOtg_tsuperproyectoss_tsuperproyectos_terceros_fk2(List<Otg_tsuperproyectos> otg_tsuperproyectoss_tsuperproyectos_terceros_fk2) {
		this.otg_tsuperproyectoss_tsuperproyectos_terceros_fk2 = otg_tsuperproyectoss_tsuperproyectos_terceros_fk2;
	}

	public List<Otg_pservicios> getOtg_pservicioss_pservicios_terceros_fk1() {
		return this.otg_pservicioss_pservicios_terceros_fk1;
	}
			
	public void setOtg_pservicioss_pservicios_terceros_fk1(List<Otg_pservicios> otg_pservicioss_pservicios_terceros_fk1) {
		this.otg_pservicioss_pservicios_terceros_fk1 = otg_pservicioss_pservicios_terceros_fk1;
	}

	public List<Otg_tproyectos> getOtg_tproyectoss_tproyectos_terceros_fk1() {
		return this.otg_tproyectoss_tproyectos_terceros_fk1;
	}
			
	public void setOtg_tproyectoss_tproyectos_terceros_fk1(List<Otg_tproyectos> otg_tproyectoss_tproyectos_terceros_fk1) {
		this.otg_tproyectoss_tproyectos_terceros_fk1 = otg_tproyectoss_tproyectos_terceros_fk1;
	}

	public List<Otg_pterceros> getOtg_pterceross_pterceros_terceros_fk2() {
		return this.otg_pterceross_pterceros_terceros_fk2;
	}
			
	public void setOtg_pterceross_pterceros_terceros_fk2(List<Otg_pterceros> otg_pterceross_pterceros_terceros_fk2) {
		this.otg_pterceross_pterceros_terceros_fk2 = otg_pterceross_pterceros_terceros_fk2;
	}

	public List<Otg_tcontratos> getOtg_tcontratoss_tcontratos_terceros_fk2() {
		return this.otg_tcontratoss_tcontratos_terceros_fk2;
	}
			
	public void setOtg_tcontratoss_tcontratos_terceros_fk2(List<Otg_tcontratos> otg_tcontratoss_tcontratos_terceros_fk2) {
		this.otg_tcontratoss_tcontratos_terceros_fk2 = otg_tcontratoss_tcontratos_terceros_fk2;
	}

	public List<Otg_cterceros> getOtg_cterceross_cterceros_terceros_fk1() {
		return this.otg_cterceross_cterceros_terceros_fk1;
	}
			
	public void setOtg_cterceross_cterceros_terceros_fk1(List<Otg_cterceros> otg_cterceross_cterceros_terceros_fk1) {
		this.otg_cterceross_cterceros_terceros_fk1 = otg_cterceross_cterceros_terceros_fk1;
	}

	public Otg_terceros getOtg_terceros_pterceros_terceros_fk1() {
		return this.otg_terceros_pterceros_terceros_fk1;
	}
			
	public void setOtg_terceros_pterceros_terceros_fk1(Otg_terceros otg_terceros_pterceros_terceros_fk1) {
		this.otg_terceros_pterceros_terceros_fk1 = otg_terceros_pterceros_terceros_fk1;
	}


	public String getTer_cif() {
		return this.ter_cif;
	}
			
	public void setTer_cif(String ter_cif) {
		this.ter_cif = ter_cif;
	}


	public String getTer_nombre() {
		return this.ter_nombre;
	}
			
	public void setTer_nombre(String ter_nombre) {
		this.ter_nombre = ter_nombre;
	}


	public String getTer_alias() {
		return this.ter_alias;
	}
			
	public void setTer_alias(String ter_alias) {
		this.ter_alias = ter_alias;
	}


	public Otg_cnaes getOtg_cnaes_terceros_cnaes_fk1() {
		return this.otg_cnaes_terceros_cnaes_fk1;
	}
			
	public void setOtg_cnaes_terceros_cnaes_fk1(Otg_cnaes otg_cnaes_terceros_cnaes_fk1) {
		this.otg_cnaes_terceros_cnaes_fk1 = otg_cnaes_terceros_cnaes_fk1;
	}


	public String getTer_domicilio() {
		return this.ter_domicilio;
	}
			
	public void setTer_domicilio(String ter_domicilio) {
		this.ter_domicilio = ter_domicilio;
	}


	public String getTer_cp() {
		return this.ter_cp;
	}
			
	public void setTer_cp(String ter_cp) {
		this.ter_cp = ter_cp;
	}


	public int getTer_pue_codigo() {
		return this.ter_pue_codigo;
	}
			
	public void setTer_pue_codigo(int ter_pue_codigo) {
		this.ter_pue_codigo = ter_pue_codigo;
	}


	public String getTer_poblacionext() {
		return this.ter_poblacionext;
	}
			
	public void setTer_poblacionext(String ter_poblacionext) {
		this.ter_poblacionext = ter_poblacionext;
	}


	public String getTer_pro_codigo() {
		return this.ter_pro_codigo;
	}
			
	public void setTer_pro_codigo(String ter_pro_codigo) {
		this.ter_pro_codigo = ter_pro_codigo;
	}


	public String getTer_provinciaext() {
		return this.ter_provinciaext;
	}
			
	public void setTer_provinciaext(String ter_provinciaext) {
		this.ter_provinciaext = ter_provinciaext;
	}


	public String getTer_pai_codigo() {
		return this.ter_pai_codigo;
	}
			
	public void setTer_pai_codigo(String ter_pai_codigo) {
		this.ter_pai_codigo = ter_pai_codigo;
	}


	public String getTer_telefono() {
		return this.ter_telefono;
	}
			
	public void setTer_telefono(String ter_telefono) {
		this.ter_telefono = ter_telefono;
	}


	public String getTer_fax() {
		return this.ter_fax;
	}
			
	public void setTer_fax(String ter_fax) {
		this.ter_fax = ter_fax;
	}


	public String getTer_mail() {
		return this.ter_mail;
	}
			
	public void setTer_mail(String ter_mail) {
		this.ter_mail = ter_mail;
	}


	public String getTer_web() {
		return this.ter_web;
	}
			
	public void setTer_web(String ter_web) {
		this.ter_web = ter_web;
	}


	public String getTer_tipo() {
		return this.ter_tipo;
	}
			
	public void setTer_tipo(String ter_tipo) {
		this.ter_tipo = ter_tipo;
	}


	public Otg_terceros getOtg_terceros_terceros_terceros_fk2() {
		return this.otg_terceros_terceros_terceros_fk2;
	}
			
	public void setOtg_terceros_terceros_terceros_fk2(Otg_terceros otg_terceros_terceros_terceros_fk2) {
		this.otg_terceros_terceros_terceros_fk2 = otg_terceros_terceros_terceros_fk2;
	}


	public String getTer_domiciliof() {
		return this.ter_domiciliof;
	}
			
	public void setTer_domiciliof(String ter_domiciliof) {
		this.ter_domiciliof = ter_domiciliof;
	}


	public String getTer_cpf() {
		return this.ter_cpf;
	}
			
	public void setTer_cpf(String ter_cpf) {
		this.ter_cpf = ter_cpf;
	}


	public int getTer_pue_codigof() {
		return this.ter_pue_codigof;
	}
			
	public void setTer_pue_codigof(int ter_pue_codigof) {
		this.ter_pue_codigof = ter_pue_codigof;
	}


	public String getTer_poblacionextf() {
		return this.ter_poblacionextf;
	}
			
	public void setTer_poblacionextf(String ter_poblacionextf) {
		this.ter_poblacionextf = ter_poblacionextf;
	}


	public String getTer_pai_codigof() {
		return this.ter_pai_codigof;
	}
			
	public void setTer_pai_codigof(String ter_pai_codigof) {
		this.ter_pai_codigof = ter_pai_codigof;
	}


	public String getTer_pro_codigof() {
		return this.ter_pro_codigof;
	}
			
	public void setTer_pro_codigof(String ter_pro_codigof) {
		this.ter_pro_codigof = ter_pro_codigof;
	}


	public String getTer_provinciaextf() {
		return this.ter_provinciaextf;
	}
			
	public void setTer_provinciaextf(String ter_provinciaextf) {
		this.ter_provinciaextf = ter_provinciaextf;
	}


	public String getTer_antiguo() {
		return this.ter_antiguo;
	}
			
	public void setTer_antiguo(String ter_antiguo) {
		this.ter_antiguo = ter_antiguo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public String getTer_ncc() {
		return this.ter_ncc;
	}
			
	public void setTer_ncc(String ter_ncc) {
		this.ter_ncc = ter_ncc;
	}


}