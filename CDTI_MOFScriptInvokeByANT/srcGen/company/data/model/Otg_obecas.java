package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de Becas
@Entity
@Table(schema="jpa")
public class Otg_obecas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OBE_CODIGO)
	@Id
	@Column(name="OBE_CODIGO")
	private int obe_codigo;
	//Codigo de la Beca (FK - OTG_BECAS)
	@Column(name="OBE_BEC_CODIGO")
	@ManyToOne
	@JoinColumn(name="BEC_CODIGO")
	private Otg_becas otg_becas_obecas_becas_fk1;
	//Observacion
	@Column(name="OBE_OBSERVACION")
	private String obe_observacion;
	
	public Otg_obecas() {
		super();
	}
		
	public Otg_obecas(int obe_codigo, Otg_becas otg_becas_obecas_becas_fk1, String obe_observacion) {
		this.obe_codigo = obe_codigo;
		this.otg_becas_obecas_becas_fk1 = otg_becas_obecas_becas_fk1;
		this.obe_observacion = obe_observacion;
	}
	
	public int getObe_codigo() {
		return this.obe_codigo;
	}
			
	public void setObe_codigo(int obe_codigo) {
		this.obe_codigo = obe_codigo;
	}

	public Otg_becas getOtg_becas_obecas_becas_fk1() {
		return this.otg_becas_obecas_becas_fk1;
	}
			
	public void setOtg_becas_obecas_becas_fk1(Otg_becas otg_becas_obecas_becas_fk1) {
		this.otg_becas_obecas_becas_fk1 = otg_becas_obecas_becas_fk1;
	}


	public String getObe_observacion() {
		return this.obe_observacion;
	}
			
	public void setObe_observacion(String obe_observacion) {
		this.obe_observacion = obe_observacion;
	}


}