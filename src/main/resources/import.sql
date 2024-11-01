INSERT INTO tb_localizacao (rua, cidade, estado, number) VALUES ('Rua das Flores', 'São Paulo', 'SP', '167');
INSERT INTO tb_localizacao (rua, cidade, estado, number) VALUES ('Avenida Brasil', 'Rio de Janeiro', 'RJ', '951');
INSERT INTO tb_localizacao (rua, cidade, estado, number) VALUES ('Rua XV de Novembro', 'Curitiba', 'PR', '667');
INSERT INTO tb_localizacao (rua, cidade, estado, number) VALUES ('Rua dos Andradas', 'Porto Alegre', 'RS', '537');
INSERT INTO tb_localizacao (rua, cidade, estado, number) VALUES ('Rua Bahia', 'Belo Horizonte', 'MG', '2623');


INSERT INTO tb_clinica (name, email_dentista, name_dentista, especialidade, description,  localizacao_id) VALUES ('Clínica Sorriso', 'dentista@clinicasorriso.com.br', 'Dr. João Silva', 'Odontologia Geral', 'Clínica especializada em odontologia geral e estética.', '1');
INSERT INTO tb_clinica (name, email_dentista, name_dentista, especialidade, description,  localizacao_id) VALUES ('Clínica Saúde e Sorriso', 'contato@saudesoriso.com.br', 'Dra. Maria Oliveira', 'Ortodontia', 'Oferecemos tratamentos ortodônticos personalizados e de alta qualidade.', '2');
INSERT INTO tb_clinica (name, email_dentista, name_dentista, especialidade, description,  localizacao_id) VALUES ('Odonto Premium', 'atendimento@odontopremium.com.br', 'Dr. Carlos Pereira', 'Implantes Dentários', 'Especializada em implantes dentários e reabilitação oral.', '3');
INSERT INTO tb_clinica (name, email_dentista, name_dentista, especialidade, description,  localizacao_id) VALUES ('Clínica do Sorriso Feliz', 'info@clinicasorrisofeliz.com.br', 'Dra. Ana Costa', 'Periodontia', 'Cuidamos da saúde das suas gengivas e dentes.', '4');
INSERT INTO tb_clinica (name, email_dentista, name_dentista, especialidade, description,  localizacao_id) VALUES ('Clínica OdontoCare', 'contato@odontocare.com.br', 'Dr. Roberto Lima', 'Dentística', 'Tratamentos dentários estéticos e restauradores com tecnologia avançada.', '5');

INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-10', '09:30:00', 'Carlos Almeida', 'carlos.almeida@email.com', '(11) 91234-5678', 1, 'Pendente');
INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-10', '09:30:00', 'Vitor Almeida', 'carlos.almeida@email.com', '(11) 91234-5678', 1, 'Pendente');
INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-12', '14:00:00', 'Mariana Souza', 'mariana.souza@email.com', '(21) 98876-5432', 2, 'Confirmada');
INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-15', '11:45:00', 'Roberto Lima', 'roberto.lima@email.com', '(41) 95432-1098', 3, 'Pendente');
INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-20', '10:00:00', 'Fernanda Oliveira', 'fernanda.oliveira@email.com', '(51) 98765-4321', 4, 'Cancelada');
INSERT INTO tb_agendamento (data, horario, paciente_name, paciente_email, paciente_telefone, clinica_id, status) VALUES ('2024-11-22', '15:30:00', 'Juliana Santos', 'juliana.santos@email.com', '(31) 91234-0987', 5, 'Pendente');
