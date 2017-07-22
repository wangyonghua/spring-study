package com.study.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pname;

	public void setPname(String pname) {
		this.pname = pname;
	}

	private String[] arr;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void test1() {
		System.out.println("arr" + this.arr);
		System.out.println("list" + this.list);
		System.out.println("map" + this.map);
		System.out.println("properties" + this.properties);
	}
}
