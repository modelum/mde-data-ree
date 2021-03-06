package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Logs (seguridad - control)
@Entity
@Table(schema="jpa")
public class Otr_log implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOG_CODIGO")
	private int log_codigo;
	@Column(name="LOG_USUA")
	private String log_usua;
	@Column(name="LOG_USUASO")
	private String log_usuaso;
	@Column(name="LOG_MAQUINA")
	private String log_maquina;
	@Column(name="LOG_TABLA")
	private String log_tabla;
	@Column(name="LOG_CAMPO")
	private String log_campo;
	@Column(name="LOG_REGISTRO")
	private int log_registro;
	@Column(name="LOG_OPER")
	private String log_oper;
	@Column(name="LOG_VOLD")
	private String log_vold;
	@Column(name="LOG_VNEW")
	private String log_vnew;
	@Column(name="LOG_FECHA")
	private java.util.Date log_fecha;
	
	public Otr_log() {
		super();
	}
		
	public Otr_log(int log_codigo, String log_usua, String log_usuaso, String log_maquina, String log_tabla, String log_campo, int log_registro, String log_oper, String log_vold, String log_vnew, java.util.Date log_fecha) {
		this.log_codigo = log_codigo;
		this.log_usua = log_usua;
		this.log_usuaso = log_usuaso;
		this.log_maquina = log_maquina;
		this.log_tabla = log_tabla;
		this.log_campo = log_campo;
		this.log_registro = log_registro;
		this.log_oper = log_oper;
		this.log_vold = log_vold;
		this.log_vnew = log_vnew;
		this.log_fecha = log_fecha;
	}
	
	public int getLog_codigo() {
		return this.log_codigo;
	}
			
	public void setLog_codigo(int log_codigo) {
		this.log_codigo = log_codigo;
	}

	public String getLog_usua() {
		return this.log_usua;
	}
			
	public void setLog_usua(String log_usua) {
		this.log_usua = log_usua;
	}


	public String getLog_usuaso() {
		return this.log_usuaso;
	}
			
	public void setLog_usuaso(String log_usuaso) {
		this.log_usuaso = log_usuaso;
	}


	public String getLog_maquina() {
		return this.log_maquina;
	}
			
	public void setLog_maquina(String log_maquina) {
		this.log_maquina = log_maquina;
	}


	public String getLog_tabla() {
		return this.log_tabla;
	}
			
	public void setLog_tabla(String log_tabla) {
		this.log_tabla = log_tabla;
	}


	public String getLog_campo() {
		return this.log_campo;
	}
			
	public void setLog_campo(String log_campo) {
		this.log_campo = log_campo;
	}


	public int getLog_registro() {
		return this.log_registro;
	}
			
	public void setLog_registro(int log_registro) {
		this.log_registro = log_registro;
	}


	public String getLog_oper() {
		return this.log_oper;
	}
			
	public void setLog_oper(String log_oper) {
		this.log_oper = log_oper;
	}


	public String getLog_vold() {
		return this.log_vold;
	}
			
	public void setLog_vold(String log_vold) {
		this.log_vold = log_vold;
	}


	public String getLog_vnew() {
		return this.log_vnew;
	}
			
	public void setLog_vnew(String log_vnew) {
		this.log_vnew = log_vnew;
	}


	public java.util.Date getLog_fecha() {
		return this.log_fecha;
	}
			
	public void setLog_fecha(java.util.Date log_fecha) {
		this.log_fecha = log_fecha;
	}


}