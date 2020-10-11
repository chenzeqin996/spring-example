package proxy.cglibProxy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CglibProxyTest {

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
		// 直接获取PersonDaoImpl的代理对象，而不是接口的代理对象
		PersonDaoImpl proxy = (PersonDaoImpl) interceptor.createProxy();
		proxy.save();
	}
}
