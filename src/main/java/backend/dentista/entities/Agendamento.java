package backend.dentista.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import backend.dentista.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate data; 

	private LocalTime horario; 

	private String pacienteName;

	private String pacienteEmail;

	private String pacienteTelefone;

	@ManyToOne
	@JoinColumn(name = "clinica_id")
	private Clinica clinica; 

	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	public Agendamento() {
	}

	public Agendamento(Long id, LocalDate data, LocalTime horario, String pacienteName, String pacienteEmail,
			String pacienteTelefone, Clinica clinica, OrderStatus status) {
		this.id = id;
		this.data = data;
		this.horario = horario;
		this.pacienteName = pacienteName;
		this.pacienteEmail = pacienteEmail;
		this.pacienteTelefone = pacienteTelefone;
		this.clinica = clinica;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public String getPacienteName() {
		return pacienteName;
	}

	public void setPacienteName(String pacienteName) {
		this.pacienteName = pacienteName;
	}

	public String getPacienteEmail() {
		return pacienteEmail;
	}

	public void setPacienteEmail(String pacienteEmail) {
		this.pacienteEmail = pacienteEmail;
	}

	public String getPacienteTelefone() {
		return pacienteTelefone;
	}

	public void setPacienteTelefone(String pacienteTelefone) {
		this.pacienteTelefone = pacienteTelefone;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
