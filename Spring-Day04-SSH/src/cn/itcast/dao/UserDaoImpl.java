package cn.itcast.dao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import cn.itcast.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		// User user = new User();
		// user.setUid(1);
		// user.setUsername("wang");
		// user.setAddress("北京");
		// template.save(user);

		// get 方法 :根据id查询
		// User user2 = template.get(User.class, 1);
		// System.out.println(user2.getUsername());

		// find方法查询所有记录
		List<User> list = (List<User>) template.find("from User");
		for (User user : list) {
			System.out.println(user);
		}

		// find 条件查询
		List<User> list1 = (List<User>) template.find("from User where username=?", "lucy");
		for (User user : list1) {
			System.out.println(user);
		}
		
		//find不能做分页

	}

}
