package com.Concard.Card.Pojos;

public class Education {
	
	private String institution;
    private String degree;
    private String fieldOfStudy;
    private String startDate;
    private String endDate;
	public Education(String institution, String degree, String fieldOfStudy, String startDate, String endDate) {
		super();
		this.institution = institution;
		this.degree = degree;
		this.fieldOfStudy = fieldOfStudy;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
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
