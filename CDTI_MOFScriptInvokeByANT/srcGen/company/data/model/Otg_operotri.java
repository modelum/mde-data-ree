package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones sobre Personas
@Entity
@Table(schema="jpa")
public class Otg_operotri implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OPR_CODIGO)
	@Id
	@Column(name="OPE_CODIGO")
	private int ope_codigo;
	//Identificador de la persona (FK - OTG_PERSONAS)
	@Column(name="OPE_PER_ID")
	@ManyToOne
	@JoinColumn(name="PER_ID")
	private Otg_perotri otg_perotri_operotri_perotri_fk1;
	//Observacion
	@Column(name="OPE_OBSERVACION")
	private String ope_observacion;
	
	public Otg_operotri() {
		super();
	}
		
	public Otg_operotri(int ope_codigo, Otg_perotri otg_perotri_operotri_perotri_fk1, String ope_observacion) {
		this.ope_codigo = ope_codigo;
		this.otg_perotri_operotri_perotri_fk1 = otg_perotri_operotri_perotri_fk1;
		this.ope_observacion = ope_observacion;
	}
	
	public int getOpe_codigo() {
		return this.ope_codigo;
	}
			
	public void setOpe_codigo(int ope_codigo) {
		this.ope_codigo = ope_codigo;
	}

	public Otg_perotri getOtg_perotri_operotri_perotri_fk1() {
		return this.otg_perotri_operotri_perotri_fk1;
	}
			
	public void setOtg_perotri_operotri_perotri_fk1(Otg_perotri otg_perotri_operotri_perotri_fk1) {
		this.otg_perotri_operotri_perotri_fk1 = otg_perotri_operotri_perotri_fk1;
	}


	public String getOpe_observacion() {
		return this.ope_observacion;
	}
			
	public void setOpe_observacion(String ope_observacion) {
		this.ope_observacion = ope_observacion;
	}


}