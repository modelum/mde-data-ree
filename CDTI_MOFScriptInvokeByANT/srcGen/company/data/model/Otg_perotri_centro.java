package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Personas de la OTRI y centrosinstitutos a los que pertenecen
@Entity
@Table(schema="jpa")
public class Otg_perotri_centro implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencia S_OPC_CODIGO)
	@Id
	@Column(name="OPC_CODIGO")
	private int opc_codigo;
	//Identifiador de la persona
	@Column(name="OPC_ID")
	private int opc_id;
	//Identificador del centroinstituto
	@Column(name="OPC_CENTRO")
	private int opc_centro;
	
	public Otg_perotri_centro() {
		super();
	}
		
	public Otg_perotri_centro(int opc_codigo, int opc_id, int opc_centro) {
		this.opc_codigo = opc_codigo;
		this.opc_id = opc_id;
		this.opc_centro = opc_centro;
	}
	
	public int getOpc_codigo() {
		return this.opc_codigo;
	}
			
	public void setOpc_codigo(int opc_codigo) {
		this.opc_codigo = opc_codigo;
	}

	public int getOpc_id() {
		return this.opc_id;
	}
			
	public void setOpc_id(int opc_id) {
		this.opc_id = opc_id;
	}


	public int getOpc_centro() {
		return this.opc_centro;
	}
			
	public void setOpc_centro(int opc_centro) {
		this.opc_centro = opc_centro;
	}


}