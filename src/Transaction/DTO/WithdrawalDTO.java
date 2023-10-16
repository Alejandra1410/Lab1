/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DTO;

import Account.Dto.AccountDto;
import java.sql.Date;


/**
 *
 * @author ekard
 */
public class WithdrawalDTO extends TransactionDTO { 

    public WithdrawalDTO(double amount, AccountDto source, Date date) {
        super(amount, source, date);
    }
    
    
}
