package backend.dentista.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import backend.dentista.entities.Agendamento;
import backend.dentista.enums.OrderStatus;

public class AgendamentoDTO {
	
	private Long id;
	private LocalDate data; 
	private LocalTime horario; 
	private String pacienteName;
	private String pacienteEmail;
	private String pacienteTelefone;
	private OrderStatus status;
	private ClinicaDTO clinica;
	
	public AgendamentoDTO() {
	}

	public AgendamentoDTO(Long id, LocalDate data, LocalTime horario, String pacienteName, String pacienteEmail,
			String pacienteTelefone, OrderStatus status, ClinicaDTO clinica) {
		this.id = id;
		this.data = data;
		this.horario = horario;
		this.pacienteName = pacienteName;
		this.pacienteEmail = pacienteEmail;
		this.pacienteTelefone = pacienteTelefone;
		this.status = status;
		this.clinica = clinica;
	}
	
	public AgendamentoDTO(Agendamento entity) {
		id = entity.getId();
		data = entity.getData();
		horario = entity.getHorario();
		pacienteName = entity.getPacienteName();
		pacienteEmail = entity.getPacienteEmail();
		pacienteTelefone = entity.getPacienteTelefone();
		status = entity.getStatus();
		clinica = new ClinicaDTO(entity.getClinica());
	}

	public Long getId() {
		return id;
	}

	public LocalDate getData() {
		return data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public String getPacienteName() {
		return pacienteName;
	}

	public String getPacienteEmail() {
		return pacienteEmail;
	}

	public String getPacienteTelefone() {
		return pacienteTelefone;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public ClinicaDTO getClinica() {
		return clinica;
	}
}
