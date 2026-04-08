package com.Model;

public class UserLogin {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserLogin() {
//		No agrs Constructor
	}

	UserLogin(String un, String pws) {
		this.username = un;
		this.password = pws;
	}

	public String toString() {
		return username + " : ";
	}

}
