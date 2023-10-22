package Controllers.Account;

import Account.DollarAccount;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.ArrayList;
import java.util.List;

public class DollarAccountController implements Controller<DollarAccount> {
    private View view;
    private Dao dao;

    public DollarAccountController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(DollarAccount account) {
        if (dao.read(account.getNumber()) != null) {
            view.displayMessage("Número de cuenta duplicado");
            return false;
        } else {
            
            if (dao.create(account)) {
                view.displayMessage("Cuenta en dólares creada exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear la cuenta en dólares.");
                return false;
            }
        }
    }

    @Override
    public DollarAccount read(String number) {
        DollarAccount account = (DollarAccount) dao.read(number);
        if (account == null) {
            view.displayMessage("Número de cuenta no encontrado");
            return null;
        } else {
            view.display(account);
            return account;
        }
    }

    @Override
    public List<DollarAccount> readAll() {
        List<DollarAccount> accountList = new ArrayList<>();
        List<DollarAccount> accounts = dao.readAll();
        accountList.addAll(accounts);

        return accountList;
    }

    @Override
    public boolean update(DollarAccount account) {
        DollarAccount accountExists = (DollarAccount) dao.read(account.getNumber());
        if (accountExists == null) {
            view.displayMessage("No se puede actualizar la cuenta. Cuenta no existente.");
            return false;
        }

        if (dao.update(account)) {
            view.displayMessage("Cuenta en dólares actualizada exitosamente.");
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(DollarAccount account) {
        DollarAccount accountExists = (DollarAccount) dao.read(account.getNumber());
        if (accountExists == null) {
            view.displayMessage("No se puede eliminar la cuenta. Cuenta no existente.");
            return false;
        } else {
            return dao.delete(account);
        }
    }
}
