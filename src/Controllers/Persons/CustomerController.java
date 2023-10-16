/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Persons;

import Controllers.Controller;
import Person.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ekard
 */
public class CustomerController implements Controller<Customer> {
    private List<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<>();
    }

    @Override
    public boolean create(Customer customer) {
        return customers.add(customer);
    }

    @Override
    public Customer read(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null; 
    }

    @Override
    public List<Customer> readAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public boolean update(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customer.getId())) {
                customers.set(i, customer);
                return true;
            }
        }
        return false; 
    }

    @Override
    public boolean delete(Customer customer) {
        return customers.remove(customer);
    }
}