package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Viajes
@Entity
@Table(schema="jpa")
public class Otg_viajes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_VIA_CODIGO)
	@Id
	@Column(name="VIA_CODIGO")
	private int via_codigo;
	@OneToMany(mappedBy="otg_viajes")
	private List<Otg_oviajes> otg_oviajess_oviajes_viajes_fk1;
	@OneToMany(mappedBy="otg_viajes")
	private List<Otg_aviajes> otg_aviajess_aviajes_viajes_fk1;
	@OneToMany(mappedBy="otg_viajes")
	private List<Otg_perviajes> otg_perviajess_perviajes_viajes_fk1;
	@OneToMany(mappedBy="otg_viajes")
	private List<Otg_sviajes> otg_sviajess_sviajes_viajes_fk1;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_viajes otg_viajes_tviajes_viajes_fk1;
	//Centro de Gasto
	@Column(name="VIA_CG")
	private String via_cg;
	//Referencia
	@Column(name="VIA_REFER")
	private String via_refer;
	//Codigo de la solicitud (FK - OTG_SOLICITUDES)
	@Column(name="VIA_SOL_CODIGO")
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_viajes_solicitudes_fk1;
	//Titulo
	@Column(name="VIA_TITULO")
	private String via_titulo;
	//Estado (FA: Fallido)
	@Column(name="VIA_ESTADO")
	private String via_estado;
	//Fecha de publicacion
	@Column(name="VIA_FPUB")
	private java.util.Date via_fpub;
	//Fecha de resolucion
	@Column(name="VIA_FRES")
	private java.util.Date via_fres;
	//Codigo de la Unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Column(name="VIA_UOR_CODIGO")
	private int via_uor_codigo;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_viajes() {
		super();
	}
		
	public Otg_viajes(int via_codigo, List<Otg_oviajes> otg_oviajess_oviajes_viajes_fk1, List<Otg_aviajes> otg_aviajess_aviajes_viajes_fk1, List<Otg_perviajes> otg_perviajess_perviajes_viajes_fk1, List<Otg_sviajes> otg_sviajess_sviajes_viajes_fk1, Otg_viajes otg_viajes_tviajes_viajes_fk1, String via_cg, String via_refer, Otg_solicitudes otg_solicitudes_viajes_solicitudes_fk1, String via_titulo, String via_estado, java.util.Date via_fpub, java.util.Date via_fres, int via_uor_codigo, int log) {
		this.via_codigo = via_codigo;
		this.otg_oviajess_oviajes_viajes_fk1 = otg_oviajess_oviajes_viajes_fk1;
		this.otg_aviajess_aviajes_viajes_fk1 = otg_aviajess_aviajes_viajes_fk1;
		this.otg_perviajess_perviajes_viajes_fk1 = otg_perviajess_perviajes_viajes_fk1;
		this.otg_sviajess_sviajes_viajes_fk1 = otg_sviajess_sviajes_viajes_fk1;
		this.otg_viajes_tviajes_viajes_fk1 = otg_viajes_tviajes_viajes_fk1;
		this.via_cg = via_cg;
		this.via_refer = via_refer;
		this.otg_solicitudes_viajes_solicitudes_fk1 = otg_solicitudes_viajes_solicitudes_fk1;
		this.via_titulo = via_titulo;
		this.via_estado = via_estado;
		this.via_fpub = via_fpub;
		this.via_fres = via_fres;
		this.via_uor_codigo = via_uor_codigo;
		this.log = log;
	}
	
	public int getVia_codigo() {
		return this.via_codigo;
	}
			
	public void setVia_codigo(int via_codigo) {
		this.via_codigo = via_codigo;
	}
	public List<Otg_oviajes> getOtg_oviajess_oviajes_viajes_fk1() {
		return this.otg_oviajess_oviajes_viajes_fk1;
	}
			
	public void setOtg_oviajess_oviajes_viajes_fk1(List<Otg_oviajes> otg_oviajess_oviajes_viajes_fk1) {
		this.otg_oviajess_oviajes_viajes_fk1 = otg_oviajess_oviajes_viajes_fk1;
	}

	public List<Otg_aviajes> getOtg_aviajess_aviajes_viajes_fk1() {
		return this.otg_aviajess_aviajes_viajes_fk1;
	}
			
	public void setOtg_aviajess_aviajes_viajes_fk1(List<Otg_aviajes> otg_aviajess_aviajes_viajes_fk1) {
		this.otg_aviajess_aviajes_viajes_fk1 = otg_aviajess_aviajes_viajes_fk1;
	}

	public List<Otg_perviajes> getOtg_perviajess_perviajes_viajes_fk1() {
		return this.otg_perviajess_perviajes_viajes_fk1;
	}
			
	public void setOtg_perviajess_perviajes_viajes_fk1(List<Otg_perviajes> otg_perviajess_perviajes_viajes_fk1) {
		this.otg_perviajess_perviajes_viajes_fk1 = otg_perviajess_perviajes_viajes_fk1;
	}

	public List<Otg_sviajes> getOtg_sviajess_sviajes_viajes_fk1() {
		return this.otg_sviajess_sviajes_viajes_fk1;
	}
			
	public void setOtg_sviajess_sviajes_viajes_fk1(List<Otg_sviajes> otg_sviajess_sviajes_viajes_fk1) {
		this.otg_sviajess_sviajes_viajes_fk1 = otg_sviajess_sviajes_viajes_fk1;
	}

	public Otg_viajes getOtg_viajes_tviajes_viajes_fk1() {
		return this.otg_viajes_tviajes_viajes_fk1;
	}
			
	public void setOtg_viajes_tviajes_viajes_fk1(Otg_viajes otg_viajes_tviajes_viajes_fk1) {
		this.otg_viajes_tviajes_viajes_fk1 = otg_viajes_tviajes_viajes_fk1;
	}


	public String getVia_cg() {
		return this.via_cg;
	}
			
	public void setVia_cg(String via_cg) {
		this.via_cg = via_cg;
	}


	public String getVia_refer() {
		return this.via_refer;
	}
			
	public void setVia_refer(String via_refer) {
		this.via_refer = via_refer;
	}


	public Otg_solicitudes getOtg_solicitudes_viajes_solicitudes_fk1() {
		return this.otg_solicitudes_viajes_solicitudes_fk1;
	}
			
	public void setOtg_solicitudes_viajes_solicitudes_fk1(Otg_solicitudes otg_solicitudes_viajes_solicitudes_fk1) {
		this.otg_solicitudes_viajes_solicitudes_fk1 = otg_solicitudes_viajes_solicitudes_fk1;
	}


	public String getVia_titulo() {
		return this.via_titulo;
	}
			
	public void setVia_titulo(String via_titulo) {
		this.via_titulo = via_titulo;
	}


	public String getVia_estado() {
		return this.via_estado;
	}
			
	public void setVia_estado(String via_estado) {
		this.via_estado = via_estado;
	}


	public java.util.Date getVia_fpub() {
		return this.via_fpub;
	}
			
	public void setVia_fpub(java.util.Date via_fpub) {
		this.via_fpub = via_fpub;
	}


	public java.util.Date getVia_fres() {
		return this.via_fres;
	}
			
	public void setVia_fres(java.util.Date via_fres) {
		this.via_fres = via_fres;
	}


	public int getVia_uor_codigo() {
		return this.via_uor_codigo;
	}
			
	public void setVia_uor_codigo(int via_uor_codigo) {
		this.via_uor_codigo = via_uor_codigo;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}