package cn.study.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.bean.Bean2;

public class TestIOC {
	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
	}

	@Test
	public void testUser1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean2 user = (Bean2) context.getBean("bean2");
		System.out.println(user);
		user.add();
	}
}
