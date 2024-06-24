package com.Concard.Card.Pojos;

public class Preferences {
    private boolean emailNotifications;
    private boolean smsNotifications;
	public Preferences(boolean emailNotifications, boolean smsNotifications) {
		super();
		this.emailNotifications = emailNotifications;
		this.smsNotifications = smsNotifications;
	}
	public boolean isEmailNotifications() {
		return emailNotifications;
	}
	public void setEmailNotifications(boolean emailNotifications) {
		this.emailNotifications = emailNotifications;
	}
	public boolean isSmsNotifications() {
		return smsNotifications;
	}
	public void setSmsNotifications(boolean smsNotifications) {
		this.smsNotifications = smsNotifications;
	}
    
}