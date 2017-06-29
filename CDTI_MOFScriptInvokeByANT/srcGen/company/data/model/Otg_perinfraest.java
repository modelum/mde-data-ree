package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas relacionadas con Infraestructuras
@Entity
@Table(schema="jpa")
public class Otg_perinfraest implements Serializable {
	private static final long serialVersionUID = 1L;

	//Identificador de la persona (FK - OTG_PERSONAS)
	@Id
	@Column(name="PIN_PER_ID")
	private String pin_per_id;
	//Codigo de la Infraestructura (FK - OTG_INFRAESTRUCTURAS)
	@Id
	@Column(name="PIN_INF_CODIGO")
	private int pin_inf_codigo;
	@ManyToOne
	@JoinColumn(name="INF_CODIGO")
	private Otg_infraest otg_infraest_perinfraest_infraest_fk1;
	//Investigador Principal (S, N)
	@Column(name="PIN_IP")
	private String pin_ip;
	
	public Otg_perinfraest() {
		super();
	}
		
	public Otg_perinfraest(String pin_per_id, int pin_inf_codigo, Otg_infraest otg_infraest_perinfraest_infraest_fk1, String pin_ip) {
		this.pin_per_id = pin_per_id;
		this.pin_inf_codigo = pin_inf_codigo;
		this.otg_infraest_perinfraest_infraest_fk1 = otg_infraest_perinfraest_infraest_fk1;
		this.pin_ip = pin_ip;
	}
	
	public String getPin_per_id() {
		return this.pin_per_id;
	}
			
	public void setPin_per_id(String pin_per_id) {
		this.pin_per_id = pin_per_id;
	}

	public int getPin_inf_codigo() {
		return this.pin_inf_codigo;
	}
			
	public void setPin_inf_codigo(int pin_inf_codigo) {
		this.pin_inf_codigo = pin_inf_codigo;
	}
	public Otg_infraest getOtg_infraest_perinfraest_infraest_fk1() {
		return this.otg_infraest_perinfraest_infraest_fk1;
	}
			
	public void setOtg_infraest_perinfraest_infraest_fk1(Otg_infraest otg_infraest_perinfraest_infraest_fk1) {
		this.otg_infraest_perinfraest_infraest_fk1 = otg_infraest_perinfraest_infraest_fk1;
	}


	public String getPin_ip() {
		return this.pin_ip;
	}
			
	public void setPin_ip(String pin_ip) {
		this.pin_ip = pin_ip;
	}


}