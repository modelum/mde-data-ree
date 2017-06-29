package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas participantes en contactos con Terceros
@Entity
@Table(schema="jpa")
public class Otg_percterceros implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PCT_PER_ID")
	private String pct_per_id;
	//Codigo del contacto (FK - OTG_CTERCEROS)
	@Id
	@Column(name="PCT_CTE_CODIGO")
	private int pct_cte_codigo;
	@ManyToOne
	@JoinColumn(name="CTE_CODIGO")
	private Otg_cterceros otg_cterceros_percterceros_cterceros_fk1;
	//Cargo
	@Column(name="PCT_CARGO")
	private String pct_cargo;
	
	public Otg_percterceros() {
		super();
	}
		
	public Otg_percterceros(String pct_per_id, int pct_cte_codigo, Otg_cterceros otg_cterceros_percterceros_cterceros_fk1, String pct_cargo) {
		this.pct_per_id = pct_per_id;
		this.pct_cte_codigo = pct_cte_codigo;
		this.otg_cterceros_percterceros_cterceros_fk1 = otg_cterceros_percterceros_cterceros_fk1;
		this.pct_cargo = pct_cargo;
	}
	
	public String getPct_per_id() {
		return this.pct_per_id;
	}
			
	public void setPct_per_id(String pct_per_id) {
		this.pct_per_id = pct_per_id;
	}

	public int getPct_cte_codigo() {
		return this.pct_cte_codigo;
	}
			
	public void setPct_cte_codigo(int pct_cte_codigo) {
		this.pct_cte_codigo = pct_cte_codigo;
	}
	public Otg_cterceros getOtg_cterceros_percterceros_cterceros_fk1() {
		return this.otg_cterceros_percterceros_cterceros_fk1;
	}
			
	public void setOtg_cterceros_percterceros_cterceros_fk1(Otg_cterceros otg_cterceros_percterceros_cterceros_fk1) {
		this.otg_cterceros_percterceros_cterceros_fk1 = otg_cterceros_percterceros_cterceros_fk1;
	}


	public String getPct_cargo() {
		return this.pct_cargo;
	}
			
	public void setPct_cargo(String pct_cargo) {
		this.pct_cargo = pct_cargo;
	}


}