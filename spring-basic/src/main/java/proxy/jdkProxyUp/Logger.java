package proxy.jdkProxyUp;

public class Logger implements MyInterceptor{
	@Override
	public void interceptor() {
		System.out.println("logger");
	}
}
