/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasjym.ui;

import com.sun.org.apache.xpath.internal.functions.Function;
import java.awt.Window;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemasjym.controlador.ControladorArticulo;
import sistemasjym.controlador.ControladorEnvio;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;

/**
 *
 * @author luis
 */
public class SubForm_Enviar extends javax.swing.JFrame {

    public String pcodigo, pnombre, pdescripcion, pcategoria, pcolor, ptalla, pfechaafabrica, pfechaaempresa, pcantidadtotal, pcantidaddisponible, pcantidadenespera, pfechaderegistro;
    
    
    public SubForm_Enviar(String codigo,String nombre,String descripcion,String categoria,String color,String talla,String fechaafabrica,String fechaaempresa,String cantidadtotal,String cantidaddisponible,String cantidadenespera, String fechaderegistro) {
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
        pcantidadtotal = cantidadtotal;
        pcantidaddisponible = cantidaddisponible;
        pcantidadenespera = cantidadenespera;
        pfechaafabrica = fechaafabrica;
        pfechaaempresa = fechaaempresa;
        pfechaderegistro = fechaderegistro;
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JDFechaDeEnvio = new com.toedter.calendar.JDateChooser();
        JSCantidadAEnviar = new javax.swing.JSpinner();
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
        JTFCodigoEnvio = new javax.swing.JTextField();
        JTFNombreFabrica = new javax.swing.JTextField();
        JTFCodigoFabrica = new javax.swing.JTextField();

        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Información requerida para envío");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel12.setText("Cantidad a enviar:");

        jLabel8.setText("Fecha de Envío:");

        jLabel11.setText("Cantidad total:");

        jButton1.setText("Registrar envío");
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

        jLabel4.setText("Código de Envío:");

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
                                .addComponent(JSCantidadAEnviar)
                                .addComponent(JDFechaDeEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTFCodigoEnvio)
                                .addComponent(JTFNombreFabrica)
                                .addComponent(JTFCodigoFabrica))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(208, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8});

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
                    .addComponent(JTFCodigoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(JSCantidadAEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDFechaDeEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Boolean verSiExisteCodigo(String codigo) 
                    throws ClassNotFoundException, 
                    InstantiationException, 
                    IllegalAccessException,
                    SQLException{
    
        Boolean existecodigo = false;
    
        //Creo la conexión con la BD
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();

        //Hago la consulta para ver si hay envíos con el mismo código
        cdb.un_sql = "SELECT codigoenvio FROM envios WHERE codigoenvio= '" + codigo + "';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);//Ejecuto la consulta

        if (cdb.resultado.next() /*!= null*/) {
            //Verifico si el código existe, mando mensaje de error
            existecodigo = true;//asigno true para devolver que existe
            
        } 
    
    return existecodigo;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int cantidadagregada, cantidaddisp, cantidadenesp;
        Boolean existe = false;

        cantidadagregada = (int) JSCantidadAEnviar.getValue();
        cantidaddisp = Integer.parseInt(pcantidaddisponible);
        cantidadenesp = Integer.parseInt(pcantidadenespera);
        //Luego de obtener la cantidad en espera, procedo a restarle la cantidad disponible y sumarle la cantidad en espera

        //Operaciones de cantidades
        cantidaddisp = cantidaddisp - cantidadagregada;//
        cantidadenesp = cantidadenesp + cantidadagregada;//
        try {        
           existe = verSiExisteCodigo(JTFCodigoEnvio.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubForm_Enviar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SubForm_Enviar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SubForm_Enviar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubForm_Enviar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
//        JOptionPane.showMessageDialog(null, existe);
        
        if(existe == false){//Ver si el código se repite
        
        //Verifico que la cantidad disponible no sea cero y antes que los campos no estén vacíos
        if( JDFechaDeEnvio.getDate()!= null && (int)JSCantidadAEnviar.getValue() != 0){

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
                String fechaaempresa = pfechaaempresa;
                String fechaderegistro = pfechaderegistro;

                String fechaafabrica = new SimpleDateFormat("dd/MMM/yyyy").format(JDFechaDeEnvio.getDate());

                String codigoenvio = JTFCodigoEnvio.getText();
                String nombrefabrica = JTFNombreFabrica.getText();
                String codigofabrica = JTFCodigoFabrica.getText();
                String cantidadenviada= Integer.toString(cantidadagregada);
                
                String cantidaddisponible = Integer.toString(cantidaddisp);
                String cantidadenespera = Integer.toString(cantidadenesp);//Al regstrar un artículo,aún no se han mandado a procesar productos de

                ControladorArticulo ap = new ControladorArticulo();//Modificas tabla stock    
                ap.modificarArticulo(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            
                ControladorEnvio ce = new ControladorEnvio();
                ce.agregarEnvio(codigoenvio, codigo, nombre, cantidadenviada, nombrefabrica, codigofabrica, fechaafabrica);
                
                
                //Modificas la tabla envios
                
               
                JOptionPane.showMessageDialog(null, "Envío registrado satisfactoriamente!");

                System.gc();//CERRAR VENTANAS
                for(Window window:Window.getWindows()){
                    window.dispose();
                }//CERRAR TODAS LAS VENTANAS
                Form_EnviarAProcesar fr = new Form_EnviarAProcesar();
                fr.setVisible(true);
//                SubForm_Enviar sf = new SubForm_Enviar(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
//                sf.setVisible(true);//Esto lo hago para que después de enviar algo, salga la pantalla de enviar de nuevo
                
                 } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al ingresar los datos","Error",JOptionPane.ERROR_MESSAGE);
                 }

            }else{

                JOptionPane.showMessageDialog(null, "Error!, no hay suficientes productos disponibles");

            }
        }else{

            JOptionPane.showMessageDialog(null, "Error!, debe llenar todos los campos");
        }
        }//if de existe
        else{
        
            JOptionPane.showMessageDialog(null, "El código que ingresó ya está registrado, ingrese otro");
        
        
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCajasDeTexto(){
        
        
        JSCantidadAEnviar.setValue(0);
        JDFechaDeEnvio.setDate(null);
        
        
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiarCajasDeTexto();

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SubForm_Enviar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubForm_Enviar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubForm_Enviar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubForm_Enviar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String pcodigo = null, pnombre = null, pdescripcion = null, pcategoria = null, pcolor = null, ptalla = null, pfechaafabrica = null, pfechaaempresa = null, pcantidadtotal = null, pcantidaddisponible = null, pcantidadenespera = null, pfechaderegistro = null;
    
                
                new SubForm_Enviar(pcodigo, pnombre, pdescripcion, pcategoria, pcolor, ptalla, pfechaafabrica, pfechaaempresa, pcantidadtotal, pcantidaddisponible, pcantidadenespera, pfechaderegistro).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDFechaDeEnvio;
    private javax.swing.JLabel JLCantidadDisponible;
    private javax.swing.JLabel JLCantidadEnEspera;
    private javax.swing.JLabel JLCantidadTotal;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JSpinner JSCantidadAEnviar;
    private javax.swing.JTextField JTFCodigoEnvio;
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
