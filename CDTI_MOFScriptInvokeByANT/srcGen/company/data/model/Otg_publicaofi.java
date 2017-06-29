package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Publicaciones Oficiales
@Entity
@Table(schema="jpa")
public class Otg_publicaofi implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Intero (Secuencia S_PUB_CODIGO)
	@Id
	@Column(name="PUB_CODIGO")
	private int pub_codigo;
	@OneToMany(mappedBy="otg_publicaofi")
	private List<Otg_convocatorias> otg_convocatoriass_convocatorias_publicaofi_fk1;
	@OneToMany(mappedBy="otg_publicaofi")
	private List<Otg_programas> otg_programass_programas_publicaofi_fk1;
	//Nombre
	@Column(name="PUB_NOMBRE")
	private String pub_nombre;
	
	public Otg_publicaofi() {
		super();
	}
		
	public Otg_publicaofi(int pub_codigo, List<Otg_convocatorias> otg_convocatoriass_convocatorias_publicaofi_fk1, List<Otg_programas> otg_programass_programas_publicaofi_fk1, String pub_nombre) {
		this.pub_codigo = pub_codigo;
		this.otg_convocatoriass_convocatorias_publicaofi_fk1 = otg_convocatoriass_convocatorias_publicaofi_fk1;
		this.otg_programass_programas_publicaofi_fk1 = otg_programass_programas_publicaofi_fk1;
		this.pub_nombre = pub_nombre;
	}
	
	public int getPub_codigo() {
		return this.pub_codigo;
	}
			
	public void setPub_codigo(int pub_codigo) {
		this.pub_codigo = pub_codigo;
	}
	public List<Otg_convocatorias> getOtg_convocatoriass_convocatorias_publicaofi_fk1() {
		return this.otg_convocatoriass_convocatorias_publicaofi_fk1;
	}
			
	public void setOtg_convocatoriass_convocatorias_publicaofi_fk1(List<Otg_convocatorias> otg_convocatoriass_convocatorias_publicaofi_fk1) {
		this.otg_convocatoriass_convocatorias_publicaofi_fk1 = otg_convocatoriass_convocatorias_publicaofi_fk1;
	}

	public List<Otg_programas> getOtg_programass_programas_publicaofi_fk1() {
		return this.otg_programass_programas_publicaofi_fk1;
	}
			
	public void setOtg_programass_programas_publicaofi_fk1(List<Otg_programas> otg_programass_programas_publicaofi_fk1) {
		this.otg_programass_programas_publicaofi_fk1 = otg_programass_programas_publicaofi_fk1;
	}


	public String getPub_nombre() {
		return this.pub_nombre;
	}
			
	public void setPub_nombre(String pub_nombre) {
		this.pub_nombre = pub_nombre;
	}


}