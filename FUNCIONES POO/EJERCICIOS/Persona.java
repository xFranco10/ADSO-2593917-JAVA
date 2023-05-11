import java.util.Scanner;

public class Persona{

    Scanner entrada = new Scanner(System.in);

    // Atributos
    int documento;
    String nombre;
    String apellidos;
    String direccion;
    int telefono;
    String email;


    // Metodos
    public Persona(int documento, String nombre, String apellidos, String direccion, int telefono, String email){
        this.documento=documento;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }

    public int getDocumento(){
        return this.documento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public String getEmail(){
        return this.email;
    }

    public void setDocumento(int documento){
        this.documento=documento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public void setEmail(String email){
        this.email=email;
    }




    public void mostrarClientesRegistrados(){

    
        System.out.println(" --------------------------------------------------- ");
        System.out.println(" -- DATOS PERSONA --  ");
        System.out.println(" --------------------------------------------------- ");
        System.out.println(" Documento: "+this.documento);
        System.out.println(" Nombre: "+this.nombre);
        System.out.println(" Apellido: "+this.apellidos);
        System.out.println(" Direccion: "+this.direccion);
        System.out.println(" Telefono: "+this.telefono);
        System.out.println(" Email: "+this.email);
        System.out.println(" --------------------------------------------------- ");

    }
    




}