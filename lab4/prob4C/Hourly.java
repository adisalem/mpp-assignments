package prob4C;
public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Hourly Wage: $%.2f%n", hourlyWage);
        System.out.println("Hours Per Week: " + hoursPerWeek);
    }
}
