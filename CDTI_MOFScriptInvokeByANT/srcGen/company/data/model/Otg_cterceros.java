package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Contactos con Terceros
@Entity
@Table(schema="jpa")
public class Otg_cterceros implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_CTE_CODIGO)
	@Id
	@Column(name="CTE_CODIGO")
	private int cte_codigo;
	@OneToMany(mappedBy="otg_cterceros")
	private List<Otg_percterceros> otg_percterceross_percterceros_cterceros_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Column(name="CTE_TER_CODIGO")
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_cterceros_terceros_fk1;
	//Descripcion
	@Column(name="CTE_DESCRIPCION")
	private String cte_descripcion;
	//Fecha
	@Column(name="CTE_FECHA")
	private java.util.Date cte_fecha;
	
	public Otg_cterceros() {
		super();
	}
		
	public Otg_cterceros(int cte_codigo, List<Otg_percterceros> otg_percterceross_percterceros_cterceros_fk1, Otg_terceros otg_terceros_cterceros_terceros_fk1, String cte_descripcion, java.util.Date cte_fecha) {
		this.cte_codigo = cte_codigo;
		this.otg_percterceross_percterceros_cterceros_fk1 = otg_percterceross_percterceros_cterceros_fk1;
		this.otg_terceros_cterceros_terceros_fk1 = otg_terceros_cterceros_terceros_fk1;
		this.cte_descripcion = cte_descripcion;
		this.cte_fecha = cte_fecha;
	}
	
	public int getCte_codigo() {
		return this.cte_codigo;
	}
			
	public void setCte_codigo(int cte_codigo) {
		this.cte_codigo = cte_codigo;
	}
	public List<Otg_percterceros> getOtg_percterceross_percterceros_cterceros_fk1() {
		return this.otg_percterceross_percterceros_cterceros_fk1;
	}
			
	public void setOtg_percterceross_percterceros_cterceros_fk1(List<Otg_percterceros> otg_percterceross_percterceros_cterceros_fk1) {
		this.otg_percterceross_percterceros_cterceros_fk1 = otg_percterceross_percterceros_cterceros_fk1;
	}


	public Otg_terceros getOtg_terceros_cterceros_terceros_fk1() {
		return this.otg_terceros_cterceros_terceros_fk1;
	}
			
	public void setOtg_terceros_cterceros_terceros_fk1(Otg_terceros otg_terceros_cterceros_terceros_fk1) {
		this.otg_terceros_cterceros_terceros_fk1 = otg_terceros_cterceros_terceros_fk1;
	}


	public String getCte_descripcion() {
		return this.cte_descripcion;
	}
			
	public void setCte_descripcion(String cte_descripcion) {
		this.cte_descripcion = cte_descripcion;
	}


	public java.util.Date getCte_fecha() {
		return this.cte_fecha;
	}
			
	public void setCte_fecha(java.util.Date cte_fecha) {
		this.cte_fecha = cte_fecha;
	}


}