package scan.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person_scan")
public class Person {
	private Long pid;
	private String pname;
	
	@Resource(name="student_scan")	
	private Student student;	
	
	public void showStudent(){
		this.student.show();
	}

}