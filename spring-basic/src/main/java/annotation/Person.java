package annotation;

@LogInfo(info="person类")	// 给注解类的属性赋值，当注解类的属性为value时，"value="可以省略，如下@MethodDesc
public class Person {
	
	@LogInfo(info="pid属性")
	String pid;
	
	@MethodDesc("sayHi方法")
	public void sayHi(){
		System.out.println("hi");
	}

}
