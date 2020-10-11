package annotation;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @Desc 注解解析器测试类
 */
public class AnnotationParse {

	@Test
	public void TestParse(){
		// 解析类上的注解
		Class clazz = Person.class;
		if(clazz.isAnnotationPresent(LogInfo.class)){
			LogInfo log = (LogInfo)clazz.getAnnotation(LogInfo.class);
			if(log.info().equals("person类")){
				System.out.println("do what you want!");
			}
		}
		// 解析方法上的注解
		Method[] methods = clazz.getMethods();
		for (Method me : methods) {
			if(me.isAnnotationPresent(MethodDesc.class)){
				MethodDesc desc = me.getAnnotation(MethodDesc.class);
				if(desc.value().equals("sayHi方法")){
					System.out.println("do something!");
				}
			}
		}
	}
}
