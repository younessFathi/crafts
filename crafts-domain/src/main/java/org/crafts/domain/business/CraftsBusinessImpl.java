package org.crafts.domain.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.crafts.domain.DTO.CraftsDTO;
import org.springframework.stereotype.Service;
@Service
public class CraftsBusinessImpl implements ICraftsBusiness {

	@Override
	public List<CraftsDTO> getCrafts() {
		List<CraftsDTO> craftsDTOs = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			CraftsDTO craftsDTO = new CraftsDTO("gon " + i, "frecs " + i, "address " + i, i * 3, "crafts " + i,
					"description " + i);
			craftsDTOs.add(craftsDTO);
		}
		return craftsDTOs;
	}

}
