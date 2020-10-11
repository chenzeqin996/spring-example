package springJdbc.jdbcTemplate;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
	@Test
	public void test() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-jdbcTemplate.xml");
		PersonDao dao = (PersonDao)context.getBean("personDao");
		String sql = "update person set page=20 where pid='1'";
		dao.update(sql);
	}
}
