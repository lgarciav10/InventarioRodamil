
package sistemasjym.controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import sistemasjym.negocio.Articulo;
import sistemasjym.negocio.Proveedor;

public class ControladorArticulo {
    
    
    
    public void agregarArticulo(String codigo,String nombre,String descripcion,String categoria,String color,String talla,String fechaafabrica,String fechaaempresa,String cantidadtotal,String cantidaddisponible,String cantidadenespera, String fechaderegistro) 
                                 throws
                                 ClassNotFoundException, 
                                 InstantiationException,
                                 IllegalAccessException, 
                                 SQLException
    {      
        Articulo art = new Articulo(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
        art.grabar();        
    }
    

    
    
     public void modificarArticulo(String codigo,String nombre,String descripcion,String categoria,String color,String talla,String fechaafabrica,String fechaaempresa,String cantidadtotal,String cantidaddisponible,String cantidadenespera, String fechaderegistro) 
                                 throws
                                 ClassNotFoundException, 
                                 InstantiationException,
                                 IllegalAccessException, 
                                 SQLException
    {      
        Articulo art = new Articulo(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
        art.actualizar();
    }
    
    
    public void eliminarArticulo(String codigo)
                                 throws
                                 ClassNotFoundException, 
                                 InstantiationException,
                                 IllegalAccessException, 
                                 SQLException
    {
        Articulo art;
        art= new Articulo(codigo); 
        art.borrar();
    }
    
    
}
