
package Person.DAOS;

import Dao.Dao;
import Person.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class CustomerDaoList implements Dao<CustomerDto>{
    private ArrayList<CustomerDto> customersList;

    public CustomerDaoList() {
     customersList = new ArrayList();
    }

    @Override
    public boolean create(CustomerDto customer) {
    if(customer == null ) return false; 
    customersList.add(customer);
    return true;
    }

    @Override
    public Customer read(String id) {
        for (CustomerDto customer : customersList) {
         if (customer.getId().equals(id)) {
            return customer;
 } 
   }     return null;
    }

    @Override
    public List<Customer> readAll() {
        return new ArrayList<CustomerDto>(customersList);
    }

    @Override
    public boolean update(CustomerDto customer) {
        return this.create(customer);
    }

    @Override
    public boolean delete(CustomerDto customer) {
        return customersList.remove(customer);
    }
    
}
