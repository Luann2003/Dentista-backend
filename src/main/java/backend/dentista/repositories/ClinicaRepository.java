package backend.dentista.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import backend.dentista.entities.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {
	
	@Query("SELECT c FROM Clinica c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
	Page<Clinica> findByNameContaining(@Param("name") String name, Pageable pageable);
}
