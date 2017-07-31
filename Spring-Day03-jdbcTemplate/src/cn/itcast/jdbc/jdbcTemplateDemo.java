package cn.itcast.jdbc;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 1 导入jar 2.创建对象，设置数据库的信息 3.创建jdbcTempalte
 * 
 * @author wangyonghua
 * 
 */
public class jdbcTemplateDemo {

	@Test
	public void testJdbc() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");

			// 创建链接
			conn = (Connection) DriverManager.getConnection("jdbc:mysql:///hhl_msg_center", "root", "123456");

			// 编写Sql
			String sql = "select * from user where username=?";

			// 预编译sql
			ps = conn.prepareStatement(sql);
			ps.setString(1, "lucy");
			rs = ps.executeQuery();
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				System.out.println(user);
			}

		} catch (Exception exception) {
			System.out.println(exception);
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///hhl_msg_center");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		// 增加
		// String sql = "insert into user values(?,?)";
		// int row = jdbcTemplate.update(sql, "lucy", "250");

		// 更新
		// String sql = "update user set password=? where username=?";
		// int row = jdbcTemplate.update(sql, "1212", "lucy");

		// 删除
		// String sql = "select count(*) from user";
		// int count = jdbcTemplate.queryForObject(sql, Integer.class);

		String sql1 = "select * from user where username='lucy'";
		User user = jdbcTemplate.queryForObject(sql1, User.class);

		System.out.println(user);
	}
}
