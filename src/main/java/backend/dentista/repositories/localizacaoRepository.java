package backend.dentista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.dentista.entities.Localizacao;


public interface localizacaoRepository extends JpaRepository<Localizacao, Long>{
	
}
