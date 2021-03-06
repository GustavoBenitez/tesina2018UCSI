/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

/**
 *
 * @author Gustavo
 */
public class registroHorario extends javax.swing.JDialog {

    /**
     * Creates new form registroHorario
     */
    public registroHorario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtHoraInicio.setText(Horario());
        txtHoraTermino.setText(Horario());
        setLocationRelativeTo(null);
        lblIdHora.setText(FuncionesHorarios.extraerIDMax());
         
    }

   public static String Horario(){
      Date hoy = new Date();
      Format timeFormat = new SimpleDateFormat("HH:mm");
      return timeFormat.format(hoy);
      /*Date hoy = new Date();
      SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm");
      return formatoFecha.format(hoy);*/
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        lblIdHora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarHorario = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        txtHoraTermino = new javax.swing.JFormattedTextField();
        txtHoraInicio = new javax.swing.JFormattedTextField();

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
        jLabel1.setText("Horarios.");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setBorder(null);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelRectTranslucido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(69, 167, 154));
        panelRectTranslucido1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de Inicio:");

        lblIdHora.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIdHora.setForeground(new java.awt.Color(255, 255, 255));
        lblIdHora.setText("ID");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora de Termino:");

        btnGuardarHorario.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btnGuardarHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_48px.png"))); // NOI18N
        btnGuardarHorario.setText("Guardar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnGuardarHorario.setBorder(dropShadowBorder3);
        btnGuardarHorario.setContentAreaFilled(false);
        btnGuardarHorario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarHorario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHorarioActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 255, 255));

        txtHoraTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 167, 154), 2));
        txtHoraTermino.setForeground(new java.awt.Color(69, 167, 154));
        try {
            txtHoraTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraTermino.setToolTipText("Ingrese Una Hora");
        txtHoraTermino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraTermino.setMaximumSize(new java.awt.Dimension(200, 42));
        txtHoraTermino.setMinimumSize(new java.awt.Dimension(200, 42));
        txtHoraTermino.setPreferredSize(new java.awt.Dimension(200, 42));

        txtHoraInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 167, 154), 2));
        txtHoraInicio.setForeground(new java.awt.Color(69, 167, 154));
        try {
            txtHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraInicio.setToolTipText("Ingrese Una Hora");
        txtHoraInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraInicio.setMaximumSize(new java.awt.Dimension(200, 42));
        txtHoraInicio.setMinimumSize(new java.awt.Dimension(200, 42));
        txtHoraInicio.setPreferredSize(new java.awt.Dimension(200, 42));

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(lblIdHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarHorario)
                    .addComponent(lblIdHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnGuardarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHorarioActionPerformed
         String tabla="HORARIO", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
            if(txtHoraInicio.getText().equals("") || txtHoraTermino.getText().equals("")){
                lblError.setText("TODOS LOS CAMPOS SON OBLIGATORIOS");
            }else{
                SentenciasHorarios s = new SentenciasHorarios();
                s.setHORA_INICIO(txtHoraInicio.getText());
                s.setHORA_TERMINO(txtHoraTermino.getText());
                s.setID_HORARIO(lblIdHora.getText()); 
                if(FuncionesHorarios.isRegistrar(s)){
                    FuncionesHorarios.isListar("");
                    lblIdHora.setText(FuncionesHorarios.extraerIDMax());
                    dispose();
                    FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                    JOptionPane.showMessageDialog(this, "Nuevo Horario Registrado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al intentar registrar.", "ERROR", JOptionPane.ERROR_MESSAGE);  
                }
            }
        } catch (Exception e) {
            System.err.println("error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(registroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroHorario dialog = new registroHorario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardarHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    public static javax.swing.JLabel lblIdHora;
    public static org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public static javax.swing.JFormattedTextField txtHoraInicio;
    public javax.swing.JFormattedTextField txtHoraTermino;
    // End of variables declaration//GEN-END:variables
}
