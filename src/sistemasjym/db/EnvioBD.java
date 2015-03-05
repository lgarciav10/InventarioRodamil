

package sistemasjym.db;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemasjym.negocio.Envio;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;


public class EnvioBD {
    
    private Envio e;

    public EnvioBD(Envio e) {
        this.e = e;
    }
    
    public void Grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Creo la conexión con la BD
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        //Hago la consulta para ver si hay envíos con el mismo código
        cdb.un_sql = "SELECT codigoenvio FROM envios WHERE codigoenvio= '" + e.getCodigoenvio() + "';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);//Ejecuto la consulta

        if (cdb.resultado.next() /*!= null*/) {
            //Verifico si el código existe, mando mensaje de error
            JOptionPane.showMessageDialog(null, "El código que ingresó ya existe", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            cdb.un_sql = "INSERT INTO envios  VALUES ('" + e.getCodigoenvio() + "','" + e.getCodigoarticulo() + "','" + e.getNombrearticulo() + "','" + e.getCantidadenviada() + "','" + e.getNombrefabrica() + "','" + e.getCodigofabrica() + "','" + e.getFechadeenvio() + "')";
            cdb.us_st.executeUpdate(cdb.un_sql);

        }
    }
    
    
    
    public void Borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "DELETE FROM envios WHERE codigoenvio='" + e.getCodigoenvio() + "'";
        cdb.us_st.executeUpdate(cdb.un_sql);
    }
    
    
    
    
}
