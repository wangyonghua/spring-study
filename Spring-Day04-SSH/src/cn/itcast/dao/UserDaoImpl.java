package cn.itcast.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUid(1);
		user.setUsername("wang");
		user.setAddress("北京");
		template.save(user);
	}

}
