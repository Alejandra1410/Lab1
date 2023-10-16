/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DAOS;

import Dao.DaoTransaction;
import Transaction.DTO.WithdrawalDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ekard
 */
public class WithdrawalDaoList implements DaoTransaction<WithdrawalDTO> {
    private HashMap<String, WithdrawalDTO> withdrawalList;
    private static WithdrawalDaoList withdrawalInstance;

    private WithdrawalDaoList() {
        withdrawalList = new HashMap<>();
    }

    public static WithdrawalDaoList getInstance() {
        if (withdrawalInstance == null) {
            withdrawalInstance = new WithdrawalDaoList();
        }
        return withdrawalInstance;
    }

    @Override
    public boolean create(WithdrawalDTO obj) {
//        if (obj == null) {
//            return false;
//        }
//        String id = obj.getId();
//
//        if (!withdrawalList.containsKey(id)) {
//            withdrawalList.put(id, obj);
//            return true;
//        } else {
//            return false;
//        }
return false;
    }

    @Override
    public WithdrawalDTO read(String id) {
        return withdrawalList.get(id);
    }

    @Override
    public List<WithdrawalDTO> readAll() {
        return new ArrayList<>(withdrawalList.values());
    }
}