package springTransation.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTransation.service.AccountService;


public class Test {

	/**
	 * 编程式事务例子
	 * @throws SQLException
	 */
	@org.junit.Test
	public void test() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("springTransation/applicationContext_springTransation.xml");
        AccountService account = (AccountService) context.getBean("accountService");
        //Tom 向 Marry 转账1000
        account.transfer("JACK", "TOM", 100);
	}
}
