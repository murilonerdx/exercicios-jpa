package teste.consulta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinTable(
			name = "nomes_Paises",
			joinColumns = @JoinColumn(name="nome_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="nome_id", referencedColumnName = "id")
	)
	private String nomePais;
	
	
	public Country() {
		
	}


	public Country(String nomePais) {
		super();
		this.nomePais = nomePais;
	}


	public String getNomePais() {
		return nomePais;
	}


	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	
}
