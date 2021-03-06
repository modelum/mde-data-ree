package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Modos de  participacion (Terceros)
@Entity
@Table(schema="jpa")
public class Otg_ptconvocatorias implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno
	@Id
	@Column(name="PTC_CODIGO")
	private String ptc_codigo;
	@OneToMany(mappedBy="otg_ptconvocatorias")
	private List<Otg_tviajes> otg_tviajess_tviajes_ptconvocator_fk3;
	@OneToMany(mappedBy="otg_ptconvocatorias")
	private List<Otg_tinfraest> otg_tinfraests_tinfraest_ptconvocator_fk3;
	@OneToMany(mappedBy="otg_ptconvocatorias")
	private List<Otg_tproyectos> otg_tproyectoss_tproyectos_ptconvocator_fk3;
	@OneToMany(mappedBy="otg_ptconvocatorias")
	private List<Otg_tbecas> otg_tbecass_tbecas_ptconvocator_fk3;
	@OneToMany(mappedBy="otg_ptconvocatorias")
	private List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_ptconvocator_fk3;
	//Nombre
	@Column(name="PTC_NOMBRE")
	private String ptc_nombre;
	
	public Otg_ptconvocatorias() {
		super();
	}
		
	public Otg_ptconvocatorias(String ptc_codigo, List<Otg_tviajes> otg_tviajess_tviajes_ptconvocator_fk3, List<Otg_tinfraest> otg_tinfraests_tinfraest_ptconvocator_fk3, List<Otg_tproyectos> otg_tproyectoss_tproyectos_ptconvocator_fk3, List<Otg_tbecas> otg_tbecass_tbecas_ptconvocator_fk3, List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_ptconvocator_fk3, String ptc_nombre) {
		this.ptc_codigo = ptc_codigo;
		this.otg_tviajess_tviajes_ptconvocator_fk3 = otg_tviajess_tviajes_ptconvocator_fk3;
		this.otg_tinfraests_tinfraest_ptconvocator_fk3 = otg_tinfraests_tinfraest_ptconvocator_fk3;
		this.otg_tproyectoss_tproyectos_ptconvocator_fk3 = otg_tproyectoss_tproyectos_ptconvocator_fk3;
		this.otg_tbecass_tbecas_ptconvocator_fk3 = otg_tbecass_tbecas_ptconvocator_fk3;
		this.otg_tconvocatoriass_tconvocator_ptconvocator_fk3 = otg_tconvocatoriass_tconvocator_ptconvocator_fk3;
		this.ptc_nombre = ptc_nombre;
	}
	
	public String getPtc_codigo() {
		return this.ptc_codigo;
	}
			
	public void setPtc_codigo(String ptc_codigo) {
		this.ptc_codigo = ptc_codigo;
	}
	public List<Otg_tviajes> getOtg_tviajess_tviajes_ptconvocator_fk3() {
		return this.otg_tviajess_tviajes_ptconvocator_fk3;
	}
			
	public void setOtg_tviajess_tviajes_ptconvocator_fk3(List<Otg_tviajes> otg_tviajess_tviajes_ptconvocator_fk3) {
		this.otg_tviajess_tviajes_ptconvocator_fk3 = otg_tviajess_tviajes_ptconvocator_fk3;
	}

	public List<Otg_tinfraest> getOtg_tinfraests_tinfraest_ptconvocator_fk3() {
		return this.otg_tinfraests_tinfraest_ptconvocator_fk3;
	}
			
	public void setOtg_tinfraests_tinfraest_ptconvocator_fk3(List<Otg_tinfraest> otg_tinfraests_tinfraest_ptconvocator_fk3) {
		this.otg_tinfraests_tinfraest_ptconvocator_fk3 = otg_tinfraests_tinfraest_ptconvocator_fk3;
	}

	public List<Otg_tproyectos> getOtg_tproyectoss_tproyectos_ptconvocator_fk3() {
		return this.otg_tproyectoss_tproyectos_ptconvocator_fk3;
	}
			
	public void setOtg_tproyectoss_tproyectos_ptconvocator_fk3(List<Otg_tproyectos> otg_tproyectoss_tproyectos_ptconvocator_fk3) {
		this.otg_tproyectoss_tproyectos_ptconvocator_fk3 = otg_tproyectoss_tproyectos_ptconvocator_fk3;
	}

	public List<Otg_tbecas> getOtg_tbecass_tbecas_ptconvocator_fk3() {
		return this.otg_tbecass_tbecas_ptconvocator_fk3;
	}
			
	public void setOtg_tbecass_tbecas_ptconvocator_fk3(List<Otg_tbecas> otg_tbecass_tbecas_ptconvocator_fk3) {
		this.otg_tbecass_tbecas_ptconvocator_fk3 = otg_tbecass_tbecas_ptconvocator_fk3;
	}

	public List<Otg_tconvocatorias> getOtg_tconvocatoriass_tconvocator_ptconvocator_fk3() {
		return this.otg_tconvocatoriass_tconvocator_ptconvocator_fk3;
	}
			
	public void setOtg_tconvocatoriass_tconvocator_ptconvocator_fk3(List<Otg_tconvocatorias> otg_tconvocatoriass_tconvocator_ptconvocator_fk3) {
		this.otg_tconvocatoriass_tconvocator_ptconvocator_fk3 = otg_tconvocatoriass_tconvocator_ptconvocator_fk3;
	}


	public String getPtc_nombre() {
		return this.ptc_nombre;
	}
			
	public void setPtc_nombre(String ptc_nombre) {
		this.ptc_nombre = ptc_nombre;
	}


}