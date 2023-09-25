package Person.DTO;

import Person.Person;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author abiga
 */
public class CustomerDTO extends Person {
   private Date dateOfBirth;
   private String phone;
   private String email;
   private String address;

    public CustomerDTO(Date dateOfBirth, String phone, String email, String address, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
   
}
  
