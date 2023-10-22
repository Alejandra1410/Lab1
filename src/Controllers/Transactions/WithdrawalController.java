package Controllers.Transactions;

import Controllers.ControllerTransaction;
import Transaction.Withdrawal;
import Dao.Dao;
import Views.View;
import java.util.List;

public class WithdrawalController implements ControllerTransaction<Withdrawal> {
    private View view;
    private Dao<Withdrawal> dao;

    public WithdrawalController(View view, Dao<Withdrawal> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(Withdrawal withdrawal) {
        try {
            if (dao.create(withdrawal)) {
                view.displayMessage("Transacción de retiro creada exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear la transacción de retiro.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Withdrawal read(String id) {
        try {
            Withdrawal withdrawal = dao.read(id);
            if (withdrawal != null) {
                view.display(withdrawal);
            } else {
                view.displayMessage("Transacción de retiro no encontrada.");
            }
            return withdrawal;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Withdrawal> readAll() {
        try {
            List<Withdrawal> withdrawals = dao.readAll();
            if (withdrawals.isEmpty()) {
                view.displayMessage("No se encontraron transacciones de retiro.");
            } else {
                view.display(withdrawals);
            }
            return withdrawals;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
