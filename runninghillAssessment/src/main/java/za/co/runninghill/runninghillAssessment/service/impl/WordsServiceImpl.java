package za.co.runninghill.runninghillAssessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.runninghill.runninghillAssessment.dto.SelectedOptionsDTO;
import za.co.runninghill.runninghillAssessment.dto.Options;
import za.co.runninghill.runninghillAssessment.dto.OptionsDTO;
import za.co.runninghill.runninghillAssessment.dto.SaveRequestDTO;
import za.co.runninghill.runninghillAssessment.entity.SentenceEntity;
import za.co.runninghill.runninghillAssessment.entity.WordsEntity;
import za.co.runninghill.runninghillAssessment.repository.ISentenceRepository;
import za.co.runninghill.runninghillAssessment.repository.IWordsRepository;
import za.co.runninghill.runninghillAssessment.service.IWordsService;

@Service
public class WordsServiceImpl implements IWordsService{

	@Autowired
    private IWordsRepository wordsRepository;
	
	@Autowired
    private ISentenceRepository setenceRepository;
	
	@Override
	public String saveEntry(SaveRequestDTO request) {
		
		try {
			SentenceEntity sentenceEntity = new SentenceEntity();
			
			sentenceEntity.setSentence(request.getSentence());
			sentenceEntity.setDescription(request.getDescription());
			
			setenceRepository.save(sentenceEntity);
			
			for(OptionsDTO options : request.getOptions()) {
				
				WordsEntity option = new WordsEntity();
				
				option.setOptionDescription(options.getOption());
				option.setOptionFlag(options.getOptionFlag());
				option.setDescription(options.getDescription());
				wordsRepository.save(option);
			}
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		return "Successfully saved";
	}

	@Override
	public List<WordsEntity> getOptionsByDescription(String description) {
		
		List<WordsEntity> optionsList = null;
		
		try {	
			optionsList = wordsRepository.findByDescription(description);
			
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		return optionsList;
	}

	@Override
	public List<SentenceEntity> getSentenceByDescription(String description) {
		List<SentenceEntity> sentence = null;
		
		try {
			sentence = setenceRepository.findByDescription(description);
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		return sentence;
	}

	@Override
	public String selectedOptions(SelectedOptionsDTO options) {
		
		String response = null;
		int count = 0;
		List<WordsEntity> optionsList = null;
		
		try {
			optionsList = wordsRepository.findByDescriptionAndOptionFlag(options.getDescription(), true);
			for(Options answerList : options.getOptions()) {
				
				for(WordsEntity opt : optionsList ) {
					
					if(answerList.getOptions().equalsIgnoreCase(opt.getOptionDescription())){
						count++;
						break;
					}
				}
			}
			
			response = (count == optionsList.size())?"Correct selection(s) " : "Incorrect selection(s)";
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		return response;
	}

}