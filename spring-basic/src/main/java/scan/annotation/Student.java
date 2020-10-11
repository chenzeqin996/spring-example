package scan.annotation;

import org.springframework.stereotype.Component;

@Component("student_scan")
public class Student {
	public void show(){
		System.out.println("student:show");
	}
}
