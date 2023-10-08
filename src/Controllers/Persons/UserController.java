/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Persons;

import Controllers.Controller;
import Dao.Dao;
import Person.DTO.UserDTO;
import Person.User;
import Views.View;
import java.util.List;

/**
 *
 * @author ekard
 */
public class UserController implements Controller<User> {
    private View view;
    private Dao dao;

    public UserController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    @Override
    public boolean create(User user) {
        if (dao.read(user.getId()) != null){
            view.displayMessage("Id de usuario duplicado");
            return false;
        }else{
            //Validad integridad
            UserDTO userDto =new UserDTO(user.getId(),user.getName(),user.getUserName(),user.getPassword());
            if (dao.create(userDto)){
               view.displayMessage("Usuario creado correctamente");
            return true;
            }else{
               view.displayMessage("Error al agregar el usuario");
            return false;

            }
       }    
    }

    @Override
    public User read(String id) {
        UserDTO userDto = (UserDTO)dao.read(id);
        if(userDto==null){
            view.displayMessage("Id de usuario no encontrado");
            return null;
        }else{
            User user = new User(userDto.getId(),userDto.getName(),userDto.getUserName(),userDto.getPassword());
            view.display(user);
            return user;
         }
      }

    @Override
    public List<User> readAll() {
        return null;

       }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
                return false;

    }
    
}

