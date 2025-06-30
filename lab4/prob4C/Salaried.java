package prob4C;
public class Salaried extends Employee {
    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Monthly Salary: $%.2f%n", salary);
    }
}
