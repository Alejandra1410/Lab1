/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author ekard
 */
public class DollarAccount extends Account{
    private static double exchangeRate = 534.48; // Tasa de cambio para Dólares

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
                // Si la cuenta de destino es en Colones, convertir el monto a Colones antes de la transferencia
                double amountInColones = amount * exchangeRate;
                if (super.transfer(destination, amountInColones)) {
                    return true;
                }
            } else if (destination instanceof DollarAccount) {
                // Si la cuenta de destino es en Dólares, realizar la transferencia directamente en Dólares
                if (super.transfer(destination, amount)) {
                    return true;
                }
            }
        }
        return false;
    }
}
