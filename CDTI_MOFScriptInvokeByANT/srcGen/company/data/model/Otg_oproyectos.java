package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de Proyectos
@Entity
@Table(schema="jpa")
public class Otg_oproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OPR_CODIGO)
	@Id
	@Column(name="OPR_CODIGO")
	private int opr_codigo;
	//Codigo del proyecto (FK - OTG_PROYECTOS)
	@Column(name="OPR_PRO_CODIGO")
	@ManyToOne
	@JoinColumn(name="PRO_CODIGO")
	private Otg_proyectos otg_proyectos_oproyectos_proyectos_fk1;
	//Observacion
	@Column(name="OPR_OBSERVACION")
	private String opr_observacion;
	
	public Otg_oproyectos() {
		super();
	}
		
	public Otg_oproyectos(int opr_codigo, Otg_proyectos otg_proyectos_oproyectos_proyectos_fk1, String opr_observacion) {
		this.opr_codigo = opr_codigo;
		this.otg_proyectos_oproyectos_proyectos_fk1 = otg_proyectos_oproyectos_proyectos_fk1;
		this.opr_observacion = opr_observacion;
	}
	
	public int getOpr_codigo() {
		return this.opr_codigo;
	}
			
	public void setOpr_codigo(int opr_codigo) {
		this.opr_codigo = opr_codigo;
	}

	public Otg_proyectos getOtg_proyectos_oproyectos_proyectos_fk1() {
		return this.otg_proyectos_oproyectos_proyectos_fk1;
	}
			
	public void setOtg_proyectos_oproyectos_proyectos_fk1(Otg_proyectos otg_proyectos_oproyectos_proyectos_fk1) {
		this.otg_proyectos_oproyectos_proyectos_fk1 = otg_proyectos_oproyectos_proyectos_fk1;
	}


	public String getOpr_observacion() {
		return this.opr_observacion;
	}
			
	public void setOpr_observacion(String opr_observacion) {
		this.opr_observacion = opr_observacion;
	}


}