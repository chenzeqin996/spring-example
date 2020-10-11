package di.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private Long pid;
	private String pname;
	
	@Resource(name="student_anno")
	//@Autowired
	//@Qualifier("student_anno")
	private Student student;	
	
	public void showStudent(){
		this.student.show();
	}

}