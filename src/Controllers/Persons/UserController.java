
package Controllers.Persons;

import Controllers.Controller;
import Dao.Dao;
import Person.DTO.UserDTO;
import Person.User;
import Views.View;
import java.util.ArrayList;
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
    List<User> userList = new ArrayList<>();
    List<UserDTO> userDTOs = dao.readAll();
    for (UserDTO userDto : userDTOs) {
        User user = new User(userDto.getId(), userDto.getName(), userDto.getUserName(), userDto.getPassword());
        userList.add(user);
    }

    return userList;
       }

    @Override
    public boolean update(User user) {
     UserDTO userExists = (UserDTO) dao.read(user.getId());
     if (userExists==null) {
     view.displayMessage("No se puede actualizar el usuario. Usuario no existente.");
     return false;
    }
    UserDTO userDto = new UserDTO(user.getId(), user.getName(), user.getUserName(), user.getPassword());
    return dao.update(userDto);
    }
    

    @Override
    public boolean delete(User user) {
     UserDTO userExists = (UserDTO) dao.read(user.getId());
        if (userExists==null) {
        view.displayMessage("No se puede eliminar el usuario. Usuario no existente.");
            return false;
        }
     UserDTO userDto = new UserDTO(user.getId(), user.getName(), user.getUserName(), user.getPassword());
     return dao.delete(userDto);
    }  
}

