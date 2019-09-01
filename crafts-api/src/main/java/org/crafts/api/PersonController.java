package org.crafts.api;

import org.crafts.domain.DTO.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class PersonController.
 */
@RestController
public class PersonController {
	
	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	@GetMapping("/person")
	public String getPerson() {
		PersonDTO personDTO = new PersonDTO();
		return personDTO.toString();
			
	}
	
	

}
