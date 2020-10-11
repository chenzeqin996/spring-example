package proxy.cglibProxy;

public class Security implements MyInterceptor{
	@Override
	public void interceptor() {
		System.out.println("security");
	}
}
