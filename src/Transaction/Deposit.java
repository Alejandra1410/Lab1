    package Transaction;

import Account.Account;

public class Deposit extends Transaction {

    public Deposit(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        try {
            getSource().deposit(getAmount());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}