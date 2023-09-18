
package Person;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Customer extends Person {
   private Date dateOfBirth;
   private String phone;
   private String email;
   private String address;

    public Customer(Date dateOfBirth, String phone, String email, String address, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(Date dateOfBirth, String phone) {
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email="";
        this.address="";
    }
 
    public Customer(Date dateOfBirth, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone="";
        this.email="";
        this.address="";
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
private int calculateAge() {
    return Period.between(this.dateOfBirth.toLocalDate(), LocalDate.now()).getYears();
}
public int getAge(){
 return calculateAge();
}
}
