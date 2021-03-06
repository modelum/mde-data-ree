package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Plazos de las convocatorias
@Entity
@Table(schema="jpa")
public class Otg_pconvocatorias implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_PCO_CODIGO)
	@Id
	@Column(name="PCO_CODIGO")
	private int pco_codigo;
	@OneToMany(mappedBy="otg_pconvocatorias")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_pconvocator_fk9;
	//Codigo de la actividad (FK - OTG_ACTIVIDADES)
	@Column(name="PCO_ACT_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACT_CODIGO")
	private Otg_actividades otg_actividades_pconvocatorias_actividades_fk1;
	//Codigo de la Modalidad (FK -  OTG_MODALIDADES)
	@Column(name="PCO_MOD_CODIGO")
	@ManyToOne
	@JoinColumn(name="MOD_CODIGO")
	private Otg_modalidades otg_modalidades_pconvocatorias_modalidades_fk1;
	//Fecha inicio de solicitud
	@Column(name="PCO_FINIS")
	private java.util.Date pco_finis;
	//Fecha fin de solicitud
	@Column(name="PCO_FFINS")
	private java.util.Date pco_ffins;
	//Fecha fin de aceptacion O.T.R.I.
	@Column(name="PCO_FFINA")
	private java.util.Date pco_ffina;
	//Ano de la convocatoria
	@Column(name="PCO_ANO")
	private int pco_ano;
	//Plazo de Justificacion
	@Column(name="PCO_FJUST")
	private java.util.Date pco_fjust;
	
	public Otg_pconvocatorias() {
		super();
	}
		
	public Otg_pconvocatorias(int pco_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudes_pconvocator_fk9, Otg_actividades otg_actividades_pconvocatorias_actividades_fk1, Otg_modalidades otg_modalidades_pconvocatorias_modalidades_fk1, java.util.Date pco_finis, java.util.Date pco_ffins, java.util.Date pco_ffina, int pco_ano, java.util.Date pco_fjust) {
		this.pco_codigo = pco_codigo;
		this.otg_solicitudess_solicitudes_pconvocator_fk9 = otg_solicitudess_solicitudes_pconvocator_fk9;
		this.otg_actividades_pconvocatorias_actividades_fk1 = otg_actividades_pconvocatorias_actividades_fk1;
		this.otg_modalidades_pconvocatorias_modalidades_fk1 = otg_modalidades_pconvocatorias_modalidades_fk1;
		this.pco_finis = pco_finis;
		this.pco_ffins = pco_ffins;
		this.pco_ffina = pco_ffina;
		this.pco_ano = pco_ano;
		this.pco_fjust = pco_fjust;
	}
	
	public int getPco_codigo() {
		return this.pco_codigo;
	}
			
	public void setPco_codigo(int pco_codigo) {
		this.pco_codigo = pco_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_pconvocator_fk9() {
		return this.otg_solicitudess_solicitudes_pconvocator_fk9;
	}
			
	public void setOtg_solicitudess_solicitudes_pconvocator_fk9(List<Otg_solicitudes> otg_solicitudess_solicitudes_pconvocator_fk9) {
		this.otg_solicitudess_solicitudes_pconvocator_fk9 = otg_solicitudess_solicitudes_pconvocator_fk9;
	}


	public Otg_actividades getOtg_actividades_pconvocatorias_actividades_fk1() {
		return this.otg_actividades_pconvocatorias_actividades_fk1;
	}
			
	public void setOtg_actividades_pconvocatorias_actividades_fk1(Otg_actividades otg_actividades_pconvocatorias_actividades_fk1) {
		this.otg_actividades_pconvocatorias_actividades_fk1 = otg_actividades_pconvocatorias_actividades_fk1;
	}


	public Otg_modalidades getOtg_modalidades_pconvocatorias_modalidades_fk1() {
		return this.otg_modalidades_pconvocatorias_modalidades_fk1;
	}
			
	public void setOtg_modalidades_pconvocatorias_modalidades_fk1(Otg_modalidades otg_modalidades_pconvocatorias_modalidades_fk1) {
		this.otg_modalidades_pconvocatorias_modalidades_fk1 = otg_modalidades_pconvocatorias_modalidades_fk1;
	}


	public java.util.Date getPco_finis() {
		return this.pco_finis;
	}
			
	public void setPco_finis(java.util.Date pco_finis) {
		this.pco_finis = pco_finis;
	}


	public java.util.Date getPco_ffins() {
		return this.pco_ffins;
	}
			
	public void setPco_ffins(java.util.Date pco_ffins) {
		this.pco_ffins = pco_ffins;
	}


	public java.util.Date getPco_ffina() {
		return this.pco_ffina;
	}
			
	public void setPco_ffina(java.util.Date pco_ffina) {
		this.pco_ffina = pco_ffina;
	}


	public int getPco_ano() {
		return this.pco_ano;
	}
			
	public void setPco_ano(int pco_ano) {
		this.pco_ano = pco_ano;
	}


	public java.util.Date getPco_fjust() {
		return this.pco_fjust;
	}
			
	public void setPco_fjust(java.util.Date pco_fjust) {
		this.pco_fjust = pco_fjust;
	}


}