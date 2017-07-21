package cn.study.ioc;

public class User {
	private String username;

	public User(String username) {
		this.setUsername(username);
	}

	public User() {

	}

	public void add() {
		System.out.println("add....");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
