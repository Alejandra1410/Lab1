/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorys;

import Account.Account;
import Transaction.Deposit;
import Transaction.Transaction;
import Transaction.Transfer;
import Transaction.Withdrawal;

/**
 *
 * @author ekard
 */
public class FactoryTransaction {
    public Transaction factory(double amount, Account source, Account destination, int type){
        if (type ==1){
            return new Deposit(amount, source);
        }if (type ==2 ){
            return new Withdrawal(amount, source);
        }else{
            return new Transfer(amount, source, destination);
        }
    }
}

