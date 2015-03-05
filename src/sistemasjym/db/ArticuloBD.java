

package sistemasjym.db;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemasjym.negocio.Articulo;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;


public class ArticuloBD {
    
    //Creo un objeto de tipo artículo
    private Articulo a;
    
    //Creo un constructor de este objeto
    public ArticuloBD(Articulo a) {
        this.a = a;
    }
    
    //Método para grabar un artículo
    public void Grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Creo la conexión con la BD
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        //Hago la consulta para ver si hay artículos con el mismo código
        cdb.un_sql = "SELECT codigo FROM stock WHERE codigo= '" + a.getCodigo()+ "';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);//Ejecuto la consulta
        
        if (cdb.resultado.next() /*!= null*/) {
            //Verifico si el código existe, mando mensaje de error
            JOptionPane.showMessageDialog(null,"El código que ingresó ya existe","Error",JOptionPane.ERROR_MESSAGE);
           
        } else {
            
            cdb.un_sql = "INSERT INTO stock  VALUES ('" + a.getCodigo()+ "','" + a.getNombre() + "','" + a.getDescripcion() + "','" + a.getCategoria() + "','" + a.getColor() + "','"+ a.getTalla() + "','"+  a.getFechaafabrica() + "','"+ a.getFechaaempresa() + "','"+ a.getCantidadtotal() + "','"+ a.getCantidaddisponible() + "','"+  a.getCantidadenespera() +"','"+ a.getFechaderegistro()+ "')";
            cdb.us_st.executeUpdate(cdb.un_sql);
            
        }
    }
    
    
   
    
    
    public void Modificar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        cdb.un_sql = "SELECT codigo FROM stock WHERE codigo= '" + a.getCodigo()+ "';";//Busco en base de datos articulo con ese codigo
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);// ejecuto consulta

        if (cdb.resultado != null) {//Si consigo algun articulo con ese codigo 
            if (cdb.resultado.next()) {//Hago consulta para actualizar daatos de ese articulo
                cdb.un_sql = "UPDATE stock SET nombre='" + a.getNombre() + "',descripcion='" + a.getDescripcion() + "',categoria='" + a.getCategoria()+ "',color='" + a.getColor()+"',talla='" + a.getTalla()+"',fechaafabrica='" + a.getFechaafabrica()+"',fechaaempresa='" + a.getFechaaempresa()+"',cantidadtotal='" + a.getCantidadtotal()+"',cantidaddisponible='" + a.getCantidaddisponible()+"',cantidadenespera='" + a.getCantidadenespera()+"',fechaderegistro='" + a.getFechaderegistro()+ "' WHERE codigo='" + a.getCodigo() + "';";
                cdb.us_st.executeUpdate(cdb.un_sql);
            } else {
                /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
                JOptionPane.showMessageDialog(null, "No puede modificar el código de un artículo");
                throw new Error("Registro" + a.getCodigo() + "No se encuentra en la tabla articulo Ubicacion'" + this.getClass().getName());
            }
        } else {
            /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
            throw new Error("Modificacion a registro" + a.getCodigo() + "Ha devuelto un recordSet null Ubicacion =" + this.getClass().getName());
        }
    }
    
    
    public void Borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "DELETE FROM stock WHERE codigo='" + a.getCodigo() + "'";
        cdb.us_st.executeUpdate(cdb.un_sql);
    }
    
    
    
    
}
