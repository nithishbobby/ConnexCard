package com.Concard.Card.DTO;



public class LoginDTO {
    private String email;

    private String phoneNumber;

    private String password;

    
    public LoginDTO(String email, String phoneNumber, String password) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	// Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
