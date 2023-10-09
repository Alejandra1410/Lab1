package Cards;

import StatusControl.StatusControl;

/**
 *
 * @author abiga
 */
public abstract class Card implements StatusControl {
    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }
    public boolean isActive() {
        return active;
    }

    public Card(String number, boolean active) {
        this.number = number;
        this.active = active;
    }
    

    public Card(String number) {
        this.number = number;
    }
    @Override
    public void activate() {
    this.active = true; 
   }

    @Override
   public void deactivate() {
   this.active = false;
   }
  public abstract boolean makePurchase(double amount);
  
   }
