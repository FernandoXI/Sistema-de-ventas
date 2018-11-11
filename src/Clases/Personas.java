
package Clases;


public class Personas extends Sistemadeventas{
    private int telefono;
    private String direccion;
    private int dni;
    private String correo;
     
    public Personas()
    { 
    }
    
    public Personas(String nombre, int ID, int telefono, String direccion, int dni, String correo)
    {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.direccion = direccion;
        this.dni = dni;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
