/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;


/**
 *
 * @author ekard
 */
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
}



