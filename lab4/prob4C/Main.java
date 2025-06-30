package prob4C;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Get current date for all paycheck calculations
        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();
        Employee emp;

        System.out.println("=== PAYROLL SYSTEM - " + today + " ===");
        System.out.println("Calculating paychecks for: " + currentMonth + "/" + currentYear);
        System.out.println();

        // Hourly Employee
        emp = new Hourly("H001", 25.0, 40);
        System.out.println("1. HOURLY EMPLOYEE:");
        emp.print();
        Paycheck hourlyPaycheck = emp.calcCompensation(currentMonth, currentYear);
        hourlyPaycheck.print();
        System.out.println();

        // Salaried Employee
        emp = new Salaried("S001", 5000.0);
        System.out.println("2. SALARIED EMPLOYEE:");
        emp.print();
        Paycheck salariedPaycheck = emp.calcCompensation(currentMonth, currentYear);
        salariedPaycheck.print();
        System.out.println();

        // Commissioned Employee
        System.out.println("3. COMMISSIONED EMPLOYEE:");
        Commissioned commissionedEmp = new Commissioned("C001", 0.08, 2000.0);

        // Calculate previous month for orders
        int prevMonth = currentMonth - 1;
        int prevYear = currentYear;

        if (prevMonth == 0) {
            prevMonth = 12;
            prevYear = currentYear - 1;
        }


        // Adding orders for the previous month for testing
        commissionedEmp.addOrder(new Order("ORD001", LocalDate.of(prevYear, prevMonth, 5), 10000.0));
        commissionedEmp.addOrder(new Order("ORD002", LocalDate.of(prevYear, prevMonth, 15), 7500.0));
        commissionedEmp.addOrder(new Order("ORD003", LocalDate.of(prevYear, prevMonth, 25), 12000.0));

        commissionedEmp.print();
        Paycheck commissionedPaycheck = commissionedEmp.calcCompensation(currentMonth, currentYear);
        commissionedPaycheck.print();
        System.out.println();

    }
}
