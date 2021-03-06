package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de Contratos
@Entity
@Table(schema="jpa")
public class Otg_ocontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OCO_CODIGO)
	@Id
	@Column(name="OCO_CODIGO")
	private int oco_codigo;
	//Codigo del Contrato (FK - OTG_CONTRATOS)
	@Column(name="OCO_CON_CODIGO")
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_ocontratos_contratos_fk1;
	//Observacion
	@Column(name="OCO_OBSERVACION")
	private String oco_observacion;
	
	public Otg_ocontratos() {
		super();
	}
		
	public Otg_ocontratos(int oco_codigo, Otg_contratos otg_contratos_ocontratos_contratos_fk1, String oco_observacion) {
		this.oco_codigo = oco_codigo;
		this.otg_contratos_ocontratos_contratos_fk1 = otg_contratos_ocontratos_contratos_fk1;
		this.oco_observacion = oco_observacion;
	}
	
	public int getOco_codigo() {
		return this.oco_codigo;
	}
			
	public void setOco_codigo(int oco_codigo) {
		this.oco_codigo = oco_codigo;
	}

	public Otg_contratos getOtg_contratos_ocontratos_contratos_fk1() {
		return this.otg_contratos_ocontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_ocontratos_contratos_fk1(Otg_contratos otg_contratos_ocontratos_contratos_fk1) {
		this.otg_contratos_ocontratos_contratos_fk1 = otg_contratos_ocontratos_contratos_fk1;
	}


	public String getOco_observacion() {
		return this.oco_observacion;
	}
			
	public void setOco_observacion(String oco_observacion) {
		this.oco_observacion = oco_observacion;
	}


}