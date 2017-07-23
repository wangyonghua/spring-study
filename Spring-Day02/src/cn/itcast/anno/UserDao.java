package cn.itcast.anno;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	public void test() {
		System.out.println("userDao");
	}
}
