package backend.dentista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.dentista.entities.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}
