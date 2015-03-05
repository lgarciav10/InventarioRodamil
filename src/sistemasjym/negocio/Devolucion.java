
package sistemasjym.negocio;

import java.sql.SQLException;
import sistemasjym.db.DevolucionBD;
import sistemasjym.db.EnvioBD;


public class Devolucion {
    
    
    private String codigodevolucion;
    private String codigoarticulo;
    private String nombrearticulo;
    private String cantidaddevuelta;
    private String nombrefabrica;
    private String codigofabrica;
    private String fechadevolucion;

    public Devolucion(String codigodevolucion, String codigoarticulo, String nombrearticulo, String cantidaddevuelta, String nombrefabrica, String codigofabrica, String fechadevolucion) {
        this.codigodevolucion = codigodevolucion;
        this.codigoarticulo = codigoarticulo;
        this.nombrearticulo = nombrearticulo;
        this.cantidaddevuelta = cantidaddevuelta;
        this.nombrefabrica = nombrefabrica;
        this.codigofabrica = codigofabrica;
        this.fechadevolucion = fechadevolucion;
    }

    public Devolucion(String codigodevolucion) {
        this.codigodevolucion = codigodevolucion;
    }


    

    public String getCodigodevolucion() {
        return codigodevolucion;
    }

    public void setCodigodevolucion(String codigodevolucion) {
        this.codigodevolucion = codigodevolucion;
    }

    public String getCodigoarticulo() {
        return codigoarticulo;
    }

    public void setCodigoarticulo(String codigoarticulo) {
        this.codigoarticulo = codigoarticulo;
    }

    public String getNombrearticulo() {
        return nombrearticulo;
    }

    public void setNombrearticulo(String nombrearticulo) {
        this.nombrearticulo = nombrearticulo;
    }

    public String getCantidaddevuelta() {
        return cantidaddevuelta;
    }

    public void setCantidaddevuelta(String cantidaddevuelta) {
        this.cantidaddevuelta = cantidaddevuelta;
    }

    public String getNombrefabrica() {
        return nombrefabrica;
    }

    public void setNombrefabrica(String nombrefabrica) {
        this.nombrefabrica = nombrefabrica;
    }

    public String getCodigofabrica() {
        return codigofabrica;
    }

    public void setCodigofabrica(String codigofabrica) {
        this.codigofabrica = codigofabrica;
    }

    public String getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    
    
    public void grabar() throws ClassNotFoundException, 
                                InstantiationException,
                                IllegalAccessException, 
                                SQLException
    {
        //Creo objeto de tipo artículoBD que maneja la comunicación con la base de datos
        DevolucionBD dev= new DevolucionBD(this);
        dev.Grabar();//Llamo a la función de agregar un nuevo artículo a la base de datos
    }
    
    public void borrar() throws ClassNotFoundException, 
                                InstantiationException, 
                                IllegalAccessException, 
                                SQLException
    {        
        DevolucionBD dev= new DevolucionBD(this);
        dev.Borrar();
    }
    
    
    
    
}
