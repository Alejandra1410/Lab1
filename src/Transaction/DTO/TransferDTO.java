
package Transaction.DTO;

import Account.Account;

/**
 *
 * @author ekard
 */
public class TransferDTO extends TransactionDTO{
    
    private Account destination;

    public TransferDTO(double amount, Account source, Account destination) {
        super(amount, source);
        this.destination = destination;
    }

}
