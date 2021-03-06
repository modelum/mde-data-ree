package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Formas de pago
@Entity
@Table(schema="jpa")
public class Otg_fpagos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno
	@Id
	@Column(name="FPA_CODIGO")
	private String fpa_codigo;
	@OneToMany(mappedBy="otg_fpagos")
	private List<Otg_contratos> otg_contratoss_contratos_fpagos_fk4;
	//Nombre
	@Column(name="FPA_NOMBRE")
	private String fpa_nombre;
	
	public Otg_fpagos() {
		super();
	}
		
	public Otg_fpagos(String fpa_codigo, List<Otg_contratos> otg_contratoss_contratos_fpagos_fk4, String fpa_nombre) {
		this.fpa_codigo = fpa_codigo;
		this.otg_contratoss_contratos_fpagos_fk4 = otg_contratoss_contratos_fpagos_fk4;
		this.fpa_nombre = fpa_nombre;
	}
	
	public String getFpa_codigo() {
		return this.fpa_codigo;
	}
			
	public void setFpa_codigo(String fpa_codigo) {
		this.fpa_codigo = fpa_codigo;
	}
	public List<Otg_contratos> getOtg_contratoss_contratos_fpagos_fk4() {
		return this.otg_contratoss_contratos_fpagos_fk4;
	}
			
	public void setOtg_contratoss_contratos_fpagos_fk4(List<Otg_contratos> otg_contratoss_contratos_fpagos_fk4) {
		this.otg_contratoss_contratos_fpagos_fk4 = otg_contratoss_contratos_fpagos_fk4;
	}


	public String getFpa_nombre() {
		return this.fpa_nombre;
	}
			
	public void setFpa_nombre(String fpa_nombre) {
		this.fpa_nombre = fpa_nombre;
	}


}