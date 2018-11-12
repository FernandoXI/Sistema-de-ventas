
package Controller;

import Clases.Personas;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;
import java.sql.*;
import Vista.JFVenta.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PersonasController {
    ArrayList<Personas> datos;
    
    public PersonasController()
    {
       datos = new ArrayList<>();
    }
    
    public void adicionar(Personas p)
    {
        datos.add(p);
    }
    
    public int tamaño()
    {
        return datos.size();
    }
    
    public void eliminar(Personas p)
    {
        datos.remove(p);
    }
    
    public Personas obtener(int pos)
    {
        return datos.get(pos);
    }
    public Personas buscar(String apellido)
    {
        for(Personas x: datos)
        {
            if(x.getApellidos().equals(apellido))
            {
                return x;
            }
        }
        return null;
    }
    
    public void guardar()  throws SQLException 
    {
      try
      {
      MysqlDataSource datopersonas = new MysqlDataSource();
      datopersonas.setServerName("localhost");
      datopersonas.setDatabaseName("sistema_de_ventas");
      datopersonas.setUser("root");
      datopersonas.setPassword("");
      
      Connection conexion = datopersonas.getConnection();
      
      Statement sentencia = conexion.createStatement();
      
      for(Personas x: datos)
      {
        PreparedStatement prep= conexion.prepareStatement("INSERT INTO clientes(nombre, apellidos, direccion, correo, telefono,dni) VALUES (?,?,?,?,?,?)");
        prep.setString(1, x.getNombre());
        prep.setString(2, x.getApellidos());
        prep.setString(3, x.getDireccion());
        prep.setString(4, x.getCorreo());
        prep.setInt(5, x.getTelefono());
        prep.setInt(6, x.getDni());
        
        prep.executeUpdate();
      }   
      
      } 
      catch (Exception e)
      {
       
      }     
    }
    
     public void extraer() throws SQLException
    {
        MysqlDataSource dataextraccion = new MysqlDataSource();
        dataextraccion.setServerName("localhost");
        dataextraccion.setDatabaseName("sistema_de_ventas");
        dataextraccion.setUser("root");
        dataextraccion.setPassword("");
        
        Connection extraer = dataextraccion.getConnection();
        PreparedStatement prep = extraer.prepareStatement("SELECT * FROM clientes");
        ResultSet rs = prep.executeQuery();
        
        while(rs.next())
        {
            String n = rs.getString("nombre");
            
            
            //Personas p = new Personas(nombre, apellidos, direccion, correo, telefono, dni);
                    
        }
    }
            
}
