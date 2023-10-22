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
    @Override
    public Withdrawal clone() {
        try {
            return (Withdrawal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Withdrawal saveToMemento() {
        return this.clone();
    }

    public void restoreFromMemento(Withdrawal memento) {
    this.amount = memento.getAmount();
    this.source = memento.getSource();
    this.date = memento.getDate();
    }
}