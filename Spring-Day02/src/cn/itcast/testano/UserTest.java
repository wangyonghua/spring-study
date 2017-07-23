package cn.itcast.testano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.anno.User;
import cn.itcast.anno.UserService;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		UserService service=(UserService)context.getBean("userService");
		service.test();
		System.out.println(user);
		System.out.println("ok");
	}

}
