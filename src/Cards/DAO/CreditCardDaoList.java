package Cards.DAO;

import Cards.DTO.CreditCardDTO;
import Dao.Dao;
import java.util.HashMap;
import java.util.List;

<<<<<<< HEAD
/**
 *
 * @author abiga
 */
public class CreditCardDaoList implements Dao<CreditCardDTO>{
     private HashMap<String,CreditCardDTO> CreditCardList;
     private static CreditCardDaoList instanceCreditCard;
     
     
      private CreditCardDaoList(){
       CreditCardList=new HashMap();
    }
      public static CreditCardDaoList getInstance(){
          if (instanceCreditCard==null) {
             instanceCreditCard=new CreditCardDaoList();
          }
          return instanceCreditCard;
      }
=======


public class CreditCardDaoList implements Dao<CreditCardDTO> {
    private HashMap<String, CreditCardDTO> creditCardList;
   
    private CreditCardDaoList() {
        creditCardList = new HashMap<>();
    }

>>>>>>> 6da74d3561ce54ca6db14aaedf9eccb7322d0416
    @Override
    public boolean create(CreditCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CreditCardDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CreditCardDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(CreditCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(CreditCardDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}