package cn.itcast.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user")
@Scope()
public class User {
	public void add() {
		System.out.println("user");
	}
}
