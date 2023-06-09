package tk.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.dto.general.SearchGeneralDTO;
import tk.dto.general.SearchGeneralConditionDTO;

@Service
public class SearchGeneralServiceImpl implements SearchGeneralService {
	
	@Autowired
	SearchGeneralServiceLogic searchGeneralServiceLogic;
	
	public List<SearchGeneralDTO> searchGeneralList(SearchGeneralConditionDTO searchGeneralConditionDTO) {
		return searchGeneralServiceLogic.searchGeneralList(searchGeneralConditionDTO);
	}
	
	public SearchGeneralDTO searchGeneralDetail(SearchGeneralDTO searchGeneralDTO) {
		return searchGeneralServiceLogic.searchGeneralDetail(searchGeneralDTO);
	}
	
}