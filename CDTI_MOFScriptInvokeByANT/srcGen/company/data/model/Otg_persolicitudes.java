package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas solicitantes (Convocatorias Nacionales)
@Entity
@Table(schema="jpa")
public class Otg_persolicitudes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PSO_PER_ID")
	private int pso_per_id;
	//Codigo de la solicitud (FK - OTG_SOLICITUDES)
	@Id
	@Column(name="PSO_SOL_CODIGO")
	private int pso_sol_codigo;
	@ManyToOne
	@JoinColumn(name="SOL_CODIGO")
	private Otg_solicitudes otg_solicitudes_persolicitudes_solicitudes_fk1;
	//Investigador principal (S, N)
	@Column(name="PSO_IP")
	private String pso_ip;
	
	public Otg_persolicitudes() {
		super();
	}
		
	public Otg_persolicitudes(int pso_per_id, int pso_sol_codigo, Otg_solicitudes otg_solicitudes_persolicitudes_solicitudes_fk1, String pso_ip) {
		this.pso_per_id = pso_per_id;
		this.pso_sol_codigo = pso_sol_codigo;
		this.otg_solicitudes_persolicitudes_solicitudes_fk1 = otg_solicitudes_persolicitudes_solicitudes_fk1;
		this.pso_ip = pso_ip;
	}
	
	public int getPso_per_id() {
		return this.pso_per_id;
	}
			
	public void setPso_per_id(int pso_per_id) {
		this.pso_per_id = pso_per_id;
	}

	public int getPso_sol_codigo() {
		return this.pso_sol_codigo;
	}
			
	public void setPso_sol_codigo(int pso_sol_codigo) {
		this.pso_sol_codigo = pso_sol_codigo;
	}
	public Otg_solicitudes getOtg_solicitudes_persolicitudes_solicitudes_fk1() {
		return this.otg_solicitudes_persolicitudes_solicitudes_fk1;
	}
			
	public void setOtg_solicitudes_persolicitudes_solicitudes_fk1(Otg_solicitudes otg_solicitudes_persolicitudes_solicitudes_fk1) {
		this.otg_solicitudes_persolicitudes_solicitudes_fk1 = otg_solicitudes_persolicitudes_solicitudes_fk1;
	}


	public String getPso_ip() {
		return this.pso_ip;
	}
			
	public void setPso_ip(String pso_ip) {
		this.pso_ip = pso_ip;
	}


}