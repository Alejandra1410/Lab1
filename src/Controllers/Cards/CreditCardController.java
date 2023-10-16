package Controllers.Cards;

import Cards.DAO.CreditCardDaoList;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

public class CreditCardController implements Controller<CreditCardDaoList> {
    private View view;
    private Dao<CreditCardDaoList> dao;

    public CreditCardController(View view, Dao<CreditCardDaoList> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(CreditCardDaoList creditCardDaoList) {
        try {
            if (dao.create(creditCardDaoList)) {
                view.displayMessage("Tarjeta de crédito creada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar la tarjeta de crédito");
                return false;
            }
        } catch (Exception ex) {
            view.displayMessage("Error al agregar la tarjeta de crédito: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public CreditCardDaoList read(String id) {
        try {
            CreditCardDaoList creditCardDaoList = dao.read(id);
            if (creditCardDaoList != null) {
                view.display(creditCardDaoList);
            } else {
                view.displayMessage("Tarjeta de crédito no encontrada");
            }
            return creditCardDaoList;
        } catch (Exception ex) {
            view.displayMessage("Error al leer la tarjeta de crédito: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<CreditCardDaoList> readAll() {
        try {
            List<CreditCardDaoList> creditCardDaoLists = dao.readAll();
            return creditCardDaoLists;
        } catch (Exception ex) {
            view.displayMessage("Error al leer todas las tarjetas de crédito: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean update(CreditCardDaoList creditCardDaoList) {
        try {
            if (dao.update(creditCardDaoList)) {
                view.displayMessage("Tarjeta de crédito actualizada correctamente");
                return true;
            } else {
                view.displayMessage("Error al actualizar la tarjeta de crédito");
                return false;
            }
        } catch (Exception ex) {
            view.displayMessage("Error al actualizar la tarjeta de crédito: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(CreditCardDaoList creditCardDaoList) {
        try {
            if (dao.delete(creditCardDaoList)) {
                view.displayMessage("Tarjeta de crédito eliminada correctamente");
                return true;
            } else {
                view.displayMessage("Error al eliminar la tarjeta de crédito");
                return false;
            }
        } catch (Exception ex) {
            view.displayMessage("Error al eliminar la tarjeta de crédito: " + ex.getMessage());
            return false;
        }
    }
}
