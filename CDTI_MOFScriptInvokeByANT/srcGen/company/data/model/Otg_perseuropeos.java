package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas solicitantes de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_perseuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PSE_PER_ID")
	private int pse_per_id;
	//Codigo de la solicitud de proyecto europeo (FK - OTG_SEUROPEOS)
	@Id
	@Column(name="PSE_SEU_CODIGO")
	private int pse_seu_codigo;
	@ManyToOne
	@JoinColumn(name="SEU_CODIGO")
	private Otg_seuropeos otg_seuropeos_perseuropeos_seuropeos_fk1;
	//Investigador Principal (S, N)
	@Column(name="PSE_IP")
	private String pse_ip;
	
	public Otg_perseuropeos() {
		super();
	}
		
	public Otg_perseuropeos(int pse_per_id, int pse_seu_codigo, Otg_seuropeos otg_seuropeos_perseuropeos_seuropeos_fk1, String pse_ip) {
		this.pse_per_id = pse_per_id;
		this.pse_seu_codigo = pse_seu_codigo;
		this.otg_seuropeos_perseuropeos_seuropeos_fk1 = otg_seuropeos_perseuropeos_seuropeos_fk1;
		this.pse_ip = pse_ip;
	}
	
	public int getPse_per_id() {
		return this.pse_per_id;
	}
			
	public void setPse_per_id(int pse_per_id) {
		this.pse_per_id = pse_per_id;
	}

	public int getPse_seu_codigo() {
		return this.pse_seu_codigo;
	}
			
	public void setPse_seu_codigo(int pse_seu_codigo) {
		this.pse_seu_codigo = pse_seu_codigo;
	}
	public Otg_seuropeos getOtg_seuropeos_perseuropeos_seuropeos_fk1() {
		return this.otg_seuropeos_perseuropeos_seuropeos_fk1;
	}
			
	public void setOtg_seuropeos_perseuropeos_seuropeos_fk1(Otg_seuropeos otg_seuropeos_perseuropeos_seuropeos_fk1) {
		this.otg_seuropeos_perseuropeos_seuropeos_fk1 = otg_seuropeos_perseuropeos_seuropeos_fk1;
	}


	public String getPse_ip() {
		return this.pse_ip;
	}
			
	public void setPse_ip(String pse_ip) {
		this.pse_ip = pse_ip;
	}


}