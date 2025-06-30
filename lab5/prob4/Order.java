package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Outside of lab5.prob4 package, Order is immutable  
final public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	// Package-private constructor - only accessible within the same package
	Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	
	public void addItem(String name){
		items.add(CustOrderFactory.createItem(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
