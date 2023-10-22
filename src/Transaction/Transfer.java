package Transaction;

import Account.Account;
/**
 *
 * @author ekard
 */
public class Transfer extends Transaction {
    
    private Account destination;

    public Transfer(double amount, Account source, Account destination) {
        super(amount, source);
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
    @Override
    public Transfer clone() {
        try {
            return (Transfer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Transfer saveToMemento() {
        return this.clone();
    }

    // Método para restaurar el estado de la Transfer desde un Memento
    public void restoreFromMemento(Transfer memento) {
        this.amount = memento.getAmount();
        this.source = memento.getSource();
        this.destination = memento.getDestination();
        this.date = memento.getDate();
    }
}

