/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasjym.ui;

import static java.awt.SystemColor.window;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import sistemasjym.controlador.ControladorArticulo;
import sistemasjym.controlador.ControladorDevolucion;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;


/**
 *
 * @author luis
 */
public class SubForm_Devolver extends javax.swing.JFrame {

    public String pcodigo, pnombre, pdescripcion, pcategoria, pcolor, ptalla, pfechaafabrica, pfechaaempresa, pcantidadtotal, pcantidaddisponible, pcantidadenespera, pfechaderegistro;
    
    
    public SubForm_Devolver(String codigo,String nombre,String descripcion,String categoria,String color,String talla,String fechaafabrica,String fechaaempresa,String cantidadtotal,String cantidaddisponible,String cantidadenespera, String fechaderegistro) {
        initComponents();
        setLocationRelativeTo(null);
        
        
        JLNombre.setText(nombre);
        JLCantidadTotal.setText(cantidadtotal);
        JLCantidadDisponible.setText(cantidaddisponible);
        JLCantidadEnEspera.setText(cantidadenespera);
        
        pcodigo = codigo;
        pnombre = nombre;
        pdescripcion =descripcion;
        pcategoria = categoria;
        pcolor = color;
        ptalla = talla;
        pfechaafabrica = fechaafabrica;
        pfechaaempresa = fechaaempresa;
        pcantidadtotal = cantidadtotal;
        pcantidaddisponible = cantidaddisponible;
        pcantidadenespera = cantidadenespera;
        pfechaderegistro = fechaderegistro;
        
        
        
        
    }



   
    
    
    private Boolean verSiExisteCodigo(String codigo) 
                    throws ClassNotFoundException, 
                    InstantiationException, 
                    IllegalAccessException,
                    SQLException{
    
        Boolean existecodigo = false;
    
        //Creo la conexión con la BD
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        //Hago la consulta para ver si hay devoluciones con el mismo código
        cdb.un_sql = "SELECT codigodevolucion FROM devoluciones WHERE codigodevolucion= '" + codigo + "';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);//Ejecuto la consulta

        if (cdb.resultado.next() /*!= null*/) {
            //Verifico si el código existe, mando mensaje de error
            existecodigo = true;//asigno true para devolver que existe
            
        } 
    
    return existecodigo;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JDFechaDeDevolucion = new com.toedter.calendar.JDateChooser();
        JSCantidadADevolver = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLCantidadTotal = new javax.swing.JLabel();
        JLCantidadDisponible = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLCantidadEnEspera = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFCodigoDevolucion = new javax.swing.JTextField();
        JTFNombreFabrica = new javax.swing.JTextField();
        JTFCodigoFabrica = new javax.swing.JTextField();

        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Información requerida para devolución");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Cantidad Rodamil:");

        jLabel12.setText("Cantidad a Devolver:");

        jLabel8.setText("Fecha de Devolución:");

        jLabel11.setText("Cantidad total:");

        jButton1.setText("Registrar Devolución");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        JLNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLNombre.setText("Nombre");

        JLCantidadTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLCantidadTotal.setText("Cantidad Total");

        JLCantidadDisponible.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLCantidadDisponible.setText("Cantidad Disponible");

        jLabel5.setText("Cantidad en espera:");

        JLCantidadEnEspera.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLCantidadEnEspera.setText("Cantidad en Espera");

        jLabel2.setText("Nombre de Fábrica:");

        jLabel3.setText("Código de Fábrica:");

        jLabel4.setText("Código de Devolución:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLCantidadEnEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLCantidadDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLCantidadTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JSCantidadADevolver)
                                .addComponent(JDFechaDeDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTFCodigoDevolucion)
                                .addComponent(JTFNombreFabrica)
                                .addComponent(JTFCodigoFabrica))
                            .addComponent(jButton1))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(208, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JLNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JLCantidadTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JLCantidadDisponible))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JLCantidadEnEspera))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFCodigoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFNombreFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFCodigoFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JSCantidadADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDFechaDeDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int cantidaddevuelta, cantidaddisp, cantidadenesp;
        Boolean existe = false;

        cantidaddevuelta = (int) JSCantidadADevolver.getValue();
        cantidaddisp = Integer.parseInt(pcantidaddisponible);
        cantidadenesp = Integer.parseInt(pcantidadenespera);
        //Luego de obtener la cantidad en espera, procedo a restarle la cantidad disponible y sumarle la cantidad en espera

        //Operaciones de cantidades
        cantidaddisp = cantidaddisp + cantidaddevuelta;//
        cantidadenesp = cantidadenesp - cantidaddevuelta;//
        try {
            existe = verSiExisteCodigo(JTFCodigoDevolucion.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubForm_Devolver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SubForm_Devolver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SubForm_Devolver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubForm_Devolver.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        if (existe == false){
        
        //Verifico que la cantidad disponible no sea cero y antes que los campos no estén vacíos
        if( JDFechaDeDevolucion.getDate()!= null && (int)JSCantidadADevolver.getValue() != 0){

            if (cantidaddisp >=0){

                try{
                    //obtengo valores
                    String codigo = pcodigo;
                    String nombre = pnombre;
                    String descripcion = pdescripcion;
                    String categoria = pcategoria;
                    String color = pcolor;
                    String talla = ptalla;
                    String cantidadtotal = pcantidadtotal;
                    String fechaaempresa = new SimpleDateFormat("dd/MMM/yyyy").format(JDFechaDeDevolucion.getDate());
                    String fechaderegistro = pfechaderegistro;
                    String fechaafabrica = pfechaafabrica;
                    String codigodevolucion = JTFCodigoDevolucion.getText();
                    String nombrefabrica = JTFNombreFabrica.getText();
                    String codigofabrica = JTFCodigoFabrica.getText();
                    String cantidaddevolucion= Integer.toString(cantidaddevuelta);
                    String cantidaddisponible = Integer.toString(cantidaddisp);
                    String cantidadenespera = Integer.toString(cantidadenesp);//Al regstrar un artículo,aún no se han mandado a procesar productos de

                    ControladorArticulo ap = new ControladorArticulo();//Modificas tabla stock
                    ap.modificarArticulo(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);

                    ControladorDevolucion cd = new ControladorDevolucion();
                    cd.agregarDevolucion(codigodevolucion, codigo, nombre, cantidaddevolucion, nombrefabrica, codigofabrica, fechaaempresa);
                    
                    //Modificas la tabla envios

                    JOptionPane.showMessageDialog(null, "Envío registrado satisfactoriamente!");

                    System.gc();//CERRAR VENTANAS
                    for(Window window:Window.getWindows()){
                        window.dispose();
                    }//CERRAR TODAS LAS VENTANAS
                    Form_EnviarAProcesar fr = new Form_EnviarAProcesar();
                    fr.setVisible(true);
                    
                    
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error al ingresar los datos","Error",JOptionPane.ERROR_MESSAGE);
                }

            }else{

                JOptionPane.showMessageDialog(null, "Error!, no hay suficientes productos disponibles");

            }
        }else{

            JOptionPane.showMessageDialog(null, "Error!, debe llenar todos los campos");
        }
        }//Ver si existe codigo
        else{
        
            JOptionPane.showMessageDialog(null, "El código que ingresó ya está registrado, ingrese otro");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiarCajasDeTexto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void limpiarCajasDeTexto(){
        
        
        JSCantidadADevolver.setValue(0);
        JDFechaDeDevolucion.setDate(null);
        
        
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubForm_Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubForm_Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubForm_Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubForm_Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String pcodigo = null, pnombre = null, pdescripcion = null, pcategoria = null, pcolor = null, ptalla = null, pfechaafabrica = null, pfechaaempresa = null, pcantidadtotal = null, pcantidaddisponible = null, pcantidadenespera = null, pfechaderegistro = null;
    
                new SubForm_Devolver(pcodigo, pnombre, pdescripcion, pcategoria, pcolor, ptalla, pfechaafabrica, pfechaaempresa, pcantidadtotal, pcantidaddisponible, pcantidadenespera, pfechaderegistro).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDFechaDeDevolucion;
    private javax.swing.JLabel JLCantidadDisponible;
    private javax.swing.JLabel JLCantidadEnEspera;
    private javax.swing.JLabel JLCantidadTotal;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JSpinner JSCantidadADevolver;
    private javax.swing.JTextField JTFCodigoDevolucion;
    private javax.swing.JTextField JTFCodigoFabrica;
    private javax.swing.JTextField JTFNombreFabrica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
