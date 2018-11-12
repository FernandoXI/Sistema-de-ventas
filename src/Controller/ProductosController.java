
package Controller;

import Clases.Productos;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductosController {
    ArrayList<Productos> productos;
    
    public ProductosController()
    {
        productos = new ArrayList<>();
    }
    public void adicionar(Productos p)
    {
        productos.add(p);
    }
    public int tamaño()
    {
        return productos.size();
    }
    public void eliminar(Productos p)
    {
        productos.remove(p);
        
    }
    public Productos buscar(String nombre)
    {
        for(Productos x: productos)
        {
            if(x.getNombre().equals(nombre))
            {
                return x;
            }        
        }
        return null;  
    }
    
     public void guardarpro()  throws SQLException 
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
      
      for(Productos x: productos)
      {
        PreparedStatement prep= conexion.prepareStatement("INSERT INTO productos(nombre, apellidos, direccion, correo, telefono,dni) VALUES (?,?,?,?,?,?)");
        prep.setString(1, x.getNombre());
        prep.setInt(2, x.getPrecio());
        prep.setString(3, x.getTipo());
        prep.setInt(4, x.getCantidad());
   
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
        PreparedStatement prep = extraer.prepareStatement("SELECT * FROM productos");
        ResultSet rs = prep.executeQuery();
        
        while(rs.next())
        {
            String n = rs.getString("nombre");
            
            
            //Personas p = new Personas(nombre, apellidos, direccion, correo, telefono, dni);
                    
        }
    }
}
