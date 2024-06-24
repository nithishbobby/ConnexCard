package com.Concard.Card.Pojos;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String profilePictureUrl;
    private String bio;
    private Address address;

    private String jobTitle;
    private String company;
    private List<String> skills;
    private List<Experience> experience;
    private List<Education> education;
    private List<Project> projects;
    private List<Certification> certifications;

    private String websiteUrl;
    private String linkedinUrl;
    private String githubUrl;
    private String twitterUrl;
    private List<User> connections;

    private Map<String, String> notes;
    private List<String> tags;
    private List<Reminder> reminders;
    private Preferences preferences;
    
    private boolean isVerified;
    
    
    public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public User ()
    {
    	
    }
	public User(String userId, String firstName, String lastName, String email, String password, String phoneNumber,
			String profilePictureUrl, String bio, Address address, String jobTitle, String company, List<String> skills,
			List<Experience> experience, List<Education> education, List<Project> projects,
			List<Certification> certifications, String websiteUrl, String linkedinUrl, String githubUrl,
			String twitterUrl, List<User> connections, Map<String, String> notes, List<String> tags,
			List<Reminder> reminders, Preferences preferences) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.profilePictureUrl = profilePictureUrl;
		this.bio = bio;
		this.address = address;
		this.jobTitle = jobTitle;
		this.company = company;
		this.skills = skills;
		this.experience = experience;
		this.education = education;
		this.projects = projects;
		this.certifications = certifications;
		this.websiteUrl = websiteUrl;
		this.linkedinUrl = linkedinUrl;
		this.githubUrl = githubUrl;
		this.twitterUrl = twitterUrl;
		this.connections = connections;
		this.notes = notes;
		this.tags = tags;
		this.reminders = reminders;
		this.preferences = preferences;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}
	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<Experience> getExperience() {
		return experience;
	}
	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getGithubUrl() {
		return githubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	public String getTwitterUrl() {
		return twitterUrl;
	}
	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}
	public List<User> getConnections() {
		return connections;
	}
	public void setConnections(List<User> connections) {
		this.connections = connections;
	}
	public Map<String, String> getNotes() {
		return notes;
	}
	public void setNotes(Map<String, String> notes) {
		this.notes = notes;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<Reminder> getReminders() {
		return reminders;
	}
	public void setReminders(List<Reminder> reminders) {
		this.reminders = reminders;
	}
	public Preferences getPreferences() {
		return preferences;
	}
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
    
    

    // Getters and Setters for all fields
}
