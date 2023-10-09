package Controllers.Transactions;

import Controllers.Controller;
import Dao.Dao;
import Transaction.DAOS.DepositDaoList;
import Views.View;
import java.util.List;

public class DepositDaoListController implements Controller<DepositDaoList> {
    private View view;
    private Dao<DepositDaoList> dao;

    public DepositDaoListController(View view, Dao<DepositDaoList> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(DepositDaoList depositDaoList) {
        try {
            if (dao.create(depositDaoList)) {
                view.displayMessage("Lista de depósitos creada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar la lista de depósitos");
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }

    @Override
    public DepositDaoList read(String id) {
        try {
            DepositDaoList depositDaoList = dao.read(id);
            if (depositDaoList != null) {
                view.display(depositDaoList); 
            } else {
                view.displayMessage("Lista de depósitos no encontrada");
            }
            return depositDaoList;
        } catch (Exception e) {
            return null; 
        }
    }

    @Override
    public List<DepositDaoList> readAll() {
        try {
            List<DepositDaoList> depositDaoLists = dao.readAll();
            return depositDaoLists;
        } catch (Exception e) {
            return null; 
        }
    }

    @Override
    public boolean update(DepositDaoList depositDaoList) {
        try {
            if (dao.update(depositDaoList)) {
                view.displayMessage("Lista de depósitos actualizada correctamente");
                return true;
            } else {
                view.displayMessage("Error al actualizar la lista de depósitos");
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }

    @Override
    public boolean delete(DepositDaoList depositDaoList) {
        try {
            if (dao.delete(depositDaoList)) {
                view.displayMessage("Lista de depósitos eliminada correctamente");
                return true;
            } else {
                view.displayMessage("Error al eliminar la lista de depósitos");
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }
}
