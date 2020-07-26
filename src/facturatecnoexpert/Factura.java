
package facturatecnoexpert;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HOLLROJM
 */
public class Factura extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel ();
    
    public Factura() {
        initComponents();
        String[] titulo = new String [] {"Artículo", "Fabricante", "Cantidad","Precio U", "Subtotal", "Total"};
        dtm.setColumnIdentifiers(titulo);
        tblProductos.setModel(dtm);
    }
    void agregar (){
        dtm.addRow(new Object[]{
            txtArticulo.getText(), 
            cbxProducto.getSelectedItem(),
            txtCant.getText(), 
            txtVuni.getText(),  
            txtSubtotal.getText(),
            lblTotalf.getText(),
                
    });
    
    }
        void limpiar(){
        txtArticulo.setText("");
            txtCant.setText("");
            txtIva.setText("");
            txtVuni.setText("");
            txtSubtotal.setText("");
            lblTotalf.setText("");
    }
        void eliminarFila (){
            tblProductos.getModel();
            dtm.removeRow(tblProductos.getSelectedRow());
            
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIva3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        lblVuni = new javax.swing.JLabel();
        txtVuni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        lblProducto = new javax.swing.JLabel();
        cbxProducto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarDescripcion = new javax.swing.JTextArea();
        lblIva = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblAran = new javax.swing.JLabel();
        txtAranf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblTotalf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblFactura.setText("Factura No");

        txtFactura.setText("0001");
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("TECNOEXPERT.");

        lblArticulo.setText("Nombre del Artículo :");

        lblVuni.setText("Valor Uni. :");

        txtVuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVuniActionPerformed(evt);
            }
        });

        jLabel2.setText("Cant. :");

        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantFocusLost(evt);
            }
        });
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });

        lblProducto.setText("Fabricante :");

        cbxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NACIONAL", "IMPORTADO" }));
        cbxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDescripcion.setText("Descripción: ");

        txtarDescripcion.setColumns(20);
        txtarDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtarDescripcion);

        lblIva.setText("IVA (19%)");

        txtIva.setEnabled(false);
        txtIva.setFocusable(false);
        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });

        lblSubtotal.setText("SUBTOTAL:");

        txtSubtotal.setEnabled(false);
        txtSubtotal.setFocusable(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });

        lblAran.setText("ARANCEL (5%) :");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setText("TOTAL:");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblTotalf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblTotalf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 73, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIva)
                                .addGap(13, 13, 13)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSubtotal)
                                .addGap(9, 9, 9)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAran)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAranf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblDescripcion)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblSubtotal))
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblAran))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAranf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setText("LISTA DE PRODUCTOS");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblProductos);

        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(lblArticulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(lblVuni)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtVuni, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel2)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProducto)
                                    .addGap(17, 17, 17)
                                    .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(196, 196, 196)
                                    .addComponent(jLabel3)
                                    .addGap(32, 32, 32)
                                    .addComponent(jButton3)
                                    .addGap(9, 9, 9)
                                    .addComponent(jButton2))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblFactura))
                        .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblArticulo))
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVuni)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblProducto)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
  
        
    }//GEN-LAST:event_txtCantActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
           
    }//GEN-LAST:event_txtIvaActionPerformed

    private void cbxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductoActionPerformed
   String producto = cbxProducto.getSelectedItem().toString();
    if (producto.equals("NACIONAL")){
        String valor = txtVuni.getText();
        String cantidad =txtCant.getText();
        double iva = (((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))*0.19);
        double subtotal = ((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))+ (((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))*0.19);
        double total = subtotal;
        
        String totalIva = String.valueOf(iva);       
        String subtotalString = String.valueOf(subtotal);
        String totalFinal = String.valueOf(total);
              
        txtIva.setText("$ " + totalIva);
        lblTotalf.setText( "$ " + subtotalString);
        txtSubtotal.setText("$ " + subtotalString);
        lblTotalf.setText("$ " + totalFinal);
        txtAranf.setText(" ");
        System.out.println(iva);
           }else {
        String valor = txtVuni.getText();
        String cantidad =txtCant.getText();
        double iva = (((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))*0.19);
        double subtotal = ((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))+ (((Double.parseDouble(valor))*(Double.parseDouble(cantidad)))*0.19);
        double totalAran = subtotal * 0.05;
        double total = subtotal + totalAran;
        String totalArancel =String.valueOf(totalAran);
        String totalIva = String.valueOf(iva);       
        String subtotalString = String.valueOf(subtotal);
        String totalFinal = String.valueOf(total);
        
        
        txtIva.setText("$ " + totalIva);
        lblTotalf.setText( "$ " + subtotalString);
        txtAranf.setText("$ " + totalArancel ); 
        txtSubtotal.setText("$ " + subtotalString);
        lblTotalf.setText("$ " + totalFinal);
    }
        
    }//GEN-LAST:event_cbxProductoActionPerformed

    private void txtVuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVuniActionPerformed
       
          
    }//GEN-LAST:event_txtVuniActionPerformed

    private void txtCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusLost
          
    }//GEN-LAST:event_txtCantFocusLost

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregar();
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminarFila ();
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAran;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalf;
    private javax.swing.JLabel lblVuni;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel txtAranf;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtIva3;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtVuni;
    private javax.swing.JTextArea txtarDescripcion;
    // End of variables declaration//GEN-END:variables
}
