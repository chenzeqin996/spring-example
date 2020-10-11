package proxy.cglibProxy;

import java.lang.reflect.Method;
import java.util.List;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Interceptor implements MethodInterceptor{
	private Object target;		
	private List<MyInterceptor> interceptors;
	
	public Interceptor(Object target, List<MyInterceptor> interceptors){
		this.target = target;
		this.interceptors = interceptors;
	}
	
	/**
	 * 返回代理类
	 */
	public Object createProxy(){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(this);
		enhancer.setSuperclass(this.target.getClass());
		return enhancer.create();
	}
	
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		for (MyInterceptor inte : interceptors) {
			inte.interceptor();
		}
		arg1.invoke(this.target, arg2);
		return null;
	}
}
