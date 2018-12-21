package academicos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

/**
 *
 * @author Gustavo
 */
public class tipoPuntaje extends javax.swing.JInternalFrame {

    public tipoPuntaje() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesTipoPuntajes.isListar("");
        jPopupMenuTP.add(menuTipoPuntaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTipoPuntaje = new javax.swing.JPanel();
        btnEditarTP = new javax.swing.JButton();
        btnEliminarTP = new javax.swing.JButton();
        jPopupMenuTP = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoPuntaje = new rojerusan.RSTableMetro();
        txtBuscarTipo = new rojerusan.RSMetroTextFullPlaceHolder();
        btnNuevoTipo = new rojerusan.RSButtonIconI();
        jLabel1 = new javax.swing.JLabel();

        menuTipoPuntaje.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarTP.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEditarTP.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEditarTP.setBorder(dropShadowBorder1);
        btnEditarTP.setContentAreaFilled(false);
        btnEditarTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTPActionPerformed(evt);
            }
        });

        btnEliminarTP.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminarTP.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEliminarTP.setBorder(dropShadowBorder2);
        btnEliminarTP.setContentAreaFilled(false);
        btnEliminarTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuTipoPuntajeLayout = new javax.swing.GroupLayout(menuTipoPuntaje);
        menuTipoPuntaje.setLayout(menuTipoPuntajeLayout);
        menuTipoPuntajeLayout.setHorizontalGroup(
            menuTipoPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTipoPuntajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuTipoPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTP, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuTipoPuntajeLayout.setVerticalGroup(
            menuTipoPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTipoPuntajeLayout.createSequentialGroup()
                .addComponent(btnEditarTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarTP))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder3);
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 89));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información sobre el  Tipo de Puntaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Century Schoolbook", 3, 24))); // NOI18N

        tablaTipoPuntaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "  ", "Tipo de Puntaje"
            }
        ));
        tablaTipoPuntaje.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaTipoPuntaje.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaTipoPuntaje.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaTipoPuntaje.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaTipoPuntaje.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaTipoPuntaje.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaTipoPuntaje.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaTipoPuntaje.setComponentPopupMenu(jPopupMenuTP);
        tablaTipoPuntaje.setGrosorBordeFilas(0);
        tablaTipoPuntaje.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane1.setViewportView(tablaTipoPuntaje);
        if (tablaTipoPuntaje.getColumnModel().getColumnCount() > 0) {
            tablaTipoPuntaje.getColumnModel().getColumn(0).setMinWidth(10);
            tablaTipoPuntaje.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        txtBuscarTipo.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarTipo.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscarTipo.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarTipo.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarTipo.setPlaceholder("Buscar");
        txtBuscarTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTipoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarTipoKeyTyped(evt);
            }
        });

        btnNuevoTipo.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevoTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevoTipo.setText("Nuevo");
        btnNuevoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTipoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(353, 353, 353)
                        .addComponent(txtBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTipoActionPerformed
        registrotipoPuntaje retipu = new registrotipoPuntaje(new JFrame(), true);
        retipu.setVisible(true);
    }//GEN-LAST:event_btnNuevoTipoActionPerformed

    private void txtBuscarTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoKeyTyped
       char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarTipoKeyTyped

    private void txtBuscarTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoKeyReleased
        FuncionesTipoPuntajes.isListar(this.txtBuscarTipo.getText());
    }//GEN-LAST:event_txtBuscarTipoKeyReleased

    private void btnEliminarTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTPActionPerformed
        int fila = tablaTipoPuntaje.getSelectedRow();
         String tabla="TIPO DE PUNTAJES", evento="DELETE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        SentenciasTipoPuntajes s = new SentenciasTipoPuntajes();
        s.setID_TIPOPUNTAJE(tipoPuntaje.tablaTipoPuntaje.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
        if (FuncionesTipoPuntajes.isDelete(s)){
            FuncionesTipoPuntajes.isListar("");
            FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
            JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnEliminarTPActionPerformed

    private void btnEditarTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTPActionPerformed
       int fila = tipoPuntaje.tablaTipoPuntaje.getSelectedRow();
         updatetipoPuntaje upTP = new updatetipoPuntaje(new JFrame(), true);
         upTP.txtTipoPuntajeUp.setText(tablaTipoPuntaje.getValueAt(fila, 1).toString());
         upTP.lblIdTipoUp.setText(tablaTipoPuntaje.getValueAt(fila, 0).toString());
         FuncionesTipoPuntajes.isListar("");
         upTP.setVisible(true);
    }//GEN-LAST:event_btnEditarTPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditarTP;
    private javax.swing.JButton btnEliminarTP;
    private rojerusan.RSButtonIconI btnNuevoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenuTP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuTipoPuntaje;
    public static rojerusan.RSTableMetro tablaTipoPuntaje;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarTipo;
    // End of variables declaration//GEN-END:variables
}
