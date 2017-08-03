package com.itcast.c3p0;

public class UserService {
    private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
    
	public void add(){
		System.out.println("service add");
		dao.add();
	}
}
