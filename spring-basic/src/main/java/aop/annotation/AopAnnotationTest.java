package aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopAnnotationTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/annotation/applicationContext-aop-annotation.xml");
		PersonDao dao = (PersonDao)context.getBean("personDaoAOPAnno");
		dao.save();
	}
}
