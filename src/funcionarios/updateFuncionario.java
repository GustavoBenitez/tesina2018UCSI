
package funcionarios;

import academicos.updatetipoPuntaje;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

/**
 *
 * @author Gustavo
 */
public class updateFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form updateFuncionario
     */
    public updateFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesFuncionarios.isCargarFunUp();
        lblIdFunUp.setText(FuncionesFuncionarios.extraerIDMax());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNomFunUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lblIdFunUp = new javax.swing.JLabel();
        txtCiFunUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApeFunUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDirecUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEmailUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCeluUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jcbCiudadesFunUp = new rojerusan.RSComboMetro();
        jLabel11 = new javax.swing.JLabel();
        btnActualizarrFun = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder1);

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setCornerSize(20);
        dropShadowBorder2.setShadowOpacity(0.7F);
        dropShadowBorder2.setShadowSize(7);
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        panelShadow1.setBorder(dropShadowBorder2);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funcionarios.");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        txtNomFunUp.setForeground(new java.awt.Color(69, 167, 154));
        txtNomFunUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNomFunUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNomFunUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtNomFunUp.setPlaceholder("Escribe si o no");
        txtNomFunUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomFunUpActionPerformed(evt);
            }
        });
        txtNomFunUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomFunUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomFunUpKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblIdFunUp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdFunUp.setForeground(new java.awt.Color(255, 255, 255));
        lblIdFunUp.setText("ID");

        txtCiFunUp.setForeground(new java.awt.Color(69, 167, 154));
        txtCiFunUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCiFunUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCiFunUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtCiFunUp.setPlaceholder("Escribe si o no");
        txtCiFunUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiFunUpActionPerformed(evt);
            }
        });
        txtCiFunUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiFunUpKeyTyped(evt);
            }
        });

        txtApeFunUp.setForeground(new java.awt.Color(69, 167, 154));
        txtApeFunUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtApeFunUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtApeFunUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtApeFunUp.setPlaceholder("Escribe si o no");
        txtApeFunUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeFunUpActionPerformed(evt);
            }
        });
        txtApeFunUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeFunUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeFunUpKeyTyped(evt);
            }
        });

        txtDirecUp.setForeground(new java.awt.Color(69, 167, 154));
        txtDirecUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDirecUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDirecUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtDirecUp.setPlaceholder("Escribe si o no");
        txtDirecUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecUpActionPerformed(evt);
            }
        });
        txtDirecUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecUpKeyTyped(evt);
            }
        });

        txtEmailUp.setForeground(new java.awt.Color(69, 167, 154));
        txtEmailUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtEmailUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtEmailUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtEmailUp.setPlaceholder("Escribe si o no");
        txtEmailUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUpActionPerformed(evt);
            }
        });
        txtEmailUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailUpKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N° Cedula:");

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° Celular:");

        txtCeluUp.setForeground(new java.awt.Color(69, 167, 154));
        txtCeluUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeluUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeluUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeluUp.setPlaceholder("Escribe si o no");
        txtCeluUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCeluUpKeyTyped(evt);
            }
        });

        jcbCiudadesFunUp.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCiudadesFunUp.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCiudadesFunUp.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCiudadesFunUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbCiudadesFunUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiudadesFunUpActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");

        btnActualizarrFun.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnActualizarrFun.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarrFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnActualizarrFun.setText("Actualizar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnActualizarrFun.setBorder(dropShadowBorder3);
        btnActualizarrFun.setContentAreaFilled(false);
        btnActualizarrFun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarrFun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarrFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarrFunActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApeFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCiudadesFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(btnActualizarrFun, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCiFunUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDirecUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmailUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCeluUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCiudadesFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiFunUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirecUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCeluUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarrFun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdFunUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNomFunUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomFunUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomFunUpActionPerformed

    private void txtCiFunUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiFunUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiFunUpActionPerformed

    private void txtApeFunUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeFunUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeFunUpActionPerformed

    private void txtDirecUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecUpActionPerformed

    private void txtEmailUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUpActionPerformed

    private void jcbCiudadesFunUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiudadesFunUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiudadesFunUpActionPerformed

    private void btnActualizarrFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarrFunActionPerformed
        String tabla="FUNCIONARIO", evento="UPDATE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
           if(updateFuncionario.txtNomFunUp.getText().equals("") || updateFuncionario.txtApeFunUp.getText().equals("")
          || updateFuncionario.txtDirecUp.getText().equals("") || updateFuncionario.txtEmailUp.getText().equals("")){
            updatetipoPuntaje.lblError.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
          }else{
            SentenciasFuncionarios s = new SentenciasFuncionarios();
            s.setID_CIUDAD(updateFuncionario.jcbCiudadesFunUp.getSelectedIndex());
            s.setNOM_FUN(updateFuncionario.txtNomFunUp.getText());
            s.setAPE_FUN(updateFuncionario.txtApeFunUp.getText());
            s.setCI_FUN(updateFuncionario.txtCiFunUp.getText());
            s.setDIRECCION_FUN(updateFuncionario.txtDirecUp.getText());
            s.setEMAIL_FUN(updateFuncionario.txtEmailUp.getText());
            s.setCELULAR_FUN(updateFuncionario.txtCeluUp.getText());
            s.setID_FUNCIONARIO(updateFuncionario.lblIdFunUp.getText());
                if(FuncionesFuncionarios.isUpdate(s)){
                    FuncionesFuncionarios.iscargarTabla("");
                    FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                    dispose();
                    JOptionPane.showMessageDialog(this, "Nuevo Usuario Registrado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                     JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);
              }
            }  
        } catch (HeadlessException ex) {
            System.out.println("error:" + ex.getMessage());
        }
      
    }//GEN-LAST:event_btnActualizarrFunActionPerformed

    private void txtNomFunUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomFunUpKeyTyped
        if(txtNomFunUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtNomFunUpKeyTyped

    private void txtApeFunUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeFunUpKeyTyped
       if(txtApeFunUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtApeFunUpKeyTyped

    private void txtCiFunUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiFunUpKeyTyped
         if(txtCiFunUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Cedula(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCiFunUpKeyTyped

    private void txtDirecUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecUpKeyTyped
       if(txtDirecUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.ParaDireccion(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtDirecUpKeyTyped

    private void txtEmailUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailUpKeyTyped
       if(txtEmailUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.USU(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtEmailUpKeyTyped

    private void txtCeluUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeluUpKeyTyped
        if(txtCeluUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCeluUpKeyTyped

    private void txtNomFunUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomFunUpKeyReleased
      librerias.LetrasMayusculas.convertiraMayusculas(txtNomFunUp);
    }//GEN-LAST:event_txtNomFunUpKeyReleased

    private void txtApeFunUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeFunUpKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtApeFunUp);
    }//GEN-LAST:event_txtApeFunUpKeyReleased

    private void txtDirecUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecUpKeyReleased
        librerias.LetrasMayusculas.convertiraMayusculas(txtDirecUp);
    }//GEN-LAST:event_txtDirecUpKeyReleased

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
            java.util.logging.Logger.getLogger(updateFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateFuncionario dialog = new updateFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizarrFun;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCiudadesFunUp;
    public static javax.swing.JLabel lblIdFunUp;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtApeFunUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeluUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCiFunUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDirecUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtEmailUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNomFunUp;
    // End of variables declaration//GEN-END:variables
}
