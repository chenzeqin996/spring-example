package di.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiConstructorTest {

	@Test
	public void test(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器把对象取出来
		 * 3、对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("person_con");
		System.out.println(person.getPname());
		System.out.println(person.getStudent());
	}
}
