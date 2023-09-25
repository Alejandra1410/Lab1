/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DTO;

import Account.Account;
import java.sql.Date;

public class TransactionDTO {
    private double amount;
    private Account source;
    private Date date;

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }

    public TransactionDTO(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }
   
}

