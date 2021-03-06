package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de Becas
@Entity
@Table(schema="jpa")
public class Otg_sbecas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SBE_CODIGO)
	@Id
	@Column(name="SBE_CODIGO")
	private int sbe_codigo;
	//Codigo de la Beca (FK - OTG_BECAS)
	@Column(name="SBE_BEC_CODIGO")
	@ManyToOne
	@JoinColumn(name="BEC_CODIGO")
	private Otg_becas otg_becas_sbecas_becas_fk1;
	//Descripcion
	@Column(name="SBE_DESCRIPCION")
	private String sbe_descripcion;
	//Fecha
	@Column(name="SBE_FECHA")
	private java.util.Date sbe_fecha;
	
	public Otg_sbecas() {
		super();
	}
		
	public Otg_sbecas(int sbe_codigo, Otg_becas otg_becas_sbecas_becas_fk1, String sbe_descripcion, java.util.Date sbe_fecha) {
		this.sbe_codigo = sbe_codigo;
		this.otg_becas_sbecas_becas_fk1 = otg_becas_sbecas_becas_fk1;
		this.sbe_descripcion = sbe_descripcion;
		this.sbe_fecha = sbe_fecha;
	}
	
	public int getSbe_codigo() {
		return this.sbe_codigo;
	}
			
	public void setSbe_codigo(int sbe_codigo) {
		this.sbe_codigo = sbe_codigo;
	}

	public Otg_becas getOtg_becas_sbecas_becas_fk1() {
		return this.otg_becas_sbecas_becas_fk1;
	}
			
	public void setOtg_becas_sbecas_becas_fk1(Otg_becas otg_becas_sbecas_becas_fk1) {
		this.otg_becas_sbecas_becas_fk1 = otg_becas_sbecas_becas_fk1;
	}


	public String getSbe_descripcion() {
		return this.sbe_descripcion;
	}
			
	public void setSbe_descripcion(String sbe_descripcion) {
		this.sbe_descripcion = sbe_descripcion;
	}


	public java.util.Date getSbe_fecha() {
		return this.sbe_fecha;
	}
			
	public void setSbe_fecha(java.util.Date sbe_fecha) {
		this.sbe_fecha = sbe_fecha;
	}


}