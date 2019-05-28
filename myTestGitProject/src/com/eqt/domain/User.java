package com.eqt.domain;

public class User {
	
	private String username = "";
	private String email = "";
	private String description = "";
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private Address address = null;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", description=" + description + ", address="
				+ address + "]";
	}
	
	
			

}
