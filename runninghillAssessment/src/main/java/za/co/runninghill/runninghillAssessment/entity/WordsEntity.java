package za.co.runninghill.runninghillAssessment.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class WordsEntity {

    @Id
    private Integer id;

    private String word;

    private int sentence_id;

}