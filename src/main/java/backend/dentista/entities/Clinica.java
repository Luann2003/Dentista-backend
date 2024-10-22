package backend.dentista.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clinica")
public class Clinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String emailDentista;
	private String nameDentista;
	private String especialidade;
	private String description;
	private String endereco;
	
	public Clinica() {
	}

	public Clinica(Long id, String name, String emailDentista, String nameDentista, String especialidade,
			String description, String endereço) {
		this.id = id;
		this.name = name;
		this.emailDentista = emailDentista;
		this.nameDentista = nameDentista;
		this.especialidade = especialidade;
		this.description = description;
		this.endereco = endereço;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailDentista() {
		return emailDentista;
	}

	public void setEmailDentista(String emailDentista) {
		this.emailDentista = emailDentista;
	}

	public String getNameDentista() {
		return nameDentista;
	}

	public void setNameDentista(String nameDentista) {
		this.nameDentista = nameDentista;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
}
