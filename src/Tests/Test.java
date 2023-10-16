/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tests;

import Controllers.Controller;
import Controllers.Persons.UserController;
import Dao.Dao;
import Person.DAOS.UserDaoList;
import Person.User;
import Person.View.UserConsoleView;
import Person.View.UserFrmView;
import Views.View;

/**
 *
 * @author wendy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dao userDao = UserDaoList.getInstance();
        
        UserFrmView userView = new UserFrmView();
        userView.setVisible(true);
        
        Controller userController = new UserController(userView,userDao);
        
        User user1 = new User("1","Juana","JJ","123");
        User user2 = new User("2","Felipe","FF","xyz");
        User user3 = new User("1","Ale","AA","123456");
        
        userController.create(user1);
        userController.create(user2);
        userController.create(user3);
        
        userController.read("2");


    }
    
}
