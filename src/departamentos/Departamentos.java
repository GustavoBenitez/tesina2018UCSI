
package departamentos;
import alertas.principal.ErrorAlert;
import alertas.principal.SuccessAlert;
import alertas.principal.WarningAlertDepar;
import departamentos.registroDepartamento;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Departamentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Departamentos
     */
    public Departamentos() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        this.setLocation(330, 120);
        FuncionesDC.isListarDepartamento(""); 
        rSPopuMenu1.add(menuCiu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCiu = new javax.swing.JPanel();
        btnEditarCiu = new javax.swing.JButton();
        btnEliminarCiu = new javax.swing.JButton();
        rSPopuMenu1 = new rojerusan.RSPopuMenu();
        jPanel16 = new javax.swing.JPanel();
        btnCerrar7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaDepar = new rojerusan.RSTableMetro();
        txtBuscarDerp = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton8 = new javax.swing.JButton();
        btnNuevoDepart = new rojerusan.RSButtonIconI();

        menuCiu.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarCiu.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
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

        btnEliminarCiu.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
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
            .addGroup(menuCiuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuCiuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarCiu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCiu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

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
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(862, Short.MAX_VALUE)
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
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información de los Departamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaDepar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre"
            }
        ));
        tablaDepar.setCellSelectionEnabled(false);
        tablaDepar.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaDepar.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaDepar.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaDepar.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaDepar.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaDepar.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaDepar.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaDepar.setComponentPopupMenu(rSPopuMenu1);
        tablaDepar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        tablaDepar.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaDepar.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaDepar.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaDepar.setGrosorBordeFilas(0);
        tablaDepar.setName("tablaDepar"); // NOI18N
        tablaDepar.setRowSelectionAllowed(true);
        tablaDepar.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane8.setViewportView(tablaDepar);
        tablaDepar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtBuscarDerp.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarDerp.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscarDerp.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarDerp.setName("txtBuscar"); // NOI18N
        txtBuscarDerp.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarDerp.setPlaceholder("Buscar....");
        txtBuscarDerp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDerpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDerpKeyTyped(evt);
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

        btnNuevoDepart.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevoDepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevoDepart.setText("Nuevo");
        btnNuevoDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevoDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(btnNuevoDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarDerp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(40, 40, 40))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarDerp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(btnNuevoDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        registroDepartamento redepar = new registroDepartamento(new JFrame(), true);
        redepar.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked

    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnEditarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCiuActionPerformed
       int fila = Departamentos.tablaDepar.getSelectedRow();
         updateDepartamento mp2 = new updateDepartamento(new JFrame(), true);
         mp2.txtNomDeparUp.setText(tablaDepar.getValueAt(fila, 1).toString());
         mp2.lblIdDeparUp.setText(tablaDepar.getValueAt(fila, 0).toString());
         FuncionesDC.isListarDepartamento("");
         mp2.setVisible(true);  
    }//GEN-LAST:event_btnEditarCiuActionPerformed

    private void btnEliminarCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCiuActionPerformed
        int fila = tablaDepar.getSelectedRow();
        if (this.tablaDepar.getRowCount() < 1) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("OOPS...");
            er.msj.setText("LA TABLA ESTA VACÍA");
            er.msj1.setText("");
            er.setVisible(true);
        } else {
            if (this.tablaDepar.getSelectedRowCount() < 1) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("SELECCIONA UN");
                er.msj1.setText("REGISTRO");
                er.setVisible(true);
            } else {
                fila = tablaDepar.getSelectedRow();
                WarningAlertDepar wa = new WarningAlertDepar(new JFrame(), true);
                wa.id.setText(this.tablaDepar.getValueAt(fila, 0).toString());
                wa.titulo.setText("¿ESTAS SEGURO?");
                wa.msj.setText("SE BORRARA PERMANENTEMENTE");
                wa.msj1.setText("");
                wa.setVisible(true);
            }
        }
  
    }//GEN-LAST:event_btnEliminarCiuActionPerformed

    private void txtBuscarDerpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDerpKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarDerpKeyTyped

    private void txtBuscarDerpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDerpKeyReleased
        FuncionesDC.isListarDepartamento(this.txtBuscarDerp.getText());
    }//GEN-LAST:event_txtBuscarDerpKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar7;
    private javax.swing.JButton btnEditarCiu;
    private javax.swing.JButton btnEliminarCiu;
    public static rojerusan.RSButtonIconI btnNuevoDepart;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel menuCiu;
    private rojerusan.RSPopuMenu rSPopuMenu1;
    public static rojerusan.RSTableMetro tablaDepar;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarDerp;
    // End of variables declaration//GEN-END:variables
}
