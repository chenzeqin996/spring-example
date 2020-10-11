package proxy.salary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Interceptor implements InvocationHandler{
	private Object target;
	private Logger logger;
	private Privilege privilege;
	private Security security;
	
	public Interceptor(Object target, Logger logger, Privilege privilege, Security security){
		this.target = target;
		this.logger = logger;
		this.privilege = privilege;
		this.security = security;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		this.logger.logging();
		this.security.security();
		if(this.privilege.getAccess().equals("admin")){
			obj = method.invoke(this.target, args);
		}else{
			System.out.println("没有权限查看");
		}
		return obj;
	}
}
