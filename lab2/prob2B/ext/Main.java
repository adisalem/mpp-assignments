package lab2.prob2B.ext;

import lab2.prob2B.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-001");

        order.createOrderLine("Laptop");
        order.createOrderLine("Mouse");
        order.createOrderLine("Keyboard");

        System.out.println(order);
    }
}
