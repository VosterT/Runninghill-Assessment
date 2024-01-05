package za.co.runninghill.runninghillAssessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.runninghill.runninghillAssessment.entity.WordsEntity;

public interface IWordsRepository extends JpaRepository<WordsEntity, Integer> {
}