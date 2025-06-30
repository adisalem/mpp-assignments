package prob4E;

public abstract class Account {
    protected String acctId;
    protected double balance;

    public String getAccountID() {
        return acctId;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double computeUpdatedBalance();
}
