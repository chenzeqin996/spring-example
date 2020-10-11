package springJdbc.jdbcTemplate;

import java.sql.SQLException;

public class PersonDao extends JdbcTemplate{
	public void update(String sql) throws SQLException{
		super.update(sql);
	}
}
