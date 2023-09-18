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
public class DollarAccount extends Account{
    private static double exchangeRate; 

    public DollarAccount(String number, double balance, Customer customer, double exchangeRate) {
        super(number, balance, customer);
        DollarAccount.exchangeRate = exchangeRate;
    }
    
    public DollarAccount(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }
    
    public DollarAccount(String number, Customer customer) {
        super(number, customer);
    }

    public static void setExchangeRate(double rate) {
        exchangeRate = rate;
    }

    public static double getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public boolean transfer(Account destination, double amount) {
        if (amount > 0 && getBalance() >= amount && destination != null) {
            if (destination instanceof ColonAccount) {
                double amountInColones = amount * exchangeRate;
                if (super.transfer(destination, amountInColones)) {
                    return true;
                }
            } else if (destination instanceof DollarAccount) {
                if (super.transfer(destination, amount)) {
                    return true;
                }
            }
        }
        return false;
    }
}
