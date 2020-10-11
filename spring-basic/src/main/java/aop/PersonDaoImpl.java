package aop;

public class PersonDaoImpl implements PersonDao{
	@Override
	public String save() {
		System.out.println("save");
		return "save success!";
	}
}
