
package docentes;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

public class updateDocentes extends javax.swing.JDialog {

    /**
     * Creates new form updateDocentes
     */
    public updateDocentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesDocentes.cargarCiudadDocUp();
        //lblIdDocUp.setText(FuncionesDocentes.extraerIDMax());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNomDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lblIdDocUp = new javax.swing.JLabel();
        txtCeduDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApeDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDirecDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEmailDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCeluDocUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jcbCiudadDocUp = new rojerusan.RSComboMetro();
        jLabel11 = new javax.swing.JLabel();
        btnActualizarDoc = new javax.swing.JButton();
        lblErrorDocUp = new javax.swing.JLabel();

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

        txtNomDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtNomDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNomDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNomDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtNomDocUp.setPlaceholder("Escribe si o no");
        txtNomDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomDocUpActionPerformed(evt);
            }
        });
        txtNomDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomDocUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomDocUpKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblIdDocUp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdDocUp.setForeground(new java.awt.Color(255, 255, 255));
        lblIdDocUp.setText("ID");

        txtCeduDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtCeduDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeduDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeduDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeduDocUp.setPlaceholder("Escribe un n° de Cedula");
        txtCeduDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCeduDocUpActionPerformed(evt);
            }
        });
        txtCeduDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCeduDocUpKeyTyped(evt);
            }
        });

        txtApeDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtApeDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtApeDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtApeDocUp.setMaximumSize(new java.awt.Dimension(250, 42));
        txtApeDocUp.setMinimumSize(new java.awt.Dimension(250, 42));
        txtApeDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtApeDocUp.setPlaceholder("Escribe si o no");
        txtApeDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeDocUpActionPerformed(evt);
            }
        });
        txtApeDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeDocUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeDocUpKeyTyped(evt);
            }
        });

        txtDirecDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtDirecDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDirecDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDirecDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtDirecDocUp.setPlaceholder("Escribe una Dirección");
        txtDirecDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecDocUpActionPerformed(evt);
            }
        });
        txtDirecDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecDocUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecDocUpKeyTyped(evt);
            }
        });

        txtEmailDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtEmailDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtEmailDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtEmailDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtEmailDocUp.setPlaceholder("Escribe un Email");
        txtEmailDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailDocUpActionPerformed(evt);
            }
        });
        txtEmailDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailDocUpKeyTyped(evt);
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

        txtCeluDocUp.setForeground(new java.awt.Color(69, 167, 154));
        txtCeluDocUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeluDocUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeluDocUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeluDocUp.setPlaceholder("Escribe un n° de Celular");
        txtCeluDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCeluDocUpActionPerformed(evt);
            }
        });
        txtCeluDocUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCeluDocUpKeyTyped(evt);
            }
        });

        jcbCiudadDocUp.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCiudadDocUp.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCiudadDocUp.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCiudadDocUp.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jcbCiudadDocUp.setMaximumSize(new java.awt.Dimension(250, 42));
        jcbCiudadDocUp.setMinimumSize(new java.awt.Dimension(250, 42));
        jcbCiudadDocUp.setPreferredSize(new java.awt.Dimension(250, 42));
        jcbCiudadDocUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiudadDocUpActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");

        btnActualizarDoc.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnActualizarDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnActualizarDoc.setText("Actualizar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnActualizarDoc.setBorder(dropShadowBorder3);
        btnActualizarDoc.setContentAreaFilled(false);
        btnActualizarDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDocActionPerformed(evt);
            }
        });

        lblErrorDocUp.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lblErrorDocUp.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorDocUp.setToolTipText("");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))
                                .addGap(44, 44, 44)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApeDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCiudadDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnActualizarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCeduDocUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirecDocUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailDocUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtCeluDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lblErrorDocUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCeduDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDirecDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCiudadDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(lblErrorDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIdDocUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCeluDocUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void txtNomDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomDocUpActionPerformed

    private void txtCeduDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCeduDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCeduDocUpActionPerformed

    private void txtApeDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeDocUpActionPerformed

    private void txtDirecDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecDocUpActionPerformed

    private void txtEmailDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDocUpActionPerformed

    private void jcbCiudadDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiudadDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiudadDocUpActionPerformed

    private void txtCeluDocUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCeluDocUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCeluDocUpActionPerformed

    private void btnActualizarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDocActionPerformed
        String tabla="DOCENTE_CURSO", evento="UPDATE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
          if(txtNomDocUp.getText().equals("") || txtApeDocUp.getText().equals("") || txtDirecDocUp.getText().equals("")
                   || txtEmailDocUp.getText().equals("")){
            lblErrorDocUp.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
          }else{
               SentenciasDocentes s = new SentenciasDocentes();
            s.setNOM_DOCENT(updateDocentes.txtNomDocUp.getText());
            s.setAPE_DOCENT(updateDocentes.txtApeDocUp.getText());
            s.setID_CIUDAD(updateDocentes.jcbCiudadDocUp.getSelectedIndex());
            s.setCI_DOCENT(updateDocentes.txtCeduDocUp.getText());
            s.setDIREC_DOCENT(updateDocentes.txtDirecDocUp.getText());
            s.setEMAIL_DOCENTE(updateDocentes.txtEmailDocUp.getText());
            s.setCELU_DOCENT(updateDocentes.txtCeluDocUp.getText());
            s.setID_DOCENTE(updateDocentes.lblIdDocUp.getText());
                if(FuncionesDocentes.isUpdate(s)){
                    FuncionesDocentes.iscargarTabla("");
                    FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                    dispose();
                    JOptionPane.showMessageDialog(this, "Actualizado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                     JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);
              }
            }  
        } catch (Exception ex) {
            System.out.println("error:" + ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarDocActionPerformed

    private void txtNomDocUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDocUpKeyReleased
        librerias.LetrasMayusculas.convertiraMayusculas(txtNomDocUp);
    }//GEN-LAST:event_txtNomDocUpKeyReleased

    private void txtApeDocUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeDocUpKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtApeDocUp);
    }//GEN-LAST:event_txtApeDocUpKeyReleased

    private void txtDirecDocUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecDocUpKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtDirecDocUp);
    }//GEN-LAST:event_txtDirecDocUpKeyReleased

    private void txtNomDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDocUpKeyTyped
        if(txtNomDocUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtNomDocUpKeyTyped

    private void txtApeDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeDocUpKeyTyped
        if(txtApeDocUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtApeDocUpKeyTyped

    private void txtCeduDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeduDocUpKeyTyped
        if(txtCeduDocUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Cedula(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCeduDocUpKeyTyped

    private void txtDirecDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecDocUpKeyTyped
         if(txtDirecDocUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.ParaDireccion(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtDirecDocUpKeyTyped

    private void txtEmailDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailDocUpKeyTyped
       if(txtEmailDocUp.getText().length()>=50){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.USU(evt.getKeyChar())){
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Email Incorrecto", "Validar Email", JOptionPane.INFORMATION_MESSAGE);
            txtEmailDocUp.requestFocus();
        }
    }//GEN-LAST:event_txtEmailDocUpKeyTyped

    private void txtCeluDocUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeluDocUpKeyTyped
         if(txtCeluDocUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCeluDocUpKeyTyped

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
            java.util.logging.Logger.getLogger(updateDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateDocentes dialog = new updateDocentes(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnActualizarDoc;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCiudadDocUp;
    public static javax.swing.JLabel lblErrorDocUp;
    public static javax.swing.JLabel lblIdDocUp;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtApeDocUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeduDocUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeluDocUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDirecDocUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtEmailDocUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNomDocUp;
    // End of variables declaration//GEN-END:variables
}
