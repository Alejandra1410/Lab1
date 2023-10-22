package Controllers.Account;

import Account.ColonAccount;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.ArrayList;
import java.util.List;

public class ColonAccountController implements Controller<ColonAccount> {
    private View view;
    private Dao dao;

    public ColonAccountController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(ColonAccount account) {
        if (dao.read(account.getNumber()) != null) {
            view.displayMessage("Número de cuenta duplicado");
            return false;
        } else {
            if (dao.create(account)) {
                view.displayMessage("Cuenta en colones creada exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear la cuenta en colones.");
                return false;
            }
        }
    }

    @Override
    public ColonAccount read(String number) {
        ColonAccount account = (ColonAccount) dao.read(number);
        if (account == null) {
            view.displayMessage("Número de cuenta no encontrado");
            return null;
        } else {
            view.display(account);
            return account;
        }
    }

    @Override
    public List<ColonAccount> readAll() {
        List<ColonAccount> accountList = new ArrayList<>();
        List<ColonAccount> accounts = dao.readAll();
        accountList.addAll(accounts);

        return accountList;
    }

    @Override
    public boolean update(ColonAccount account) {
        ColonAccount accountExists = (ColonAccount) dao.read(account.getNumber());
        if (accountExists == null) {
            view.displayMessage("No se puede actualizar la cuenta. Cuenta no existente.");
            return false;
        }

        if (dao.update(account)) {
            view.displayMessage("Cuenta en colones actualizada exitosamente.");
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(ColonAccount account) {
        ColonAccount accountExists = (ColonAccount) dao.read(account.getNumber());
        if (accountExists == null) {
            view.displayMessage("No se puede eliminar la cuenta. Cuenta no existente.");
            return false;
        } else {
            return dao.delete(account);
        }
    }
}
