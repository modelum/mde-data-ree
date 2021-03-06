package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otg_gastos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GAS_CODIGO")
	private int gas_codigo;
	@Column(name="GAS_PP")
	private String gas_pp;
	@Column(name="GAS_ANO")
	private int gas_ano;
	@Column(name="GAS_GASTO")
	private int gas_gasto;
	@Column(name="GAS_CG")
	private String gas_cg;
	
	public Otg_gastos() {
		super();
	}
		
	public Otg_gastos(int gas_codigo, String gas_pp, int gas_ano, int gas_gasto, String gas_cg) {
		this.gas_codigo = gas_codigo;
		this.gas_pp = gas_pp;
		this.gas_ano = gas_ano;
		this.gas_gasto = gas_gasto;
		this.gas_cg = gas_cg;
	}
	
	public int getGas_codigo() {
		return this.gas_codigo;
	}
			
	public void setGas_codigo(int gas_codigo) {
		this.gas_codigo = gas_codigo;
	}

	public String getGas_pp() {
		return this.gas_pp;
	}
			
	public void setGas_pp(String gas_pp) {
		this.gas_pp = gas_pp;
	}


	public int getGas_ano() {
		return this.gas_ano;
	}
			
	public void setGas_ano(int gas_ano) {
		this.gas_ano = gas_ano;
	}


	public int getGas_gasto() {
		return this.gas_gasto;
	}
			
	public void setGas_gasto(int gas_gasto) {
		this.gas_gasto = gas_gasto;
	}


	public String getGas_cg() {
		return this.gas_cg;
	}
			
	public void setGas_cg(String gas_cg) {
		this.gas_cg = gas_cg;
	}


}