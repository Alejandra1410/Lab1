
package Person;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Customer extends Person {
   private Date dateOfBirth;
   private String phone;
   private String email;
   private String address;

    public Customer(String name, String id,Date dateOfBirth, String phone, String email, String address) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
 
    public Customer(Date dateOfBirth, String id, String name,String email,String address) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.email= email;
        this.address= address;
        this.phone= "";
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
     public String getDateOfBirthAsString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(dateOfBirth);
    }
}
