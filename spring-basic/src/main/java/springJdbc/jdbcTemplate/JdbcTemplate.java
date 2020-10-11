package springJdbc.jdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class JdbcTemplate {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void update(String sql) throws SQLException{
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
	}
}
