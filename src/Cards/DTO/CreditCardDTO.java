package Cards;

/**
 *
 * @author abiga
 */
public class CreditCard extends Card {
 private double balance;
 private double creditLimit;
 private static double interestRate;

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public CreditCard(double balance, double creditLimit, String number, boolean active) {
        super(number, active);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }
    public boolean makePayment(double amount) {
    if (isActive() && amount > 0) {
        balance -= amount;
        return true;
    }
    return false;
    }
    
    @Override
    public boolean makePurchase(double amount) {
     if (isActive() && amount > 0) {
        if (balance + amount <= creditLimit) {
         balance += amount; 
            return true; 
        }
    }
    return false; 
         }
    }
