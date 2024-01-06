package za.co.runninghill.runninghillAssessment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.runninghill.runninghillAssessment.dto.SelectedOptionsDTO;
import za.co.runninghill.runninghillAssessment.dto.SaveRequestDTO;
import za.co.runninghill.runninghillAssessment.entity.SentenceEntity;
import za.co.runninghill.runninghillAssessment.entity.WordsEntity;
import za.co.runninghill.runninghillAssessment.service.IWordsService;

@RestController
@RequestMapping("/runninghill")
@CrossOrigin("http://localhost:4200")
public class WordsController {

    @Autowired
    private IWordsService wordsService;
    
    @GetMapping("/options/{description}")
    public List<WordsEntity> getOptionsByDescription(@PathVariable String description) {
        List<WordsEntity> options = wordsService.getOptionsByDescription(description);
        return options;
    }
    
    @GetMapping("/sentence/{description}")
    public List<SentenceEntity> getSentenceByDescription(@PathVariable String description) {
    	List<SentenceEntity> sentence = wordsService.getSentenceByDescription(description);
        return sentence;
    }
    
    @PostMapping("/save")
    public String saveEntry(@RequestBody SaveRequestDTO request ) {
        String words = wordsService.saveEntry(request);
        return words != null? words : null;
    }
    
    @PostMapping("/answers")
    public String selectedOptions(@RequestBody SelectedOptionsDTO request ) {
        String words = wordsService.selectedOptions(request);
        return words != null? words : null;
    }
}