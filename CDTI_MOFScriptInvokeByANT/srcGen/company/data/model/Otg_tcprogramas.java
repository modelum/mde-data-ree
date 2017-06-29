package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Terceros (Convocatorias europeas)
@Entity
@Table(schema="jpa")
public class Otg_tcprogramas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo de la convocatoria (FK - OTG_CPROGRAMAS)
	@Id
	@Column(name="TCP_CPR_CODIGO")
	private int tcp_cpr_codigo;
	@OneToOne(mappedBy="otg_tcprogramas")
	@PrimaryKeyJoinColumn
	private Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1;
	//Codigo del tercero (FK - OTG_TERCEROS)
	@Id
	@Column(name="TCP_TER_CODIGO")
	private int tcp_ter_codigo;
	@ManyToOne
	@JoinColumn(name="TER_CODIGO")
	private Otg_terceros otg_terceros_tcprogramas_terceros_fk2;
	
	public Otg_tcprogramas() {
		super();
	}
		
	public Otg_tcprogramas(int tcp_cpr_codigo, Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1, int tcp_ter_codigo, Otg_terceros otg_terceros_tcprogramas_terceros_fk2) {
		this.tcp_cpr_codigo = tcp_cpr_codigo;
		this.otg_cprogramas_tcprogramas_cprogramas_fk1 = otg_cprogramas_tcprogramas_cprogramas_fk1;
		this.tcp_ter_codigo = tcp_ter_codigo;
		this.otg_terceros_tcprogramas_terceros_fk2 = otg_terceros_tcprogramas_terceros_fk2;
	}
	
	public int getTcp_cpr_codigo() {
		return this.tcp_cpr_codigo;
	}
			
	public void setTcp_cpr_codigo(int tcp_cpr_codigo) {
		this.tcp_cpr_codigo = tcp_cpr_codigo;
	}
	public Otg_cprogramas getOtg_cprogramas_tcprogramas_cprogramas_fk1() {
		return this.otg_cprogramas_tcprogramas_cprogramas_fk1;
	}
			
	public void setOtg_cprogramas_tcprogramas_cprogramas_fk1(Otg_cprogramas otg_cprogramas_tcprogramas_cprogramas_fk1) {
		this.otg_cprogramas_tcprogramas_cprogramas_fk1 = otg_cprogramas_tcprogramas_cprogramas_fk1;
	}


	public int getTcp_ter_codigo() {
		return this.tcp_ter_codigo;
	}
			
	public void setTcp_ter_codigo(int tcp_ter_codigo) {
		this.tcp_ter_codigo = tcp_ter_codigo;
	}
	public Otg_terceros getOtg_terceros_tcprogramas_terceros_fk2() {
		return this.otg_terceros_tcprogramas_terceros_fk2;
	}
			
	public void setOtg_terceros_tcprogramas_terceros_fk2(Otg_terceros otg_terceros_tcprogramas_terceros_fk2) {
		this.otg_terceros_tcprogramas_terceros_fk2 = otg_terceros_tcprogramas_terceros_fk2;
	}


}