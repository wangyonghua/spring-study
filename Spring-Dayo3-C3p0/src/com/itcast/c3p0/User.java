package com.itcast.c3p0;

public class User {
	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getUsername() + "," + this.getPassword();
	}
}
