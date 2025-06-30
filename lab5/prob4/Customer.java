package lab5.prob4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	public Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrder(Order o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setOrder'");
	}
}
