package za.co.runninghill.runninghillAssessment.dto;

import java.util.List;

public class SaveRequestDTO {
	
	private String sentence;
	
	private String description;
	
	private List<OptionsDTO> options;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public List<OptionsDTO> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsDTO> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		
		 StringBuilder sb = new StringBuilder();
		 
		 sb.append("Sentence");
		 sb.append('=');
		 sb.append(this.sentence);
		 sb.append(',');
		 sb.append("Options");
		 sb.append('=');
		 sb.append(this.options);
		 
		 
		 return sb.toString();
		 
	}
}
