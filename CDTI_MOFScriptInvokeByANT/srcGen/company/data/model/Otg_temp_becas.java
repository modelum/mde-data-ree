package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Tabla temporal para el informe OTG_BECAS_RES1
@Entity
@Table(schema="jpa")
public class Otg_temp_becas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo identificador.
	@Id
	@Column(name="TEM_ID")
	private java.util.Date tem_id;
	@Id
	@Column(name="TEM_CONT")
	private int tem_cont;
	//Ano.
	@Column(name="TEM_ANO")
	private String tem_ano;
	//Meses de la renovacion en el ano.
	@Column(name="TEM_MESES")
	private int tem_meses;
	//Tipo de beca.
	@Column(name="TEM_TIPO")
	private String tem_tipo;
	//Importe en pesetasmes.
	@Column(name="TEM_IMPP")
	private int tem_impp;
	//Importe en eurosmes.
	@Column(name="TEM_IMPE")
	private int tem_impe;
	//Departamento.
	@Column(name="TEM_DEP")
	private String tem_dep;
	
	public Otg_temp_becas() {
		super();
	}
		
	public Otg_temp_becas(java.util.Date tem_id, int tem_cont, String tem_ano, int tem_meses, String tem_tipo, int tem_impp, int tem_impe, String tem_dep) {
		this.tem_id = tem_id;
		this.tem_cont = tem_cont;
		this.tem_ano = tem_ano;
		this.tem_meses = tem_meses;
		this.tem_tipo = tem_tipo;
		this.tem_impp = tem_impp;
		this.tem_impe = tem_impe;
		this.tem_dep = tem_dep;
	}
	
	public java.util.Date getTem_id() {
		return this.tem_id;
	}
			
	public void setTem_id(java.util.Date tem_id) {
		this.tem_id = tem_id;
	}

	public int getTem_cont() {
		return this.tem_cont;
	}
			
	public void setTem_cont(int tem_cont) {
		this.tem_cont = tem_cont;
	}

	public String getTem_ano() {
		return this.tem_ano;
	}
			
	public void setTem_ano(String tem_ano) {
		this.tem_ano = tem_ano;
	}


	public int getTem_meses() {
		return this.tem_meses;
	}
			
	public void setTem_meses(int tem_meses) {
		this.tem_meses = tem_meses;
	}


	public String getTem_tipo() {
		return this.tem_tipo;
	}
			
	public void setTem_tipo(String tem_tipo) {
		this.tem_tipo = tem_tipo;
	}


	public int getTem_impp() {
		return this.tem_impp;
	}
			
	public void setTem_impp(int tem_impp) {
		this.tem_impp = tem_impp;
	}


	public int getTem_impe() {
		return this.tem_impe;
	}
			
	public void setTem_impe(int tem_impe) {
		this.tem_impe = tem_impe;
	}


	public String getTem_dep() {
		return this.tem_dep;
	}
			
	public void setTem_dep(String tem_dep) {
		this.tem_dep = tem_dep;
	}


}