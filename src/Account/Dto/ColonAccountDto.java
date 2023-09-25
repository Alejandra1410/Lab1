
package Account.Dto;

import Account.Dto.AccountDto;

/**
 *
 * @author Emerson
 */
public class ColonAccountDto extends AccountDto {

    public ColonAccountDto (String number, double balance, Object customerDto, boolean active) {
        super(number, balance, customerDto, active);
    }
    
   
}
