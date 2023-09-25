
package Person.DTO;


public class UserDTO extends PersonDTO {
     private String userName;
     private int password;

    
    public String getUserName() {
        return userName;
    }
  
    public int getPassword() {
        return password;
    }
    
    public UserDTO(String id,String name,String userName, int password ) {
        super(id, name);
        this.userName = userName;
        this.password = password;
    }  

    
}
