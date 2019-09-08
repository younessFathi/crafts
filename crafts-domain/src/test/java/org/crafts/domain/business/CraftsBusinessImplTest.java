package org.crafts.domain.business;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.crafts.domain.DTO.CraftsDTO;
import org.junit.Before;
import org.junit.Test;

public class CraftsBusinessImplTest {
	
	private ICraftsBusiness craftsBusiness;
	
	@Before
	public void init() {
		craftsBusiness = new CraftsBusinessImpl();
	}
	
	@Test
	public void getCraftsTest() {
		List<CraftsDTO> craftsDTO = craftsBusiness.getCrafts();
		assertTrue(!craftsDTO.isEmpty());
	}

}
