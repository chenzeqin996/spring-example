package springJdbc.jdbcTemplate_demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao2{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int update(String sql){
		return this.jdbcTemplate.update(sql);
	}
}
