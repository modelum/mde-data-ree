package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Unidades organizativas de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_upeuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del proyecto europeo (FK - OTG_PEUROPEOS)
	@Id
	@Column(name="UPE_PEU_CODIGO")
	private int upe_peu_codigo;
	@OneToOne(mappedBy="otg_upeuropeos")
	@PrimaryKeyJoinColumn
	private Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1;
	//Codigo de la unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Id
	@Column(name="UPE_UOR_CODIGO")
	private int upe_uor_codigo;
	
	public Otg_upeuropeos() {
		super();
	}
		
	public Otg_upeuropeos(int upe_peu_codigo, Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1, int upe_uor_codigo) {
		this.upe_peu_codigo = upe_peu_codigo;
		this.otg_peuropeos_useuropeos_peuropeos_fk1 = otg_peuropeos_useuropeos_peuropeos_fk1;
		this.upe_uor_codigo = upe_uor_codigo;
	}
	
	public int getUpe_peu_codigo() {
		return this.upe_peu_codigo;
	}
			
	public void setUpe_peu_codigo(int upe_peu_codigo) {
		this.upe_peu_codigo = upe_peu_codigo;
	}
	public Otg_peuropeos getOtg_peuropeos_useuropeos_peuropeos_fk1() {
		return this.otg_peuropeos_useuropeos_peuropeos_fk1;
	}
			
	public void setOtg_peuropeos_useuropeos_peuropeos_fk1(Otg_peuropeos otg_peuropeos_useuropeos_peuropeos_fk1) {
		this.otg_peuropeos_useuropeos_peuropeos_fk1 = otg_peuropeos_useuropeos_peuropeos_fk1;
	}


	public int getUpe_uor_codigo() {
		return this.upe_uor_codigo;
	}
			
	public void setUpe_uor_codigo(int upe_uor_codigo) {
		this.upe_uor_codigo = upe_uor_codigo;
	}

}