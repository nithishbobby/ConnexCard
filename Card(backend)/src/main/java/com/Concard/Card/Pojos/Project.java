package com.Concard.Card.Pojos;

public class Project {
	private String title;
	private String description;
	private String url;
	private String startDate;
	private String endDate;
	public Project(String title, String description, String url, String startDate, String endDate) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	
}
