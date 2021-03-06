package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otw_tablon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TAB_NUMERO")
	private int tab_numero;
	@Column(name="TAB_TITULO")
	private String tab_titulo;
	@Column(name="TAB_DESCRIP")
	private String tab_descrip;
	@Column(name="TAB_ACTIVO")
	private String tab_activo;
	
	public Otw_tablon() {
		super();
	}
		
	public Otw_tablon(int tab_numero, String tab_titulo, String tab_descrip, String tab_activo) {
		this.tab_numero = tab_numero;
		this.tab_titulo = tab_titulo;
		this.tab_descrip = tab_descrip;
		this.tab_activo = tab_activo;
	}
	
	public int getTab_numero() {
		return this.tab_numero;
	}
			
	public void setTab_numero(int tab_numero) {
		this.tab_numero = tab_numero;
	}

	public String getTab_titulo() {
		return this.tab_titulo;
	}
			
	public void setTab_titulo(String tab_titulo) {
		this.tab_titulo = tab_titulo;
	}


	public String getTab_descrip() {
		return this.tab_descrip;
	}
			
	public void setTab_descrip(String tab_descrip) {
		this.tab_descrip = tab_descrip;
	}


	public String getTab_activo() {
		return this.tab_activo;
	}
			
	public void setTab_activo(String tab_activo) {
		this.tab_activo = tab_activo;
	}


}