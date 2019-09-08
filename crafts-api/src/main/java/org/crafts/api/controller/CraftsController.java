package org.crafts.api.controller;

import java.util.List;

import org.crafts.api.model.Crafts;
import org.crafts.domain.DTO.CraftsDTO;
import org.crafts.domain.business.ICraftsBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class PersonController.
 */
@RestController
public class CraftsController {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private ICraftsBusiness craftsBusiness;

	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	@GetMapping("/crafts")
	public Crafts[] getPerson() {
		// domain execution
		List<CraftsDTO> craftsDTOs = craftsBusiness.getCrafts();
		// mappe to model Objects
		Crafts[] crafts = objectMapper.convertValue(craftsDTOs, Crafts[].class);
		return crafts;
	}

}
