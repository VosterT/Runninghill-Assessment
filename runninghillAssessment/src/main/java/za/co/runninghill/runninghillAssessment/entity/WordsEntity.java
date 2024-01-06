package za.co.runninghill.runninghillAssessment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class WordsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer option_id;

    private String optionDescription;

	private Boolean optionFlag;
	
	private String description;

	@ManyToOne
	@JoinColumn(name = "id")
    private SentenceEntity sentenceEntity;
	
    public Integer getId() {
		return option_id;
	}

	public void setId(Integer id) {
		this.option_id = id;
	}


	public SentenceEntity getSentence_id() {
		return sentenceEntity;
	}

	public void setSentence_id(SentenceEntity sentence_id) {
		this.sentenceEntity = sentence_id;
	}

	public String getOptionDescription() {
		return optionDescription;
	}

	public void setOptionDescription(String optionDescription) {
		this.optionDescription = optionDescription;
	}

	public Boolean getOptionFlag() {
		return optionFlag;
	}

	public void setOptionFlag(Boolean optionFlag) {
		this.optionFlag = optionFlag;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}