package com.itcast.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void lessMoney(Integer id, Integer money) {
		String sql = "update account set salary=salary-? where id=? and salary-?>0";
		int result = jdbcTemplate.update(sql, money, id, money);
		System.out.println(result);
	}

	public void moreMoney(Integer id, Integer money) {
		String sql = "update account set salary=salary+? where id=?";
		int result = jdbcTemplate.update(sql, money, id);
		System.out.println(result);
	}
}
