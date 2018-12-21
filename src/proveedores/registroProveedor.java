
package proveedores;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Gustavo
 */
public class registroProveedor extends javax.swing.JDialog {

    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    public registroProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesProveedor.isCargar();
        txtNomPro.requestFocus();
        lblIdPro.setText(FuncionesProveedor.extraerIDMax());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNomPro = new rojerusan.RSMetroTextFullPlaceHolder();
        txtRucPro = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApePro = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDirecPro = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEmailPro = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCeluPro = new rojerusan.RSMetroTextFullPlaceHolder();
        jcbCiudadesPro = new rojerusan.RSComboMetro();
        jLabel3 = new javax.swing.JLabel();
        lblIdPro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGuardarProv = new javax.swing.JButton();
        txtCedulaPro = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel12 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

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
        jLabel1.setText("Proveedores.");

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

        txtNomPro.setForeground(new java.awt.Color(102, 102, 102));
        txtNomPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNomPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNomPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtNomPro.setPlaceholder("Escribe si o no");
        txtNomPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProActionPerformed(evt);
            }
        });
        txtNomPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomProKeyTyped(evt);
            }
        });

        txtRucPro.setForeground(new java.awt.Color(102, 102, 102));
        txtRucPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtRucPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtRucPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtRucPro.setPlaceholder("Escribe si o no");
        txtRucPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucProActionPerformed(evt);
            }
        });
        txtRucPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucProKeyTyped(evt);
            }
        });

        txtApePro.setForeground(new java.awt.Color(102, 102, 102));
        txtApePro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtApePro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtApePro.setPhColor(new java.awt.Color(71, 120, 197));
        txtApePro.setPlaceholder("Escribe si o no");
        txtApePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeProActionPerformed(evt);
            }
        });
        txtApePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeProKeyTyped(evt);
            }
        });

        txtDirecPro.setForeground(new java.awt.Color(102, 102, 102));
        txtDirecPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDirecPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDirecPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtDirecPro.setPlaceholder("Escribe si o no");
        txtDirecPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecProActionPerformed(evt);
            }
        });
        txtDirecPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecProKeyTyped(evt);
            }
        });

        txtEmailPro.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtEmailPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtEmailPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtEmailPro.setPlaceholder("Escribe si o no");
        txtEmailPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailProActionPerformed(evt);
            }
        });
        txtEmailPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailProKeyTyped(evt);
            }
        });

        txtCeluPro.setForeground(new java.awt.Color(102, 102, 102));
        txtCeluPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCeluPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCeluPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtCeluPro.setPlaceholder("Escribe si o no");
        txtCeluPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCeluProKeyTyped(evt);
            }
        });

        jcbCiudadesPro.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCiudadesPro.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCiudadesPro.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCiudadesPro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCiudadesPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiudadesProActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblIdPro.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdPro.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPro.setText("ID");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ruc:");

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

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad:");

        txtGuardarProv.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        txtGuardarProv.setForeground(new java.awt.Color(255, 255, 255));
        txtGuardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        txtGuardarProv.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        txtGuardarProv.setBorder(dropShadowBorder3);
        txtGuardarProv.setContentAreaFilled(false);
        txtGuardarProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtGuardarProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        txtGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarProvActionPerformed(evt);
            }
        });

        txtCedulaPro.setForeground(new java.awt.Color(102, 102, 102));
        txtCedulaPro.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCedulaPro.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCedulaPro.setPhColor(new java.awt.Color(71, 120, 197));
        txtCedulaPro.setPlaceholder("Escribe si o no");
        txtCedulaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaProActionPerformed(evt);
            }
        });
        txtCedulaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaProKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cedula:");

        lblError.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(txtGuardarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(lblIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCiudadesPro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCeluPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirecPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(31, 31, 31)
                        .addComponent(txtCedulaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRucPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDirecPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCiudadesPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCeluPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(28, 28, 28)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(lblIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(txtGuardarProv)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtNomProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProActionPerformed

    private void txtRucProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucProActionPerformed

    private void txtApeProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeProActionPerformed

    private void txtDirecProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecProActionPerformed

    private void txtEmailProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailProActionPerformed

    private void jcbCiudadesProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiudadesProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiudadesProActionPerformed

    private void txtCedulaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaProActionPerformed

    private void txtGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarProvActionPerformed
        String tabla="PROVEEDORES", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
            String sql = "INSERT INTO proveedores(ID_PROVEEDOR, ID_CIUDAD, NOM_PRO, APE_PRO, DREC_PRO, CEDU_PRO, CELU_PRO, RUC_PRO, EMAIL_PRO)"
                    + " VALUES ('"+lblIdPro.getText()+"', '"+jcbCiudadesPro.getSelectedIndex()+"', "
                    + "'"+txtNomPro.getText()+"', '"+txtApePro.getText()+"', "
                    + "'"+txtDirecPro.getText()+"', '"+txtCedulaPro.getText()+"', "
                    + "'"+txtCeluPro.getText()+"', '"+txtRucPro.getText()+"', '"+txtEmailPro.getText()+"')";
            ps = conexion.prepareStatement(sql);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                new rojerusan.RSNotifyFade("¡HECHO!", "Se Guardo Correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                FuncionesProveedor.iscargarTabla("");
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }//GEN-LAST:event_txtGuardarProvActionPerformed

    private void txtNomProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtNomPro);
    }//GEN-LAST:event_txtNomProKeyReleased

    private void txtApeProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeProKeyReleased
         librerias.LetrasMayusculas.convertiraMayusculas(txtApePro);
    }//GEN-LAST:event_txtApeProKeyReleased

    private void txtDirecProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecProKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtDirecPro);
    }//GEN-LAST:event_txtDirecProKeyReleased

    private void txtNomProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProKeyTyped
        if(txtNomPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtNomProKeyTyped

    private void txtApeProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeProKeyTyped
         if(txtApePro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtApeProKeyTyped

    private void txtCeluProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCeluProKeyTyped
         if(txtCeluPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCeluProKeyTyped

    private void txtRucProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucProKeyTyped
        if(txtRucPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtRucProKeyTyped

    private void txtDirecProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecProKeyTyped
        if(txtDirecPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.ParaDireccion(evt.getKeyChar()) && ClaseValidaciones.Espacio(evt.getKeyChar()) ){
            evt.consume();  
        }
    }//GEN-LAST:event_txtDirecProKeyTyped

    private void txtEmailProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailProKeyTyped
        if(txtEmailPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.USU(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtEmailProKeyTyped

    private void txtCedulaProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaProKeyTyped
        if(txtCedulaPro.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Cedula(evt.getKeyChar())){
            evt.consume();
           
        }
    }//GEN-LAST:event_txtCedulaProKeyTyped

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
            java.util.logging.Logger.getLogger(registroProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroProveedor dialog = new registroProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCiudadesPro;
    private javax.swing.JLabel lblError;
    public static javax.swing.JLabel lblIdPro;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtApePro;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCedulaPro;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCeluPro;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDirecPro;
    public static rojerusan.RSMetroTextFullPlaceHolder txtEmailPro;
    private javax.swing.JButton txtGuardarProv;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNomPro;
    public static rojerusan.RSMetroTextFullPlaceHolder txtRucPro;
    // End of variables declaration//GEN-END:variables
}
