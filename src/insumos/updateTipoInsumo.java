package insumos;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyFade;
public class updateTipoInsumo extends javax.swing.JDialog {
    public updateTipoInsumo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lblIdTpInsumoUp.setText(FuncionesInsumo.extraerIDMaxTip());
        txtTipoInsumoUp.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtTipoInsumoUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lblIdTpInsumoUp = new javax.swing.JLabel();
        btnActualizarTipoInsumo = new javax.swing.JButton();
        lblErrorUP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder1);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setCornerSize(20);
        dropShadowBorder2.setShadowOpacity(0.7F);
        dropShadowBorder2.setShadowSize(7);
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        panelShadow1.setBorder(dropShadowBorder2);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipos de Insumos.");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
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

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 419, -1));

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        txtTipoInsumoUp.setForeground(new java.awt.Color(69, 167, 154));
        txtTipoInsumoUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtTipoInsumoUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtTipoInsumoUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtTipoInsumoUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoInsumoUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoInsumoUpKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        lblIdTpInsumoUp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdTpInsumoUp.setForeground(new java.awt.Color(255, 255, 255));
        lblIdTpInsumoUp.setText("ID");

        btnActualizarTipoInsumo.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnActualizarTipoInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTipoInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnActualizarTipoInsumo.setText("Actualizar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnActualizarTipoInsumo.setBorder(dropShadowBorder3);
        btnActualizarTipoInsumo.setContentAreaFilled(false);
        btnActualizarTipoInsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarTipoInsumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarTipoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTipoInsumoActionPerformed(evt);
            }
        });

        lblErrorUP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrorUP.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorUP.setToolTipText("");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorUP, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(txtTipoInsumoUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(btnActualizarTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdTpInsumoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoInsumoUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(lblErrorUP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(btnActualizarTipoInsumo)
                        .addContainerGap())
                    .addComponent(lblIdTpInsumoUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(panelRectTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, -1, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarTipoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTipoInsumoActionPerformed
         String tabla="TIPO_INSUMOS", evento="UPDATE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        if(txtTipoInsumoUp.getText().equals("")){
            lblErrorUP.setText("EL CAMPO ES OBLIGATORIO LLENAR");
        }else{
            SentenciasInsumo s = new SentenciasInsumo();
            s.setID_CATEINSUMO(Integer.parseInt(lblIdTpInsumoUp.getText()));
            s.setTIPO_INSUMO(txtTipoInsumoUp.getText());
            if(FuncionesInsumo.isUpdate(s)){
                FuncionesInsumo.isListar("");
                dispose();
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                new rojerusan.RSNotifyFade("¡HECHO!", "Se Actualizo correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnActualizarTipoInsumoActionPerformed

    private void txtTipoInsumoUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoInsumoUpKeyReleased
        librerias.LetrasMayusculas.convertiraMayusculas(txtTipoInsumoUp);
    }//GEN-LAST:event_txtTipoInsumoUpKeyReleased

    private void txtTipoInsumoUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoInsumoUpKeyTyped
        if(txtTipoInsumoUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar())&&ClaseValidaciones.Espacio(evt.getKeyChar())){
            evt.consume(); 
        }
    }//GEN-LAST:event_txtTipoInsumoUpKeyTyped

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
            java.util.logging.Logger.getLogger(updateTipoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateTipoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateTipoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateTipoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateTipoInsumo dialog = new updateTipoInsumo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTipoInsumo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblErrorUP;
    public static javax.swing.JLabel lblIdTpInsumoUp;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtTipoInsumoUp;
    // End of variables declaration//GEN-END:variables
}
