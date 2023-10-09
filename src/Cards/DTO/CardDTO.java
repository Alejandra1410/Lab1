package Cards.DTO;



/**
 *
 * @author abiga
 */
public abstract class CardDTO {//implements StatusControl
    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public CardDTO(String number, boolean active) {
        this.number = number;
        this.active = active;
    
    }
   }
