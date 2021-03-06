package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Observaciones de Viajes
@Entity
@Table(schema="jpa")
public class Otg_oviajes implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OVI_CODIGO)
	@Id
	@Column(name="OVI_CODIGO")
	private int ovi_codigo;
	//Codigo del Viaje (FK - OTG_VIAJES)
	@Column(name="OVI_VIA_CODIGO")
	@ManyToOne
	@JoinColumn(name="VIA_CODIGO")
	private Otg_viajes otg_viajes_oviajes_viajes_fk1;
	//Observacion
	@Column(name="OVI_OBSERVACION")
	private String ovi_observacion;
	
	public Otg_oviajes() {
		super();
	}
		
	public Otg_oviajes(int ovi_codigo, Otg_viajes otg_viajes_oviajes_viajes_fk1, String ovi_observacion) {
		this.ovi_codigo = ovi_codigo;
		this.otg_viajes_oviajes_viajes_fk1 = otg_viajes_oviajes_viajes_fk1;
		this.ovi_observacion = ovi_observacion;
	}
	
	public int getOvi_codigo() {
		return this.ovi_codigo;
	}
			
	public void setOvi_codigo(int ovi_codigo) {
		this.ovi_codigo = ovi_codigo;
	}

	public Otg_viajes getOtg_viajes_oviajes_viajes_fk1() {
		return this.otg_viajes_oviajes_viajes_fk1;
	}
			
	public void setOtg_viajes_oviajes_viajes_fk1(Otg_viajes otg_viajes_oviajes_viajes_fk1) {
		this.otg_viajes_oviajes_viajes_fk1 = otg_viajes_oviajes_viajes_fk1;
	}


	public String getOvi_observacion() {
		return this.ovi_observacion;
	}
			
	public void setOvi_observacion(String ovi_observacion) {
		this.ovi_observacion = ovi_observacion;
	}


}