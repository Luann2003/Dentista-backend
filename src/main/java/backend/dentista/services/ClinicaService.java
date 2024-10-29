package backend.dentista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import backend.dentista.dto.ClinicaDTO;
import backend.dentista.entities.Clinica;
import backend.dentista.entities.Localizacao;
import backend.dentista.repositories.ClinicaRepository;
import backend.dentista.repositories.localizacaoRepository;
import backend.dentista.services.exceptions.DatabaseException;
import backend.dentista.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ClinicaService {
	
	@Autowired
	private ClinicaRepository repository;
	
	@Autowired
	private localizacaoRepository localizacaoRepository;
	
	@Transactional(readOnly = true)
	public ClinicaDTO findById(Long id) {
		Clinica clinica = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new ClinicaDTO(clinica);
	}
	
	@Transactional(readOnly = true)
	public List<ClinicaDTO> findAll(){
		List<Clinica> list = repository.findAll();
		return list.stream().map(x -> new ClinicaDTO(x)).toList();
	}
	
	@Transactional
	public ClinicaDTO insert (ClinicaDTO dto) {
		
		Clinica entity = new Clinica();
		copyDtoToEntity(dto, entity);
		
		Localizacao localizacao = new Localizacao();
	    localizacao.setRua(dto.getlocalizacaodto().getRua());
	    localizacao.setCidade(dto.getlocalizacaodto().getCidade());
	    localizacao.setEstado(dto.getlocalizacaodto().getEstado());
	    localizacao.setNumber(dto.getlocalizacaodto().getNumber());
	    
	    localizacao = localizacaoRepository.save(localizacao); 
	    
		entity.setlocalizacao(localizacao);
		
		entity = repository.save(entity);
		
		return new ClinicaDTO(entity);
		
	}
	
	@Transactional
	public ClinicaDTO update(ClinicaDTO dto, Long id) {
		try {

			Clinica entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			
			
			entity = repository.save(entity);
			return new ClinicaDTO(entity);

		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Recurso não encontrado");
		}
	}
	
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			throw new ResourceNotFoundException("Recurso não encontrado");
		}
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Falha de integridade referencial");
		}
	}

	
	
	private void copyDtoToEntity(ClinicaDTO dto, Clinica entity) {
		entity.setName(dto.getName());
		entity.setNameDentista(dto.getNameDentista());
		entity.setEmailDentista(dto.getEmailDentista());
		entity.setEspecialidade(dto.getEspecialidade());
		entity.setDescription(dto.getDescription());
	}

}
