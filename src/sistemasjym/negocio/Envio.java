

package sistemasjym.negocio;

import java.sql.SQLException;
import sistemasjym.db.ArticuloBD;
import sistemasjym.db.EnvioBD;


public class Envio {
   
    
    private String codigoenvio;
    private String codigoarticulo;
    private String nombrearticulo;
    private String cantidadenviada;
    private String nombrefabrica;
    private String codigofabrica;
    private String fechadeenvio;

    public Envio(String codigoenvio, String codigoarticulo, String nombrearticulo, String cantidadenviada, String nombrefabrica, String codigofabrica, String fechadeenvio) {
        this.codigoenvio = codigoenvio;
        this.codigoarticulo = codigoarticulo;
        this.nombrearticulo = nombrearticulo;
        this.cantidadenviada = cantidadenviada;
        this.nombrefabrica = nombrefabrica;
        this.codigofabrica = codigofabrica;
        this.fechadeenvio = fechadeenvio;
    }

    public Envio(String codigoenvio) {
        this.codigoenvio = codigoenvio;
    }
    
    

    public String getCodigoenvio() {
        return codigoenvio;
    }

    public void setCodigoenvio(String codigoenvio) {
        this.codigoenvio = codigoenvio;
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

    public String getCantidadenviada() {
        return cantidadenviada;
    }

    public void setCantidadenviada(String cantidadenviada) {
        this.cantidadenviada = cantidadenviada;
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

    public String getFechadeenvio() {
        return fechadeenvio;
    }

    public void setFechadeenvio(String fechadeenvio) {
        this.fechadeenvio = fechadeenvio;
    }
    
    
    
    
    
    
    
    
    public void grabar() throws ClassNotFoundException, 
                                InstantiationException,
                                IllegalAccessException, 
                                SQLException
    {
        //Creo objeto de tipo artículoBD que maneja la comunicación con la base de datos
        EnvioBD env= new EnvioBD(this);
        env.Grabar();//Llamo a la función de agregar un nuevo artículo a la base de datos
    }

    public void borrar() throws ClassNotFoundException, 
                                InstantiationException, 
                                IllegalAccessException, 
                                SQLException
    {        
        EnvioBD env= new EnvioBD(this);
        env.Borrar();
    }
    
    
}
