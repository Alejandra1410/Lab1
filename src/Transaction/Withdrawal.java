package Transaction;

import Account.Account;

public class Withdrawal extends Transaction {
    
    public Withdrawal(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        try {
            if (getSource().getBalance() >= getAmount()) {
                getSource().withdraw(getAmount());
                
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
           return false;
        }
    }
}