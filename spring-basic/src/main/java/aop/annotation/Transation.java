package aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect 
 * 相当于
 * <aop:config></aop:config>
 */
@Component("transation")
@Aspect
public class Transation {
	
	/**
	 * 这个方法的定义相当于
	 * <aop:pointcut expression="execution(* aop.annotation.PersonDaoImpl.*(..))" id="cut1()"/>
	 */
	@Pointcut("execution(* aop.annotation.PersonDaoImpl.*(..))")
	private void cut1(){}	// 方法签名，返回值必须是void，方法的修饰符最好是private
	
	/**
	 * 相当于
	 * <aop:before method="beginTransation" pointcut-ref="cut1()"/>
	 */
	@Before("cut1()")
	public void beginTransation(){
		System.out.println("begin transation");
	}
	
	/**
	 * 相当于
	 * <aop:after-returning method="commitTransation" pointcut-ref="cut1()" returning="msg"/>
	 */
	@AfterReturning(value="cut1()",returning="msg")
	public void commitTransation(String msg){
		System.out.println("commit transation");
		System.out.println(msg);
	}
}
