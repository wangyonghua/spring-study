package cn.itcast.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 1 导入jar 2.创建对象，设置数据库的信息 3.创建jdbcTempalte
 * 
 * @author wangyonghua
 *
 */
public class jdbcTemplateDemo {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///hhl_msg_center");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "insert into user values(?,?)";
		int row = jdbcTemplate.update(sql, "lucy", "250");
		System.out.println(row);
	}
}
