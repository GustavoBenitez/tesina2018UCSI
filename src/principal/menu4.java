/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import facturacion.facturaCompra;
import facturacion.facturaCuota;
import facturacion.ordenCompra;

/**
 *
 * @author Gustavo
 */
public class menu4 extends javax.swing.JDialog {

    public static ordenCompra ordenC=null;
    public static facturaCompra facturaOcc=null;
    public static facturaCuota fac=null;
    public menu4(java.awt.Frame parent, boolean modal) {
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

        menu4 = new javax.swing.JPanel();
        btnOrdenC = new javax.swing.JButton();
        btnFacturaCompra = new javax.swing.JButton();
        btnCuota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        menu4.setBackground(new java.awt.Color(255, 255, 255));

        btnOrdenC.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnOrdenC.setText("Orden de Compra Insumos");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnOrdenC.setBorder(dropShadowBorder1);
        btnOrdenC.setContentAreaFilled(false);
        btnOrdenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenCActionPerformed(evt);
            }
        });

        btnFacturaCompra.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnFacturaCompra.setText("Factura Compra de Insumos");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnFacturaCompra.setBorder(dropShadowBorder2);
        btnFacturaCompra.setContentAreaFilled(false);
        btnFacturaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaCompraActionPerformed(evt);
            }
        });

        btnCuota.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnCuota.setText("Facturas de Alumnos");
        btnCuota.setToolTipText("");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnCuota.setBorder(dropShadowBorder3);
        btnCuota.setContentAreaFilled(false);
        btnCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrdenC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addComponent(btnOrdenC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacturaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuota)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenCActionPerformed
        ordenC = new ordenCompra();
        FuncionesPrincipal.CentrarVentanaInterna(ordenC);
           dispose();
    }//GEN-LAST:event_btnOrdenCActionPerformed

    private void btnFacturaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaCompraActionPerformed
        facturaOcc = new facturaCompra();
        FuncionesPrincipal.CentrarVentanaInterna(facturaOcc);
           dispose();
    }//GEN-LAST:event_btnFacturaCompraActionPerformed

    private void btnCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuotaActionPerformed
        fac =  new facturaCuota();
        FuncionesPrincipal.CentrarVentanaInterna(fac);
           dispose();
    }//GEN-LAST:event_btnCuotaActionPerformed

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
            java.util.logging.Logger.getLogger(menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu4 dialog = new menu4(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCuota;
    private javax.swing.JButton btnFacturaCompra;
    private javax.swing.JButton btnOrdenC;
    private javax.swing.JPanel menu4;
    // End of variables declaration//GEN-END:variables
}