package za.co.runninghill.runninghillAssessment.service;

import java.util.List;

import za.co.runninghill.runninghillAssessment.dto.SelectedOptionsDTO;
import za.co.runninghill.runninghillAssessment.dto.SaveRequestDTO;
import za.co.runninghill.runninghillAssessment.entity.SentenceEntity;
import za.co.runninghill.runninghillAssessment.entity.WordsEntity;

public interface IWordsService {

	String saveEntry(SaveRequestDTO request);
	List<WordsEntity> getOptionsByDescription(String description);
	List<SentenceEntity> getSentenceByDescription(String description);
	String selectedOptions(SelectedOptionsDTO options);
}
