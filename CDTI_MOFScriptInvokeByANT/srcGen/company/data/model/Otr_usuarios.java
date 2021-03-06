package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Usuarios
@Entity
@Table(schema="jpa")
public class Otr_usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USU_NOMBRE")
	private String usu_nombre;
	@Column(name="USU_CLAVE")
	private String usu_clave;
	@Column(name="USU_TIPO")
	private String usu_tipo;
	@Column(name="USU_NIVEL")
	private String usu_nivel;
	
	public Otr_usuarios() {
		super();
	}
		
	public Otr_usuarios(String usu_nombre, String usu_clave, String usu_tipo, String usu_nivel) {
		this.usu_nombre = usu_nombre;
		this.usu_clave = usu_clave;
		this.usu_tipo = usu_tipo;
		this.usu_nivel = usu_nivel;
	}
	
	public String getUsu_nombre() {
		return this.usu_nombre;
	}
			
	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}

	public String getUsu_clave() {
		return this.usu_clave;
	}
			
	public void setUsu_clave(String usu_clave) {
		this.usu_clave = usu_clave;
	}


	public String getUsu_tipo() {
		return this.usu_tipo;
	}
			
	public void setUsu_tipo(String usu_tipo) {
		this.usu_tipo = usu_tipo;
	}


	public String getUsu_nivel() {
		return this.usu_nivel;
	}
			
	public void setUsu_nivel(String usu_nivel) {
		this.usu_nivel = usu_nivel;
	}


}