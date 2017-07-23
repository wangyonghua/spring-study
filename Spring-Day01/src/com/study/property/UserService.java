package com.study.property;

public class UserService {
	private UserDao dao;

	public void add() {
		System.out.println("service.....");
		dao.add();
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
