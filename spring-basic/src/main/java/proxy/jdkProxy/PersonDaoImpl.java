package proxy.jdkProxy;

public class PersonDaoImpl implements PersonDao{
	@Override
	public void save() {
		System.out.println("save");
	}
	@Override
	public void update() {
		System.out.println("update");
	}
	@Override
	public void delete() {
		System.out.println("delete");
	}
}
