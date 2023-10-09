package Account.Dao;

import Account.Dto.ColonAccountDto;
import Dao.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class ColonAccountDao implements Dao<ColonAccountDto>{
    private ArrayList<ColonAccountDto> listColonAccount; 
    private static ColonAccountDao instance; 

    private ColonAccountDao() {
        listColonAccount = new ArrayList();
    }
    
     public static ColonAccountDao getInstance() {
        if (instance == null) {
            instance = new ColonAccountDao();
        }
        return instance;
    }

    @Override
    public boolean create(ColonAccountDto colonAccount) {
        if (colonAccount == null) return false;{
          listColonAccount.add(colonAccount);
          return true; 
        }
    }

    @Override
    public ColonAccountDto read(String accountNumber) {
        for (ColonAccountDto colonAccount : listColonAccount) {
            if (colonAccount.getNumber().equals(accountNumber)) {
                return colonAccount;
            }
        }
        return null;
    }

    @Override
    public List<ColonAccountDto> readAll() {
       return new ArrayList<ColonAccountDto>(listColonAccount);
     }

    @Override
    public boolean update(ColonAccountDto obj) {
<<<<<<< HEAD
        return create(obj);
    }

=======
    return create(obj);
    }
    
>>>>>>> 547229c14a2cafcd26dbd51dff4c69421ea47637
    @Override
    public boolean delete(ColonAccountDto accountNumber) {
        return listColonAccount.remove(accountNumber);
    }
    
}
