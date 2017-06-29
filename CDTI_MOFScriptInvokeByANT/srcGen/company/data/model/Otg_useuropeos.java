package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Unidades organizativas de solicitudes de proyectos europeos
@Entity
@Table(schema="jpa")
public class Otg_useuropeos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la solicitud de proyecto europeo (FK - OTG_SEUROPEOS)
	@Id
	@Column(name="USE_SEU_CODIGO")
	private int use_seu_codigo;
	@OneToOne(mappedBy="otg_useuropeos")
	@PrimaryKeyJoinColumn
	private Otg_seuropeos otg_seuropeos_useuropeos_seuropeos_fk1;
	//Codigo de la unidad organizativa (FK - GEA_UORGANIZATIVA)
	@Id
	@Column(name="USE_UOR_CODIGO")
	private int use_uor_codigo;
	
	public Otg_useuropeos() {
		super();
	}
		
	public Otg_useuropeos(int use_seu_codigo, Otg_seuropeos otg_seuropeos_useuropeos_seuropeos_fk1, int use_uor_codigo) {
		this.use_seu_codigo = use_seu_codigo;
		this.otg_seuropeos_useuropeos_seuropeos_fk1 = otg_seuropeos_useuropeos_seuropeos_fk1;
		this.use_uor_codigo = use_uor_codigo;
	}
	
	public int getUse_seu_codigo() {
		return this.use_seu_codigo;
	}
			
	public void setUse_seu_codigo(int use_seu_codigo) {
		this.use_seu_codigo = use_seu_codigo;
	}
	public Otg_seuropeos getOtg_seuropeos_useuropeos_seuropeos_fk1() {
		return this.otg_seuropeos_useuropeos_seuropeos_fk1;
	}
			
	public void setOtg_seuropeos_useuropeos_seuropeos_fk1(Otg_seuropeos otg_seuropeos_useuropeos_seuropeos_fk1) {
		this.otg_seuropeos_useuropeos_seuropeos_fk1 = otg_seuropeos_useuropeos_seuropeos_fk1;
	}


	public int getUse_uor_codigo() {
		return this.use_uor_codigo;
	}
			
	public void setUse_uor_codigo(int use_uor_codigo) {
		this.use_uor_codigo = use_uor_codigo;
	}

}