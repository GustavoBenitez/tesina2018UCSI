package alumnos;

import conexion.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import librerias.LetrasMayusculas;
import static librerias.LetrasMayusculas.convertiraMayusculas;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowAnimated;

public class registroAlumnos extends javax.swing.JDialog {
    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    public registroAlumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesAlumnos.isCargar();
        lblIdAlum.setText(FuncionesAlumnos.extraerIDMax());
        lblIdAlum.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNomAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApeAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCiAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDirecAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        jcbCiudadesAlum = new rojerusan.RSComboMetro();
        txtEmailAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCeluAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lblIdAlum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarAlumn = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("Alumnos.");

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
        panelRectTranslucido1.setAutoscrolls(true);
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        txtNomAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtNomAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNomAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNomAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtNomAlum.setPlaceholder("Escribe si o no");
        txtNomAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomAlumActionPerformed(evt);
            }
        });
        txtNomAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomAlumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomAlumKeyTyped(evt);
            }
        });

        txtApeAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtApeAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtApeAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtApeAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtApeAlum.setPlaceholder("Escribe si o no");
        txtApeAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeAlumActionPerformed(evt);
            }
        });
        txtApeAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeAlumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeAlumKeyTyped(evt);
            }
        });

        txtCiAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtCiAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCiAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCiAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtCiAlum.setPlaceholder("Escribe si o no");
        txtCiAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiAlumActionPerformed(evt);
            }
        });
        txtCiAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiAlumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiAlumKeyTyped(evt);
            }
        });

        txtDirecAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtDirecAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDirecAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDirecAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtDirecAlum.setPlaceholder("Escribe si o no");
        txtDirecAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecAlumActionPerformed(evt);
            }
        });
        txtDirecAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecAlumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecAlumKeyTyped(evt);
            }
        });

        jcbCiudadesAlum.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCiudadesAlum.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCiudadesAlum.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCiudadesAlum.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jcbCiudadesAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbCiudadesAlumKeyReleased(evt);
            }
        });

        txtEmailAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtEmailAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtEmailAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtEmailAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtEmailAlum.setPlaceholder("Escribe si o no");
        txtEmailAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailAlumKeyReleased(evt);
            }
        });

        txtCeluAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtCeluAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeluAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeluAlum.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeluAlum.setPlaceholder("Escribe si o no");
        txtCeluAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCeluAlumKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblIdAlum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdAlum.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAlum.setText("ID");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad:");

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

        btnGuardarAlumn.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnGuardarAlumn.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAlumn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnGuardarAlumn.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnGuardarAlumn.setBorder(dropShadowBorder3);
        btnGuardarAlumn.setContentAreaFilled(false);
        btnGuardarAlumn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarAlumn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlumnActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txtDirecAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtCeluAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addComponent(txtNomAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addComponent(txtApeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addGap(31, 31, 31)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCiAlum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailAlum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jcbCiudadesAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(lblIdAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCeluAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbCiudadesAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirecAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(34, 34, 34)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarAlumn)
                    .addComponent(lblIdAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtApeAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeAlumActionPerformed

    private void txtCiAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiAlumActionPerformed

    private void txtNomAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomAlumActionPerformed

    private void txtDirecAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecAlumActionPerformed

    private void btnGuardarAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlumnActionPerformed
         String tabla="ALUMNOS", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
            if(registroAlumnos.txtNomAlum.getText().length()==0 || registroAlumnos.txtApeAlum.getText().length()==0 || jcbCiudadesAlum.getSelectedIndex()==0){
               new rojerusan.RSNotifyShadowAnimated("¡ERROR!", "FALTA LLENAR CAMPOS", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.RightLeft, RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
            }else{
                    String sql = "INSERT INTO alumnos(ID_ALUMNO, ID_CIUDAD, NOM_ALUM, APE_ALUM, CI_ALUM, DIRECC_ALUM, EMAIL_ALUM, CELU_ALUM)"
                    + " VALUES ('"+lblIdAlum.getText()+"', '"+jcbCiudadesAlum.getSelectedIndex()+"', "
                    + "'"+txtNomAlum.getText()+"', '"+txtApeAlum.getText()+"', "
                    + "'"+txtCiAlum.getText()+"', '"+txtDirecAlum.getText()+"', "
                    + "'"+txtEmailAlum.getText()+"', '"+txtCeluAlum.getText()+"')";
                        ps = conexion.prepareStatement(sql);
                int resultado = ps.executeUpdate();
                if(resultado > 0){
                    new rojerusan.RSNotifyFade("¡HECHO!", "Se Guardo Correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    FuncionesAlumnos.iscargarTabla("");
                    FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnGuardarAlumnActionPerformed

    private void txtNomAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomAlumKeyTyped
        if(txtNomAlum.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomAlumKeyTyped

    private void txtApeAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeAlumKeyTyped
       if(txtApeAlum.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_txtApeAlumKeyTyped

    private void txtDirecAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecAlumKeyTyped
        if(txtDirecAlum.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.ParaDireccion(evt.getKeyChar()) && (ClaseValidaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
            lblError.setText("Solo puedes ingresar letras y numeros");
        }
    }//GEN-LAST:event_txtDirecAlumKeyTyped

    private void txtCiAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiAlumKeyTyped
        if(txtDirecAlum.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Cedula(evt.getKeyChar())){
            evt.consume();
            lblError.setText("Solo puedes ingresar numeros y guiones");
        }
    }//GEN-LAST:event_txtCiAlumKeyTyped

    private void txtNomAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomAlumKeyReleased
         convertiraMayusculas(txtNomAlum);
    }//GEN-LAST:event_txtNomAlumKeyReleased

    private void txtApeAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeAlumKeyReleased
         convertiraMayusculas(txtApeAlum);
    }//GEN-LAST:event_txtApeAlumKeyReleased

    private void txtDirecAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecAlumKeyReleased
         convertiraMayusculas(txtDirecAlum);
    }//GEN-LAST:event_txtDirecAlumKeyReleased

    private void jcbCiudadesAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbCiudadesAlumKeyReleased
       
    }//GEN-LAST:event_jcbCiudadesAlumKeyReleased

    private void txtCiAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiAlumKeyReleased
        convertiraMayusculas(txtCiAlum);
    }//GEN-LAST:event_txtCiAlumKeyReleased

    private void txtEmailAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAlumKeyReleased
       // convertiraMayusculas(txtEmailAlum);
    }//GEN-LAST:event_txtEmailAlumKeyReleased

    private void txtCeluAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeluAlumKeyReleased
        convertiraMayusculas(txtCeluAlum);
    }//GEN-LAST:event_txtCeluAlumKeyReleased

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
            java.util.logging.Logger.getLogger(registroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroAlumnos dialog = new registroAlumnos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardarAlumn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCiudadesAlum;
    public static javax.swing.JLabel lblError;
    public static javax.swing.JLabel lblIdAlum;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtApeAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeluAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCiAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDirecAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtEmailAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNomAlum;
    // End of variables declaration//GEN-END:variables
}
