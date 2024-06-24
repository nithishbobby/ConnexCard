package com.Concard.Card.Pojos;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Otp {
	@Id
	private long id ;
	
	private String otp;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private LocalDateTime expiryData;
	
	public Otp()
	{
		
	}
	public Otp(long id, String otp, LocalDateTime expiryData) {
		super();
		this.id = id;
		this.otp = otp;
		this.expiryData = expiryData;
	}
	public Otp(String email ,String otp)
	{
		this.email = email;
		this.otp = otp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public LocalDateTime getExpiryData() {
		return expiryData;
	}
	public void setExpiryData(LocalDateTime expiryData) {
		this.expiryData = expiryData;
	}
	
	

}
