package com.jsp.entity;

public class AdministratorEntity {

	private String adminName;
	private String adminEmail;
	private String adminPassword;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Adimistrator [adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminPassword="
				+ adminPassword + "]";
	}
	
}
