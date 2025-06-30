package lab5.prob4;
final class CustomerAndOrderImpl implements CustomerAndOrder {
	private Customer customer;
	private Order order;
	CustomerAndOrderImpl(Customer c, Order o) {
		customer = c;
		order = o;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Order getOrder() {
		return order;
	}
}
