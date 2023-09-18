/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

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
        // Aquí adaptamos el método transfer para cuentas en Colones
        if (amount > 0 && getBalance() >= amount && destination != null) {
            if (destination instanceof DollarAccount) {
                // Si la cuenta de destino es en Dólares, convertir el monto a Dólares antes de la transferencia
                double exchangeRate = DollarAccount.getExchangeRate(); // Obtener la tasa de cambio de Dólares
                double amountInDollars = amount / exchangeRate;
                if (super.transfer(destination, amountInDollars)) {
                    return true;
                }
            } else if (destination instanceof ColonAccount) {
                // Si la cuenta de destino es en Colones, realizar la transferencia directamente en Colones
                if (super.transfer(destination, amount)) {
                    return true;
                }
            }
        }
        return false;
    }
}

