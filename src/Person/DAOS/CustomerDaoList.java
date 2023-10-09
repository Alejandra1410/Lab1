
package Person.DAOS;

import Dao.Dao;
import Person.DTO.CustomerDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class CustomerDaoList implements Dao<CustomerDTO>{
    private ArrayList<CustomerDTO> customersList;
    private static CustomerDaoList instance; 

    private CustomerDaoList() {
        customersList = new ArrayList<>();
    }
    public static CustomerDaoList getInstance() {
        if (instance == null) {
            instance = new CustomerDaoList();
        }
        return instance;
    }
    @Override
    public boolean create(CustomerDTO customer) {
    if(customer == null ) return false; 
    customersList.add(customer);
    return true;
    }

    @Override
    public CustomerDTO read(String id) {
        for (CustomerDTO customer : customersList) {
         if (customer.getId().equals(id)) {
            return customer;
 } 
   }     return null;
    }

    @Override
    public List<CustomerDTO> readAll() {
        return new ArrayList<CustomerDTO>(customersList);
    }

    @Override
    public boolean update(CustomerDTO customer) {
        return this.create(customer);
    }

    @Override
    public boolean delete(CustomerDTO customer) {
        return customersList.remove(customer);
    }
    
}
