/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Account;

import Account.DollarAccount;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

/**
 *
 * @author wendy
 */
public class DollarAccountController implements Controller<DollarAccount> {
    private Dao<DollarAccount> dao;
    private View view;

    public DollarAccountController(Dao<DollarAccount> dao, View view) {
        this.dao = dao;
        this.view = view;
    }

    @Override
    public boolean create(DollarAccount account) {
        try {
            boolean success = dao.create(account);
            if (success) {
                view.displayMessage("Cuenta en dólares creada exitosamente.");
            } else {
                view.displayMessage("Error al crear la cuenta en dólares.");
            }
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DollarAccount read(String number) {
        try {
            DollarAccount account = dao.read(number);
            if (account != null) {
                view.display(account);
            } else {
                view.displayMessage("Cuenta en dólares no encontrada.");
            }
            return account;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<DollarAccount> readAll() {
        try {
            List<DollarAccount> accounts = dao.readAll();
            if (accounts.isEmpty()) {
                view.displayMessage("No se encontraron cuentas en dólares.");
            } else {
                view.display(accounts);
            }
            return accounts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(DollarAccount account) {
        try {
            boolean success = dao.update(account);
            if (success) {
                view.displayMessage("Cuenta en dólares actualizada exitosamente.");
            } else {
                view.displayMessage("Error al actualizar la cuenta en dólares.");
            }
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(DollarAccount account) {
        try {
            boolean success = dao.delete(account);
            if (success) {
                view.displayMessage("Cuenta en dólares eliminada exitosamente.");
            } else {
                view.displayMessage("Error al eliminar la cuenta en dólares.");
            }
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}