package Cards.DAO;

import Cards.DTO.DebitCardDTO;
import Dao.Dao;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author abiga
 */
public class DebitCardDaoList  implements Dao<DebitCardDTO>{
     private HashMap<String,DebitCardDTO> DebitCardList;
     private static DebitCardDaoList instance; // Instancia única

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
     // return new ArrayList<>(debitCardList.values());
         return null;
    }

    @Override
    public boolean update(DebitCardDTO obj) { //Preguntar a JP si es necesario el update
        return create(obj);
//        if (updatedDebitCard == null)
//            return false;
//        String updatedCardNumber = updatedDebitCard.getNumber();
//        if (DebitCardList.containsKey(updatedCardNumber)) {
//            DebitCardList.put(updatedCardNumber, updatedDebitCard);
//            return true;
//        } else {
//            return false; // La tarjeta a actualizar no existe
        
    }

    @Override
    public boolean delete(DebitCardDTO debitCard) {
        if (debitCard == null)
            return false;

        String cardNumber = debitCard.getNumber();
        return DebitCardList.remove(cardNumber) != null;
    }
}