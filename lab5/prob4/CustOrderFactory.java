package lab5.prob4;

import java.time.LocalDate;

/** Factory for creating Customer, Order, and Item instances with controlled relationships */
final public class CustOrderFactory {
	private CustOrderFactory(){}
	
	// Factory method to create Customer
	public static Customer createCustomer(String name) {
		return new Customer(name);
	}
	
	public static Order createOrder(Customer customer, LocalDate orderDate) {
		if(customer == null) throw new NullPointerException("Null customer");
		Order order = new Order(orderDate);
		customer.addOrder(order);
		return order;
	}
	
	public static Item createItem(String name) {
		return new Item(name);
	}
	
	public static CustomerAndOrder createCustomerAndOrder(
			String name, LocalDate orderDate) {
		Customer cust = createCustomer(name);
		Order order = createOrder(cust, orderDate);
		return new CustomerAndOrderImpl(cust, order);
	}
}
