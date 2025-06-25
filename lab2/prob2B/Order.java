package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(OrderLine orderLine) {
        if (orderLine != null) {
            this.orderLines.add(orderLine);
            orderLine.setOrder(this);
        }
    }

    public OrderLine createOrderLine(String productName) {
        OrderLine orderLine = new OrderLine(productName);
        this.orderLines.add(orderLine);
        orderLine.setOrder(this);
        return orderLine;
    }

    public void removeOrderLine(OrderLine orderLine) {
        if (orderLine != null && this.orderLines.contains(orderLine)) {
            this.orderLines.remove(orderLine);
            orderLine.setOrder(null);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{")
                .append("orderNum='").append(orderNum).append('\'')
                .append(", orderLines=[");

        for (int i = 0; i < orderLines.size(); i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(orderLines.get(i).toString());
        }

        sb.append("]}");
        return sb.toString();
    }
}
