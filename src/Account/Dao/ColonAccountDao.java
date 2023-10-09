/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public ColonAccountDao() {
        listColonAccount = new ArrayList();
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
                return false; 
   }

    @Override
    public boolean delete(ColonAccountDto accountNumber) {
        return listColonAccount.remove(accountNumber);
    }
    
    
}
