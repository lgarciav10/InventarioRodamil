

package sistemasjym.negocio;

import java.sql.SQLException;
import sistemasjym.db.ArticuloBD;
import sistemasjym.db.ProveedorBD;


public class Articulo {
    
   //Creo atributos de la clase Artículo 
   private String codigo;
   private String nombre;
   private String descripcion;
   private String categoria;
   private String color;
   private String talla;
   private String fechaafabrica;
   private String fechaaempresa;
   private String cantidadtotal;
   private String cantidaddisponible;
   private String cantidadenespera;
   private String fechaderegistro;
   
    //Creo contructor, y getters and setters
   

    public Articulo(String codigo, String nombre, String descripcion, String categoria, String color, String talla, String fechaafabrica, String fechaaempresa, String cantidadtotal, String cantidaddisponible, String cantidadenespera, String fechaderegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.color = color;
        this.talla = talla;
        this.fechaafabrica = fechaafabrica;
        this.fechaaempresa = fechaaempresa;
        this.cantidadtotal = cantidadtotal;
        this.cantidaddisponible = cantidaddisponible;
        this.cantidadenespera = cantidadenespera;
        this.fechaderegistro = fechaderegistro;
    }

    public Articulo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getFechaafabrica() {
        return fechaafabrica;
    }

    public void setFechaafabrica(String fechaafabrica) {
        this.fechaafabrica = fechaafabrica;
    }

    public String getFechaaempresa() {
        return fechaaempresa;
    }

    public void setFechaaempresa(String fechaaempresa) {
        this.fechaaempresa = fechaaempresa;
    }

    public String getCantidadtotal() {
        return cantidadtotal;
    }

    public void setCantidadtotal(String cantidadtotal) {
        this.cantidadtotal = cantidadtotal;
    }

    public String getCantidaddisponible() {
        return cantidaddisponible;
    }

    public void setCantidaddisponible(String cantidaddisponible) {
        this.cantidaddisponible = cantidaddisponible;
    }

    public String getCantidadenespera() {
        return cantidadenespera;
    }

    public void setCantidadenespera(String cantidadenespera) {
        this.cantidadenespera = cantidadenespera;
    }

    public String getFechaderegistro() {
        return fechaderegistro;
    }

    public void setFechaderegistro(String fechaderegistro) {
        this.fechaderegistro = fechaderegistro;
    }

   
   
    
    //Método para pasar a texto
    public String toString() {
        return "[Codigo: "+this.getCodigo()+"] [Nombre: "+this.getNombre()+"] [Descripción: "+this.getDescripcion()+"] [Categoría: "+this.getCategoria()+"] [Color: "+this.getColor()+"] [Color: "+this.getTalla()+"] [Fecha de envío: "+this.getFechaafabrica()+"] [FechaAEmpresa: "+this.getFechaaempresa()+"] [Cantidad Total: "+this.getCantidadtotal()+"] [Cantidad Disponible: "+this.getCantidaddisponible()+"] [Cantidad en espera: "+this.getCantidadenespera()+"] [Fecha de REgistro: "+this.getFechaderegistro()+"]";
    }

    //Ahora paso a los métodos que usaré en el programa
    public void grabar() throws ClassNotFoundException, 
                                InstantiationException,
                                IllegalAccessException, 
                                SQLException
    {
        //Creo objeto de tipo artículoBD que maneja la comunicación con la base de datos
        ArticuloBD adb= new ArticuloBD(this);
        adb.Grabar();//Llamo a la función de agregar un nuevo artículo a la base de datos
    }
 
    public void actualizar() throws ClassNotFoundException, 
                                InstantiationException,
                                IllegalAccessException, 
                                SQLException
    {
        //Creo objeto de tipo artículoBD que maneja la comunicación con la base de datos
        ArticuloBD adb= new ArticuloBD(this);
        adb.Modificar();//Llamo a la función 
    }

  
    public void borrar() throws ClassNotFoundException, 
                                InstantiationException, 
                                IllegalAccessException, 
                                SQLException
    {        
        ArticuloBD adb= new ArticuloBD(this);
        adb.Borrar();
    }
    
    
    
    
    
}
