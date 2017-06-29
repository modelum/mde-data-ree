package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otg_cgtipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CGT_CODIGO")
	private String cgt_codigo;
	@Id
	@Column(name="CGT_TIPO")
	private String cgt_tipo;
	@Column(name="CGT_NOMBRE")
	private String cgt_nombre;
	
	public Otg_cgtipo() {
		super();
	}
		
	public Otg_cgtipo(String cgt_codigo, String cgt_tipo, String cgt_nombre) {
		this.cgt_codigo = cgt_codigo;
		this.cgt_tipo = cgt_tipo;
		this.cgt_nombre = cgt_nombre;
	}
	
	public String getCgt_codigo() {
		return this.cgt_codigo;
	}
			
	public void setCgt_codigo(String cgt_codigo) {
		this.cgt_codigo = cgt_codigo;
	}

	public String getCgt_tipo() {
		return this.cgt_tipo;
	}
			
	public void setCgt_tipo(String cgt_tipo) {
		this.cgt_tipo = cgt_tipo;
	}

	public String getCgt_nombre() {
		return this.cgt_nombre;
	}
			
	public void setCgt_nombre(String cgt_nombre) {
		this.cgt_nombre = cgt_nombre;
	}


}