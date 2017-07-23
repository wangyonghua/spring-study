package cn.itcast.testano;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.anno.User;
import cn.itcast.anno.UserService;
import cn.itcast.xmlanno.BookService;

public class UserTest {
	@Test
	public void testResource() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		UserService service = (UserService) context.getBean("userService");
		service.test();
		System.out.println(user);
		System.out.println("ok");
	}

	@Test
	public void testResource2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		BookService service = (BookService) context.getBean("bookService");
		service.add();
		System.out.println("ok");
	}

}
