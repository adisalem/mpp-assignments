package prob4C;
public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        
        // Calculate all tax deductions based on gross pay
        double fica = grossPay * 0.23;          
        double state = grossPay * 0.05;          
        double local = grossPay * 0.01;         
        double medicare = grossPay * 0.03;      
        double socialSecurity = grossPay * 0.075; 
        
        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
    }

    protected abstract double calcGrossPay(int month, int year);

    public void print() {
        System.out.println("Employee ID: " + empId);
}
}




