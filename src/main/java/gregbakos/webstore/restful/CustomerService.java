package gregbakos.webstore.restful;

import gregbakos.webstore.domain.Customer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
public interface CustomerService {

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Customer createCustomer(Customer customer);

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer(@PathParam("id") int id);

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void updateCustomer(Customer update);

}
