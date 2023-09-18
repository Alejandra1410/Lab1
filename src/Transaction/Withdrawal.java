/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;
import java.sql.Date;

public class Withdrawal extends Transaction {
    
    public Withdrawal(double amount, Account source, Date date) {
        super(amount, source, date);
    }

    @Override
    public boolean execute() {
        try {
            // Verificar si hay suficientes fondos en la cuenta
            if (getSource().getBalance() >= getAmount()) {
                // Realizar el retiro
                getSource().withdraw(getAmount());
                
                // El retiro fue exitoso
                return true;
            } else {
                // No hay suficientes fondos para realizar el retiro
                return false;
            }
        } catch (Exception e) {
           return false;
        }
    }
}