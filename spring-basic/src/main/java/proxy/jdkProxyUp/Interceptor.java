package proxy.jdkProxyUp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class Interceptor implements InvocationHandler{
	private Object target;		
	private List<MyInterceptor> interceptors;
	
	public Interceptor(Object target, List<MyInterceptor> interceptors){
		this.target = target;
		this.interceptors = interceptors;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		for (MyInterceptor inte : interceptors) {
			inte.interceptor();
		}
		method.invoke(this.target, args);
		return null;
	}
}
