/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account.Dto;

import Person.DTO.CustomerDTO;

/**
 *
 * @author wendy
 */
public class DollarAccountDto extends AccountDto{
    private static double exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public DollarAccountDto(String number, double balance, CustomerDTO customerDto, boolean active, double exchangeRate) {
        super(number, balance, customerDto, active);
        this.exchangeRate = exchangeRate;
    }
}

