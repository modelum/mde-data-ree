package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Contratos)
@Entity
@Table(schema="jpa")
public class Otg_tcontratos implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del Contrato (FK - OTG_CONTRATOS)
	@Id
	@Column(name="TCO_CON_CODIGO")
	private int tco_con_codigo;
	@OneToOne(mappedBy="otg_tcontratos")
	@PrimaryKeyJoinColumn
	private Otg_contratos otg_contratos_tcontratos_contratos_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TCO_TER_CODIGO")
	private int tco_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tcontratos_terceros_fk2;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_tcontratos() {
		super();
	}
		
	public Otg_tcontratos(int tco_con_codigo, Otg_contratos otg_contratos_tcontratos_contratos_fk1, int tco_ter_codigo, Otg_terceros otg_terceros_tcontratos_terceros_fk2, int log) {
		this.tco_con_codigo = tco_con_codigo;
		this.otg_contratos_tcontratos_contratos_fk1 = otg_contratos_tcontratos_contratos_fk1;
		this.tco_ter_codigo = tco_ter_codigo;
		this.otg_terceros_tcontratos_terceros_fk2 = otg_terceros_tcontratos_terceros_fk2;
		this.log = log;
	}
	
	public int getTco_con_codigo() {
		return this.tco_con_codigo;
	}
			
	public void setTco_con_codigo(int tco_con_codigo) {
		this.tco_con_codigo = tco_con_codigo;
	}
	public Otg_contratos getOtg_contratos_tcontratos_contratos_fk1() {
		return this.otg_contratos_tcontratos_contratos_fk1;
	}
			
	public void setOtg_contratos_tcontratos_contratos_fk1(Otg_contratos otg_contratos_tcontratos_contratos_fk1) {
		this.otg_contratos_tcontratos_contratos_fk1 = otg_contratos_tcontratos_contratos_fk1;
	}


	public int getTco_ter_codigo() {
		return this.tco_ter_codigo;
	}
			
	public void setTco_ter_codigo(int tco_ter_codigo) {
		this.tco_ter_codigo = tco_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tcontratos_terceros_fk2() {
		return this.otg_terceros_tcontratos_terceros_fk2;
	}
			
	public void setOtg_terceros_tcontratos_terceros_fk2(Otg_terceros otg_terceros_tcontratos_terceros_fk2) {
		this.otg_terceros_tcontratos_terceros_fk2 = otg_terceros_tcontratos_terceros_fk2;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}