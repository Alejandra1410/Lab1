/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DAOS;

import Dao.Dao;
import Transaction.DTO.DepositDTO;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ekard
 */
public class DepositDaoList implements Dao<DepositDTO>{
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
        return null;
//        return new ArrayList<>(depositList.values());
    }

    @Override
    public boolean update(DepositDTO obj) { //Preguntar a JP si es necesario un update en Deposit
        return create(obj);
//        if (updatedDeposit == null)
//            return false;
//
//        String source = updatedDeposit.getSource().getNumber(); 
//
//        if (depositList.containsKey(source)) {
//            // Reemplazar la transacción existente con la actualizada
//            depositList.put(source, updatedDeposit);
//            return true;
//        } else {
//            return false; // La transacción a actualizar no existe
//        }
    }

    @Override
    public boolean delete(DepositDTO deposit) {
        if (deposit == null)
            return false;

        String source = deposit.getSource().getNumber();
        return depositList.remove(source) != null;
    }
}