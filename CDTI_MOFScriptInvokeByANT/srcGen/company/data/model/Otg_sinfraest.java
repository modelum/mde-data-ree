package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Seguimiento de Infraestructuras
@Entity
@Table(schema="jpa")
public class Otg_sinfraest implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_SIN_CODIGO)
	@Id
	@Column(name="SIN_CODIGO")
	private int sin_codigo;
	//Codigo de la Infraestructura (FK - OTG_INFRAESTRUCTURA)
	@Column(name="SIN_INF_CODIGO")
	@ManyToOne
	@JoinColumn(name="INF_CODIGO")
	private Otg_infraest otg_infraest_sinfraest_infraest_fk1;
	//Descripcion
	@Column(name="SIN_DESCRIPCION")
	private String sin_descripcion;
	//Fecha
	@Column(name="SIN_FECHA")
	private java.util.Date sin_fecha;
	
	public Otg_sinfraest() {
		super();
	}
		
	public Otg_sinfraest(int sin_codigo, Otg_infraest otg_infraest_sinfraest_infraest_fk1, String sin_descripcion, java.util.Date sin_fecha) {
		this.sin_codigo = sin_codigo;
		this.otg_infraest_sinfraest_infraest_fk1 = otg_infraest_sinfraest_infraest_fk1;
		this.sin_descripcion = sin_descripcion;
		this.sin_fecha = sin_fecha;
	}
	
	public int getSin_codigo() {
		return this.sin_codigo;
	}
			
	public void setSin_codigo(int sin_codigo) {
		this.sin_codigo = sin_codigo;
	}

	public Otg_infraest getOtg_infraest_sinfraest_infraest_fk1() {
		return this.otg_infraest_sinfraest_infraest_fk1;
	}
			
	public void setOtg_infraest_sinfraest_infraest_fk1(Otg_infraest otg_infraest_sinfraest_infraest_fk1) {
		this.otg_infraest_sinfraest_infraest_fk1 = otg_infraest_sinfraest_infraest_fk1;
	}


	public String getSin_descripcion() {
		return this.sin_descripcion;
	}
			
	public void setSin_descripcion(String sin_descripcion) {
		this.sin_descripcion = sin_descripcion;
	}


	public java.util.Date getSin_fecha() {
		return this.sin_fecha;
	}
			
	public void setSin_fecha(java.util.Date sin_fecha) {
		this.sin_fecha = sin_fecha;
	}


}