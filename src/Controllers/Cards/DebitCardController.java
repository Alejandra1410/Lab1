package Controllers.Cards;

import Cards.DAO.DebitCardDaoList;
import Controllers.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

public class DebitCardController implements Controller<DebitCardDaoList> {
    private View view;
    private Dao<DebitCardDaoList> dao;

    public DebitCardController(View view, Dao<DebitCardDaoList> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(DebitCardDaoList debitCardList) {
        try {
            if (dao.create(debitCardList)) {
                view.displayMessage("Lista de tarjetas de débito creada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar la lista de tarjetas de débito");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public DebitCardDaoList read(String id) {
        try {
            DebitCardDaoList debitCardList = dao.read(id);
            if (debitCardList != null) {
                view.display(debitCardList);
            } else {
                view.displayMessage("Lista de tarjetas de débito no encontrada");
            }
            return debitCardList;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<DebitCardDaoList> readAll() {
        try {
            List<DebitCardDaoList> debitCardLists = dao.readAll();
            return debitCardLists;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean update(DebitCardDaoList debitCardList) {
        try {
            if (dao.update(debitCardList)) {
                view.displayMessage("Lista de tarjetas de débito actualizada correctamente");
                return true;
            } else {
                view.displayMessage("Error al actualizar la lista de tarjetas de débito");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(DebitCardDaoList debitCardList) {
        try {
            if (dao.delete(debitCardList)) {
                view.displayMessage("Lista de tarjetas de débito eliminada correctamente");
                return true;
            } else {
                view.displayMessage("Error al eliminar la lista de tarjetas de débito");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
