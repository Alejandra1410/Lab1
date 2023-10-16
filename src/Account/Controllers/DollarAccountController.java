/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account.Controllers;

import Account.DollarAccount;
import Account.Dto.DollarAccountDto;
import Dao.Dao;
import Views.View;
import java.util.List;

/**
 *
 * @author wendy
 */
public class DollarAccountController implements Dao<DollarAccount> {
private Dao dao;
private View view;

    public DollarAccountController(Dao dao, View view) {
        this.dao = dao;
        this.view = view;
    }

    @Override
    public boolean create(DollarAccount account) {
        if (dao.create(account.getNumber()!=null)) {
            view.displayMessage("Numero de cuenta duplicado");
            return false;
        }else{
         DollarAccountDto dollarAccount = new DollarAccountDto(account.getNumber(), account.) 
        } 
    }

    @Override
    public DollarAccount read(String number) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DollarAccount> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(DollarAccount account) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(DollarAccount account) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
