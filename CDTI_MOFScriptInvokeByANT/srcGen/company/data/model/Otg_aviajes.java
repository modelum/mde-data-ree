package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Anualidades de Viajes
@Entity
@Table(schema="jpa")
public class Otg_aviajes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_AVI_CODIGO)
	@Id
	@Column(name="AVI_CODIGO")
	private int avi_codigo;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Otg_aviajes otg_aviajes_cviajes_aviajes_fk1;
	//Codigo del viaje (FK - OTG_VIAJES)
	@Column(name="AVI_VIA_CODIGO")
	@ManyToOne
	@JoinColumn(name="VIA_CODIGO")
	private Otg_viajes otg_viajes_aviajes_viajes_fk1;
	//Ano
	@Column(name="AVI_ANO")
	private int avi_ano;
	//Fecha de inicio
	@Column(name="AVI_FINI")
	private java.util.Date avi_fini;
	//Fecha de fin
	@Column(name="AVI_FFIN")
	private java.util.Date avi_ffin;
	
	public Otg_aviajes() {
		super();
	}
		
	public Otg_aviajes(int avi_codigo, Otg_aviajes otg_aviajes_cviajes_aviajes_fk1, Otg_viajes otg_viajes_aviajes_viajes_fk1, int avi_ano, java.util.Date avi_fini, java.util.Date avi_ffin) {
		this.avi_codigo = avi_codigo;
		this.otg_aviajes_cviajes_aviajes_fk1 = otg_aviajes_cviajes_aviajes_fk1;
		this.otg_viajes_aviajes_viajes_fk1 = otg_viajes_aviajes_viajes_fk1;
		this.avi_ano = avi_ano;
		this.avi_fini = avi_fini;
		this.avi_ffin = avi_ffin;
	}
	
	public int getAvi_codigo() {
		return this.avi_codigo;
	}
			
	public void setAvi_codigo(int avi_codigo) {
		this.avi_codigo = avi_codigo;
	}
	public Otg_aviajes getOtg_aviajes_cviajes_aviajes_fk1() {
		return this.otg_aviajes_cviajes_aviajes_fk1;
	}
			
	public void setOtg_aviajes_cviajes_aviajes_fk1(Otg_aviajes otg_aviajes_cviajes_aviajes_fk1) {
		this.otg_aviajes_cviajes_aviajes_fk1 = otg_aviajes_cviajes_aviajes_fk1;
	}


	public Otg_viajes getOtg_viajes_aviajes_viajes_fk1() {
		return this.otg_viajes_aviajes_viajes_fk1;
	}
			
	public void setOtg_viajes_aviajes_viajes_fk1(Otg_viajes otg_viajes_aviajes_viajes_fk1) {
		this.otg_viajes_aviajes_viajes_fk1 = otg_viajes_aviajes_viajes_fk1;
	}


	public int getAvi_ano() {
		return this.avi_ano;
	}
			
	public void setAvi_ano(int avi_ano) {
		this.avi_ano = avi_ano;
	}


	public java.util.Date getAvi_fini() {
		return this.avi_fini;
	}
			
	public void setAvi_fini(java.util.Date avi_fini) {
		this.avi_fini = avi_fini;
	}


	public java.util.Date getAvi_ffin() {
		return this.avi_ffin;
	}
			
	public void setAvi_ffin(java.util.Date avi_ffin) {
		this.avi_ffin = avi_ffin;
	}


}