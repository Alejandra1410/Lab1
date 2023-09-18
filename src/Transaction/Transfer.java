package Transaction;

import Account.Account;
import java.sql.Date;

/**
 *
 * @author ekard
 */
public class Transfer extends Transaction {
    
    private Account destination;

    public Transfer(double amount, Account source, Account destination, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }

    @Override
    public boolean execute() {
        try {
            if (getSource().getBalance() >= getAmount()) {
                getSource().withdraw(getAmount());

                getDestination().deposit(getAmount());
                
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Account getDestination() {
        return destination;
    }
}
