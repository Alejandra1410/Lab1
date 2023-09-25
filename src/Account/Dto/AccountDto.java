
package Account.Dto;

import Person.DTO.CustomerDTO;

/**
 *
 * @author Emerson
 */
//import Person.CustomerDto;

public abstract class AccountDto {
    private String number;
    private double balance;
    private CustomerDTO customerDto;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public CustomerDTO getCustomerDto() {
        return customerDto;
    }

    public boolean isActive() {
        return active;
    }

    public AccountDto(String number, double balance, CustomerDTO customerDto, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customerDto = customerDto;
        this.active = active;
    }
}
