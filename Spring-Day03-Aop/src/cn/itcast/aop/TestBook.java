package cn.itcast.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean3.xml");
		Book book = (Book) applicationContext.getBean("book");
		book.add();
		System.out.println("okay");
	}
}
