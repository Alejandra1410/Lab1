package Cards.DAO;

import Cards.DTO.DebitCardDTO;
import Dao.Dao;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author abiga
 */
public class DebitCardDaoList  implements Dao<DebitCardDTO>{
     private HashMap<String,DebitCardDTO> DebitCardList;

      public DebitCardDaoList(){
       DebitCardList=new HashMap();
    } 

    @Override
    public boolean create(DebitCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DebitCardDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DebitCardDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(DebitCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(DebitCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
