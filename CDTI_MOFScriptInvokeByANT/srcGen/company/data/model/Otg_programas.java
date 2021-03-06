package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Programas Europeos
@Entity
@Table(schema="jpa")
public class Otg_programas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_PGR_CODIGO)
	@Id
	@Column(name="PRO_CODIGO")
	private int pro_codigo;
	@OneToMany(mappedBy="otg_programas")
	private List<Otg_pespecificos> otg_pespecificoss_pespecificos_programas_fk1;
	@OneToMany(mappedBy="otg_programas")
	private List<Otg_cprogramas> otg_cprogramass_cprogramas_programas_fk1;
	//Tipo (M: Programa Marco; E: Programa Europeo)
	@Column(name="PRO_TIPO")
	private String pro_tipo;
	//Titulo
	@Column(name="PRO_TITULO")
	private String pro_titulo;
	//Fecha de publicacion
	@Column(name="PRO_FPUB")
	private java.util.Date pro_fpub;
	//Codigo de la publicacion oficial (FK - OTG_PUBLICAOFI)
	@Column(name="PRO_PUB_CODIGO")
	@ManyToOne
	@JoinColumn(name="PUB_CODIGO")
	private Otg_publicaofi otg_publicaofi_programas_publicaofi_fk1;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_programas() {
		super();
	}
		
	public Otg_programas(int pro_codigo, List<Otg_pespecificos> otg_pespecificoss_pespecificos_programas_fk1, List<Otg_cprogramas> otg_cprogramass_cprogramas_programas_fk1, String pro_tipo, String pro_titulo, java.util.Date pro_fpub, Otg_publicaofi otg_publicaofi_programas_publicaofi_fk1, int log) {
		this.pro_codigo = pro_codigo;
		this.otg_pespecificoss_pespecificos_programas_fk1 = otg_pespecificoss_pespecificos_programas_fk1;
		this.otg_cprogramass_cprogramas_programas_fk1 = otg_cprogramass_cprogramas_programas_fk1;
		this.pro_tipo = pro_tipo;
		this.pro_titulo = pro_titulo;
		this.pro_fpub = pro_fpub;
		this.otg_publicaofi_programas_publicaofi_fk1 = otg_publicaofi_programas_publicaofi_fk1;
		this.log = log;
	}
	
	public int getPro_codigo() {
		return this.pro_codigo;
	}
			
	public void setPro_codigo(int pro_codigo) {
		this.pro_codigo = pro_codigo;
	}
	public List<Otg_pespecificos> getOtg_pespecificoss_pespecificos_programas_fk1() {
		return this.otg_pespecificoss_pespecificos_programas_fk1;
	}
			
	public void setOtg_pespecificoss_pespecificos_programas_fk1(List<Otg_pespecificos> otg_pespecificoss_pespecificos_programas_fk1) {
		this.otg_pespecificoss_pespecificos_programas_fk1 = otg_pespecificoss_pespecificos_programas_fk1;
	}

	public List<Otg_cprogramas> getOtg_cprogramass_cprogramas_programas_fk1() {
		return this.otg_cprogramass_cprogramas_programas_fk1;
	}
			
	public void setOtg_cprogramass_cprogramas_programas_fk1(List<Otg_cprogramas> otg_cprogramass_cprogramas_programas_fk1) {
		this.otg_cprogramass_cprogramas_programas_fk1 = otg_cprogramass_cprogramas_programas_fk1;
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


	public java.util.Date getPro_fpub() {
		return this.pro_fpub;
	}
			
	public void setPro_fpub(java.util.Date pro_fpub) {
		this.pro_fpub = pro_fpub;
	}


	public Otg_publicaofi getOtg_publicaofi_programas_publicaofi_fk1() {
		return this.otg_publicaofi_programas_publicaofi_fk1;
	}
			
	public void setOtg_publicaofi_programas_publicaofi_fk1(Otg_publicaofi otg_publicaofi_programas_publicaofi_fk1) {
		this.otg_publicaofi_programas_publicaofi_fk1 = otg_publicaofi_programas_publicaofi_fk1;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}