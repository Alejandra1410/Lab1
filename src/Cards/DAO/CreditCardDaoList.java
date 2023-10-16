package Cards.DAO;

import Cards.DTO.CreditCardDTO;
import Dao.DaoCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author abiga
 */
public class CreditCardDaoList implements DaoCard<CreditCardDTO>{
    private HashMap<String, CreditCardDTO> CreditCardList;
    private static CreditCardDaoList instanceCreditCard;

    private CreditCardDaoList() {
        CreditCardList = new HashMap<>();
    }

    public static CreditCardDaoList getInstance() {
        if (instanceCreditCard == null) {
            instanceCreditCard = new CreditCardDaoList();
        }
        return instanceCreditCard;
    }

    @Override
    public boolean create(CreditCardDTO obj) {
        if (obj == null) {
            return false;
        }
        String cardNumber = obj.getNumber();

        if (!CreditCardList.containsKey(cardNumber)) {
            CreditCardList.put(cardNumber, obj);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CreditCardDTO read(String cardNumber) {
        return CreditCardList.get(cardNumber);
    }

    @Override
    public List<CreditCardDTO> readAll() {
        return new ArrayList<>(CreditCardList.values());
    }

    @Override
    public boolean delete(CreditCardDTO obj) {
        if (obj == null) {
            return false;
        }

        String cardNumber = obj.getNumber();
        return CreditCardList.remove(cardNumber) != null;
    }

}