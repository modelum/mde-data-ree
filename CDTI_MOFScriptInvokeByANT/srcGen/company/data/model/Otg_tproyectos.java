package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Proyectos nacionales)
@Entity
@Table(schema="jpa")
public class Otg_tproyectos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del proyecto (FK - OTG_PROYECTOS)
	@Id
	@Column(name="TPR_PRO_CODIGO")
	private int tpr_pro_codigo;
	@OneToOne(mappedBy="otg_tproyectos")
	@PrimaryKeyJoinColumn
	private Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2;
	//Codigo del Tercero (OTG_TERCEROS)
	@Id
	@Column(name="TPR_TER_CODIGO")
	private int tpr_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tproyectos_terceros_fk1;
	//Codigo del tipo de participacion (FK - OTG_PTCONVOCATORIAS)
	@Column(name="TPR_PTC_CODIGO")
	@ManyToOne
	@JoinColumn(name="PTC_CODIGO")
	private Otg_ptconvocatorias otg_ptconvocatorias_tproyectos_ptconvocator_fk3;
	
	public Otg_tproyectos() {
		super();
	}
		
	public Otg_tproyectos(int tpr_pro_codigo, Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2, int tpr_ter_codigo, Otg_terceros otg_terceros_tproyectos_terceros_fk1, Otg_ptconvocatorias otg_ptconvocatorias_tproyectos_ptconvocator_fk3) {
		this.tpr_pro_codigo = tpr_pro_codigo;
		this.otg_proyectos_tproyectos_proyectos_fk2 = otg_proyectos_tproyectos_proyectos_fk2;
		this.tpr_ter_codigo = tpr_ter_codigo;
		this.otg_terceros_tproyectos_terceros_fk1 = otg_terceros_tproyectos_terceros_fk1;
		this.otg_ptconvocatorias_tproyectos_ptconvocator_fk3 = otg_ptconvocatorias_tproyectos_ptconvocator_fk3;
	}
	
	public int getTpr_pro_codigo() {
		return this.tpr_pro_codigo;
	}
			
	public void setTpr_pro_codigo(int tpr_pro_codigo) {
		this.tpr_pro_codigo = tpr_pro_codigo;
	}
	public Otg_proyectos getOtg_proyectos_tproyectos_proyectos_fk2() {
		return this.otg_proyectos_tproyectos_proyectos_fk2;
	}
			
	public void setOtg_proyectos_tproyectos_proyectos_fk2(Otg_proyectos otg_proyectos_tproyectos_proyectos_fk2) {
		this.otg_proyectos_tproyectos_proyectos_fk2 = otg_proyectos_tproyectos_proyectos_fk2;
	}


	public int getTpr_ter_codigo() {
		return this.tpr_ter_codigo;
	}
			
	public void setTpr_ter_codigo(int tpr_ter_codigo) {
		this.tpr_ter_codigo = tpr_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tproyectos_terceros_fk1() {
		return this.otg_terceros_tproyectos_terceros_fk1;
	}
			
	public void setOtg_terceros_tproyectos_terceros_fk1(Otg_terceros otg_terceros_tproyectos_terceros_fk1) {
		this.otg_terceros_tproyectos_terceros_fk1 = otg_terceros_tproyectos_terceros_fk1;
	}


	public Otg_ptconvocatorias getOtg_ptconvocatorias_tproyectos_ptconvocator_fk3() {
		return this.otg_ptconvocatorias_tproyectos_ptconvocator_fk3;
	}
			
	public void setOtg_ptconvocatorias_tproyectos_ptconvocator_fk3(Otg_ptconvocatorias otg_ptconvocatorias_tproyectos_ptconvocator_fk3) {
		this.otg_ptconvocatorias_tproyectos_ptconvocator_fk3 = otg_ptconvocatorias_tproyectos_ptconvocator_fk3;
	}


}