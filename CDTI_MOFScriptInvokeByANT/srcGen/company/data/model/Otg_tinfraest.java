package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Infraestructuras)
@Entity
@Table(schema="jpa")
public class Otg_tinfraest implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la Infraestructura (FK - OTG_INFRAESTRUCTURAS)
	@Id
	@Column(name="TIN_INF_CODIGO")
	private int tin_inf_codigo;
	@OneToOne(mappedBy="otg_tinfraest")
	@PrimaryKeyJoinColumn
	private Otg_infraest otg_infraest_tinfraest_infraest_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TIN_TER_CODIGO")
	private int tin_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tinfraest_terceros_fk2;
	//Codigo del tipo de participacion (FK - OTG_PTCONVOCATORIAS)
	@Column(name="TIN_PTC_CODIGO")
	@ManyToOne
	@JoinColumn(name="PTC_CODIGO")
	private Otg_ptconvocatorias otg_ptconvocatorias_tinfraest_ptconvocator_fk3;
	
	public Otg_tinfraest() {
		super();
	}
		
	public Otg_tinfraest(int tin_inf_codigo, Otg_infraest otg_infraest_tinfraest_infraest_fk1, int tin_ter_codigo, Otg_terceros otg_terceros_tinfraest_terceros_fk2, Otg_ptconvocatorias otg_ptconvocatorias_tinfraest_ptconvocator_fk3) {
		this.tin_inf_codigo = tin_inf_codigo;
		this.otg_infraest_tinfraest_infraest_fk1 = otg_infraest_tinfraest_infraest_fk1;
		this.tin_ter_codigo = tin_ter_codigo;
		this.otg_terceros_tinfraest_terceros_fk2 = otg_terceros_tinfraest_terceros_fk2;
		this.otg_ptconvocatorias_tinfraest_ptconvocator_fk3 = otg_ptconvocatorias_tinfraest_ptconvocator_fk3;
	}
	
	public int getTin_inf_codigo() {
		return this.tin_inf_codigo;
	}
			
	public void setTin_inf_codigo(int tin_inf_codigo) {
		this.tin_inf_codigo = tin_inf_codigo;
	}
	public Otg_infraest getOtg_infraest_tinfraest_infraest_fk1() {
		return this.otg_infraest_tinfraest_infraest_fk1;
	}
			
	public void setOtg_infraest_tinfraest_infraest_fk1(Otg_infraest otg_infraest_tinfraest_infraest_fk1) {
		this.otg_infraest_tinfraest_infraest_fk1 = otg_infraest_tinfraest_infraest_fk1;
	}


	public int getTin_ter_codigo() {
		return this.tin_ter_codigo;
	}
			
	public void setTin_ter_codigo(int tin_ter_codigo) {
		this.tin_ter_codigo = tin_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tinfraest_terceros_fk2() {
		return this.otg_terceros_tinfraest_terceros_fk2;
	}
			
	public void setOtg_terceros_tinfraest_terceros_fk2(Otg_terceros otg_terceros_tinfraest_terceros_fk2) {
		this.otg_terceros_tinfraest_terceros_fk2 = otg_terceros_tinfraest_terceros_fk2;
	}


	public Otg_ptconvocatorias getOtg_ptconvocatorias_tinfraest_ptconvocator_fk3() {
		return this.otg_ptconvocatorias_tinfraest_ptconvocator_fk3;
	}
			
	public void setOtg_ptconvocatorias_tinfraest_ptconvocator_fk3(Otg_ptconvocatorias otg_ptconvocatorias_tinfraest_ptconvocator_fk3) {
		this.otg_ptconvocatorias_tinfraest_ptconvocator_fk3 = otg_ptconvocatorias_tinfraest_ptconvocator_fk3;
	}


}