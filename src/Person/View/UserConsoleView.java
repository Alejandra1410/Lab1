/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.View;

import Person.User;
import Views.View;

public class UserConsoleView implements View<User> {

    @Override
    public void display(User user) {
        System.out.println("Id;"+user.getId());
        System.out.println("Nombre;"+user.getName());
        System.out.println("Nombre de usuario;"+user.getUserName());
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
