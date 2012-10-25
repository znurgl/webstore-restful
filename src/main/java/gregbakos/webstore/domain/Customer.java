package gregbakos.webstore.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Customer extends BasicEntity {

	@XmlElement(name = "City", required = true)
	private String city;
	@XmlElement(name = "LastName", required = true)
	private String lastName;
	@XmlElement(name = "FirstName", required = true)
	private String firstName;
	@XmlElement(name = "PostCode", required = true)
	private String postCode;
	@XmlElement(name = "Street", required = true)
	private String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
