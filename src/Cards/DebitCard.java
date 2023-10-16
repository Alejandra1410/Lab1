package Cards;

import Account.Account;

/**
 *
 * @author abiga
 */
public class DebitCard extends Card {
    private Account account;

    public Account getAccount() {
        return account;
    }
    
    public DebitCard(String number, Account account, boolean active) {
        super(number, active);
        this.account = account;
        
    }
    

   @Override
   public boolean makePurchase(double amount) {
      if (isActive() && amount > 0 && account != null) {
          if (account.withdraw(amount)) {
                return true;
            }
        }
        return false; 
    }
 }

    