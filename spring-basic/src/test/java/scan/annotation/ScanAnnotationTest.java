package scan.annotation;

import org.junit.Test;
import util.SpringInit;

public class ScanAnnotationTest extends SpringInit{

	@Test
	public void test(){
		Person person = (Person)context.getBean("person_scan");
		person.showStudent();
	}
}
