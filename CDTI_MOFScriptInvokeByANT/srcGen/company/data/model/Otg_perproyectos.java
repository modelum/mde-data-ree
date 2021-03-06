package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas participantes en proyectos nacionales
@Entity
@Table(schema="jpa")
public class Otg_perproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PPR_PER_ID")
	private String ppr_per_id;
	//Codigo del proyecto (FK - OTG_PROYECTOS)
	@Id
	@Column(name="PPR_PRO_CODIGO")
	private int ppr_pro_codigo;
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_perproyectos_proyectos_fk1;
	//Investigador principal (S, N)
	@Column(name="PPR_IP")
	private String ppr_ip;
	@Column(name="PPR_TDEDICA")
	private String ppr_tdedica;
	@Column(name="PPR_HDEDICA")
	private int ppr_hdedica;
	
	public Otg_perproyectos() {
		super();
	}
		
	public Otg_perproyectos(String ppr_per_id, int ppr_pro_codigo, Otg_proyectos otg_proyectos_perproyectos_proyectos_fk1, String ppr_ip, String ppr_tdedica, int ppr_hdedica) {
		this.ppr_per_id = ppr_per_id;
		this.ppr_pro_codigo = ppr_pro_codigo;
		this.otg_proyectos_perproyectos_proyectos_fk1 = otg_proyectos_perproyectos_proyectos_fk1;
		this.ppr_ip = ppr_ip;
		this.ppr_tdedica = ppr_tdedica;
		this.ppr_hdedica = ppr_hdedica;
	}
	
	public String getPpr_per_id() {
		return this.ppr_per_id;
	}
			
	public void setPpr_per_id(String ppr_per_id) {
		this.ppr_per_id = ppr_per_id;
	}

	public int getPpr_pro_codigo() {
		return this.ppr_pro_codigo;
	}
			
	public void setPpr_pro_codigo(int ppr_pro_codigo) {
		this.ppr_pro_codigo = ppr_pro_codigo;
	}
	public Otg_proyectos getOtg_proyectos_perproyectos_proyectos_fk1() {
		return this.otg_proyectos_perproyectos_proyectos_fk1;
	}
			
	public void setOtg_proyectos_perproyectos_proyectos_fk1(Otg_proyectos otg_proyectos_perproyectos_proyectos_fk1) {
		this.otg_proyectos_perproyectos_proyectos_fk1 = otg_proyectos_perproyectos_proyectos_fk1;
	}


	public String getPpr_ip() {
		return this.ppr_ip;
	}
			
	public void setPpr_ip(String ppr_ip) {
		this.ppr_ip = ppr_ip;
	}


	public String getPpr_tdedica() {
		return this.ppr_tdedica;
	}
			
	public void setPpr_tdedica(String ppr_tdedica) {
		this.ppr_tdedica = ppr_tdedica;
	}


	public int getPpr_hdedica() {
		return this.ppr_hdedica;
	}
			
	public void setPpr_hdedica(int ppr_hdedica) {
		this.ppr_hdedica = ppr_hdedica;
	}


}