/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorys;

import Account.Account;
import Cards.Card;
import Cards.CreditCard;
import Cards.DebitCard;

/**
 *
 * @author ekard
 */
public class FactoryCard {
    public Card factory(String number, double balance, double creditLimit,Account account,boolean active, int type) {
        if (type == 1) {
            return new CreditCard(number, balance, creditLimit,active);
        } else {
            return new DebitCard(number,account, active);
        }
    }
}
