package Controllers.Cards;

import Cards.CreditCard;
import Controllers.ControllerCard;
import Dao.Dao;
import Views.View;
import java.util.List;

public class CreditCardController implements ControllerCard<CreditCard> {
    private View view;
    private Dao<CreditCard> dao;

    public CreditCardController(View view, Dao<CreditCard> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(CreditCard card) {
        try {
            if (dao.read(card.getNumber()) != null) {
                view.displayMessage("Número de tarjeta duplicado");
                return false;
            } else {
                if (dao.create(card)) {
                    view.displayMessage("Tarjeta de crédito creada exitosamente.");
                    return true;
                } else {
                    view.displayMessage("Error al crear la tarjeta de crédito.");
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public CreditCard read(String number) {
        try {
            CreditCard card = dao.read(number);
            if (card != null) {
                view.display(card);
            } else {
                view.displayMessage("Tarjeta de crédito no encontrada.");
            }
            return card;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<CreditCard> readAll() {
        try {
            List<CreditCard> cards = dao.readAll();
            if (cards.isEmpty()) {
                view.displayMessage("No se encontraron tarjetas de crédito.");
            } else {
                view.display(cards);
            }
            return cards;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   
    @Override
    public boolean delete(CreditCard card) {
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