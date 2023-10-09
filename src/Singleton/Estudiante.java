package Singleton;

/**
 *
 * @author abiga
 */
public class Estudiante {
    private static Estudiante instancia;
    static Estudiante getInstancia;
    private String nombre;
    
    public String getNombre() {
    return nombre;
}
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Estudiante getInstancia(){
        if(instancia==null){
            instancia=new Estudiante();
        }
        return instancia;
    }
    private Estudiante(){
    
   }
}
