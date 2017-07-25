package com.itcast.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.aop.Book;

public class TestBook {
	@Test
	public void testBook() {
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean3.xml");
		Book book = (Book) context.getBean("book");
		book.add();
		System.out.println("okay");
	}
}
