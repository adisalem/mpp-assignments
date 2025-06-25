package lab2.prob2B;

public class OrderLine {
    private Order order;
    private String productName;

    OrderLine(String productName) {
        this.productName = productName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
