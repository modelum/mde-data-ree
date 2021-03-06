package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otw_direcciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DIR_NUMERO")
	private int dir_numero;
	@Column(name="DIR_NOMBRE")
	private String dir_nombre;
	@Column(name="DIR_ENLACE")
	private String dir_enlace;
	
	public Otw_direcciones() {
		super();
	}
		
	public Otw_direcciones(int dir_numero, String dir_nombre, String dir_enlace) {
		this.dir_numero = dir_numero;
		this.dir_nombre = dir_nombre;
		this.dir_enlace = dir_enlace;
	}
	
	public int getDir_numero() {
		return this.dir_numero;
	}
			
	public void setDir_numero(int dir_numero) {
		this.dir_numero = dir_numero;
	}

	public String getDir_nombre() {
		return this.dir_nombre;
	}
			
	public void setDir_nombre(String dir_nombre) {
		this.dir_nombre = dir_nombre;
	}


	public String getDir_enlace() {
		return this.dir_enlace;
	}
			
	public void setDir_enlace(String dir_enlace) {
		this.dir_enlace = dir_enlace;
	}


}