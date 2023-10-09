/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import Person.Customer;

/**
 *
 * @author ekard
 */
public class ColonAccount extends Account {
     
    public ColonAccount(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }

    public ColonAccount(String number, Customer customer) {
        super(number, customer);
    }

    @Override
    public boolean transfer(Account destination, double amount) {
        if (amount > 0 && getBalance() >= amount && destination != null) {
            if (destination instanceof DollarAccount) {
                double exchangeRate = DollarAccount.getExchangeRate(); 
                double amountInDollars = amount / exchangeRate;
                if (super.transfer(destination, amountInDollars)) {
                    return true;
                }
            } else if (destination instanceof ColonAccount) {
                if (super.transfer(destination, amount)) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public ColonAccount clone() {
        return (ColonAccount) super.clone();
    }
}

