package backend.dentista.repositories;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.dentista.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{
	
    boolean existsByDataAndHorarioAndClinicaId(LocalDate data, LocalTime horario, Long clinicaId);

}
