package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de personas PERUMH
@Entity
@Table(schema="jpa")
public class Otg_operumh implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OPU_CODIGO)
	@Id
	@Column(name="OPE_CODIGO")
	private int ope_codigo;
	//Identificador de la personas (FK - OTG_PERSONAS)
	@Column(name="OPE_PER_ID")
	private int ope_per_id;
	//Observacion
	@Column(name="OPE_OBSERVACION")
	private String ope_observacion;
	
	public Otg_operumh() {
		super();
	}
		
	public Otg_operumh(int ope_codigo, int ope_per_id, String ope_observacion) {
		this.ope_codigo = ope_codigo;
		this.ope_per_id = ope_per_id;
		this.ope_observacion = ope_observacion;
	}
	
	public int getOpe_codigo() {
		return this.ope_codigo;
	}
			
	public void setOpe_codigo(int ope_codigo) {
		this.ope_codigo = ope_codigo;
	}

	public int getOpe_per_id() {
		return this.ope_per_id;
	}
			
	public void setOpe_per_id(int ope_per_id) {
		this.ope_per_id = ope_per_id;
	}


	public String getOpe_observacion() {
		return this.ope_observacion;
	}
			
	public void setOpe_observacion(String ope_observacion) {
		this.ope_observacion = ope_observacion;
	}


}