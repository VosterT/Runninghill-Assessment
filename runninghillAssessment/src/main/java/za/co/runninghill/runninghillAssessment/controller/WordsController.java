package za.co.runninghill.runninghillAssessment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.runninghill.runninghillAssessment.entity.WordsEntity;
import za.co.runninghill.runninghillAssessment.repository.IWordsRepository;

@RestController
public class WordsController {

    @Autowired
    private IWordsRepository wordsRepository;

    @GetMapping("/words")
    public List<WordsEntity> getWords() {
        List<WordsEntity> words = wordsRepository.findAll();
        return words != null? words : null;
    }
}