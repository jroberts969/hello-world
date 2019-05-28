package com.eqt.domain;

public class User {
	
	private String username = "";
	private String email = "";
	private String description = "";
	private String description2 = "";
	
	
	
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
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
	public User(String username, String email, String description, Address address) {
		super();
		this.username = username;
		this.email = email;
		this.description = description;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
			

}
