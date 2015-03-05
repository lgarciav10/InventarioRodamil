

package sistemasjym.db;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemasjym.negocio.Devolucion;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;


public class DevolucionBD {
    
    
    private Devolucion d;

    public DevolucionBD(Devolucion d) {
        this.d = d;
    }
    
     public void Grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Creo la conexión con la BD
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        //Hago la consulta para ver si hay devoluciones con el mismo código
        cdb.un_sql = "SELECT codigodevolucion FROM devoluciones WHERE codigodevolucion= '" + d.getCodigodevolucion() + "';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);//Ejecuto la consulta

        if (cdb.resultado.next() /*!= null*/) {
            //Verifico si el código existe, mando mensaje de error
            JOptionPane.showMessageDialog(null, "El código que ingresó ya existe", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            cdb.un_sql = "INSERT INTO devoluciones  VALUES ('" + d.getCodigodevolucion() + "','" + d.getCodigoarticulo() + "','" + d.getNombrearticulo() + "','" + d.getCantidaddevuelta() + "','" + d.getNombrefabrica() + "','" + d.getCodigofabrica() + "','" + d.getFechadevolucion() + "')";
            cdb.us_st.executeUpdate(cdb.un_sql);

        }
    }
     
     
     public void Borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "DELETE FROM devoluciones WHERE codigodevolucion='" + d.getCodigodevolucion() + "'";
        cdb.us_st.executeUpdate(cdb.un_sql);
    }
    
    
    
}
