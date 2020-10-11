package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 拦截器
 * 1、引入目标类和事务
 * 2、给目标类和事务赋值
 * 3、填充invoke方法：开启事务-调用目标类方法-关闭事务
 */
public class Interceptor implements InvocationHandler{
	private Object target;					// 目标类
	private Transation transation;			// 事务
	
	public Interceptor(Object target, Transation transation){
		this.target = target;
		this.transation = transation;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.transation.beginTransation();	// 开启事务
		method.invoke(this.target, args);	// 调用目标类方法
		this.transation.commitTranstation();// 关闭事务
		return null;
	}
}
