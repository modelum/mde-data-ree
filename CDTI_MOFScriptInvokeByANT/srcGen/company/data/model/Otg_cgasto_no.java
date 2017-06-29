package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Centros de Gasto rechazados en la importacion de datos de AA.EE.
@Entity
@Table(schema="jpa")
public class Otg_cgasto_no implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del Centro de Gasto rechazado
	@Id
	@Column(name="CGN_CG")
	private String cgn_cg;
	
	public Otg_cgasto_no() {
		super();
	}
		
	public Otg_cgasto_no(String cgn_cg) {
		this.cgn_cg = cgn_cg;
	}
	
	public String getCgn_cg() {
		return this.cgn_cg;
	}
			
	public void setCgn_cg(String cgn_cg) {
		this.cgn_cg = cgn_cg;
	}

}