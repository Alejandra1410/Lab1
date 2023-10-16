    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Factorys;

    import Person.Customer;
    import java.sql.Date;

    /**
     *
     * @author ekard
     */
    public class FactoryCustomer {

        public Customer createCustomer(String name, String id,Date dateOfBirth, String phone, String email, String address) {
            return new Customer(name, id, dateOfBirth, phone, email, address);
        }
    }
