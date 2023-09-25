package Cards.DTO;

import Cards.*;

/**
 *
 * @author abiga
 */
public class CreditCardDTO extends CardDTO {
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

    public CreditCardDTO(double balance, double creditLimit, String number, boolean active) {
        super(number, active);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }
}
