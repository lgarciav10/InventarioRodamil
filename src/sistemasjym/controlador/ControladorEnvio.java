

package sistemasjym.controlador;

import java.sql.SQLException;
import sistemasjym.negocio.Articulo;
import sistemasjym.negocio.Envio;


public class ControladorEnvio {
    

    
        public void agregarEnvio(String codigoenvio, String codigoarticulo, String nombrearticulo, String cantidadenviada, String nombrefabrica, String codigofabrica, String fechadeenvio)
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Envio env = new Envio(codigoenvio, codigoarticulo, nombrearticulo, cantidadenviada, nombrefabrica, codigofabrica, fechadeenvio);
        env.grabar();
    }
        
        public void eliminarEnvio(String codigo)
                                 throws
                                 ClassNotFoundException, 
                                 InstantiationException,
                                 IllegalAccessException, 
                                 SQLException
    {
        Envio env;
        env= new Envio(codigo); 
        env.borrar();
    }
    
    
    
}
