package backend.dentista.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.dentista.dto.EmailDTO;
import backend.dentista.services.EmailServices;



@RestController
@RequestMapping(value = "/email")
public class EmailController {

	@Autowired
	private EmailServices emailService;
	
	@PostMapping
	public ResponseEntity<Void> sendEmail(@Valid @RequestBody EmailDTO obj) {
		emailService.sendEmail(obj);
		return ResponseEntity.noContent().build();
	}
}
