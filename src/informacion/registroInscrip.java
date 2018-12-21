/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librerias.LetrasMayusculas;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Gustavo
 */
public class registroInscrip extends javax.swing.JDialog {

    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    public registroInscrip(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FuncionesAca.isCargarCurso();
        lblIdIns.setText(FuncionesAca.extraerIDMaxIns());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIdIns = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaIns = new rojerusan.RSDateChooser();
        jcbCursoINs = new rojerusan.RSComboMetro();
        txtNameAlum = new rojerusan.RSMetroTextFullPlaceHolder();
        lblIdAlum = new javax.swing.JLabel();
        txtPrecioCuo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCantidadCuota = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarIns = new rojerusan.RSButtonRound();

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
        jLabel1.setText("Inscribir.");

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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setColorPrimario(new java.awt.Color(51, 51, 51));
        panelRectTranslucido1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alumno:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Curso:");

        lblIdIns.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdIns.setForeground(new java.awt.Color(255, 255, 255));
        lblIdIns.setText("ID");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

        txtFechaIns.setColorBackground(new java.awt.Color(69, 167, 154));
        txtFechaIns.setFormatoFecha("dd/MM/yyyy");

        jcbCursoINs.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbCursoINs.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbCursoINs.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbCursoINs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCursoINs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoINsActionPerformed(evt);
            }
        });

        txtNameAlum.setForeground(new java.awt.Color(69, 167, 154));
        txtNameAlum.setBorderColor(new java.awt.Color(69, 167, 154));
        txtNameAlum.setBotonColor(new java.awt.Color(69, 167, 154));
        txtNameAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameAlumKeyReleased(evt);
            }
        });

        lblIdAlum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdAlum.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAlum.setText("ID");

        txtPrecioCuo.setForeground(new java.awt.Color(69, 167, 154));
        txtPrecioCuo.setBorderColor(new java.awt.Color(69, 167, 154));
        txtPrecioCuo.setBotonColor(new java.awt.Color(69, 167, 154));

        txtCantidadCuota.setForeground(new java.awt.Color(69, 167, 154));
        txtCantidadCuota.setBorderColor(new java.awt.Color(69, 167, 154));
        txtCantidadCuota.setBotonColor(new java.awt.Color(69, 167, 154));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Cuota:");

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad Cuota:");

        btnGuardarIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnGuardarIns.setText("Guardar");
        btnGuardarIns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarIns.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)))
                .addGap(25, 25, 25)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioCuo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNameAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addComponent(jcbCursoINs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFechaIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCantidadCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarIns, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(lblIdAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdIns, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCursoINs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCuo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdIns, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardarIns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void txtNameAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameAlumKeyReleased
        LetrasMayusculas.convertiraMayusculas(txtNameAlum);
    }//GEN-LAST:event_txtNameAlumKeyReleased

    private void jcbCursoINsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoINsActionPerformed
      FuncionesAca.isPrecio(jcbCursoINs.getSelectedItem().toString());
    }//GEN-LAST:event_jcbCursoINsActionPerformed

    private void btnGuardarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInsActionPerformed
         String fechaa=txtFechaIns.getFechaSeleccionada();
        String dia = fechaa.substring(0, 2); //substring sirve para extraer caracteres de una cadena en este caso dos lugares que es del dia
        String mes = fechaa.substring(3, 5);
        String anho =fechaa.substring(6, 10);
        String fechafinal = dia+"/"+mes+"/"+anho;
        int idCurso = jcbCursoINs.getSelectedIndex();
        System.out.println(idCurso);
         String tabla="INSCRIPCION", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
            String sql = "INSERT INTO inscripciones(ID_INSCRIPCION, FK_ALUMNO, FK_CURSO, fecha_inscripcion, CANT_CUOTA, PRECIO_CUO)"
                    + " VALUES ('"+lblIdIns.getText()+"', '"+lblIdAlum.getText()+"', "
                    + "'"+jcbCursoINs.getSelectedIndex()+"', '"+fechafinal+"', '"+txtCantidadCuota.getText()+"', '"+txtPrecioCuo.getText()+"')";
            ps = conexion.prepareStatement(sql);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                //FuncionesAca.isListarIns("");
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                new rojerusan.RSNotifyAnimated("¡HECHO!", "Se Guardo Correctamente", 5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                lblIdIns.setText(FuncionesAca.extraerIDMaxIns());
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        } catch (SQLException ex) {
            System.out.println("error al guardar inscripcion: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarInsActionPerformed

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
            java.util.logging.Logger.getLogger(registroInscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroInscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroInscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroInscrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroInscrip dialog = new registroInscrip(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonRound btnGuardarIns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSComboMetro jcbCursoINs;
    public static javax.swing.JLabel lblIdAlum;
    public static javax.swing.JLabel lblIdIns;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCantidadCuota;
    public static rojerusan.RSDateChooser txtFechaIns;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNameAlum;
    public static rojerusan.RSMetroTextFullPlaceHolder txtPrecioCuo;
    // End of variables declaration//GEN-END:variables
}
