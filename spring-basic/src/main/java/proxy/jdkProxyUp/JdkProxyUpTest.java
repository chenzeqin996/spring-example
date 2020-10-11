package proxy.jdkProxyUp;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JdkProxyUpTest {

	@Test
	public void test(){
		Object target = new PersonDaoImpl();
		Logger logger = new Logger();	
		Security security = new Security();			
		List<MyInterceptor> interceptors = new ArrayList<MyInterceptor>();
		// 需要添加新切面，可以继承MyInterceptor来实现；无需更改过滤器Interceptor
		interceptors.add(logger);
		interceptors.add(security);
		Interceptor interceptor = new Interceptor(target, interceptors);		
		PersonDao personDao =  (PersonDao)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), interceptor);
		personDao.save();
	}
}
