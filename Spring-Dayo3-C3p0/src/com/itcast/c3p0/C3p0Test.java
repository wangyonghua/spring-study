package com.itcast.c3p0;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Test {
	@Test
	public void test() throws PropertyVetoException {
		// ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// dataSource.setDriverClass("com.mysql.jdbc.Driver");
		// dataSource.setJdbcUrl("jdbc:mysql:///hhl_msg_center");
		// dataSource.setUser("root");
		// dataSource.setPassword("123456");
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean3.xml");
		ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean("datasource");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user where username=?";
		User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int num) throws SQLException {
				// TODO Auto-generated method stub
				String username = rs.getString("username");
				String password = rs.getString("password");
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);

				return user;
			}
		}, "lucy");

		System.out.println(user);
	}
}
