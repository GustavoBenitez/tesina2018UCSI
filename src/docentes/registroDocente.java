package docentes;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyFade;

public class registroDocente extends javax.swing.JDialog {
    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    public registroDocente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesDocentes.cargarCiudadDoc();
        lblIdDoc.setText(FuncionesDocentes.extraerIDMax());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNomDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lblIdDoc = new javax.swing.JLabel();
        txtCedDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApeDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDirecDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEmailDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCeluDoc = new rojerusan.RSMetroTextFullPlaceHolder();
        jcbCiudadesDoc = new rojerusan.RSComboMetro();
        jLabel11 = new javax.swing.JLabel();
        btnGUardarDOc = new javax.swing.JButton();
        lblErrorDoc = new javax.swing.JLabel();

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
        jLabel1.setText("Docentes.");

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

        txtNomDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtNomDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNomDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNomDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtNomDoc.setPlaceholder("Escribe un Nombre");
        txtNomDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomDocActionPerformed(evt);
            }
        });
        txtNomDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomDocKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblIdDoc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblIdDoc.setText("ID");

        txtCedDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtCedDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCedDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCedDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtCedDoc.setPlaceholder("Escribe si o no");
        txtCedDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedDocActionPerformed(evt);
            }
        });
        txtCedDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedDocKeyTyped(evt);
            }
        });

        txtApeDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtApeDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtApeDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtApeDoc.setMaximumSize(new java.awt.Dimension(250, 42));
        txtApeDoc.setMinimumSize(new java.awt.Dimension(250, 42));
        txtApeDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtApeDoc.setPlaceholder("Escribe un Apellido");
        txtApeDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeDocActionPerformed(evt);
            }
        });
        txtApeDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeDocKeyTyped(evt);
            }
        });

        txtDirecDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtDirecDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDirecDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDirecDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtDirecDoc.setPlaceholder("Escribe si o no");
        txtDirecDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecDocActionPerformed(evt);
            }
        });
        txtDirecDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecDocKeyTyped(evt);
            }
        });

        txtEmailDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtEmailDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtEmailDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtEmailDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtEmailDoc.setPlaceholder("Escribe si o no");
        txtEmailDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailDocActionPerformed(evt);
            }
        });
        txtEmailDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailDocKeyTyped(evt);
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

        txtCeluDoc.setForeground(new java.awt.Color(69, 167, 154));
        txtCeluDoc.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeluDoc.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeluDoc.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeluDoc.setPlaceholder("Escribe si o no");
        txtCeluDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCeluDocKeyTyped(evt);
            }
        });

        jcbCiudadesDoc.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCiudadesDoc.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCiudadesDoc.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCiudadesDoc.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jcbCiudadesDoc.setMaximumSize(new java.awt.Dimension(250, 42));
        jcbCiudadesDoc.setMinimumSize(new java.awt.Dimension(250, 42));
        jcbCiudadesDoc.setPreferredSize(new java.awt.Dimension(250, 42));
        jcbCiudadesDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiudadesDocActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");

        btnGUardarDOc.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnGUardarDOc.setForeground(new java.awt.Color(255, 255, 255));
        btnGUardarDOc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnGUardarDOc.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnGUardarDOc.setBorder(dropShadowBorder3);
        btnGUardarDOc.setContentAreaFilled(false);
        btnGUardarDOc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGUardarDOc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUardarDOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUardarDOcActionPerformed(evt);
            }
        });

        lblErrorDoc.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lblErrorDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorDoc.setToolTipText("");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(44, 44, 44)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCiudadesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirecDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(btnGUardarDOc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtCeluDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErrorDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDirecDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCiudadesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCeluDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGUardarDOc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCedDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedDocActionPerformed

    private void txtApeDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeDocActionPerformed

    private void txtDirecDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecDocActionPerformed

    private void txtNomDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomDocActionPerformed

    private void txtEmailDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDocActionPerformed

    private void jcbCiudadesDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiudadesDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiudadesDocActionPerformed

    private void btnGUardarDOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUardarDOcActionPerformed
       String tabla="DOCENTE", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
           if(txtNomDoc.getText().equals("") || txtApeDoc.getText().equals("") || txtDirecDoc.getText().equals("")
                   || jcbCiudadesDoc.getSelectedIndex()==0){
            lblErrorDoc.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
          }else{
               String sql = "INSERT INTO docentes(ID_DOCENTE, ID_CIUDAD, NOM_DOCENT, APE_DOCENT, CI_DOCENT, EMAIL_DOCENTE, DIREC_DOCENT, CELU_DOCENT)"
                    + " VALUES ('"+lblIdDoc.getText()+"', '"+jcbCiudadesDoc.getSelectedIndex()+"', "
                    + "'"+txtNomDoc.getText()+"', '"+txtApeDoc.getText()+"', "
                    + "'"+txtCedDoc.getText()+"', '"+txtEmailDoc.getText()+"', "
                    + "'"+txtDirecDoc.getText()+"', '"+txtCeluDoc.getText()+"')";     
            ps = conexion.prepareStatement(sql);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                 new rojerusan.RSNotifyFade("¡HECHO!", "Se Guardo Correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                FuncionesDocentes.iscargarTabla("");
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                dispose();
            }else{
                 new rojerusan.RSNotifyFade("¡Error!", "No Se Guardo", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
           }
            
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGUardarDOcActionPerformed

    private void txtNomDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDocKeyTyped
        if(txtNomDoc.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtNomDocKeyTyped

    private void txtApeDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeDocKeyTyped
        if(txtApeDoc.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtApeDocKeyTyped

    private void txtDirecDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecDocKeyTyped
        if(txtDirecDoc.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.ParaDireccion(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtDirecDocKeyTyped

    private void txtEmailDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailDocKeyTyped
        if(txtEmailDoc.getText().length()>=50){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.USU(evt.getKeyChar())){
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Email Incorrecto", "Validar Email", JOptionPane.INFORMATION_MESSAGE);
            txtEmailDoc.requestFocus();
        }
    }//GEN-LAST:event_txtEmailDocKeyTyped

    private void txtCedDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedDocKeyTyped
        if(txtCedDoc.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Cedula(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCedDocKeyTyped

    private void txtCeluDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeluDocKeyTyped
        if(txtCeluDoc.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCeluDocKeyTyped

    private void txtNomDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDocKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtNomDoc);
    }//GEN-LAST:event_txtNomDocKeyReleased

    private void txtApeDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeDocKeyReleased
        librerias.LetrasMayusculas.convertiraMayusculas(txtApeDoc);
    }//GEN-LAST:event_txtApeDocKeyReleased

    private void txtDirecDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecDocKeyReleased
        librerias.LetrasMayusculas.convertiraMayusculas(txtDirecDoc);
    }//GEN-LAST:event_txtDirecDocKeyReleased

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
            java.util.logging.Logger.getLogger(registroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroDocente dialog = new registroDocente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGUardarDOc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCiudadesDoc;
    public static javax.swing.JLabel lblErrorDoc;
    public static javax.swing.JLabel lblIdDoc;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtApeDoc;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCedDoc;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeluDoc;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDirecDoc;
    public static rojerusan.RSMetroTextFullPlaceHolder txtEmailDoc;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNomDoc;
    // End of variables declaration//GEN-END:variables
}
