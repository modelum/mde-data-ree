package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Acciones clave y tipos de acciones que cubre la Convocatoria
@Entity
@Table(schema="jpa")
public class Otg_acciones_fcprogramas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (S_ACP_CODIGO)
	@Id
	@Column(name="ACP_CODIGO")
	private int acp_codigo;
	//Codigo de la convocatoria (FK - OTG_CPROGRAMAS)
	@Column(name="ACP_CPR_CODIGO")
	@ManyToOne
	@JoinColumn(name="CPR_CODIGO")
	private Otg_cprogramas otg_cprogramas_accfcp_cprogramas_fk1;
	//Codigo del cierre de la convocatoria (FK - OTG_FCPROGRAMAS)
	@Column(name="ACP_FCP_CODIGO")
	@ManyToOne
	@JoinColumn(name="FCP_CODIGO")
	private Otg_fcprogramas otg_fcprogramas_accfcp_fcprogramas_fk2;
	//Codigo de la accion clave (FK - OTG_ACLAVES)
	@Column(name="ACP_ACL_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACL_CODIGO")
	private Otg_aclaves otg_aclaves_accfcp_aclaves_fk3;
	//Codigo del tipo de accion (FK - OTG_ACCIONES)
	@Column(name="ACP_ACC_CODIGO")
	@ManyToOne
	@JoinColumn(name="ACC_CODIGO")
	private Otg_acciones otg_acciones_accfcp_acciones_fk4;
	@Column(name="ACP_ACL_ALL")
	private String acp_acl_all;
	@Column(name="ACP_ACC_ALL")
	private String acp_acc_all;
	
	public Otg_acciones_fcprogramas() {
		super();
	}
		
	public Otg_acciones_fcprogramas(int acp_codigo, Otg_cprogramas otg_cprogramas_accfcp_cprogramas_fk1, Otg_fcprogramas otg_fcprogramas_accfcp_fcprogramas_fk2, Otg_aclaves otg_aclaves_accfcp_aclaves_fk3, Otg_acciones otg_acciones_accfcp_acciones_fk4, String acp_acl_all, String acp_acc_all) {
		this.acp_codigo = acp_codigo;
		this.otg_cprogramas_accfcp_cprogramas_fk1 = otg_cprogramas_accfcp_cprogramas_fk1;
		this.otg_fcprogramas_accfcp_fcprogramas_fk2 = otg_fcprogramas_accfcp_fcprogramas_fk2;
		this.otg_aclaves_accfcp_aclaves_fk3 = otg_aclaves_accfcp_aclaves_fk3;
		this.otg_acciones_accfcp_acciones_fk4 = otg_acciones_accfcp_acciones_fk4;
		this.acp_acl_all = acp_acl_all;
		this.acp_acc_all = acp_acc_all;
	}
	
	public int getAcp_codigo() {
		return this.acp_codigo;
	}
			
	public void setAcp_codigo(int acp_codigo) {
		this.acp_codigo = acp_codigo;
	}

	public Otg_cprogramas getOtg_cprogramas_accfcp_cprogramas_fk1() {
		return this.otg_cprogramas_accfcp_cprogramas_fk1;
	}
			
	public void setOtg_cprogramas_accfcp_cprogramas_fk1(Otg_cprogramas otg_cprogramas_accfcp_cprogramas_fk1) {
		this.otg_cprogramas_accfcp_cprogramas_fk1 = otg_cprogramas_accfcp_cprogramas_fk1;
	}


	public Otg_fcprogramas getOtg_fcprogramas_accfcp_fcprogramas_fk2() {
		return this.otg_fcprogramas_accfcp_fcprogramas_fk2;
	}
			
	public void setOtg_fcprogramas_accfcp_fcprogramas_fk2(Otg_fcprogramas otg_fcprogramas_accfcp_fcprogramas_fk2) {
		this.otg_fcprogramas_accfcp_fcprogramas_fk2 = otg_fcprogramas_accfcp_fcprogramas_fk2;
	}


	public Otg_aclaves getOtg_aclaves_accfcp_aclaves_fk3() {
		return this.otg_aclaves_accfcp_aclaves_fk3;
	}
			
	public void setOtg_aclaves_accfcp_aclaves_fk3(Otg_aclaves otg_aclaves_accfcp_aclaves_fk3) {
		this.otg_aclaves_accfcp_aclaves_fk3 = otg_aclaves_accfcp_aclaves_fk3;
	}


	public Otg_acciones getOtg_acciones_accfcp_acciones_fk4() {
		return this.otg_acciones_accfcp_acciones_fk4;
	}
			
	public void setOtg_acciones_accfcp_acciones_fk4(Otg_acciones otg_acciones_accfcp_acciones_fk4) {
		this.otg_acciones_accfcp_acciones_fk4 = otg_acciones_accfcp_acciones_fk4;
	}


	public String getAcp_acl_all() {
		return this.acp_acl_all;
	}
			
	public void setAcp_acl_all(String acp_acl_all) {
		this.acp_acl_all = acp_acl_all;
	}


	public String getAcp_acc_all() {
		return this.acp_acc_all;
	}
			
	public void setAcp_acc_all(String acp_acc_all) {
		this.acp_acc_all = acp_acc_all;
	}


}