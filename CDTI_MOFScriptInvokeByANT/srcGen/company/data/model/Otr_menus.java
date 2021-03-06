package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Menus
@Entity
@Table(schema="jpa")
public class Otr_menus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEN_CODIGO")
	private int men_codigo;
	@Column(name="MEN_MENU")
	private int men_menu;
	@Column(name="MEN_OPCION")
	private int men_opcion;
	@Column(name="MEN_PADRE")
	private int men_padre;
	@Column(name="MEN_NOMBRE")
	private String men_nombre;
	@Column(name="MEN_TACCION")
	private String men_taccion;
	@Column(name="MEN_ACCION")
	private String men_accion;
	@Column(name="MEN_ROLE")
	private int men_role;
	@Column(name="MEN_NROLE")
	private int men_nrole;
	@Column(name="MEN_GLOBALSEL")
	private String men_globalsel;
	
	public Otr_menus() {
		super();
	}
		
	public Otr_menus(int men_codigo, int men_menu, int men_opcion, int men_padre, String men_nombre, String men_taccion, String men_accion, int men_role, int men_nrole, String men_globalsel) {
		this.men_codigo = men_codigo;
		this.men_menu = men_menu;
		this.men_opcion = men_opcion;
		this.men_padre = men_padre;
		this.men_nombre = men_nombre;
		this.men_taccion = men_taccion;
		this.men_accion = men_accion;
		this.men_role = men_role;
		this.men_nrole = men_nrole;
		this.men_globalsel = men_globalsel;
	}
	
	public int getMen_codigo() {
		return this.men_codigo;
	}
			
	public void setMen_codigo(int men_codigo) {
		this.men_codigo = men_codigo;
	}

	public int getMen_menu() {
		return this.men_menu;
	}
			
	public void setMen_menu(int men_menu) {
		this.men_menu = men_menu;
	}


	public int getMen_opcion() {
		return this.men_opcion;
	}
			
	public void setMen_opcion(int men_opcion) {
		this.men_opcion = men_opcion;
	}


	public int getMen_padre() {
		return this.men_padre;
	}
			
	public void setMen_padre(int men_padre) {
		this.men_padre = men_padre;
	}


	public String getMen_nombre() {
		return this.men_nombre;
	}
			
	public void setMen_nombre(String men_nombre) {
		this.men_nombre = men_nombre;
	}


	public String getMen_taccion() {
		return this.men_taccion;
	}
			
	public void setMen_taccion(String men_taccion) {
		this.men_taccion = men_taccion;
	}


	public String getMen_accion() {
		return this.men_accion;
	}
			
	public void setMen_accion(String men_accion) {
		this.men_accion = men_accion;
	}


	public int getMen_role() {
		return this.men_role;
	}
			
	public void setMen_role(int men_role) {
		this.men_role = men_role;
	}


	public int getMen_nrole() {
		return this.men_nrole;
	}
			
	public void setMen_nrole(int men_nrole) {
		this.men_nrole = men_nrole;
	}


	public String getMen_globalsel() {
		return this.men_globalsel;
	}
			
	public void setMen_globalsel(String men_globalsel) {
		this.men_globalsel = men_globalsel;
	}


}