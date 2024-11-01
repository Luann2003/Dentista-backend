package backend.dentista.dto;

import backend.dentista.entities.Clinica;


public class ClinicaDTO {
	
	private Long id;
	private String name;
	private String emailDentista;
	private String nameDentista;
	private String especialidade;
	private String description;
	private LocalizacaoDTO localizacaodto;
		
	public ClinicaDTO() {
	}
	
	public ClinicaDTO(Long id, String name, String emailDentista, String nameDentista, String especialidade, String description,
			LocalizacaoDTO localizacaodto) {
		this.id = id;
		this.name = name;
		this.emailDentista = emailDentista;
		this.nameDentista = nameDentista;
		this.especialidade = especialidade;
		this.description = description;
		this.localizacaodto = localizacaodto;
	}
	
	public ClinicaDTO(Clinica entity) {
		id = entity.getId();
		name = entity.getName();
		emailDentista = entity.getEmailDentista();
		nameDentista = entity.getNameDentista();
		especialidade = entity.getEspecialidade();
		description = entity.getDescription();

	   localizacaodto = new LocalizacaoDTO(entity.getlocalizacao());
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmailDentista() {
		return emailDentista;
	}

	public String getNameDentista() {
		return nameDentista;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public String getDescription() {
		return description;
	}

	public LocalizacaoDTO getlocalizacaodto() {
		return localizacaodto;
	}
	
}
