package Controllers.Transactions;

import Controllers.ControllerTransaction;
import Transaction.Deposit;
import Dao.Dao;
import Views.View;
import java.util.List;

public class DepositController implements ControllerTransaction<Deposit> {
    private View view;
    private Dao<Deposit> dao;

    public DepositController(View view, Dao<Deposit> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(Deposit deposit) {
        try {
            if (dao.create(deposit)) {
                view.displayMessage("Transacción de depósito creada exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear la transacción de depósito.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Deposit read(String id) {
        try {
            Deposit deposit = dao.read(id);
            if (deposit != null) {
                view.display(deposit);
            } else {
                view.displayMessage("Transacción de depósito no encontrada.");
            }
            return deposit;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Deposit> readAll() {
        try {
            List<Deposit> deposits = dao.readAll();
            if (deposits.isEmpty()) {
                view.displayMessage("No se encontraron transacciones de depósito.");
            } else {
                view.display(deposits);
            }
            return deposits;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
