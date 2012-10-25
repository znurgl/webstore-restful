# Webshop: restful application

This is a simple web store application based on RESTful concept. 

## Install
	mvn clean compile jetty:run

## Application design

### Domain

* Order
 * id
 * total
 * date
 * cancelled
 * Customer
 * Item List
* Customer
 * id
 * firstName
 * lastName
 * street
 * city
 * postcode
* Item
 * id
 * quantity
 * Product
* Product
 * id
 * name
 * cost

### Services

* OrderService 
 * getOrders
 * getOrderById
 * addOrder
 * updateOrder
 * deleteOrder
 * cancelOrder
	
* ProductService 
 * getProducts
 * getProductById
 * addProduct
 * updateProduct
 * deleteProduct
	
* CustomerService 
 * getCustomers
 * getCustomerById
 * addCustomer
 * updateCustomer
 * deleteCustomer

### URIs

/orders (GET)
	optional parameters:
		startIndex
		size
/orders/{id} (GET, POST, PUT, DELETE)
/products (GET)
	optional parameters:
		startIndex
		size
/products/{id} (GET, POST. PUT, DELETE)
/customers (GET)
	optional parameters:
		startIndex
		size
/customers/{id} (GET, POST. PUT, DELETE)

