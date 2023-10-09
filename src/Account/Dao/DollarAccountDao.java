/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account.Dao;

import Account.Dto.DollarAccountDto;
import Dao.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wendy
 */
public class DollarAccountDao implements Dao<DollarAccountDto>{
    private ArrayList<DollarAccountDto> listDollarAccount;
    private static DollarAccountDao instance;

    private DollarAccountDao() {
        listDollarAccount = new ArrayList();
    }
    
    public static DollarAccountDao getInstance() {
        if (instance == null) {
            instance = new DollarAccountDao();
        }
        return instance;
    }

    @Override
    public boolean create(DollarAccountDto dollarAccount) {
        if (dollarAccount ==null)return false; {
            listDollarAccount.add(dollarAccount);
            return true;
        }
    }

    @Override
    public DollarAccountDto read(String accountNumber) {
        for (DollarAccountDto dollarAccountDto : listDollarAccount) {
            if (dollarAccountDto.getNumber().equals(accountNumber)) {
                return dollarAccountDto;
            }
        }
        return null;
    }
    

    @Override
    public List<DollarAccountDto> readAll() {
        return new ArrayList<DollarAccountDto>(listDollarAccount);
    }

    @Override
    public boolean update(DollarAccountDto obj) {  
        return create(obj);
        
    }

    @Override
    public boolean delete(DollarAccountDto dollarAccount) {
        if (listDollarAccount.contains(dollarAccount)) {
            return listDollarAccount.remove(dollarAccount);
        }
    return false;
  }
}