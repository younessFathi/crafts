package org.crafts.domain.business;


import java.util.List;

import org.crafts.domain.DTO.CraftsDTO;

/**
 * The Interface ICraftsBusiness.
 */
public interface ICraftsBusiness {

	/**
	 * Gets the crafts.
	 *
	 * @return the crafts
	 */
	public List<CraftsDTO> getCrafts();

}
