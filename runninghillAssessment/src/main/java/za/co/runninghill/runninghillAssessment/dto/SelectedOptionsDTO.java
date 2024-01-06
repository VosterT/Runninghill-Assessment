package za.co.runninghill.runninghillAssessment.dto;

import java.util.List;

public class SelectedOptionsDTO {

	private List<Options> options;
	
	private String description;
	
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
