package prob4E;
public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        this.acctId = acctId;
        this.monthlyFee = fee;
        this.balance = startBalance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
