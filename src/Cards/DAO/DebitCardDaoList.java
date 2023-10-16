package Cards.DAO;

import Cards.DTO.DebitCardDTO;
import Dao.DaoCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author abiga
 */
public class DebitCardDaoList  implements DaoCard<DebitCardDTO>{
     private HashMap<String,DebitCardDTO> DebitCardList;
     private static DebitCardDaoList instance;

    private DebitCardDaoList() {
        DebitCardList = new HashMap<>();
    }

    public static DebitCardDaoList getInstance() {
        if (instance == null) {
            instance = new DebitCardDaoList();
        }
        return instance;
    }
     @Override
    public boolean create(DebitCardDTO debitCard) {
        if (debitCard == null)
            return false;
        String debitCardNumber = debitCard.getNumber();

        if (!DebitCardList.containsKey(debitCardNumber)) {
            DebitCardList.put(debitCardNumber, debitCard);
            return true;
        } else {
            return false; 
        }
    }

    @Override
    public DebitCardDTO read(String cardNumber) {
        return DebitCardList.get(cardNumber);
    }

    @Override
    public List<DebitCardDTO> readAll() {
     return new ArrayList<>(DebitCardList.values());
    }

    @Override
    public boolean delete(DebitCardDTO debitCard) {
        if (debitCard == null)
            return false;

        String cardNumber = debitCard.getNumber();
        return DebitCardList.remove(cardNumber) != null;
    }
}