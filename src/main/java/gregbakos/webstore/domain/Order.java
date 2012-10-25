package gregbakos.webstore.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name = "Order")
public class Order extends BasicEntity {

	@XmlElement(name = "Total")
	private int total;

	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	private Date date;

	@XmlElement(name = "Cancelled")
	private boolean cancelled;

	@XmlElement(name = "Customer", required = true)
	private Customer customer;

	@XmlElement(name = "Items")
	private Items items;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
