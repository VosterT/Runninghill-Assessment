package za.co.runninghill.runninghillAssessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.runninghill.runninghillAssessment.entity.WordsEntity;

@Repository
public interface IWordsRepository extends JpaRepository<WordsEntity, Integer> {
	
	 List<WordsEntity> findByDescription(String description);
	 List<WordsEntity> findByDescriptionAndOptionFlag(String description, boolean optionFlag);
}