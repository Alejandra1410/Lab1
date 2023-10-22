package Controllers.Transactions;

import Controllers.ControllerTransaction;
import Transaction.Transfer;
import Dao.Dao;
import Views.View;
import java.util.List;

public class TransferController implements ControllerTransaction<Transfer> {
    private View view;
    private Dao<Transfer> dao;

    public TransferController(View view, Dao<Transfer> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(Transfer transfer) {
        try {
            if (dao.create(transfer)) {
                view.displayMessage("Transacción de transferencia creada exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear la transacción de transferencia.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Transfer read(String id) {
        try {
            Transfer transfer = dao.read(id);
            if (transfer != null) {
                view.display(transfer);
            } else {
                view.displayMessage("Transacción de transferencia no encontrada.");
            }
            return transfer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Transfer> readAll() {
        try {
            List<Transfer> transfers = dao.readAll();
            if (transfers.isEmpty()) {
                view.displayMessage("No se encontraron transacciones de transferencia.");
            } else {
                view.display(transfers);
            }
            return transfers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
