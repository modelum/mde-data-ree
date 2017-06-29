package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Estado de solicitudes
@Entity
@Table(schema="jpa")
public class Otg_esolicitudes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno
	@Id
	@Column(name="ESO_CODIGO")
	private String eso_codigo;
	@OneToMany(mappedBy="otg_esolicitudes")
	private List<Otg_seuropeos> otg_seuropeoss_seuropeos_esolicitudes_fk4;
	@OneToMany(mappedBy="otg_esolicitudes")
	private List<Otg_solicitudes> otg_solicitudess_solicitudes_esolicitudes_fk8;
	//Nombre
	@Column(name="ESO_NOMBRE")
	private String eso_nombre;
	
	public Otg_esolicitudes() {
		super();
	}
		
	public Otg_esolicitudes(String eso_codigo, List<Otg_seuropeos> otg_seuropeoss_seuropeos_esolicitudes_fk4, List<Otg_solicitudes> otg_solicitudess_solicitudes_esolicitudes_fk8, String eso_nombre) {
		this.eso_codigo = eso_codigo;
		this.otg_seuropeoss_seuropeos_esolicitudes_fk4 = otg_seuropeoss_seuropeos_esolicitudes_fk4;
		this.otg_solicitudess_solicitudes_esolicitudes_fk8 = otg_solicitudess_solicitudes_esolicitudes_fk8;
		this.eso_nombre = eso_nombre;
	}
	
	public String getEso_codigo() {
		return this.eso_codigo;
	}
			
	public void setEso_codigo(String eso_codigo) {
		this.eso_codigo = eso_codigo;
	}
	public List<Otg_seuropeos> getOtg_seuropeoss_seuropeos_esolicitudes_fk4() {
		return this.otg_seuropeoss_seuropeos_esolicitudes_fk4;
	}
			
	public void setOtg_seuropeoss_seuropeos_esolicitudes_fk4(List<Otg_seuropeos> otg_seuropeoss_seuropeos_esolicitudes_fk4) {
		this.otg_seuropeoss_seuropeos_esolicitudes_fk4 = otg_seuropeoss_seuropeos_esolicitudes_fk4;
	}

	public List<Otg_solicitudes> getOtg_solicitudess_solicitudes_esolicitudes_fk8() {
		return this.otg_solicitudess_solicitudes_esolicitudes_fk8;
	}
			
	public void setOtg_solicitudess_solicitudes_esolicitudes_fk8(List<Otg_solicitudes> otg_solicitudess_solicitudes_esolicitudes_fk8) {
		this.otg_solicitudess_solicitudes_esolicitudes_fk8 = otg_solicitudess_solicitudes_esolicitudes_fk8;
	}


	public String getEso_nombre() {
		return this.eso_nombre;
	}
			
	public void setEso_nombre(String eso_nombre) {
		this.eso_nombre = eso_nombre;
	}


}