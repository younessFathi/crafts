package org.crafts.api;

import org.crafts.domain.DTO.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/person")
	public String getPerson() {
		PersonDTO personDTO = new PersonDTO();
		return personDTO.toString();
	}

}
