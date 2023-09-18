package Person.DAOS;

import Dao.Dao;
import Person.DTO.UserDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * @author abiga <3
 */
public class UserDaoList implements Dao<UserDTO> {
   private HashMap<String,UserDTO> userList;

    public UserDaoList(){
       userList=new HashMap();
    }
   
    @Override
    public boolean create(UserDTO user) {
        if (user==null) return false;
        userList.put(user.getId(),user);
        return true;
    }

    @Override
    public UserDTO read(String id) {
        return userList.get(id);
        }

    @Override
    public List<UserDTO> readAll() {
        return new ArrayList<UserDTO>(userList.values()) ;
       }

    @Override
    public boolean update(UserDTO user) {
        return this.create(user);
    }

    @Override
    public boolean delete(UserDTO user) {
        return userList.remove(user.getId())!=null;
    }
    
}
