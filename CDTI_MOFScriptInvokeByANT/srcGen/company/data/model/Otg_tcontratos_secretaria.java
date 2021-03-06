package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Contratos de Secretaria)
@Entity
@Table(schema="jpa")
public class Otg_tcontratos_secretaria implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo del Contrato de Secretaria (FK - OTG_CONTRATOS_SECRETARIA)
	@Id
	@Column(name="TCS_COS_CODIGO")
	private int tcs_cos_codigo;
	@OneToOne(mappedBy="otg_tcontratos_secretaria")
	@PrimaryKeyJoinColumn
	private Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	//Codigo del Tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TCS_TER_CODIGO")
	private int tcs_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tcontratos_sec_terceros_fk2;
	//Codigo Log
	@Column(name="LOG")
	private int log;
	
	public Otg_tcontratos_secretaria() {
		super();
	}
		
	public Otg_tcontratos_secretaria(int tcs_cos_codigo, Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1, int tcs_ter_codigo, Otg_terceros otg_terceros_tcontratos_sec_terceros_fk2, int log) {
		this.tcs_cos_codigo = tcs_cos_codigo;
		this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1 = otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
		this.tcs_ter_codigo = tcs_ter_codigo;
		this.otg_terceros_tcontratos_sec_terceros_fk2 = otg_terceros_tcontratos_sec_terceros_fk2;
		this.log = log;
	}
	
	public int getTcs_cos_codigo() {
		return this.tcs_cos_codigo;
	}
			
	public void setTcs_cos_codigo(int tcs_cos_codigo) {
		this.tcs_cos_codigo = tcs_cos_codigo;
	}
	public Otg_contratos_secretaria getOtg_contratos_secretaria_tcontr_sec_contr_sec_fk1() {
		return this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	}
			
	public void setOtg_contratos_secretaria_tcontr_sec_contr_sec_fk1(Otg_contratos_secretaria otg_contratos_secretaria_tcontr_sec_contr_sec_fk1) {
		this.otg_contratos_secretaria_tcontr_sec_contr_sec_fk1 = otg_contratos_secretaria_tcontr_sec_contr_sec_fk1;
	}


	public int getTcs_ter_codigo() {
		return this.tcs_ter_codigo;
	}
			
	public void setTcs_ter_codigo(int tcs_ter_codigo) {
		this.tcs_ter_codigo = tcs_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tcontratos_sec_terceros_fk2() {
		return this.otg_terceros_tcontratos_sec_terceros_fk2;
	}
			
	public void setOtg_terceros_tcontratos_sec_terceros_fk2(Otg_terceros otg_terceros_tcontratos_sec_terceros_fk2) {
		this.otg_terceros_tcontratos_sec_terceros_fk2 = otg_terceros_tcontratos_sec_terceros_fk2;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


}