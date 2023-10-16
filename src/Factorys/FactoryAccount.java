/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorys;

import Account.Account;
import Account.ColonAccount;
import Account.DollarAccount;
import Person.Customer;

/**
 *
 * @author ekard
 */
public class FactoryAccount {
    public Account factory(String id, double Balance, Customer Customer, int type){
        if (type ==1){
            return new ColonAccount(id, Balance, Customer);
        }else{
            return new DollarAccount(id, Balance, Customer);
        }
    }
    
}
