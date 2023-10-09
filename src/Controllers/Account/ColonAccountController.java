package Controllers.Account;

import Account.Dao.ColonAccountDao;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

public class ColonAccountController implements Controller<ColonAccountDao> {
    private View view;
    private Dao<ColonAccountDao> dao;

    public ColonAccountController(View view, Dao<ColonAccountDao> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(ColonAccountDao accountDao) {
        try {
            if (dao.create(accountDao)) {
                view.displayMessage("Cuenta creada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar la cuenta");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ColonAccountDao read(String accountNumber) {
        try {
            ColonAccountDao accountDao = dao.read(accountNumber);
            if (accountDao != null) {
                view.display(accountDao);
            } else {
                view.displayMessage("Cuenta no encontrada");
            }
            return accountDao;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ColonAccountDao> readAll() {
        try {
            List<ColonAccountDao> accountDaos = dao.readAll();
            return accountDaos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(ColonAccountDao accountDao) {
        try {
            if (dao.update(accountDao)) {
                view.displayMessage("Cuenta actualizada correctamente");
                return true;
            } else {
                view.displayMessage("Error al actualizar la cuenta");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(ColonAccountDao accountDao) {
        try {
            if (dao.delete(accountDao)) {
                view.displayMessage("Cuenta eliminada correctamente");
                return true;
            } else {
                view.displayMessage("Error al eliminar la cuenta");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
