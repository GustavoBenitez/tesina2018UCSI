
package proveedores;

import javax.swing.JFrame;

/**
 *
 * @author Gustavo
 */
public class Proveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesProveedor.iscargarTabla("");
        jPopupMenu1.add(menuPro);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPro = new javax.swing.JPanel();
        btnEitarPro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new rojerusan.RSTableMetro();
        btnNuevo = new rojerusan.RSButtonIconI();
        txtBuscartProv = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        rSComboMetro1 = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        menuPro.setBackground(new java.awt.Color(255, 255, 255));

        btnEitarPro.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEitarPro.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEitarPro.setBorder(dropShadowBorder1);
        btnEitarPro.setContentAreaFilled(false);
        btnEitarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEitarProActionPerformed(evt);
            }
        });

        btnEliminarPro.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminarPro.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEliminarPro.setBorder(dropShadowBorder2);
        btnEliminarPro.setContentAreaFilled(false);
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuProLayout = new javax.swing.GroupLayout(menuPro);
        menuPro.setLayout(menuProLayout);
        menuProLayout.setHorizontalGroup(
            menuProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEitarPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        menuProLayout.setVerticalGroup(
            menuProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProLayout.createSequentialGroup()
                .addComponent(btnEitarPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPro))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder3, "Información de los Proveedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  ", "Ciudad", "Nombre", "Apellido", "Ruc", "Cedula", "Dirección", "Email", "N° Celular"
            }
        ));
        tablaProveedor.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaProveedor.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaProveedor.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaProveedor.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaProveedor.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaProveedor.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaProveedor.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaProveedor.setComponentPopupMenu(jPopupMenu1);
        tablaProveedor.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaProveedor.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaProveedor.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaProveedor.setGridColor(new java.awt.Color(153, 153, 153));
        tablaProveedor.setGrosorBordeFilas(0);
        jScrollPane1.setViewportView(tablaProveedor);
        tablaProveedor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaProveedor.getColumnModel().getColumnCount() > 0) {
            tablaProveedor.getColumnModel().getColumn(0).setMinWidth(10);
            tablaProveedor.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnNuevo.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtBuscartProv.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscartProv.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscartProv.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscartProv.setPhColor(new java.awt.Color(71, 120, 197));
        txtBuscartProv.setPlaceholder("Buscar....");
        txtBuscartProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscartProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscartProvKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        rSComboMetro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Nombre", "Apellido", "Cedula", "Ciudad" }));
        rSComboMetro1.setColorArrow(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setColorBorde(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setColorFondo(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscartProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscartProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(rSComboMetro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder4);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(862, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 580, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        registroProveedor redo = new registroProveedor(new JFrame(), true);
        redo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscartProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscartProvKeyTyped
         char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscartProvKeyTyped

    private void txtBuscartProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscartProvKeyReleased
        FuncionesProveedor.iscargarTabla(this.txtBuscartProv.getText());
    }//GEN-LAST:event_txtBuscartProvKeyReleased

    private void btnEitarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEitarProActionPerformed
        int fila = Proveedores.tablaProveedor.getSelectedRow();
         updateProveedor upF = new updateProveedor(new JFrame(), true);
         upF.jcbCiudadesProUp.setSelectedItem(tablaProveedor.getValueAt(fila, 1).toString());
         upF.txtNomProUp.setText(tablaProveedor.getValueAt(fila, 2).toString());
         upF.txtApeProUp.setText(tablaProveedor.getValueAt(fila, 3).toString());
         upF.txtRucProUp.setText(tablaProveedor.getValueAt(fila, 4).toString());
         upF.txtCedulaProUp.setText(tablaProveedor.getValueAt(fila, 5).toString());
         upF.txtDirecPro.setText(tablaProveedor.getValueAt(fila, 6).toString());
         upF.txtEmailProUP.setText(tablaProveedor.getValueAt(fila, 7).toString());
         upF.txtCeluProUp.setText(tablaProveedor.getValueAt(fila, 8).toString());
         upF.lblIdProUp.setText(tablaProveedor.getValueAt(fila, 0).toString());
         FuncionesProveedor.iscargarTabla("");
         upF.setVisible(true);
    }//GEN-LAST:event_btnEitarProActionPerformed

    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEitarPro;
    private javax.swing.JButton btnEliminarPro;
    private rojerusan.RSButtonIconI btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPro;
    private rojerusan.RSComboMetro rSComboMetro1;
    public static rojerusan.RSTableMetro tablaProveedor;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscartProv;
    // End of variables declaration//GEN-END:variables
}
