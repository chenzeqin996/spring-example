package springJdbc.jdbcTemplate_demo;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
	@Test
	public void test() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-jdbcTemplate.xml");
		PersonDao2 dao = (PersonDao2)context.getBean("personDao2");
		String sql = "update person set page=200 where pid='1'";
		dao.update(sql);
	}
}
