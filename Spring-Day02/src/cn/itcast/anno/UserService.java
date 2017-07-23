package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	/*
	 * @Autowired private UserDao dao;
	 */

	@Resource(name = "userDao")
	private UserDao dao;

	public void test() {
		dao.test();
		System.out.println("service");
	}
}
