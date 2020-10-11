package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Transation {
	public void beginTransation(){
		System.out.println("begin transation");
	}
	public void commitTransation(String msg){
		System.out.println("commit transation");
		System.out.println(msg);
	}
	
	public void finallyMethod(){
		System.out.println("最终输出");
	}
	
	public void throwingMethod(Throwable ex){
		System.out.println("异常通知："+ex.getMessage());
	}
	
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕通知:前");	// 相当于调用前置通知
		joinPoint.proceed();			// 调用目标方法，如果不写则目标方法不会执行
		System.out.println("环绕通知：后");	// 相当于调用后置通知
	}
}
