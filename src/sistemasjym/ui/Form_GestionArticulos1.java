/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasjym.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import sistemasjym.controlador.ControladorProveedor;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;

/**
 *
 * @author luis
 */
public class Form_GestionArticulos1 extends javax.swing.JFrame {

   
    private TableRowSorter trsfiltro;
    String filtro;
    
    public Form_GestionArticulos1() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Gestión de Artículos");
        
        
        
        cargarArticulos();
        
        JTFBuscador.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (JTFBuscador.getText())/*.toUpperCase()*/;
                JTFBuscador.setText(cadena);
                repaint();
                filtro();
            }
        });
        
    }



    
    
    
     public void filtro() {//Con este método asigno la columna o dato por el que quiero filtrar mi jtable
        filtro = JTFBuscador.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(JTFBuscador.getText(), 2));
        //En este caso estoy filtrando por el dato en la posición 2, que es la razón social
    }
    
    
    public void cargarArticulos(){
        DefaultTableModel m;
        try {
            String titulo[]={"Número","Código","Nombre","Descripción","Categoría","Color","Talla","Últ. Envío","Últ. Devolución","Cantidad Total","Cantidad Rodamil","Cantidad Espera","Fecha Registro"};
            m= new DefaultTableModel(null, titulo);
            JTable p = new JTable(m);
            TBLArticulos.getTableHeader().setReorderingAllowed(false) ;
            String fila[]= new String[14];//creo vector donde voy a meter los registros en la tabla
            Conexion cdb= ConectarServicio.getInstancia().getConexionDb();//Me conecto con la base de datos            
            cdb.un_sql="select * from stock";//selecciono todos de la tabla artículo
            cdb.resultado= cdb.us_st.executeQuery(cdb.un_sql);//ejecuto la consulta
            int index =1;//Creo un campo para el index
            
            while(cdb.resultado.next()){
                fila[0]=String.valueOf(index);//Valor del index en primera columna
                fila[1]= cdb.resultado.getString(1);
                fila[2]= cdb.resultado.getString(2);
                fila[3]= cdb.resultado.getString(3);
                fila[4]= cdb.resultado.getString(4);
                fila[5]= cdb.resultado.getString(5);
                fila[6]= cdb.resultado.getString(6);
                fila[7]= cdb.resultado.getString(7);
                fila[8]= cdb.resultado.getString(8);
                fila[9]= cdb.resultado.getString(9);
                fila[10]= cdb.resultado.getString(10);
                fila[11]= cdb.resultado.getString(11);
                fila[12]= cdb.resultado.getString(12);
                
                m.addRow(fila);
                index++;
            }
            TBLArticulos.setModel(m);
            TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(m);//Para ordenar por la columna que se toque
            TBLArticulos.setRowSorter(ordenar);
            this.TBLArticulos.setModel(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla","Error",JOptionPane.ERROR_MESSAGE);
        }
    } 
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLArticulos = new javax.swing.JTable();
        JTFBuscador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        TBLArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBLArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBLArticulosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TBLArticulos);

        JTFBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFBuscadorKeyTyped(evt);
            }
        });

        jLabel10.setText("BUSCAR:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Gestión de inventario");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Enviar/Devolver");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });

        jMenuItem3.setText("Agregar Artículo");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Modificar Artículo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Eliminar Artículo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historial");

        jMenuItem6.setText("Envíos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Devoluciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void JTFBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBuscadorKeyTyped
       
        trsfiltro = new TableRowSorter(TBLArticulos.getModel());
        TBLArticulos.setRowSorter(trsfiltro);
        //Aquí aplico el filtro mientras voy escribiendo en el campo
        
    }//GEN-LAST:event_JTFBuscadorKeyTyped

    private void TBLArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLArticulosMousePressed
       
    }//GEN-LAST:event_TBLArticulosMousePressed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked

        
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        
        
        
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                
        SubForm_Agregar fr = new SubForm_Agregar();
        fr.setVisible(true);
                
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed

    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        int clie = -1;
        clie = this.TBLArticulos.getSelectedRow();

        
        if (clie != -1){
            //Asigno valores de tabla a variables
            String codigo = (TBLArticulos.getValueAt(clie, 1).toString());
            String nombre = (TBLArticulos.getValueAt(clie, 2).toString());
            String descripcion = (TBLArticulos.getValueAt(clie, 3).toString());
            String categoria = (String) (TBLArticulos.getValueAt(clie, 4));
            String color = (String) (TBLArticulos.getValueAt(clie, 5));
            String talla = (String) TBLArticulos.getValueAt(clie, 6);
            String fechaafabrica = (String) TBLArticulos.getValueAt(clie, 7);
            String fechaaempresa = (String) TBLArticulos.getValueAt(clie, 8);//No se ha devuelto a la empresa
            String cantidadtotal = (String) TBLArticulos.getValueAt(clie, 9);
            String cantidaddisponible = (String) TBLArticulos.getValueAt(clie, 10);
            String cantidadenespera = (String) TBLArticulos.getValueAt(clie, 11);
            String fechaderegistro = (String) TBLArticulos.getValueAt(clie, 12);
            
            //String fechaafabrica = String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.YEAR));

            //Paso por parametros los valores de la tabla a el subform
            SubForm_Modificar fr = new SubForm_Modificar(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            fr.setVisible(true); 
        }else{
        
            JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
        
        }
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        int clie = -1;
        clie = this.TBLArticulos.getSelectedRow();

            //Asigno valores de tabla a variables
        if (clie != -1){
        try {
            String codigo = (TBLArticulos.getValueAt(clie, 1).toString());    
          
            ControladorArticulo ca = new ControladorArticulo();
            ca.eliminarArticulo(codigo);
            cargarArticulos();          
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Error en la eliminacion del registro","Error",JOptionPane.ERROR_MESSAGE);
        }
        }else{
           
            JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
            
        }
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        Form_EnviarAProcesar fr = new Form_EnviarAProcesar();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        Form_HistorialEnvios fr = new Form_HistorialEnvios();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        Form_HistorialDevoluciones fr = new Form_HistorialDevoluciones();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    
    
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
            java.util.logging.Logger.getLogger(Form_GestionArticulos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_GestionArticulos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_GestionArticulos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_GestionArticulos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_GestionArticulos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFBuscador;
    private javax.swing.JTable TBLArticulos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
