package prob4E;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        this.acctId = acctId;
        this.interestRate = interestRate;
        this.balance = startBalance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (balance * interestRate);
    }
}
