package cn.itcast.aop;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	public void add() {
		System.out.println("book");
	}
}
