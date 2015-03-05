

package sistemasjym.controlador;

import java.sql.SQLException;
import sistemasjym.negocio.Devolucion;
import sistemasjym.negocio.Envio;


public class ControladorDevolucion {
    
    
    public void agregarDevolucion(String codigodevolucion, String codigoarticulo, String nombrearticulo, String cantidaddevuelta, String nombrefabrica, String codigofabrica, String fechadevolucion)
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Devolucion dev = new Devolucion(codigodevolucion, codigoarticulo, nombrearticulo, cantidaddevuelta, nombrefabrica, codigofabrica, fechadevolucion);
        dev.grabar();
    }
    
    
    public void eliminarDevolucion(String codigo)
                                 throws
                                 ClassNotFoundException, 
                                 InstantiationException,
                                 IllegalAccessException, 
                                 SQLException
    {
        Devolucion dev;
        dev= new Devolucion(codigo); 
        dev.borrar();
    }
    
    
    
}
