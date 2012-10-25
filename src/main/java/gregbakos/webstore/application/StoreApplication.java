package gregbakos.webstore.application;

import gregbakos.webstore.restful.CustomerServiceImpl;
import gregbakos.webstore.restful.OrderServiceImpl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class StoreApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public StoreApplication() {
		singletons.add(new CustomerServiceImpl());
		singletons.add(new OrderServiceImpl());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
