package Transaction;

import Account.Account;
import java.sql.Date;

public class Withdrawal extends Transaction {
    
    public Withdrawal(double amount, Account source, Date date) {
        super(amount, source, date);
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