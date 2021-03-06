package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otw_html implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HTM_CODIGO")
	private int htm_codigo;
	@Column(name="HTM_TITULO")
	private String htm_titulo;
	@Column(name="HTM_DIRECCION")
	private String htm_direccion;
	@Column(name="HTM_ACTIVO")
	private String htm_activo;
	@Column(name="HTM_CARPETA")
	private String htm_carpeta;
	
	public Otw_html() {
		super();
	}
		
	public Otw_html(int htm_codigo, String htm_titulo, String htm_direccion, String htm_activo, String htm_carpeta) {
		this.htm_codigo = htm_codigo;
		this.htm_titulo = htm_titulo;
		this.htm_direccion = htm_direccion;
		this.htm_activo = htm_activo;
		this.htm_carpeta = htm_carpeta;
	}
	
	public int getHtm_codigo() {
		return this.htm_codigo;
	}
			
	public void setHtm_codigo(int htm_codigo) {
		this.htm_codigo = htm_codigo;
	}

	public String getHtm_titulo() {
		return this.htm_titulo;
	}
			
	public void setHtm_titulo(String htm_titulo) {
		this.htm_titulo = htm_titulo;
	}


	public String getHtm_direccion() {
		return this.htm_direccion;
	}
			
	public void setHtm_direccion(String htm_direccion) {
		this.htm_direccion = htm_direccion;
	}


	public String getHtm_activo() {
		return this.htm_activo;
	}
			
	public void setHtm_activo(String htm_activo) {
		this.htm_activo = htm_activo;
	}


	public String getHtm_carpeta() {
		return this.htm_carpeta;
	}
			
	public void setHtm_carpeta(String htm_carpeta) {
		this.htm_carpeta = htm_carpeta;
	}


}