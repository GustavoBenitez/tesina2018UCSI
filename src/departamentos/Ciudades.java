package departamentos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Gustavo
 */
public class Ciudades extends javax.swing.JInternalFrame {
    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    public Ciudades() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesDC.iscargarTablaCiu("");
        jPopupMenu1.add(menuCiu);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCiu = new javax.swing.JPanel();
        btnEditarCiu = new javax.swing.JButton();
        btnEliminarCiu = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel16 = new javax.swing.JPanel();
        btnCerrar7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaCiu = new rojerusan.RSTableMetro();
        txtBuscarCiudad = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton8 = new javax.swing.JButton();
        btnNuevo7 = new rojerusan.RSButtonIconI();
        jcbFiltroCiudad = new rojerusan.RSComboMetro();
        rSButtonRound1 = new rojerusan.RSButtonRound();

        menuCiu.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarCiu.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEditarCiu.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEditarCiu.setBorder(dropShadowBorder1);
        btnEditarCiu.setContentAreaFilled(false);
        btnEditarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCiuActionPerformed(evt);
            }
        });

        btnEliminarCiu.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminarCiu.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEliminarCiu.setBorder(dropShadowBorder2);
        btnEliminarCiu.setContentAreaFilled(false);
        btnEliminarCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCiuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuCiuLayout = new javax.swing.GroupLayout(menuCiu);
        menuCiu.setLayout(menuCiuLayout);
        menuCiuLayout.setHorizontalGroup(
            menuCiuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarCiu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminarCiu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );
        menuCiuLayout.setVerticalGroup(
            menuCiuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCiuLayout.createSequentialGroup()
                .addComponent(btnEditarCiu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCiu))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel16.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jPanel16.setBorder(dropShadowBorder3);

        btnCerrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar7.setToolTipText("Cerrar");
        btnCerrar7.setContentAreaFilled(false);
        btnCerrar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar7btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar7btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar7)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información de las Ciudades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaCiu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  ", "Nombre", "Departamento"
            }
        ));
        tablaCiu.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaCiu.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaCiu.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaCiu.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaCiu.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaCiu.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaCiu.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaCiu.setComponentPopupMenu(jPopupMenu1);
        tablaCiu.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        tablaCiu.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaCiu.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaCiu.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaCiu.setGridColor(new java.awt.Color(204, 204, 204));
        tablaCiu.setGrosorBordeFilas(0);
        tablaCiu.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane8.setViewportView(tablaCiu);
        if (tablaCiu.getColumnModel().getColumnCount() > 0) {
            tablaCiu.getColumnModel().getColumn(0).setMinWidth(10);
            tablaCiu.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        txtBuscarCiudad.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarCiudad.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscarCiudad.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarCiudad.setName("txtBuscar"); // NOI18N
        txtBuscarCiudad.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarCiudad.setPlaceholder("Buscar....");
        txtBuscarCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCiudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCiudadKeyTyped(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btnNuevo7.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevo7.setText("Nuevo");
        btnNuevo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevo7btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo7btnNuevoActionPerformed(evt);
            }
        });

        jcbFiltroCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Ciudad", "Departamento" }));
        jcbFiltroCiudad.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroCiudad.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroCiudad.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroCiudad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbFiltroCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroCiudadActionPerformed(evt);
            }
        });

        rSButtonRound1.setText("Reporte");
        rSButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(btnNuevo7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jcbFiltroCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbFiltroCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar7btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar7btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrar7btnCerrarMouseClicked

    private void btnCerrar7btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar7btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrar7btnCerrarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnNuevo7btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevo7btnNuevoMouseClicked

    }//GEN-LAST:event_btnNuevo7btnNuevoMouseClicked

    private void btnNuevo7btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo7btnNuevoActionPerformed
        registroCiudad redepar = new registroCiudad(new JFrame(), true);
        redepar.setVisible(true);
    }//GEN-LAST:event_btnNuevo7btnNuevoActionPerformed

    private void btnEliminarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCiuActionPerformed
        try {
             int fila = tablaCiu.getSelectedRow();
            String sql = "DELETE FROM ciudades WHERE ID_CIUDAD = '"+Ciudades.tablaCiu.getValueAt(fila, 0).toString()+"'";
            ps = conexion.prepareStatement(sql);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                FuncionesDC.iscargarTablaCiu("");
            }else{
                JOptionPane.showMessageDialog(this, "Error al Eliminar");
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarCiuActionPerformed

    private void btnEditarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCiuActionPerformed
        int fila = tablaCiu.getSelectedRow();
        updateCiudad up= new updateCiudad(new JFrame(), true, fila);
        up.txtNomCiuUp.setText(this.tablaCiu.getValueAt(fila, 1).toString());
        up.jcbDepartUp.setSelectedItem(this.tablaCiu.getValueAt(fila, 2).toString());
        up.lblIdCiuUp.setText(this.tablaCiu.getValueAt(fila, 0).toString());
        FuncionesDC.iscargarTablaCiu("");
        up.setVisible(true);
    }//GEN-LAST:event_btnEditarCiuActionPerformed

    private void txtBuscarCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCiudadKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarCiudadKeyTyped

    private void txtBuscarCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCiudadKeyReleased
        FuncionesDC.isBuscatDatos(this.txtBuscarCiudad.getText(), jcbFiltroCiudad.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarCiudadKeyReleased

    private void jcbFiltroCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroCiudadActionPerformed

    private void rSButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound1ActionPerformed
       try {
            Conexion conexion = new Conexion();
            Connection conexion2 = con.getConnection();
            JasperReport reporte = null;
            String path = "src\\reportes\\reportCiudades.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conexion2);
            JasperViewer view= new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Ciudades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_rSButtonRound1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar7;
    private javax.swing.JButton btnEditarCiu;
    private javax.swing.JButton btnEliminarCiu;
    private rojerusan.RSButtonIconI btnNuevo7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane8;
    public static rojerusan.RSComboMetro jcbFiltroCiudad;
    private javax.swing.JPanel menuCiu;
    private rojerusan.RSButtonRound rSButtonRound1;
    public static rojerusan.RSTableMetro tablaCiu;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarCiudad;
    // End of variables declaration//GEN-END:variables
}
