
package Account.Dto;
/**
 *
 * @author Emerson
 */
//import Person.CustomerDto;

public abstract class AccountDto {
    private String number;
    private double balance;
    private CustomerDto customerDto;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public boolean isActive() {
        return active;
    }

    public AccountDto(String number, double balance, CustomerDto customerDto, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customerDto = customerDto;
        this.active = active;
    }
}
