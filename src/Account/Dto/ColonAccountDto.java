
package Account.Dto;

import Person.DTO.CustomerDTO;


/**
 *
 * @author Emerson
 */
public class ColonAccountDto extends AccountDto {

    public ColonAccountDto (String number, double balance, CustomerDTO customerDTO, boolean active) {
        super(number, balance, customerDTO, active);
    }
    
   
}
