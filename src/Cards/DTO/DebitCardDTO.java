package Cards.DTO;

import Cards.*;
import Account.Account;

/**
 *
 * @author abiga
 */
public class DebitCardDTO extends CardDTO {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public DebitCardDTO(Account account, String number, boolean active) {
        super(number, active);
        this.account = account;
    }
}
    

 

    