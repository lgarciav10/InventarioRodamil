/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasjym.ui;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;

/**
 *
 * @author luis
 */
public class Frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Login
     */
    public Frm_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
     
    }

 
    private void login() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        //Esta será mi consulta
        cdb.un_sql = "SELECT * FROM usuario WHERE username='" + JTFUsername.getText() + "' && password = '"+JTFPassword.getText()+"';";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        if (cdb.resultado.next()) {//Si consigo el username con su contraseña registrados en la base de datos, entonces me logueo
            //Si está registrado, entonces muestro mensaje satisfactorio y  me voy a la pantalla principal del programa
            
            Frm_Proveedores fr = new Frm_Proveedores();
            fr.setVisible(true);//Aquí muestro la pantalla principal
            this.setVisible(false);
            
        } else {//Si no está registrado, no entra, y muestra un mensaje de error
            
            JOptionPane.showMessageDialog(null, "Username o password incorrectos, inténtelo de nuevo","Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTFPassword = new javax.swing.JPasswordField();
        panelNice4 = new org.edisoncor.gui.panel.PanelNice();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice3.setBackground(new java.awt.Color(204, 204, 204));
        panelNice3.setAnchoDeBorde(3.0F);
        panelNice3.setBorderColor(new java.awt.Color(51, 51, 51));
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contraseña:");
        panelNice3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Username:");
        panelNice3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));
        panelNice3.add(JTFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelNice3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 120, -1));

        jButton2.setText("Registrarme");
        panelNice3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));
        panelNice3.add(JTFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        jPanel1.add(panelNice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 350, 170));

        panelNice4.setBackground(new java.awt.Color(204, 204, 204));
        panelNice4.setAnchoDeBorde(3.0F);
        panelNice4.setBorderColor(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PANTALLA DE INICIO DE SESIÓN");

        javax.swing.GroupLayout panelNice4Layout = new javax.swing.GroupLayout(panelNice4);
        panelNice4.setLayout(panelNice4Layout);
        panelNice4Layout.setHorizontalGroup(
            panelNice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNice4Layout.setVerticalGroup(
            panelNice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelNice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 630, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            login();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice4;
    // End of variables declaration//GEN-END:variables
}
