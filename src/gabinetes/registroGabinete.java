package gabinetes;

import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

/**
 *
 * @author Gustavo
 */
public class registroGabinete extends javax.swing.JDialog {
    public registroGabinete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesGabinete.codigos();
        lblIdGabinete.setText(FuncionesGabinete.extraerIDMax());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtCodGab = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIdGabinete = new javax.swing.JLabel();
        btnGuardarGabinete = new javax.swing.JButton();
        jcbHabilitado = new rojerusan.RSComboMetro();
        lblError = new javax.swing.JLabel();
        jcbEnuso = new rojerusan.RSComboMetro();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("registroGabinete"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("Gabinetes.");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 460, 90));

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        txtCodGab.setForeground(new java.awt.Color(69, 167, 154));
        txtCodGab.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCodGab.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCodGab.setPhColor(new java.awt.Color(71, 120, 197));
        txtCodGab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodGabKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodGabKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Habilitado:");

        lblIdGabinete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdGabinete.setForeground(new java.awt.Color(255, 255, 255));
        lblIdGabinete.setText("ID");

        btnGuardarGabinete.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnGuardarGabinete.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarGabinete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnGuardarGabinete.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnGuardarGabinete.setBorder(dropShadowBorder3);
        btnGuardarGabinete.setContentAreaFilled(false);
        btnGuardarGabinete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarGabinete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarGabinete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGabineteActionPerformed(evt);
            }
        });

        jcbHabilitado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Si", "No" }));
        jcbHabilitado.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbHabilitado.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbHabilitado.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbHabilitado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabilitadoActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jcbEnuso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Si", "No" }));
        jcbEnuso.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbEnuso.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbEnuso.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbEnuso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEnuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEnusoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("En USO:");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnGuardarGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodGab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbHabilitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbEnuso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(txtCodGab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbHabilitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbEnuso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnGuardarGabinete)))
                .addContainerGap())
        );

        jPanel1.add(panelRectTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCodGabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodGabKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodGabKeyReleased

    private void txtCodGabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodGabKeyTyped
      if(txtCodGab.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCodGabKeyTyped

    private void btnGuardarGabineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGabineteActionPerformed
        String tabla="GABINETE", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        if(txtCodGab.getText().equals("") || jcbHabilitado.getSelectedIndex()==0 ||jcbEnuso.getSelectedIndex()==0){
            lblError.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
        }else{
         SentenciasGabinete s = new SentenciasGabinete();
          s.setCODIGO(txtCodGab.getText());
          s.setHABILITADO(jcbHabilitado.getSelectedItem().toString());
          s.setENUSO(jcbEnuso.getSelectedItem().toString());
          s.setID_GABINETE(lblIdGabinete.getText()); 
          if(FuncionesGabinete.isRegistrar(s)){
              FuncionesGabinete.isListar("");
              lblIdGabinete.setText(FuncionesGabinete.extraerIDMax());
              FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
              dispose();
              JOptionPane.showMessageDialog(this, "Se Guardo con Exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
          }else{
            JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);  
          }
        }
    }//GEN-LAST:event_btnGuardarGabineteActionPerformed

    private void jcbHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHabilitadoActionPerformed

    private void jcbEnusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEnusoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEnusoActionPerformed

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
            java.util.logging.Logger.getLogger(registroGabinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroGabinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroGabinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroGabinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroGabinete dialog = new registroGabinete(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardarGabinete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbEnuso;
    public static rojerusan.RSComboMetro jcbHabilitado;
    public static javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIdGabinete;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCodGab;
    // End of variables declaration//GEN-END:variables
}
