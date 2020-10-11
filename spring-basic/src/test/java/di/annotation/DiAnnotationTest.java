package di.annotation;

import org.junit.Test;
import util.SpringInit;

public class DiAnnotationTest extends SpringInit{

	@Test
	public void test(){
		Person person = (Person)context.getBean("person_anno");
		person.showStudent();
	}
}
