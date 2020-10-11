package proxy.salary;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class SalaryTest {
	@Test
	public void test(){
		Object target = new SalaryManagerImpl();
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("admin1");
		Interceptor interceptor = new Interceptor(target, logger, privilege, security);
		SalaryManager manager =  (SalaryManager)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), interceptor);
		manager.showSalary();
	}
}
