/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DTO;

import Account.Account;

/**
 *
 * @author ekard
 */
public class WithdrawalDTO extends TransactionDTO {
    
    public WithdrawalDTO(double amount, Account source) {
        super(amount, source);
    }
}
