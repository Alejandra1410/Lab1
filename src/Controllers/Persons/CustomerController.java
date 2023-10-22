package Controllers.Persons;

import Controllers.Controller;
import Dao.Dao;
import Person.Customer;
import Person.DTO.CustomerDTO;
import Views.View;
import java.util.ArrayList;
import java.util.List;

public class CustomerController implements Controller<Customer> {
    private View view;
    private Dao<CustomerDTO> dao;

    public CustomerController(View view, Dao<CustomerDTO> dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(Customer customer) {
        try {
            CustomerDTO customerDto = new CustomerDTO(customer.getDateOfBirth(),customer.getPhone(), customer.getEmail(), customer.getAddress(),customer.getId(),customer.getName());

            if (dao.create(customerDto)) {
                view.displayMessage("Cliente creado exitosamente.");
                return true;
            } else {
                view.displayMessage("Error al crear el cliente.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Customer read(String id) {
        try {
            CustomerDTO customerDto = dao.read(id);
            if (customerDto != null) {
                Customer customer = new Customer(
                    customerDto.getId(),
                    customerDto.getName(),
                    customerDto.getDateOfBirth(),
                    customerDto.getPhone(),
                    customerDto.getEmail(),
                    customerDto.getAddress()
                );
                view.display(customer);
                return customer;
            } else {
                view.displayMessage("Cliente no encontrado.");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Customer> readAll() {
        try {
            List<Customer> customers = new ArrayList<>();
            List<CustomerDTO> customerDTOs = dao.readAll();
            for (CustomerDTO customerDto : customerDTOs) {
                Customer customer = new Customer(
                    customerDto.getId(),
                    customerDto.getName(),
                    customerDto.getDateOfBirth(),
                    customerDto.getPhone(),
                    customerDto.getEmail(),
                    customerDto.getAddress()
                );
                customers.add(customer);
            }
            if (customers.isEmpty()) {
                view.displayMessage("No se encontraron clientes.");
            } else {
                view.display(customers);
            }
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(Customer customer) {
        try {
            CustomerDTO customerExists = dao.read(customer.getId());
            if (customerExists == null) {
                view.displayMessage("No se puede actualizar el cliente. Cliente no existente.");
                return false;
            }
            CustomerDTO customerDto = new CustomerDTO(
                customer.getDateOfBirth(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getId(),
                customer.getName()
            );
            if (dao.update(customerDto)) {
                view.displayMessage("Cliente actualizado exitosamente.");
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Customer customer) {
        try {
            CustomerDTO customerExists = dao.read(customer.getId());
            if (customerExists == null) {
                view.displayMessage("No se puede eliminar el cliente. Cliente no existente.");
                return false;
            } else {            
                CustomerDTO customerDto = new CustomerDTO(customer.getDateOfBirth(),customer.getPhone(), customer.getEmail(), customer.getAddress(),customer.getId(),customer.getName());
                return dao.delete(customerDto);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
