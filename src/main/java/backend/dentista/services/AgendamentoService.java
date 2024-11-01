package backend.dentista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import backend.dentista.dto.AgendamentoDTO;
import backend.dentista.entities.Agendamento;
import backend.dentista.entities.Clinica;
import backend.dentista.repositories.AgendamentoRepository;
import backend.dentista.repositories.ClinicaRepository;
import backend.dentista.services.exceptions.ResourceNotFoundException;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	@Autowired
	private ClinicaRepository clinicaRepository;
	
	@Transactional(readOnly = true)
	public List<AgendamentoDTO> findAll() {
		List<Agendamento> list = agendamentoRepository.findAll();
        return list.stream().map(x -> new AgendamentoDTO(x)).toList();
	}
	
    @Transactional(readOnly = true)
    public AgendamentoDTO findById(Long id) {
        Agendamento agendamento = agendamentoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new AgendamentoDTO(agendamento);
    }
	@Transactional
	public AgendamentoDTO insert(AgendamentoDTO dto) {
		Agendamento entity 	= new Agendamento();
		
		
		Clinica clinica = clinicaRepository.getReferenceById(dto.getClinica().getId());
	    boolean existeAgendamento = agendamentoRepository.existsByDataAndHorarioAndClinicaId(
	        dto.getData(), dto.getHorario(), dto.getClinica().getId()
	    );
	    
	    if (existeAgendamento) {
	        throw new IllegalArgumentException("Já existe um agendamento para esse horário.");
	    }
		
		copyDtoToEntity(dto, entity);

		entity.setClinica(clinica);
		entity = agendamentoRepository.save(entity);
		
		return new AgendamentoDTO(entity);
	}
	


	private void copyDtoToEntity(AgendamentoDTO dto, Agendamento entity) {
		entity.setData(dto.getData());
		entity.setHorario(dto.getHorario());
		entity.setPacienteEmail(dto.getPacienteEmail());
		entity.setPacienteName(dto.getPacienteName());
		entity.setPacienteTelefone(dto.getPacienteTelefone());
		entity.setStatus(dto.getStatus());
	}






	@Transactional
	public Agendamento criarAgendamento(Agendamento agendamento) {
		boolean existeAgendamento = agendamentoRepository.existsByDataAndHorarioAndClinicaId(agendamento.getData(),
				agendamento.getHorario(), agendamento.getClinica().getId());

		if (existeAgendamento) {
			throw new IllegalArgumentException("Já existe um agendamento para esse horário.");
		}

		return agendamentoRepository.save(agendamento);
	}
}
