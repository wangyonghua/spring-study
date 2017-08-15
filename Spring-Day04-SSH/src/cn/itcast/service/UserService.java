package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.UserDao;

@Transactional
public class UserService {
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add() {
		dao.add();
	}
}
