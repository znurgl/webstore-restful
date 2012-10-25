package gregbakos.webstore.restful;

import gregbakos.webstore.domain.Order;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
public interface OrderService {

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Order createOrder(Order order);

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Order getOrder(@PathParam("id") int id);

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void updateOrder(Order order);

}
