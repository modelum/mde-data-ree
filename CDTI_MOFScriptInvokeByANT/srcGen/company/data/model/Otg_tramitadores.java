package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Organismos encargados de la tramitacion de contratos.
@Entity
@Table(schema="jpa")
public class Otg_tramitadores implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno
	@Id
	@Column(name="TRA_CODIGO")
	private String tra_codigo;
	@OneToMany(mappedBy="otg_tramitadores")
	private List<Otg_contratos_secretaria> otg_contratos_secretarias_contratos_sec_tramitadores_fk1;
	//Nombre del organismo tramitador
	@Column(name="TRA_NOMBRE")
	private String tra_nombre;
	
	public Otg_tramitadores() {
		super();
	}
		
	public Otg_tramitadores(String tra_codigo, List<Otg_contratos_secretaria> otg_contratos_secretarias_contratos_sec_tramitadores_fk1, String tra_nombre) {
		this.tra_codigo = tra_codigo;
		this.otg_contratos_secretarias_contratos_sec_tramitadores_fk1 = otg_contratos_secretarias_contratos_sec_tramitadores_fk1;
		this.tra_nombre = tra_nombre;
	}
	
	public String getTra_codigo() {
		return this.tra_codigo;
	}
			
	public void setTra_codigo(String tra_codigo) {
		this.tra_codigo = tra_codigo;
	}
	public List<Otg_contratos_secretaria> getOtg_contratos_secretarias_contratos_sec_tramitadores_fk1() {
		return this.otg_contratos_secretarias_contratos_sec_tramitadores_fk1;
	}
			
	public void setOtg_contratos_secretarias_contratos_sec_tramitadores_fk1(List<Otg_contratos_secretaria> otg_contratos_secretarias_contratos_sec_tramitadores_fk1) {
		this.otg_contratos_secretarias_contratos_sec_tramitadores_fk1 = otg_contratos_secretarias_contratos_sec_tramitadores_fk1;
	}


	public String getTra_nombre() {
		return this.tra_nombre;
	}
			
	public void setTra_nombre(String tra_nombre) {
		this.tra_nombre = tra_nombre;
	}


}