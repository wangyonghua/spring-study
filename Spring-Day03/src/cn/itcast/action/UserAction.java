package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.service.UserService;

public class UserAction extends ActionSupport {
	private UserService service;

	public void setService(UserService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("bean3.xml");
		// UserService service = (UserService) context.getBean("userService");
		service.add();
		// TODO Auto-generated method stub
		return NONE;
	}
}
