package prob4C;
public record Paycheck(
    double grossPay,
    double fica,
    double state,
    double local,
    double medicare,
    double socialSecurity
) {

    public double getNetPay() {
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }

    public void print() {
        System.out.println("=== PAYCHECK ===");
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.printf("FICA: $%.2f%n", fica);
        System.out.printf("State Tax: $%.2f%n", state);
        System.out.printf("Local Tax: $%.2f%n", local);
        System.out.printf("Medicare: $%.2f%n", medicare);
        System.out.printf("Social Security: $%.2f%n", socialSecurity);
        System.out.printf("Net Pay: $%.2f%n", getNetPay());
        System.out.println("================");
    }
}
