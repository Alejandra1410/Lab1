/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patron;

import Account.Account;
import Account.ColonAccount;
import Person.Customer;

/**
 *
 * @author ekard
 */
public class PuntoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un cliente
        Customer customer = new Customer("Ale", "208270083", java.sql.Date.valueOf("2004-10-14"), "84081130", "Ale@gmail.com", "Tilaran");

        // Crear una cuenta en colones y asignarle el cliente
        Account colonesAccount = new ColonAccount("12345", 1000.0, customer);

        // Crear una copia de la cuenta usando el método clone
        Account copyOfColonesAccount = colonesAccount.clone();

        // Realizar un depósito en la cuenta original
        colonesAccount.deposit(500.0);
        
        // Mostrar el saldo de ambas cuentas
        System.out.println("Saldo de la cuenta en colones: " + colonesAccount.getBalance());
        System.out.println("Saldo de la copia de la cuenta en colones: " + copyOfColonesAccount.getBalance());
    }

}
