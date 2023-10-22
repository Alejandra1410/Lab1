    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;
import java.sql.Date;
/**
 *
 * @author abiga
 */
public abstract class Transaction implements Cloneable {
    double amount;
    Account source;
    Date date;

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }

    public Transaction(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }
    
    public Transaction(double amount, Account source) {
        this.amount = amount;
        this.source = source;
    }
    
    public abstract boolean execute();

    public Transaction cloneTransaction() {
        try {
            return (Transaction) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Transaction saveToMemento() {
        return this.cloneTransaction();
    }

    public void restoreFromMemento(Transaction memento) {
        this.amount = memento.getAmount();
        this.source = memento.getSource();
        this.date = memento.getDate();
    }
}



