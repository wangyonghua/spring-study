package com.itcast.c3p0;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add() {
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
