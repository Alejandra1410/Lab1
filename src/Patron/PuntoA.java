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
        // Crear un cliente
        Customer customer = new Customer("Ale", "208270083", java.sql.Date.valueOf("2004-10-14"), "84081130", "Ale@gmail.com", "Tilaran");

        // Crear una cuenta en colones y asignarle el cliente
        Account colonesAccount = new ColonAccount("12345", 1000.0, customer);

        // Crear una nueva cuenta en colones con los mismos valores que la cuenta original
        Account copyOfColonesAccount = new ColonAccount(colonesAccount.getNumber(), colonesAccount.getBalance(), customer);

        // Realizar un depósito en la cuenta original
  
        colonesAccount.deposit(1000);

        // Mostrar el saldo de ambas cuentas
        System.out.println("Saldo de la cuenta en colones: " + colonesAccount.getBalance());
        System.out.println("Saldo de la copia de la cuenta en colones: " + copyOfColonesAccount.getBalance());
    }

}
