package backend.dentista.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import backend.dentista.entities.Localizacao;


public interface localizacaoRepository extends JpaRepository<Localizacao, Long>{
	



}
