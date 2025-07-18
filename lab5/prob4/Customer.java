package lab5.prob4;

import java.util.ArrayList;
import java.util.List;

// Outside of lab5.prob4 package, Customer is immutable
final public class Customer {
	private String name;
	private List<Order> orders;
	
	// Package-private constructor - only accessible within the same package
	Customer(String name) {
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
}
