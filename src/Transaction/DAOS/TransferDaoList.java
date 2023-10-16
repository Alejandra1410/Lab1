/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DAOS;

import Dao.Dao;
import Dao.DaoTransaction;
import Transaction.DTO.TransferDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ekard
 */
  public class TransferDaoList implements DaoTransaction<TransferDTO>{
      private HashMap<String,TransferDTO> TransferDaoList;
      private static TransferDaoList instance; // Instancia única

    private TransferDaoList() {
        TransferDaoList = new HashMap<>();
    }

   
    public static TransferDaoList getInstance() {
        if (instance == null) {
            instance = new TransferDaoList();
        }
        return instance;
    }
    @Override
    public boolean create(TransferDTO transfer) {
       
       return false;
       
    }

    @Override
    public TransferDTO read(String id) {
        return TransferDaoList.get(id);
    }

    @Override
    public List<TransferDTO> readAll() {
       return new ArrayList<>(TransferDaoList.values());
       
    }

  
}