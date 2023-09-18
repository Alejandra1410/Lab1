package Person.DTO;

public abstract class PersonDTO {
  private String id;
  private String name; 

    public PersonDTO() {
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public PersonDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    

  
}
