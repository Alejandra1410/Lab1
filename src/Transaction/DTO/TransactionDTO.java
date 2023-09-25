/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DTO;

import Account.Dto.AccountDto;
import java.sql.Date;

public class TransactionDTO {
    private double amount;
    private AccountDto source;
    private Date date;

    public double getAmount() {
        return amount;
    }

    public AccountDto getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }

    public TransactionDTO(double amount, AccountDto source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }
   
}

