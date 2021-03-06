package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de solicitudes (europeos)
@Entity
@Table(schema="jpa")
public class Otg_sseuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SSE_CODIGO)
	@Id
	@Column(name="SSE_CODIGO")
	private int sse_codigo;
	//Codigo de la solicitud de proyecto europeo
	@Column(name="SSE_SEU_CODIGO")
	@ManyToOne
	@JoinColumn(name="SEU_CODIGO")
	private Otg_seuropeos otg_seuropeos_sseuropeos_seuropeos_fk1;
	//Descripcion
	@Column(name="SSE_DESCRIPCION")
	private String sse_descripcion;
	//Fecha
	@Column(name="SSE_FECHA")
	private java.util.Date sse_fecha;
	
	public Otg_sseuropeos() {
		super();
	}
		
	public Otg_sseuropeos(int sse_codigo, Otg_seuropeos otg_seuropeos_sseuropeos_seuropeos_fk1, String sse_descripcion, java.util.Date sse_fecha) {
		this.sse_codigo = sse_codigo;
		this.otg_seuropeos_sseuropeos_seuropeos_fk1 = otg_seuropeos_sseuropeos_seuropeos_fk1;
		this.sse_descripcion = sse_descripcion;
		this.sse_fecha = sse_fecha;
	}
	
	public int getSse_codigo() {
		return this.sse_codigo;
	}
			
	public void setSse_codigo(int sse_codigo) {
		this.sse_codigo = sse_codigo;
	}

	public Otg_seuropeos getOtg_seuropeos_sseuropeos_seuropeos_fk1() {
		return this.otg_seuropeos_sseuropeos_seuropeos_fk1;
	}
			
	public void setOtg_seuropeos_sseuropeos_seuropeos_fk1(Otg_seuropeos otg_seuropeos_sseuropeos_seuropeos_fk1) {
		this.otg_seuropeos_sseuropeos_seuropeos_fk1 = otg_seuropeos_sseuropeos_seuropeos_fk1;
	}


	public String getSse_descripcion() {
		return this.sse_descripcion;
	}
			
	public void setSse_descripcion(String sse_descripcion) {
		this.sse_descripcion = sse_descripcion;
	}


	public java.util.Date getSse_fecha() {
		return this.sse_fecha;
	}
			
	public void setSse_fecha(java.util.Date sse_fecha) {
		this.sse_fecha = sse_fecha;
	}


}