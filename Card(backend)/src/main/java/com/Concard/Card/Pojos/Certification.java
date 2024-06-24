package com.Concard.Card.Pojos;

public class Certification {
    private String name;
    private String authority;
    private String licenseNumber;
    private String startDate;
    private String endDate;
	public Certification(String name, String authority, String licenseNumber, String startDate, String endDate) {
		super();
		this.name = name;
		this.authority = authority;
		this.licenseNumber = licenseNumber;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
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