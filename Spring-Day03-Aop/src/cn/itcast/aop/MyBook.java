package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBook {
	@Before("execution(* cn.itcast.aop.Book.*(..))")
	public void before1() {
		System.out.println("before1");
	}
}
