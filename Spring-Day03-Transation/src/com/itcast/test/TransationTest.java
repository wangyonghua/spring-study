package com.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.service.OrderService;

public class TransationTest {
	@Test
	public void testAccount() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean3.xml");
		OrderService orderService = (OrderService) applicationContext.getBean("orderService");
		orderService.accountMoney();
		System.out.println("ok");
	}
}
