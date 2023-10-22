package Controllers.Cards;

import Cards.DebitCard;
import Controllers.Controller;
import Controllers.ControllerCard;
import Dao.Dao;
import Views.View;
import java.util.ArrayList;
import java.util.List;

public class DebitCardController implements ControllerCard<DebitCard> {
    private View view;
    private Dao<DebitCard> dao;

    public DebitCardController(View view, Dao<DebitCard> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(DebitCard card) {
        try {
            if (dao.read(card.getNumber()) != null) {
                view.displayMessage("Número de tarjeta duplicado");
                return false;
            } else {
                if (dao.create(card)) {
                    view.displayMessage("Tarjeta de débito creada exitosamente.");
                    return true;
                } else {
                    view.displayMessage("Error al crear la tarjeta de débito.");
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DebitCard read(String number) {
        try {
            DebitCard card = dao.read(number);
            if (card != null) {
                view.display(card);
            } else {
                view.displayMessage("Tarjeta de débito no encontrada.");
            }
            return card;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<DebitCard> readAll() {
        try {
            List<DebitCard> cards = dao.readAll();
            if (cards.isEmpty()) {
                view.displayMessage("No se encontraron tarjetas de débito.");
            } else {
                view.display(cards);
            }
            return cards;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public boolean delete(DebitCard card) {
        try {
            if (dao.read(card.getNumber()) == null) {
                view.displayMessage("No se puede eliminar la tarjeta. Tarjeta no encontrada.");
                return false;
            } else {
                return dao.delete(card);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
