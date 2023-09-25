/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.DAOS;

import Dao.Dao;
import Transaction.DTO.WithdrawalDTO;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ekard
 */
public class WithdrawalDaoList implements Dao<WithdrawalDTO>{
     private HashMap<String,WithdrawalDTO> WithdrawalDaoList;

      public WithdrawalDaoList(){
      WithdrawalDaoList=new HashMap();
    }
    @Override
    public boolean create(WithdrawalDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public WithdrawalDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<WithdrawalDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(WithdrawalDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(WithdrawalDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
