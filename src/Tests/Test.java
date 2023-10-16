/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tests;

import Bank.Bank;
import Controllers.Controller;
import Controllers.Persons.CustomerController;
import Controllers.Persons.UserController;
import Dao.Dao;
import Person.Customer;
import Person.DAOS.UserDaoList;
import Person.User;
import Person.View.UserConsoleView;
import Person.View.UserFrmView;
import Views.View;
import java.sql.Date;

/**
 *
 * @author wendy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller CustomerController = new CustomerController();
         Bank bank = new Bank();
//    
    bank.crearCliente("John Doe", "12345", Date.valueOf("1990-01-15"), "555-1234", "john@example.com", "123 Main St");
    //  bank.crearCuenta("208270083",10000,Mario,1);
//    bank.crearTarjeta();
//    bank.crearTransaccion();
        CustomerController.read("12345");
        
        
////        
//        Dao userDao = UserDaoList.getInstance();
////        
//        UserFrmView userView = new UserFrmView();
//        userView.setVisible(true);
        
//        Controller userController = new UserController(userView,userDao);
//        
//        User user1 = new User("1","Juana","JJ","123");
//        User user2 = new User("2","Felipe","FF","xyz");
//        User user3 = new User("1","Ale","AA","123456");
//        
//        userController.create(user1);
//        userController.create(user2);
//        userController.create(user3);
//        
//        userController.read("2");


    }
    
}
