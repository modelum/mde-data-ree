package company.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="jpa")
public class Otg_anos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ANO")
	private String ano;
	
	public Otg_anos() {
		super();
	}
		
	public Otg_anos(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return this.ano;
	}
			
	public void setAno(String ano) {
		this.ano = ano;
	}

}