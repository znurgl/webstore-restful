package gregbakos.webstore.restful;

import gregbakos.webstore.dao.BasicDao;
import gregbakos.webstore.dao.DaoFactory;
import gregbakos.webstore.domain.Order;

import javax.ws.rs.PathParam;

public class OrderServiceImpl implements OrderService {

	@SuppressWarnings("unchecked")
	private BasicDao<Order> dao = DaoFactory.getDao();

	public Order getOrder(@PathParam("id") int id) {
		return dao.readById(id);
	}

	public Order createOrder(Order order) {
		dao.create(order);
		return order;
	}

	public void updateOrder(Order order) {
		dao.update(order);
	}

}
