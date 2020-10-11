package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented										// 该注解是否出现在帮助文档中
@Retention(RetentionPolicy.RUNTIME)				// 该注解在java文件、class文件和运行时都起作用
@Target({ElementType.TYPE,ElementType.FIELD})	// 指定该注解能标记的位置（类、属性）
public @interface LogInfo {
	String info();		// 注解类的属性info
}
