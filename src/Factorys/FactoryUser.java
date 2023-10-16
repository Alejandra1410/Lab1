/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorys;

import Person.User;

/**
 *
 * @author ekard
 */
public class FactoryUser {
    public User createUser(String id, String name, String userName, String password) {
        return new User(id, name, userName, password);
    }
}
