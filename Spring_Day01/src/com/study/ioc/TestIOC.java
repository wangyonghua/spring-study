package com.study.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.bean.Bean2;
import com.study.bean.Bean3;
import com.study.property.Book;
import com.study.property.PropertyDemo1;
import com.study.property.UserService;

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

	@Test
	public void testUser2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean3 user = (Bean3) context.getBean("bean3");
		System.out.println(user);
		user.add();
	}

	/**
	 * 属性有参构造函数注入
	 */
	@Test
	public void testPropertyDemo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		PropertyDemo1 user = (PropertyDemo1) context.getBean("bean4");
		System.out.println(user);
		user.test1Demo();
	}

	@Test
	public void testBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Book user = (Book) context.getBean("book");
		System.out.println(user);
		user.test();
	}

	@Test
	public void testUserService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		UserService user = (UserService) context.getBean("userService");
		System.out.println(user);
		user.add();
	}
}
