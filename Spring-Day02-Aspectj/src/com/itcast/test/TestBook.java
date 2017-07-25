package com.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.aop.Book;

public class TestBook {
	private ApplicationContext context;

	@Test
	public void testBook() {
		context = new ClassPathXmlApplicationContext("Bean3.xml");
		Book book = (Book) context.getBean("book");
		book.add();
		System.out.println("okay");
	}
}
