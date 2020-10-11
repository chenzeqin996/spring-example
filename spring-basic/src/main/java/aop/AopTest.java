package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/applicationContext-aop.xml");
		PersonDao dao = (PersonDao)context.getBean("personDao_aop");
		dao.save();
	}
}
