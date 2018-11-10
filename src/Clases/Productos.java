
package Clases;


public class Productos extends Sistemadeventas{
    private int precio;
    private String tipo;
    private int cantidad;
    
    public Productos()
    {
        
    }
    
    public Productos(String nombre, int ID, int precio, String tipo, int cantidad)
    {
        this.nombre=nombre;
        this.ID = ID;
        this.precio= precio;
        this.tipo= tipo;
        this.cantidad= cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
