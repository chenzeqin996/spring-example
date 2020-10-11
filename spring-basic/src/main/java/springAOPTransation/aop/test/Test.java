package springAOPTransation.aop.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAOPTransation.aop.service.AccountService;


public class Test {

	/**
	 * 声明式事务例子
	 * @throws SQLException
	 */
	@org.junit.Test
	public void test() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_springAOPTransation.xml");
        AccountService account = (AccountService) context.getBean("accountService");
        //Tom 向 Marry 转账1000
        account.transfer("JACK", "TOM", 100);
	}
}
