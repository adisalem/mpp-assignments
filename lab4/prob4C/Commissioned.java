package prob4C;
import java.util.List;
import java.util.ArrayList;

public class Commissioned extends Employee {
    private double commission; 
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    private double addupOrderAmount(int month, int year) {
        return orders.stream()
                .filter(order -> order.getOrderDate().getMonthValue() == month && 
                               order.getOrderDate().getYear() == year)
                .mapToDouble(Order::getOrderAmount)
                .sum();
    }

    @Override
    protected double calcGrossPay(int month, int year) {

        int prevMonth = month - 1;
        int prevYear = year;
    
        if (prevMonth == 0) {
            prevMonth = 12;
            prevYear = year - 1;
        }
        
        double totalOrdersValue = addupOrderAmount(prevMonth, prevYear);
        double commissionAmount = totalOrdersValue * commission;
        return baseSalary + commissionAmount;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Monthly Base Salary: $%.2f%n", baseSalary);
        System.out.printf("Commission Rate: %.2f%%%n", commission * 100);
        System.out.println("Number of Orders: " + orders.size());
    }
}
