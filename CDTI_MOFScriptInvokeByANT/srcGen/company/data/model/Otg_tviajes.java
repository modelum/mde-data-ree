package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Viajes)
@Entity
@Table(schema="jpa")
public class Otg_tviajes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del Viaje (FK - OTG_VIAJES)
	@Id
	@Column(name="TVI_VIA_CODIGO")
	private int tvi_via_codigo;
	@OneToOne(mappedBy="otg_tviajes")
	@PrimaryKeyJoinColumn
	private Otg_viajes otg_viajes_tviajes_viajes_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TVI_TER_CODIGO")
	private int tvi_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tviajes_terceros_fk2;
	//Codigo del tipo de participacion (FK - OTG_PTCONVOCATORIAS)
	@Column(name="TVI_PTC_CODIGO")
	@ManyToOne
	@JoinColumn(name="PTC_CODIGO")
	private Otg_ptconvocatorias otg_ptconvocatorias_tviajes_ptconvocator_fk3;
	
	public Otg_tviajes() {
		super();
	}
		
	public Otg_tviajes(int tvi_via_codigo, Otg_viajes otg_viajes_tviajes_viajes_fk1, int tvi_ter_codigo, Otg_terceros otg_terceros_tviajes_terceros_fk2, Otg_ptconvocatorias otg_ptconvocatorias_tviajes_ptconvocator_fk3) {
		this.tvi_via_codigo = tvi_via_codigo;
		this.otg_viajes_tviajes_viajes_fk1 = otg_viajes_tviajes_viajes_fk1;
		this.tvi_ter_codigo = tvi_ter_codigo;
		this.otg_terceros_tviajes_terceros_fk2 = otg_terceros_tviajes_terceros_fk2;
		this.otg_ptconvocatorias_tviajes_ptconvocator_fk3 = otg_ptconvocatorias_tviajes_ptconvocator_fk3;
	}
	
	public int getTvi_via_codigo() {
		return this.tvi_via_codigo;
	}
			
	public void setTvi_via_codigo(int tvi_via_codigo) {
		this.tvi_via_codigo = tvi_via_codigo;
	}
	public Otg_viajes getOtg_viajes_tviajes_viajes_fk1() {
		return this.otg_viajes_tviajes_viajes_fk1;
	}
			
	public void setOtg_viajes_tviajes_viajes_fk1(Otg_viajes otg_viajes_tviajes_viajes_fk1) {
		this.otg_viajes_tviajes_viajes_fk1 = otg_viajes_tviajes_viajes_fk1;
	}


	public int getTvi_ter_codigo() {
		return this.tvi_ter_codigo;
	}
			
	public void setTvi_ter_codigo(int tvi_ter_codigo) {
		this.tvi_ter_codigo = tvi_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tviajes_terceros_fk2() {
		return this.otg_terceros_tviajes_terceros_fk2;
	}
			
	public void setOtg_terceros_tviajes_terceros_fk2(Otg_terceros otg_terceros_tviajes_terceros_fk2) {
		this.otg_terceros_tviajes_terceros_fk2 = otg_terceros_tviajes_terceros_fk2;
	}


	public Otg_ptconvocatorias getOtg_ptconvocatorias_tviajes_ptconvocator_fk3() {
		return this.otg_ptconvocatorias_tviajes_ptconvocator_fk3;
	}
			
	public void setOtg_ptconvocatorias_tviajes_ptconvocator_fk3(Otg_ptconvocatorias otg_ptconvocatorias_tviajes_ptconvocator_fk3) {
		this.otg_ptconvocatorias_tviajes_ptconvocator_fk3 = otg_ptconvocatorias_tviajes_ptconvocator_fk3;
	}


}