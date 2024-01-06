package za.co.runninghill.runninghillAssessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.runninghill.runninghillAssessment.entity.SentenceEntity;

@Repository
public interface ISentenceRepository extends JpaRepository<SentenceEntity, Integer>{
	
	List<SentenceEntity> findByDescription(String description);
}
