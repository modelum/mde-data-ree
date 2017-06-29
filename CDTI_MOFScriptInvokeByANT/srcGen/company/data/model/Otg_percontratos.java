package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas participantes en Contratos
@Entity
@Table(schema="jpa")
public class Otg_percontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PCO_PER_ID")
	private int pco_per_id;
	//Codigo del Contrato (FK - OTG_CONTRATOS)
	@Id
	@Column(name="PCO_CON_CODIGO")
	private int pco_con_codigo;
	@ManyToOne
	@JoinColumn(name="CON_CODIGO")
	private Otg_contratos otg_contratos_percontratos_contratos_fk1;
	//Investigador Principal (S, N)
	@Column(name="PCO_IP")
	private String pco_ip;
	
	public Otg_percontratos() {
		super();
	}
		
	public Otg_percontratos(int pco_per_id, int pco_con_codigo, Otg_contratos otg_contratos_percontratos_contratos_fk1, String pco_ip) {
		this.pco_per_id = pco_per_id;
		this.pco_con_codigo = pco_con_codigo;
		this.otg_contratos_percontratos_contratos_fk1 = otg_contratos_percontratos_contratos_fk1;
		this.pco_ip = pco_ip;
	}
	
	public int getPco_per_id() {
		return this.pco_per_id;
	}
			
	public void setPco_per_id(int pco_per_id) {
		this.pco_per_id = pco_per_id;
	}

	public int getPco_con_codigo() {
		return this.pco_con_codigo;
	}
			
	public void setPco_con_codigo(int pco_con_codigo) {
		this.pco_con_codigo = pco_con_codigo;
	}
	public Otg_contratos getOtg_contratos_percontratos_contratos_fk1() {
		return this.otg_contratos_percontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_percontratos_contratos_fk1(Otg_contratos otg_contratos_percontratos_contratos_fk1) {
		this.otg_contratos_percontratos_contratos_fk1 = otg_contratos_percontratos_contratos_fk1;
	}


	public String getPco_ip() {
		return this.pco_ip;
	}
			
	public void setPco_ip(String pco_ip) {
		this.pco_ip = pco_ip;
	}


}