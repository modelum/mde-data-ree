package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas de contacto (Terceros)
@Entity
@Table(schema="jpa")
public class Otg_perterceros implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PTE_PER_ID")
	private String pte_per_id;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="PTE_TER_CODIGO")
	private int pte_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_perterceros_terceros_fk1;
	//Cargo que desempena
	@Column(name="PTE_CARGO")
	private String pte_cargo;
	
	public Otg_perterceros() {
		super();
	}
		
	public Otg_perterceros(String pte_per_id, int pte_ter_codigo, Otg_terceros otg_terceros_perterceros_terceros_fk1, String pte_cargo) {
		this.pte_per_id = pte_per_id;
		this.pte_ter_codigo = pte_ter_codigo;
		this.otg_terceros_perterceros_terceros_fk1 = otg_terceros_perterceros_terceros_fk1;
		this.pte_cargo = pte_cargo;
	}
	
	public String getPte_per_id() {
		return this.pte_per_id;
	}
			
	public void setPte_per_id(String pte_per_id) {
		this.pte_per_id = pte_per_id;
	}

	public int getPte_ter_codigo() {
		return this.pte_ter_codigo;
	}
			
	public void setPte_ter_codigo(int pte_ter_codigo) {
		this.pte_ter_codigo = pte_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_perterceros_terceros_fk1() {
		return this.otg_terceros_perterceros_terceros_fk1;
	}
			
	public void setOtg_terceros_perterceros_terceros_fk1(Otg_terceros otg_terceros_perterceros_terceros_fk1) {
		this.otg_terceros_perterceros_terceros_fk1 = otg_terceros_perterceros_terceros_fk1;
	}


	public String getPte_cargo() {
		return this.pte_cargo;
	}
			
	public void setPte_cargo(String pte_cargo) {
		this.pte_cargo = pte_cargo;
	}


}