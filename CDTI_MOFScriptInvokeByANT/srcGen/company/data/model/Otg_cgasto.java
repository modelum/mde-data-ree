package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otg_cgasto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CGA_CG")
	private String cga_cg;
	@Column(name="CGA_CAMPO")
	private String cga_campo;
	@Column(name="CGA_OBJET")
	private String cga_objet;
	@Column(name="CGA_TIPO")
	private String cga_tipo;
	@Column(name="CGA_ORIG")
	private String cga_orig;
	
	public Otg_cgasto() {
		super();
	}
		
	public Otg_cgasto(String cga_cg, String cga_campo, String cga_objet, String cga_tipo, String cga_orig) {
		this.cga_cg = cga_cg;
		this.cga_campo = cga_campo;
		this.cga_objet = cga_objet;
		this.cga_tipo = cga_tipo;
		this.cga_orig = cga_orig;
	}
	
	public String getCga_cg() {
		return this.cga_cg;
	}
			
	public void setCga_cg(String cga_cg) {
		this.cga_cg = cga_cg;
	}

	public String getCga_campo() {
		return this.cga_campo;
	}
			
	public void setCga_campo(String cga_campo) {
		this.cga_campo = cga_campo;
	}


	public String getCga_objet() {
		return this.cga_objet;
	}
			
	public void setCga_objet(String cga_objet) {
		this.cga_objet = cga_objet;
	}


	public String getCga_tipo() {
		return this.cga_tipo;
	}
			
	public void setCga_tipo(String cga_tipo) {
		this.cga_tipo = cga_tipo;
	}


	public String getCga_orig() {
		return this.cga_orig;
	}
			
	public void setCga_orig(String cga_orig) {
		this.cga_orig = cga_orig;
	}


}