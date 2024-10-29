package backend.dentista.dto;

import backend.dentista.entities.Localizacao;

public class LocalizacaoDTO {
	
	private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private int number;
    
    public LocalizacaoDTO() {
    }

	public LocalizacaoDTO(Long id,String rua, String cidade, String estado, int number) {
		this.id = id;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.number = number;
	}
	
	public LocalizacaoDTO(Localizacao entity) {
		this.id = entity.getId();
		this.rua = entity.getRua();
		this.cidade = entity.getCidade();
		this.estado = entity.getEstado();
		this.number = entity.getNumber();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getRua() {
		return rua;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public int getNumber() {
		return number;
	}
}
