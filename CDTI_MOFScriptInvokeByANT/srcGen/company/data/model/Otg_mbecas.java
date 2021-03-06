package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Modalidades de Becas
@Entity
@Table(schema="jpa")
public class Otg_mbecas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_MBE_CODIGO)
	@Id
	@Column(name="MBE_CODIGO")
	private int mbe_codigo;
	@OneToMany(mappedBy="otg_mbecas")
	private List<Otg_solicitudes> otg_solicitudess_solicitudess_mbecas_fk13;
	@OneToMany(mappedBy="otg_mbecas")
	private List<Otg_becas> otg_becass_becas_mbecas_fk1;
	//Nombre
	@Column(name="MBE_NOMBRE")
	private String mbe_nombre;
	//Tipo (PU: Publica, PR: Privada)
	@Column(name="MBE_TIPO")
	private String mbe_tipo;
	//Duracion maxima de renovaciones
	@Column(name="MBE_DURMAX")
	private int mbe_durmax;
	//Duracion minima
	@Column(name="MBE_DURINI")
	private int mbe_durini;
	//Duracion maxima
	@Column(name="MBE_DURFIN")
	private int mbe_durfin;
	
	public Otg_mbecas() {
		super();
	}
		
	public Otg_mbecas(int mbe_codigo, List<Otg_solicitudes> otg_solicitudess_solicitudess_mbecas_fk13, List<Otg_becas> otg_becass_becas_mbecas_fk1, String mbe_nombre, String mbe_tipo, int mbe_durmax, int mbe_durini, int mbe_durfin) {
		this.mbe_codigo = mbe_codigo;
		this.otg_solicitudess_solicitudess_mbecas_fk13 = otg_solicitudess_solicitudess_mbecas_fk13;
		this.otg_becass_becas_mbecas_fk1 = otg_becass_becas_mbecas_fk1;
		this.mbe_nombre = mbe_nombre;
		this.mbe_tipo = mbe_tipo;
		this.mbe_durmax = mbe_durmax;
		this.mbe_durini = mbe_durini;
		this.mbe_durfin = mbe_durfin;
	}
	
	public int getMbe_codigo() {
		return this.mbe_codigo;
	}
			
	public void setMbe_codigo(int mbe_codigo) {
		this.mbe_codigo = mbe_codigo;
	}
	public List<Otg_solicitudes> getOtg_solicitudess_solicitudess_mbecas_fk13() {
		return this.otg_solicitudess_solicitudess_mbecas_fk13;
	}
			
	public void setOtg_solicitudess_solicitudess_mbecas_fk13(List<Otg_solicitudes> otg_solicitudess_solicitudess_mbecas_fk13) {
		this.otg_solicitudess_solicitudess_mbecas_fk13 = otg_solicitudess_solicitudess_mbecas_fk13;
	}

	public List<Otg_becas> getOtg_becass_becas_mbecas_fk1() {
		return this.otg_becass_becas_mbecas_fk1;
	}
			
	public void setOtg_becass_becas_mbecas_fk1(List<Otg_becas> otg_becass_becas_mbecas_fk1) {
		this.otg_becass_becas_mbecas_fk1 = otg_becass_becas_mbecas_fk1;
	}


	public String getMbe_nombre() {
		return this.mbe_nombre;
	}
			
	public void setMbe_nombre(String mbe_nombre) {
		this.mbe_nombre = mbe_nombre;
	}


	public String getMbe_tipo() {
		return this.mbe_tipo;
	}
			
	public void setMbe_tipo(String mbe_tipo) {
		this.mbe_tipo = mbe_tipo;
	}


	public int getMbe_durmax() {
		return this.mbe_durmax;
	}
			
	public void setMbe_durmax(int mbe_durmax) {
		this.mbe_durmax = mbe_durmax;
	}


	public int getMbe_durini() {
		return this.mbe_durini;
	}
			
	public void setMbe_durini(int mbe_durini) {
		this.mbe_durini = mbe_durini;
	}


	public int getMbe_durfin() {
		return this.mbe_durfin;
	}
			
	public void setMbe_durfin(int mbe_durfin) {
		this.mbe_durfin = mbe_durfin;
	}


}