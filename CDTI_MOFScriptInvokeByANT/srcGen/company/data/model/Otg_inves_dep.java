package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Investigadores (codificados) que pertenecen a un departamento (solo I.N.E.))
@Entity
@Table(schema="jpa")
public class Otg_inves_dep implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_IND_CODIGO)
	@Id
	@Column(name="IND_CODIGO")
	private int ind_codigo;
	//Codigo del investigador
	@Column(name="IND_CODIGO_INV")
	private String ind_codigo_inv;
	//Codigo del CentroDepartamentoArea (FK - OTG_CEN_ARE_DEP)
	@Column(name="IND_CODIGO_CDA")
	private String ind_codigo_cda;
	
	public Otg_inves_dep() {
		super();
	}
		
	public Otg_inves_dep(int ind_codigo, String ind_codigo_inv, String ind_codigo_cda) {
		this.ind_codigo = ind_codigo;
		this.ind_codigo_inv = ind_codigo_inv;
		this.ind_codigo_cda = ind_codigo_cda;
	}
	
	public int getInd_codigo() {
		return this.ind_codigo;
	}
			
	public void setInd_codigo(int ind_codigo) {
		this.ind_codigo = ind_codigo;
	}

	public String getInd_codigo_inv() {
		return this.ind_codigo_inv;
	}
			
	public void setInd_codigo_inv(String ind_codigo_inv) {
		this.ind_codigo_inv = ind_codigo_inv;
	}


	public String getInd_codigo_cda() {
		return this.ind_codigo_cda;
	}
			
	public void setInd_codigo_cda(String ind_codigo_cda) {
		this.ind_codigo_cda = ind_codigo_cda;
	}


}