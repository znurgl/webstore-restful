package gregbakos.webstore.restful;

import gregbakos.webstore.dao.BasicDao;
import gregbakos.webstore.dao.DaoFactory;
import gregbakos.webstore.domain.Customer;

import javax.ws.rs.PathParam;

public class CustomerServiceImpl implements CustomerService {

	@SuppressWarnings("unchecked")
	private BasicDao<Customer> dao = DaoFactory.getDao();

	public Customer getCustomer(@PathParam("id") int id) {
		return dao.readById(id);
	}

	public Customer createCustomer(Customer customer) {
		dao.create(customer);
		return customer;
	}

	public void updateCustomer(Customer customer) {
		dao.update(customer);
	}

}
