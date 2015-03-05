/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasjym.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import sistemasjym.controlador.ControladorArticulo;
import sistemasjym.servicios.ConectarServicio;
import sistemasjym.servicios.Conexion;

/**
 *
 * @author luis
 */
public class Form_EnviarAProcesar extends javax.swing.JFrame {

    
    private TableRowSorter trsfiltro;
    String filtro;
    
    
    public Form_EnviarAProcesar() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Enviar/Devolver");
        
        
        JTFCodigo.setEditable(false);
        JTFNombre.setEditable(false);
        JTFDescripcion.setEditable(false);
        JTFCategoria.setEditable(false);
        JTFColor.setEditable(false);
        JTFTalla.setEditable(false);
        JTFCantidadTotal.setEditable(false);
        JTFCantidadRodamil.setEditable(false);
        JTFCantidadEspera.setEditable(false);
        JTFFechaRegistro.setEditable(false);
        
        
        
        
        
        cargarArticulos();//lleno la tabla
        
        
        
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
    
    


    
    public void cargarArticulos(){
        
  
        DefaultTableModel m;
        try {
            String titulo[]={"Número","Código","Nombre","Descripción","Categoría","Color","Talla","Últ. Envío","Últ. Devolución","Cantidad Total","Cantidad Rodamil","Cantidad Espera","Fecha Registro"};
           
            m= new DefaultTableModel(null, titulo){
            
                @Override
                 public boolean isCellEditable (int fila, int columna) {
                    return false;
                }
            
            };//Así hago que la tabla no se pueda editar
            

            JTable p = new JTable(m);
            TBLArticulos.getTableHeader().setReorderingAllowed(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Jlabelfecharegistro = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFDescripcion = new javax.swing.JTextField();
        JTFCategoria = new javax.swing.JTextField();
        JTFColor = new javax.swing.JTextField();
        JTFTalla = new javax.swing.JTextField();
        JTFCantidadRodamil = new javax.swing.JTextField();
        JTFCantidadTotal = new javax.swing.JTextField();
        JTFFechaRegistro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTFCantidadEspera = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLArticulos = new javax.swing.JTable();
        JTFBuscador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Código:");

        jLabel6.setText("Talla:");

        jLabel7.setText("Cantidad Rodamil:");

        jLabel4.setText("Categoría:");

        jLabel5.setText("Color:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jLabel11.setText("Cantidad total:");

        Jlabelfecharegistro.setText("Fecha de Registro:");

        jLabel12.setText("Cantidad Espera:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFCantidadRodamil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCantidadEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlabelfecharegistro)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFCantidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCantidadRodamil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(JTFCantidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(Jlabelfecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(JTFCantidadEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Aquí puedes registrar los envíos de los artículos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

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

        jButton1.setText("Enviar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Devolver ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(JTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Gestión de inventario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Enviar/Devolver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");

        jMenuItem3.setText("Enviar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Devolver");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historial");

        jMenuItem5.setText("Envíos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Devoluciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBLArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLArticulosMousePressed

        int clie = this.TBLArticulos.getSelectedRow();
        try {
            this.JTFCodigo.setText(TBLArticulos.getValueAt(clie, 1).toString());
            this.JTFNombre.setText(TBLArticulos.getValueAt(clie, 2).toString());
            this.JTFDescripcion.setText(TBLArticulos.getValueAt(clie, 3).toString());
            this.JTFCategoria.setText((String) TBLArticulos.getValueAt(clie, 4));
            this.JTFColor.setText((String) TBLArticulos.getValueAt(clie, 5));
            this.JTFTalla.setText((String) TBLArticulos.getValueAt(clie, 6));
            this.JTFCantidadTotal.setText((String) TBLArticulos.getValueAt(clie, 9));
            this.JTFCantidadRodamil.setText((String) TBLArticulos.getValueAt(clie, 10));
            this.JTFCantidadEspera.setText((String) TBLArticulos.getValueAt(clie, 11));
            this.JTFFechaRegistro.setText((String) TBLArticulos.getValueAt(clie, 12));

           
            
//            try {
//            SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
//            java.util.Date fechaDate = formato.parse((String) TBLArticulos.getValueAt(clie, 12));
//            JDFechaDeRegistro.setDate(fechaDate);
//            } catch (ParseException ex) {
//               JDFechaDeRegistro.setDate(null);
//            }
            
            //String fechaafabrica = new SimpleDateFormat("dd/MM/yyyy").format(JDFechaAFabrica.getDate());//Aquí obtengo la fecha del jdatechooser, y si no es del formato, la coloco vacía

            //String fechaafabrica = String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.YEAR));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_TBLArticulosMousePressed

    
    public void filtro() {//Con este método asigno la columna o dato por el que quiero filtrar mi jtable
        filtro = JTFBuscador.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(JTFBuscador.getText(), 2));
        //En este caso estoy filtrando por el dato en la posición 2, que es la razón social
    }
    
    
    private void JTFBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBuscadorKeyTyped

        trsfiltro = new TableRowSorter(TBLArticulos.getModel());
        TBLArticulos.setRowSorter(trsfiltro);
        //Aquí aplico el filtro mientras voy escribiendo en el campo

    }//GEN-LAST:event_JTFBuscadorKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int clie = -1;
         clie = this.TBLArticulos.getSelectedRow();
   
            if(clie != -1){
                
            //Asigno valores de tabla a variables
            String codigo = TBLArticulos.getValueAt(clie, 1).toString();
            String nombre = TBLArticulos.getValueAt(clie, 2).toString();
            String descripcion = TBLArticulos.getValueAt(clie, 3).toString();
            String categoria = TBLArticulos.getValueAt(clie, 4).toString();
            String color = TBLArticulos.getValueAt(clie, 5).toString();
            String talla = TBLArticulos.getValueAt(clie, 6).toString();
            String fechaafabrica = (String) TBLArticulos.getValueAt(clie, 7);//No se ha devuelto a la empresa  
            String fechaaempresa = (String) TBLArticulos.getValueAt(clie, 8);
            String cantidadtotal = TBLArticulos.getValueAt(clie, 9).toString();
            String cantidaddisponible = TBLArticulos.getValueAt(clie, 10).toString();
            String cantidadenespera = TBLArticulos.getValueAt(clie, 11).toString();  
            String fechaderegistro = (String) TBLArticulos.getValueAt(clie, 12);//No se ha devuelto a la empresa
            
            

            //Paso por parametros los valores de la tabla a el subform
            SubForm_Enviar fr = new SubForm_Enviar(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            fr.setVisible(true);
            }else{
                
                JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
                
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int clie= -1;
        clie = this.TBLArticulos.getSelectedRow();
   
            
        if (clie != -1){
            
             //Asigno valores de tabla a variables
            String codigo = TBLArticulos.getValueAt(clie, 1).toString();
            String nombre = TBLArticulos.getValueAt(clie, 2).toString();
            String descripcion = TBLArticulos.getValueAt(clie, 3).toString();
            String categoria = TBLArticulos.getValueAt(clie, 4).toString();
            String color = TBLArticulos.getValueAt(clie, 5).toString();
            String talla = TBLArticulos.getValueAt(clie, 6).toString();
            String fechaafabrica = (String) TBLArticulos.getValueAt(clie, 7);//No se ha devuelto a la empresa  
            String fechaaempresa = (String) TBLArticulos.getValueAt(clie, 8);
            String cantidadtotal = TBLArticulos.getValueAt(clie, 9).toString();
            String cantidaddisponible = TBLArticulos.getValueAt(clie, 10).toString();
            String cantidadenespera = TBLArticulos.getValueAt(clie, 11).toString();  
            String fechaderegistro = (String) TBLArticulos.getValueAt(clie, 12);//No se ha devuelto a la empresa
            

            //Paso por parametros los valores de la tabla a el subform
            SubForm_Devolver fr = new SubForm_Devolver(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            fr.setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
            
        }

            
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

   
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        Form_GestionArticulos1 fr = new Form_GestionArticulos1();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        
        int clie = -1;
        clie = this.TBLArticulos.getSelectedRow();
   
            
        if (clie != -1){
            
             //Asigno valores de tabla a variables
            String codigo = TBLArticulos.getValueAt(clie, 1).toString();
            String nombre = TBLArticulos.getValueAt(clie, 2).toString();
            String descripcion = TBLArticulos.getValueAt(clie, 3).toString();
            String categoria = TBLArticulos.getValueAt(clie, 4).toString();
            String color = TBLArticulos.getValueAt(clie, 5).toString();
            String talla = TBLArticulos.getValueAt(clie, 6).toString();
            String fechaafabrica = (String) TBLArticulos.getValueAt(clie, 7);//No se ha devuelto a la empresa  
            String fechaaempresa = (String) TBLArticulos.getValueAt(clie, 8);
            String cantidadtotal = TBLArticulos.getValueAt(clie, 9).toString();
            String cantidaddisponible = TBLArticulos.getValueAt(clie, 10).toString();
            String cantidadenespera = TBLArticulos.getValueAt(clie, 11).toString();  
            String fechaderegistro = (String) TBLArticulos.getValueAt(clie, 12);//No se ha devuelto a la empresa
            
            
            
            
            //String fechaafabrica = String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(JDFechaAFabrica.getCalendar().get(Calendar.YEAR));

            //Paso por parametros los valores de la tabla a el subform
            SubForm_Enviar fr = new SubForm_Enviar(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            fr.setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
            
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
        
        int clie = -1;
        clie = this.TBLArticulos.getSelectedRow();
   
            
        if(clie != -1){
             //Asigno valores de tabla a variables
            String codigo = TBLArticulos.getValueAt(clie, 1).toString();
            String nombre = TBLArticulos.getValueAt(clie, 2).toString();
            String descripcion = TBLArticulos.getValueAt(clie, 3).toString();
            String categoria = TBLArticulos.getValueAt(clie, 4).toString();
            String color = TBLArticulos.getValueAt(clie, 5).toString();
            String talla = TBLArticulos.getValueAt(clie, 6).toString();
            String fechaafabrica = (String) TBLArticulos.getValueAt(clie, 7);//No se ha devuelto a la empresa  
            String fechaaempresa = (String) TBLArticulos.getValueAt(clie, 8);
            String cantidadtotal = TBLArticulos.getValueAt(clie, 9).toString();
            String cantidaddisponible = TBLArticulos.getValueAt(clie, 10).toString();
            String cantidadenespera = TBLArticulos.getValueAt(clie, 11).toString();  
            String fechaderegistro = (String) TBLArticulos.getValueAt(clie, 12);//No se ha devuelto a la empresa
            
            
            
            //Paso por parametros los valores de la tabla a el subform
            SubForm_Devolver fr = new SubForm_Devolver(codigo, nombre, descripcion, categoria, color, talla, fechaafabrica, fechaaempresa, cantidadtotal, cantidaddisponible, cantidadenespera, fechaderegistro);
            fr.setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(null, "Debes seleccionar un artículo en la tabla para realizar esta acción");
            
        }
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        Form_HistorialDevoluciones fr = new Form_HistorialDevoluciones();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        Form_HistorialEnvios fr = new Form_HistorialEnvios();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_EnviarAProcesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_EnviarAProcesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_EnviarAProcesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_EnviarAProcesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_EnviarAProcesar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFBuscador;
    private javax.swing.JTextField JTFCantidadEspera;
    private javax.swing.JTextField JTFCantidadRodamil;
    private javax.swing.JTextField JTFCantidadTotal;
    private javax.swing.JTextField JTFCategoria;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFColor;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFFechaRegistro;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFTalla;
    private javax.swing.JLabel Jlabelfecharegistro;
    private javax.swing.JTable TBLArticulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
