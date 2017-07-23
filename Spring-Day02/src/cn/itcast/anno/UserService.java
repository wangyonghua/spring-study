package cn.itcast.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao dao;

	public void test() {
		dao.test();
		System.out.println("service");
	}
}
