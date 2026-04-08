package com.Model;

public class Register {

	private String username;
	private String firstname;
	private String lastname;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Register() {
	}

	public Register(String un, String fn, String ln, String password) {
		this.username = un;
		this.firstname = fn;
		this.lastname = ln;
		this.password = password;
	}

}
