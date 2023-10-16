/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DAOS;


import Dao.DaoTransaction;
import Transaction.DTO.DepositDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ekard
 */
public class DepositDaoList implements DaoTransaction<DepositDTO>{
    private HashMap<String,DepositDTO> depositList;
    private static DepositDaoList instance;
    private DepositDaoList() {
        depositList = new HashMap<>();
    }

    public static DepositDaoList getInstance() {
        if (instance == null) {
            instance = new DepositDaoList();
        }
        return instance;
    
    }

    @Override
    public boolean create(DepositDTO deposit) {
        if (deposit == null)
            return false;

        String source = deposit.getSource().getNumber();

        if (!depositList.containsKey(source)) {
            depositList.put(source, deposit);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public DepositDTO read(String source) {
        return depositList.get(source);
    }

    @Override
    public List<DepositDTO> readAll() {
    return new ArrayList<>(depositList.values());
    }
  
}