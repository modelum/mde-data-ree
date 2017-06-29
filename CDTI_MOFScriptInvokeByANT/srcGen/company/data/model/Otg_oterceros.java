package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de Terceros
@Entity
@Table(schema="jpa")
public class Otg_oterceros implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OTE_CODIGO)
	@Id
	@Column(name="OTE_CODIGO")
	private int ote_codigo;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Column(name="OTE_TER_CODIGO")
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_oterceros_terceros_fk1;
	//Observacion
	@Column(name="OTE_OBSERVACION")
	private String ote_observacion;
	
	public Otg_oterceros() {
		super();
	}
		
	public Otg_oterceros(int ote_codigo, Otg_terceros otg_terceros_oterceros_terceros_fk1, String ote_observacion) {
		this.ote_codigo = ote_codigo;
		this.otg_terceros_oterceros_terceros_fk1 = otg_terceros_oterceros_terceros_fk1;
		this.ote_observacion = ote_observacion;
	}
	
	public int getOte_codigo() {
		return this.ote_codigo;
	}
			
	public void setOte_codigo(int ote_codigo) {
		this.ote_codigo = ote_codigo;
	}

	public Otg_terceros getOtg_terceros_oterceros_terceros_fk1() {
		return this.otg_terceros_oterceros_terceros_fk1;
	}
			
	public void setOtg_terceros_oterceros_terceros_fk1(Otg_terceros otg_terceros_oterceros_terceros_fk1) {
		this.otg_terceros_oterceros_terceros_fk1 = otg_terceros_oterceros_terceros_fk1;
	}


	public String getOte_observacion() {
		return this.ote_observacion;
	}
			
	public void setOte_observacion(String ote_observacion) {
		this.ote_observacion = ote_observacion;
	}


}