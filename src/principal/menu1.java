/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import academicos.Puntajes;
import academicos.tipoPuntaje;
import calificaciones.Calificaciones;
import clases.Clases;

/**
 *
 * @author Gustavo
 */
public class menu1 extends javax.swing.JDialog {
    public static Puntajes puntaje=null;
    public static tipoPuntaje tipopuntaje=null;
    public static Clases clase=null;
    public static Calificaciones nota=null;
    public menu1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new javax.swing.JPanel();
        btnClases = new javax.swing.JButton();
        btnPuntaje = new javax.swing.JButton();
        btnCalifi = new javax.swing.JButton();
        btntipoPunt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        menu1.setBackground(new java.awt.Color(255, 255, 255));

        btnClases.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnClases.setText("Clases");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnClases.setBorder(dropShadowBorder1);
        btnClases.setContentAreaFilled(false);
        btnClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasesActionPerformed(evt);
            }
        });

        btnPuntaje.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnPuntaje.setText("Puntajes");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnPuntaje.setBorder(dropShadowBorder2);
        btnPuntaje.setContentAreaFilled(false);
        btnPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntajeActionPerformed(evt);
            }
        });

        btnCalifi.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnCalifi.setText("Calificaciones");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnCalifi.setBorder(dropShadowBorder3);
        btnCalifi.setContentAreaFilled(false);
        btnCalifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalifiActionPerformed(evt);
            }
        });

        btntipoPunt.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btntipoPunt.setText("Tipo de Puntajes");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        btntipoPunt.setBorder(dropShadowBorder4);
        btntipoPunt.setContentAreaFilled(false);
        btntipoPunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntipoPuntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPuntaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntipoPunt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addComponent(btnClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPuntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalifi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntipoPunt))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasesActionPerformed
        clase = new Clases();
        FuncionesPrincipal.CentrarVentanaInterna(clase);
        dispose();
    }//GEN-LAST:event_btnClasesActionPerformed

    private void btnPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntajeActionPerformed
        puntaje = new Puntajes();
        FuncionesPrincipal.CentrarVentanaInterna(puntaje);
         dispose();
    }//GEN-LAST:event_btnPuntajeActionPerformed

    private void btnCalifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalifiActionPerformed
        nota = new Calificaciones();
        FuncionesPrincipal.CentrarVentanaInterna(nota);
         dispose();
    }//GEN-LAST:event_btnCalifiActionPerformed

    private void btntipoPuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntipoPuntActionPerformed
        tipopuntaje = new tipoPuntaje();
        FuncionesPrincipal.CentrarVentanaInterna(tipopuntaje);
        dispose();
    }//GEN-LAST:event_btntipoPuntActionPerformed

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
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu1 dialog = new menu1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCalifi;
    private javax.swing.JButton btnClases;
    private javax.swing.JButton btnPuntaje;
    private javax.swing.JButton btntipoPunt;
    public static javax.swing.JPanel menu1;
    // End of variables declaration//GEN-END:variables
}
