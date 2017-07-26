package cn.itcast.service;

import cn.itcast.dao.UserDao;

public class UserService {
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add() {
		System.out.println("add ....");
		dao.add();
	}
}
