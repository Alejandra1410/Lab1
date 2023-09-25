
package Transaction.DTO;


import Account.Dto.AccountDto;
import java.sql.Date;

/**
 *
 * @author ekard
 */
public class TransferDTO extends TransactionDTO{
    
    private AccountDto destination;

    public TransferDTO(AccountDto destination, double amount, AccountDto source, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }

    

}
