package login;
import funcionarios.FuncionesUsuarios;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Gustavo
 */
public class Login extends javax.swing.JFrame {
    public static String usu="";
    public static Integer idUsu=0;
    public Login() {
        initComponents();
        lbldisable.setVisible(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);  
        this.txtUsuarioInicio.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtUsuarioInicio = new rojerusan.RSMetroTextFullPlaceHolder();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtPasswordInicio = new rojerusan.RSPasswordTextPlaceHolder();
        btnInicioo = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        lbldisable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 430));
        setMinimumSize(new java.awt.Dimension(400, 430));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setCornerSize(20);
        dropShadowBorder1.setShadowColor(new java.awt.Color(0, 153, 153));
        dropShadowBorder1.setShadowOpacity(0.4F);
        dropShadowBorder1.setShadowSize(10);
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Employee Card_96px.png"))); // NOI18N

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtUsuarioInicio.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioInicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuarioInicio.setBorderColor(new java.awt.Color(0, 102, 102));
        txtUsuarioInicio.setBotonColor(new java.awt.Color(0, 102, 102));
        txtUsuarioInicio.setCaretColor(new java.awt.Color(0, 102, 102));
        txtUsuarioInicio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsuarioInicio.setPhColor(new java.awt.Color(0, 0, 0));
        txtUsuarioInicio.setPlaceholder("Usuario...");

        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio de Sesión");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPasswordInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        txtPasswordInicio.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordInicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordInicio.setCaretColor(new java.awt.Color(0, 102, 102));
        txtPasswordInicio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtPasswordInicio.setPhColor(new java.awt.Color(0, 0, 0));
        txtPasswordInicio.setPlaceholder("Contraseña...");
        txtPasswordInicio.setPreferredSize(new java.awt.Dimension(250, 42));
        txtPasswordInicio.setSelectionColor(new java.awt.Color(0, 102, 102));

        btnInicioo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnInicioo.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciarsesion64.png"))); // NOI18N
        btnInicioo.setText("Iniciar");
        btnInicioo.setBorderPainted(false);
        btnInicioo.setContentAreaFilled(false);
        btnInicioo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicioo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicioo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciooActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye_icon.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        lbldisable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldisable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo64.png"))); // NOI18N
        lbldisable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldisableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2)
                .addGap(115, 115, 115)
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtPasswordInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldisable)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnInicioo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPasswordInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldisable))
                .addGap(8, 8, 8)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicioo))
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIniciooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciooActionPerformed
        if(this.txtUsuarioInicio.getText().length()==0 || this.txtPasswordInicio.getText().length() == 0){
            this.info.setText("¡USUARIO Y CONTRASEÑA REQUERIDOS!");
            this.txtUsuarioInicio.requestFocus();
        }else{
            FuncionesUsuarios.verificarUsuario(this.txtUsuarioInicio.getText(), this.txtPasswordInicio.getText(), this);
            //new principal.nuevoPrincipal().setVisible(true);
        }
    }//GEN-LAST:event_btnIniciooActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        lbldisable.setVisible(true);
        lbldisable.setEnabled(true);
        txtPasswordInicio.setEchoChar((char)0);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void lbldisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldisableMouseClicked
        show.setVisible(true);
        show.setEnabled(true);
       txtPasswordInicio.setEchoChar((char)8226);
        lbldisable.setVisible(false);
        lbldisable.setEnabled(false);
    }//GEN-LAST:event_lbldisableMouseClicked

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInicioo;
    public static javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldisable;
    private javax.swing.JLabel show;
    public static rojerusan.RSPasswordTextPlaceHolder txtPasswordInicio;
    public static rojerusan.RSMetroTextFullPlaceHolder txtUsuarioInicio;
    // End of variables declaration//GEN-END:variables
}
