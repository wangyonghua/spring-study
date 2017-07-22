package com.study.property;

public class Book {
	private String bookname;

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void test() {
		System.out.println("test" + this.bookname);
	}
}
