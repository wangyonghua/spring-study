package com.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	public void before1() {
		System.out.println("前置增强 ....");
	}

	public void after1() {
		System.out.println("后置增强 ....");
	}

	public void around1(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("方法执行之前");
		joinPoint.proceed();
		System.out.println("方法执行之后");
	}
}
