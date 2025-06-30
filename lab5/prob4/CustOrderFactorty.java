package lab5.prob4;

import java.time.LocalDate;

final public class CustOrderFactorty {
	private CustOrderFactorty(){}
	
	public static CustomerAndOrder createCustomerAndOrder(
			String name, LocalDate orderDate) {
		Order o= new Order(orderDate);
		Customer cust = new Customer(name);
		o.setCustomer(cust);
		cust.setOrder(o);
		return new CustomerAndOrderImpl(cust, o);
	}
}
