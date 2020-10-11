package proxy.jdkProxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class JdkProxyTest {

	@Test
	public void test(){
		Object target = new PersonDaoImpl();
		Transation transation = new Transation();
		Interceptor interceptor = new Interceptor(target, transation);
		/**
		 * Proxy.newProxyInstance(...) JDK提供的实现动态代理
		 * 参数1：目标类的类加载器
		 * 参数2：目标类实现的所有接口
		 * 参数3：拦截器
		 */
		PersonDao personDao =  (PersonDao)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), interceptor);
		personDao.save();
	}
}
