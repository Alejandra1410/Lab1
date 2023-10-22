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
    @Override
    public Deposit clone() {
        try {
            return (Deposit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Deposit saveToMemento() {
        return this.clone();
    }

    public void restoreFromMemento(Deposit memento) {
    this.amount = memento.getAmount();
    this.source = memento.getSource();
    this.date = memento.getDate();
    }
    
}