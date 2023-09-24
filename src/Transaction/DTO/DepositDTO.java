/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DTO;


/**
 *
 * @author ekard
 */
public class DepositDTO extends TransactionDTO { //Falta AccountDTO CREOOO

     public DepositDTO(double amount, Account source) {
        super(amount, source);
    }
}
