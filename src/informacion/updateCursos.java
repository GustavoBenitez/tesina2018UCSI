package informacion;

import javax.swing.JOptionPane;
import librerias.ClaseValidaciones;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;


public class updateCursos extends javax.swing.JDialog {


    public updateCursos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.lblIdCursoUp.setText(FuncionesAca.extraerIDMax());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtNombreCursoUP = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCuotasUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPreCuoUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPreTotUp = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDuracionUp = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIdCursoUp = new javax.swing.JLabel();
        btnActualizarCurso = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel1.setText("Cursos.");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        txtNombreCursoUP.setForeground(new java.awt.Color(69, 167, 154));
        txtNombreCursoUP.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNombreCursoUP.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNombreCursoUP.setPhColor(new java.awt.Color(71, 120, 197));
        txtNombreCursoUP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreCursoUPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCursoUPKeyTyped(evt);
            }
        });

        txtCuotasUp.setForeground(new java.awt.Color(69, 167, 154));
        txtCuotasUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCuotasUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtCuotasUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtCuotasUp.setPlaceholder("Escribe si o no");
        txtCuotasUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuotasUpKeyTyped(evt);
            }
        });

        txtPreCuoUp.setForeground(new java.awt.Color(69, 167, 154));
        txtPreCuoUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtPreCuoUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtPreCuoUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtPreCuoUp.setPlaceholder("Escribe si o no");
        txtPreCuoUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreCuoUpActionPerformed(evt);
            }
        });
        txtPreCuoUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPreCuoUpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreCuoUpKeyTyped(evt);
            }
        });

        txtPreTotUp.setForeground(new java.awt.Color(69, 167, 154));
        txtPreTotUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtPreTotUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtPreTotUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtPreTotUp.setPlaceholder("Escribe si o no");
        txtPreTotUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreTotUpActionPerformed(evt);
            }
        });
        txtPreTotUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreTotUpKeyTyped(evt);
            }
        });

        txtDuracionUp.setForeground(new java.awt.Color(69, 167, 154));
        txtDuracionUp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtDuracionUp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtDuracionUp.setPhColor(new java.awt.Color(71, 120, 197));
        txtDuracionUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionUpKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuotas:");

        lblIdCursoUp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdCursoUp.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCursoUp.setText("ID");

        btnActualizarCurso.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnActualizarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnActualizarCurso.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnActualizarCurso.setBorder(dropShadowBorder3);
        btnActualizarCurso.setContentAreaFilled(false);
        btnActualizarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCursoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Cuota:");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Total:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duración:");

        lblError.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPreCuoUp, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnActualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdCursoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPreTotUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDuracionUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCuotasUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreCursoUP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCursoUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracionUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuotasUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreCuoUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreTotUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdCursoUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnActualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCursoActionPerformed
         String tabla="CURSO", evento="UPDATE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        if(updateCursos.txtNombreCursoUP.getText().equals("") || updateCursos.txtDuracionUp.getText().equals("")){
            this.lblError.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
        }else{
            SentenciasAca s = new SentenciasAca();
            s.setNOM_CURSO(this.txtNombreCursoUP.getText());
            s.setDURACION(Integer.parseInt(this.txtDuracionUp.getText()));
            s.setCUOTA(Integer.parseInt(this.txtCuotasUp.getText()));
            s.setPRECIO_CUOTA(Double.parseDouble(this.txtPreCuoUp.getText()));
            s.setPRECIO_TOT(Integer.parseInt(this.txtPreTotUp.getText()));
            s.setID_CURSO(this.lblIdCursoUp.getText());
            if(FuncionesAca.isUpdate(s)){
                FuncionesAca.isListar("");
                dispose();
                 FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                JOptionPane.showMessageDialog(this, "Nuevo Usuario Registrado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnActualizarCursoActionPerformed

    private void txtPreCuoUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreCuoUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreCuoUpActionPerformed

    private void txtPreTotUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreTotUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreTotUpActionPerformed

    private void txtNombreCursoUPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCursoUPKeyReleased
       librerias.LetrasMayusculas.convertiraMayusculas(txtNombreCursoUP);
    }//GEN-LAST:event_txtNombreCursoUPKeyReleased

    private void txtNombreCursoUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCursoUPKeyTyped
        if(txtNombreCursoUP.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Letras(evt.getKeyChar())&& ClaseValidaciones.Espacio(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCursoUPKeyTyped

    private void txtDuracionUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionUpKeyTyped
        if(txtDuracionUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionUpKeyTyped

    private void txtCuotasUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotasUpKeyTyped
        if(txtCuotasUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCuotasUpKeyTyped

    private void txtPreCuoUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreCuoUpKeyTyped
        if(txtPreCuoUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPreCuoUpKeyTyped

    private void txtPreTotUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreTotUpKeyTyped
        if(txtPreTotUp.getText().length()>=25){
            evt.consume();
        }
        // validar solo letras
        if(ClaseValidaciones.Numeros(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPreTotUpKeyTyped

    private void txtPreCuoUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreCuoUpKeyReleased
       String can = txtCuotasUp.getText();
        String pre = txtPreCuoUp.getText();
        if(pre.equals("")==false && pre.matches("[0-9]*")){
            Integer precio =Integer.parseInt(pre);
            Integer cuota = Integer.parseInt(can);
            Integer imp=precio*cuota;
            txtPreTotUp.setText(Integer.toString(imp));
        } 
    }//GEN-LAST:event_txtPreCuoUpKeyReleased

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
            java.util.logging.Logger.getLogger(updateCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateCursos dialog = new updateCursos(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnActualizarCurso;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    public static javax.swing.JLabel lblIdCursoUp;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCuotasUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDuracionUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNombreCursoUP;
    public static rojerusan.RSMetroTextFullPlaceHolder txtPreCuoUp;
    public static rojerusan.RSMetroTextFullPlaceHolder txtPreTotUp;
    // End of variables declaration//GEN-END:variables
}
