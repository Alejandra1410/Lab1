/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;
import java.sql.Date;


/**
 *
 * @author ekard
 */
public class Deposit extends Transaction {
    
    public Deposit(double amount, Account source, Date date) {
        super(amount, source, date);
    }

    @Override
    public boolean execute() {
        try {
            // Realizar el depósito en la cuenta
            getSource().deposit(getAmount());
            
            // El depósito fue exitoso
            return true;
        } catch (Exception e) {
         return false;
        }
    }
}



