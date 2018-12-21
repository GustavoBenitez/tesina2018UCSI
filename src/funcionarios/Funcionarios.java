
package funcionarios;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Funcionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
         FuncionesFuncionarios.iscargarTabla("");
         jPopupMenuFun.add(menuFun);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuFun = new javax.swing.JPanel();
        btnEditarFun = new javax.swing.JButton();
        btnEliminarFun = new javax.swing.JButton();
        AgregarUsuario = new javax.swing.JButton();
        jPopupMenuFun = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFun = new rojerusan.RSTableMetro();
        btnNuevo = new rojerusan.RSButtonIconI();
        txtBuscarFun = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        jcbFiltroFun = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        menuFun.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarFun.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEditarFun.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEditarFun.setBorder(dropShadowBorder1);
        btnEditarFun.setContentAreaFilled(false);
        btnEditarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFunActionPerformed(evt);
            }
        });

        btnEliminarFun.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminarFun.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEliminarFun.setBorder(dropShadowBorder2);
        btnEliminarFun.setContentAreaFilled(false);
        btnEliminarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFunActionPerformed(evt);
            }
        });

        AgregarUsuario.setFont(new java.awt.Font("Franklin Gothic Book", 3, 14)); // NOI18N
        AgregarUsuario.setText("Agregar Usuario");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        AgregarUsuario.setBorder(dropShadowBorder3);
        AgregarUsuario.setContentAreaFilled(false);
        AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuFunLayout = new javax.swing.GroupLayout(menuFun);
        menuFun.setLayout(menuFunLayout);
        menuFunLayout.setHorizontalGroup(
            menuFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarFun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminarFun, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
            .addComponent(AgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuFunLayout.setVerticalGroup(
            menuFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFunLayout.createSequentialGroup()
                .addComponent(btnEditarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarUsuario)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información de los Funcionarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  ", "Nombre", "Apellido", "Ciudad", "N° Cedula", "Dirección", "Email", "N° Celular"
            }
        ));
        tablaFun.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaFun.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaFun.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaFun.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaFun.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaFun.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaFun.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaFun.setComponentPopupMenu(jPopupMenuFun);
        tablaFun.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaFun.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaFun.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaFun.setGridColor(new java.awt.Color(153, 153, 153));
        tablaFun.setGrosorBordeFilas(0);
        tablaFun.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane1.setViewportView(tablaFun);
        tablaFun.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaFun.getColumnModel().getColumnCount() > 0) {
            tablaFun.getColumnModel().getColumn(0).setMinWidth(10);
            tablaFun.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnNuevo.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtBuscarFun.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarFun.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscarFun.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarFun.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarFun.setPlaceholder("Buscar....");
        txtBuscarFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarFunKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarFunKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcbFiltroFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Nombre", "Apellido", "Cedula", "Ciudad" }));
        jcbFiltroFun.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroFun.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroFun.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroFun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jcbFiltroFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbFiltroFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder5);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setMaximumSize(new java.awt.Dimension(910, 41));
        btnCerrar.setMinimumSize(new java.awt.Dimension(910, 41));
        btnCerrar.setPreferredSize(new java.awt.Dimension(910, 41));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        registroFuncionario redo = new registroFuncionario(new JFrame(), true);
        redo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFunActionPerformed
       int fila = tablaFun.getSelectedRow();
        SentenciasFuncionarios s = new SentenciasFuncionarios();
        s.setID_FUNCIONARIO(this.tablaFun.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            if (FuncionesFuncionarios.isDelete(s)){
                FuncionesFuncionarios.iscargarTabla("");
                JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarFunActionPerformed

    private void btnEditarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFunActionPerformed
        int fila = Funcionarios.tablaFun.getSelectedRow();
         updateFuncionario upF = new updateFuncionario(new JFrame(), true);
         upF.txtNomFunUp.setText(tablaFun.getValueAt(fila, 1).toString());
         upF.txtApeFunUp.setText(tablaFun.getValueAt(fila, 2).toString());
         upF.jcbCiudadesFunUp.setSelectedItem(tablaFun.getValueAt(fila, 3).toString());
         upF.txtCiFunUp.setText(tablaFun.getValueAt(fila, 4).toString());
         upF.txtDirecUp.setText(tablaFun.getValueAt(fila, 5).toString());
         upF.txtEmailUp.setText(tablaFun.getValueAt(fila, 6).toString());
         upF.txtCeluUp.setText(tablaFun.getValueAt(fila, 7).toString());
         upF.lblIdFunUp.setText(tablaFun.getValueAt(fila, 0).toString());
         FuncionesFuncionarios.iscargarTabla("");
         upF.setVisible(true);
    }//GEN-LAST:event_btnEditarFunActionPerformed

    private void txtBuscarFunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFunKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarFunKeyTyped

    private void txtBuscarFunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarFunKeyReleased
         FuncionesFuncionarios.isBuscarDatos(this.txtBuscarFun.getText(), jcbFiltroFun.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarFunKeyReleased

    private void AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioActionPerformed
        registroUsuario regIns = new registroUsuario(new JFrame(), true);
        String name = "", id = "", nom="", ape="";
        int fila = tablaFun.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");         
        }
         id =  (String)tablaFun.getValueAt(fila, 0);
         nom = (String) tablaFun.getValueAt(fila, 1);
         ape = (String) tablaFun.getValueAt(fila, 2);
         name = nom+" "+ape;
         registroUsuario.lblTituloUsuario.setText(name);
         registroUsuario.idFun.setText(id);
         jPopupMenuFun.setVisible(false);
         
         regIns.setVisible(true);
    }//GEN-LAST:event_AgregarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarUsuario;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditarFun;
    private javax.swing.JButton btnEliminarFun;
    private rojerusan.RSButtonIconI btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenuFun;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSComboMetro jcbFiltroFun;
    private javax.swing.JPanel menuFun;
    public static rojerusan.RSTableMetro tablaFun;
    public static rojerusan.RSMetroTextFullPlaceHolder txtBuscarFun;
    // End of variables declaration//GEN-END:variables
}
