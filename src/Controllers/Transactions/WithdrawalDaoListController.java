/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Transactions;

import Controllers.Controller;
import Dao.Dao;
import Transaction.DAOS.WithdrawalDaoList;
import Views.View;
import java.util.List;

public class WithdrawalDaoListController implements Controller<WithdrawalDaoList> {
    private View view;
    private Dao<WithdrawalDaoList> dao;

    public WithdrawalDaoListController(View view, Dao<WithdrawalDaoList> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(WithdrawalDaoList withdrawalDaoList) {
        try {
            if (dao.create(withdrawalDaoList)) {
                view.displayMessage("Lista de retiros creada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar la lista de retiros");
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }

    @Override
    public WithdrawalDaoList read(String id) {
        try {
            WithdrawalDaoList withdrawalDaoList = dao.read(id);
            if (withdrawalDaoList != null) {
                view.display(withdrawalDaoList); 
            } else {
                view.displayMessage("Lista de retiros no encontrada");
            }
            return withdrawalDaoList;
        } catch (Exception e) {
            return null; 
        }
    }

    @Override
    public List<WithdrawalDaoList> readAll() {
        try {
            List<WithdrawalDaoList> withdrawalDaoLists = dao.readAll();
            return withdrawalDaoLists;
        } catch (Exception e) {
            return null; 
        }
    }

    @Override
    public boolean update(WithdrawalDaoList withdrawalDaoList) {
        try {
            if (dao.update(withdrawalDaoList)) {
                view.displayMessage("Lista de retiros actualizada correctamente");
                return true;
            } else {
                view.displayMessage("Error al actualizar la lista de retiros");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(WithdrawalDaoList withdrawalDaoList) {
        try {
            if (dao.delete(withdrawalDaoList)) {
                view.displayMessage("Lista de retiros eliminada correctamente");
                return true;
            } else {
                view.displayMessage("Error al eliminar la lista de retiros");
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }
}
