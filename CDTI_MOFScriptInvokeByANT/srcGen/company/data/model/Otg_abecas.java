package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//Anualidades de Becas
@Entity
@Table(schema="jpa")
public class Otg_abecas implements Serializable {
	private static final long serialVersionUID = 1L;

	//Codigo Interno (Secuencias S_ABE_CODIGO)
	@Id
	@Column(name="ABE_CODIGO")
	private int abe_codigo;
	//Codigo de la Beca (FK - OTG_BECAS)
	@Column(name="ABE_BEC_CODIGO")
	@ManyToOne
	@JoinColumn(name="BEC_CODIGO")
	private Otg_becas otg_becas_abecas_becas_fk1;
	//Fecha de Inicio
	@Column(name="ABE_FINI")
	private java.util.Date abe_fini;
	//Fecha de Fin
	@Column(name="ABE_FFIN")
	private java.util.Date abe_ffin;
	//Importe en pesetas
	@Column(name="ABE_IMPP")
	private int abe_impp;
	//Importe en euros
	@Column(name="ABE_IMPE")
	private int abe_impe;
	//Importe del seguro de asistencia medica (pesetas)
	@Column(name="ABE_IMPSAMP")
	private int abe_impsamp;
	//Importe del seguro de asistencia medica (euros)
	@Column(name="ABE_IMPSAME")
	private int abe_impsame;
	//Importe del seguro de accidente corporal (pesetas)
	@Column(name="ABE_IMPSACP")
	private int abe_impsacp;
	//Importe del seguro de accidente corporal (euros)
	@Column(name="ABE_IMPSACE")
	private int abe_impsace;
	//Fecha de solicitud de prorroga
	@Column(name="ABE_FPRO")
	private java.util.Date abe_fpro;
	//Fecha de resolucion
	@Column(name="ABE_FRES")
	private java.util.Date abe_fres;
	//Fecha de publicacion
	@Column(name="ABE_FPUB")
	private java.util.Date abe_fpub;
	//Fecha de envio de informe anual
	@Column(name="ABE_FINF")
	private java.util.Date abe_finf;
	//Anualidad final (S, N)
	@Column(name="ABE_FINAL")
	private String abe_final;
	//Ano
	@Column(name="ABE_ANO")
	private int abe_ano;
	//Codigo LOG
	@Column(name="LOG")
	private int log;
	//Ayudas Institucionales (en euros)
	@Column(name="ABE_AYU_INSE")
	private int abe_ayu_inse;
	
	public Otg_abecas() {
		super();
	}
		
	public Otg_abecas(int abe_codigo, Otg_becas otg_becas_abecas_becas_fk1, java.util.Date abe_fini, java.util.Date abe_ffin, int abe_impp, int abe_impe, int abe_impsamp, int abe_impsame, int abe_impsacp, int abe_impsace, java.util.Date abe_fpro, java.util.Date abe_fres, java.util.Date abe_fpub, java.util.Date abe_finf, String abe_final, int abe_ano, int log, int abe_ayu_inse) {
		this.abe_codigo = abe_codigo;
		this.otg_becas_abecas_becas_fk1 = otg_becas_abecas_becas_fk1;
		this.abe_fini = abe_fini;
		this.abe_ffin = abe_ffin;
		this.abe_impp = abe_impp;
		this.abe_impe = abe_impe;
		this.abe_impsamp = abe_impsamp;
		this.abe_impsame = abe_impsame;
		this.abe_impsacp = abe_impsacp;
		this.abe_impsace = abe_impsace;
		this.abe_fpro = abe_fpro;
		this.abe_fres = abe_fres;
		this.abe_fpub = abe_fpub;
		this.abe_finf = abe_finf;
		this.abe_final = abe_final;
		this.abe_ano = abe_ano;
		this.log = log;
		this.abe_ayu_inse = abe_ayu_inse;
	}
	
	public int getAbe_codigo() {
		return this.abe_codigo;
	}
			
	public void setAbe_codigo(int abe_codigo) {
		this.abe_codigo = abe_codigo;
	}

	public Otg_becas getOtg_becas_abecas_becas_fk1() {
		return this.otg_becas_abecas_becas_fk1;
	}
			
	public void setOtg_becas_abecas_becas_fk1(Otg_becas otg_becas_abecas_becas_fk1) {
		this.otg_becas_abecas_becas_fk1 = otg_becas_abecas_becas_fk1;
	}


	public java.util.Date getAbe_fini() {
		return this.abe_fini;
	}
			
	public void setAbe_fini(java.util.Date abe_fini) {
		this.abe_fini = abe_fini;
	}


	public java.util.Date getAbe_ffin() {
		return this.abe_ffin;
	}
			
	public void setAbe_ffin(java.util.Date abe_ffin) {
		this.abe_ffin = abe_ffin;
	}


	public int getAbe_impp() {
		return this.abe_impp;
	}
			
	public void setAbe_impp(int abe_impp) {
		this.abe_impp = abe_impp;
	}


	public int getAbe_impe() {
		return this.abe_impe;
	}
			
	public void setAbe_impe(int abe_impe) {
		this.abe_impe = abe_impe;
	}


	public int getAbe_impsamp() {
		return this.abe_impsamp;
	}
			
	public void setAbe_impsamp(int abe_impsamp) {
		this.abe_impsamp = abe_impsamp;
	}


	public int getAbe_impsame() {
		return this.abe_impsame;
	}
			
	public void setAbe_impsame(int abe_impsame) {
		this.abe_impsame = abe_impsame;
	}


	public int getAbe_impsacp() {
		return this.abe_impsacp;
	}
			
	public void setAbe_impsacp(int abe_impsacp) {
		this.abe_impsacp = abe_impsacp;
	}


	public int getAbe_impsace() {
		return this.abe_impsace;
	}
			
	public void setAbe_impsace(int abe_impsace) {
		this.abe_impsace = abe_impsace;
	}


	public java.util.Date getAbe_fpro() {
		return this.abe_fpro;
	}
			
	public void setAbe_fpro(java.util.Date abe_fpro) {
		this.abe_fpro = abe_fpro;
	}


	public java.util.Date getAbe_fres() {
		return this.abe_fres;
	}
			
	public void setAbe_fres(java.util.Date abe_fres) {
		this.abe_fres = abe_fres;
	}


	public java.util.Date getAbe_fpub() {
		return this.abe_fpub;
	}
			
	public void setAbe_fpub(java.util.Date abe_fpub) {
		this.abe_fpub = abe_fpub;
	}


	public java.util.Date getAbe_finf() {
		return this.abe_finf;
	}
			
	public void setAbe_finf(java.util.Date abe_finf) {
		this.abe_finf = abe_finf;
	}


	public String getAbe_final() {
		return this.abe_final;
	}
			
	public void setAbe_final(String abe_final) {
		this.abe_final = abe_final;
	}


	public int getAbe_ano() {
		return this.abe_ano;
	}
			
	public void setAbe_ano(int abe_ano) {
		this.abe_ano = abe_ano;
	}


	public int getLog() {
		return this.log;
	}
			
	public void setLog(int log) {
		this.log = log;
	}


	public int getAbe_ayu_inse() {
		return this.abe_ayu_inse;
	}
			
	public void setAbe_ayu_inse(int abe_ayu_inse) {
		this.abe_ayu_inse = abe_ayu_inse;
	}


}