/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patron;

import Account.Account;
import Account.ColonAccount;
import Person.Customer;
import Transaction.Transaction;

/**
 *
 * @author ekard
 */
public class PuntoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Ale", "208270083", java.sql.Date.valueOf("2004-10-14"), "84081130", "Ale@gmail.com", "Tilaran");

        Account colonesAccount = new ColonAccount("12345", 1000.0, customer);
        
        Account copyOfColonesAccount = colonesAccount;
  
        colonesAccount.deposit(1000);
        copyOfColonesAccount.deposit(1000);

        System.out.println("Saldo de la cuenta en colones: " + colonesAccount.getBalance());
        System.out.println("Saldo de la copia de la cuenta en colones: " + copyOfColonesAccount.getBalance());
    }

}
