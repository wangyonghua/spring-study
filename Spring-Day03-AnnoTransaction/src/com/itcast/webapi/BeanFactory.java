package com.itcast.webapi;

import java.beans.PropertyVetoException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class BeanFactory {

	@Bean
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql:///hhl_msg_center");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(ComboPooledDataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean(name = "dataSourceTransactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager(ComboPooledDataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
