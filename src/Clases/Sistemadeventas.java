
package Clases;

import Vista.JFLogin;


public class Sistemadeventas {
    protected String nombre;
    protected int ID;
    


    public static void main(String[] args) {
        JFLogin marco = new JFLogin();
        marco.setVisible(true);
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
