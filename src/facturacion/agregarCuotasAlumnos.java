/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import static facturacion.registroFacturaCuota.tablaFacCuotaDetalle;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Gustavo
 */
public class agregarCuotasAlumnos extends javax.swing.JDialog {

    /**
     * Creates new form agregarCuotasAlumnos
     */
    public agregarCuotasAlumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
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
        jPanel2 = new javax.swing.JPanel();
        rSButtonRound2 = new rojerusan.RSButtonRound();
        lblAlumnoNameCuota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuotasAlumnos = new rojerusan.RSTableMetro();
        txtBuscarAlumno = new rojerusan.RSMetroTextFullPlaceHolder();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder1);

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));

        rSButtonRound2.setBackground(new java.awt.Color(69, 167, 154));
        rSButtonRound2.setText("X");
        rSButtonRound2.setColorHover(new java.awt.Color(255, 0, 0));
        rSButtonRound2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        rSButtonRound2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound2ActionPerformed(evt);
            }
        });

        lblAlumnoNameCuota.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblAlumnoNameCuota.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumnoNameCuota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblAlumnoNameCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAlumnoNameCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaCuotasAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuotas", "Precio Unitario"
            }
        ));
        tablaCuotasAlumnos.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaCuotasAlumnos.setColorFilasForeground1(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setColorFilasForeground2(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaCuotasAlumnos.setGrosorBordeFilas(0);
        tablaCuotasAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuotasAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCuotasAlumnos);
        if (tablaCuotasAlumnos.getColumnModel().getColumnCount() > 0) {
            tablaCuotasAlumnos.getColumnModel().getColumn(0).setMinWidth(10);
            tablaCuotasAlumnos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        txtBuscarAlumno.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarAlumno.setBorderColor(new java.awt.Color(255, 255, 255));
        txtBuscarAlumno.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarAlumno.setPlaceholder("Buscar...");
        txtBuscarAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAlumnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarAlumnoKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(69, 167, 154));
        jSeparator1.setForeground(new java.awt.Color(69, 167, 154));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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

    private void rSButtonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound2ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonRound2ActionPerformed

    private void txtBuscarAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAlumnoKeyReleased
        FuncionesFacturaCuota.isListarIns(txtBuscarAlumno.getText());
    }//GEN-LAST:event_txtBuscarAlumnoKeyReleased

    private void txtBuscarAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAlumnoKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarAlumnoKeyTyped

    private void tablaCuotasAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuotasAlumnosMouseClicked
       FuncionesFacturaCuota.cargarIvaCurso();
    }//GEN-LAST:event_tablaCuotasAlumnosMouseClicked

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
            java.util.logging.Logger.getLogger(agregarCuotasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarCuotasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarCuotasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarCuotasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                agregarCuotasAlumnos dialog = new agregarCuotasAlumnos(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblAlumnoNameCuota;
    private rojerusan.RSButtonRound rSButtonRound2;
    public static rojerusan.RSTableMetro tablaCuotasAlumnos;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarAlumno;
    // End of variables declaration//GEN-END:variables
}