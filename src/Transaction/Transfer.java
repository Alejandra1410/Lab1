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
public class Transfer extends Transaction {
    
    private Account destination;

    public Transfer(double amount, Account source, Account destination, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }

    @Override
    public boolean execute() {
        try {
            // Verificar si hay suficientes fondos en la cuenta de origen
            if (getSource().getBalance() >= getAmount()) {
                // Realizar el retiro de la cuenta de origen
                getSource().withdraw(getAmount());

                // Realizar el depósito en la cuenta de destino
                getDestination().deposit(getAmount());
                
                // La transferencia fue exitosa
                return true;
            } else {
                // No hay suficientes fondos para realizar la transferencia
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Account getDestination() {
        return destination;
    }
}
